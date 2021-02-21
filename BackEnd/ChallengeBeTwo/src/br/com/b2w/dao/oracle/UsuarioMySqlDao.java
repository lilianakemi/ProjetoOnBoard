package br.com.b2w.dao.oracle;

import java.sql.SQLException;
import java.util.List;

import br.com.b2w.dao.UsuarioDao;
import br.com.b2w.exception.EntidadeNaoEncontradaException;
import br.com.b2w.to.UsuarioTO;

public class UsuarioMySqlDao implements UsuarioDao{

	@Override
	public void cadastrar(UsuarioTO usuario) throws SQLException {
		System.out.println("Cadastrando pelo SQL");
	}

	@Override
	public void atualizar(UsuarioTO usuario) throws SQLException, EntidadeNaoEncontradaException {
		System.out.println("Atualizando pelo SQL");
	}

	@Override
	public void remover(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		System.out.println("Removendo pelo SQL");
	}

	@Override
	public UsuarioTO buscar(int codigo) throws SQLException {
		System.out.println("Buscando pelo SQL");
		return null;
	}

	@Override
	public List<UsuarioTO> listar() throws SQLException {
		System.out.println("Listando pelo SQL");
		return null;
	}

}
