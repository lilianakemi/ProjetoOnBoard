package br.com.b2w.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.b2w.exception.EntidadeNaoEncontradaException;
import br.com.b2w.to.UsuarioTO;

public interface UsuarioDao {

	void cadastrar(UsuarioTO usuario) throws SQLException;
	
	void atualizar(UsuarioTO usuario) throws SQLException, EntidadeNaoEncontradaException;
	
	void remover(int codigo) throws SQLException, EntidadeNaoEncontradaException;
	
	UsuarioTO buscar(int codigo) throws SQLException;
	
	List<UsuarioTO> listar() throws SQLException;
}
