package br.com.b2w.bo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import br.com.b2w.dao.UsuarioDao;
import br.com.b2w.exception.DadoInvalidoException;
import br.com.b2w.exception.EntidadeNaoEncontradaException;
import br.com.b2w.factory.AbstractDaoFactory;
import br.com.b2w.to.UsuarioTO;
import br.com.b2w.util.StringUtils;

public class UsuarioBo {

	private UsuarioDao dao;
	
	public UsuarioBo() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		dao = AbstractDaoFactory.getDaoFactory(AbstractDaoFactory.ORACLE).getUsuarioDao();
	}
	public void cadastrar(UsuarioTO usuario) throws SQLException, DadoInvalidoException {
		validar(usuario);
		dao.cadastrar(usuario);
	}
	public void atualizar(UsuarioTO usuario) throws SQLException, EntidadeNaoEncontradaException, DadoInvalidoException {
		validar(usuario);
		dao.atualizar(usuario);
	}
	private void validar(UsuarioTO usuario) throws DadoInvalidoException {
		if (StringUtils.isEmptyOrNull(usuario.getLogin()))
			throw new DadoInvalidoException("Login é obrigatório");
		if (StringUtils.isEmptyOrNull(usuario.getSenha()))
			throw new DadoInvalidoException("Senha é obrigatória");
		if (StringUtils.isEmptyOrNull(usuario.getNome()))
			throw new DadoInvalidoException("Nome é obrigatório");
		if (StringUtils.isEmptyOrNull(usuario.getDtAdmissao()))
			throw new DadoInvalidoException("Data de Admissão é obrigatória");
	}
	public void remover(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		dao.remover(codigo);
	}
	public UsuarioTO buscar(int codigo) throws SQLException {
		return dao.buscar(codigo);
	}
	public List<UsuarioTO> listar() throws SQLException {
		return dao.listar();
	}
}
