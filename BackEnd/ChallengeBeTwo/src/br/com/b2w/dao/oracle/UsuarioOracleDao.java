package br.com.b2w.dao.oracle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.b2w.dao.UsuarioDao;
import br.com.b2w.exception.EntidadeNaoEncontradaException;
import br.com.b2w.singleton.ConnectionManager;
import br.com.b2w.to.UsuarioTO;

public class UsuarioOracleDao implements UsuarioDao{

	private Connection conexao;
	
	public UsuarioOracleDao() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		conexao = ConnectionManager.getInstance().getConnection();
	}

	@Override
	public void cadastrar(UsuarioTO usuario) throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement("INSERT INTO T_BETWO_USUARIO"
				+ " (CD_USUARIO, DS_LOGIN, DS_SENHA, ST_ATIVO, NM_COMPLETO, DT_ADMISSAO)"
				+ " VALUES (SQ_T_BETWO_USUARIO.NEXTVAL, ?, ?, ?, ?, ?)");
		
		stmt.setString(1, usuario.getLogin());
		stmt.setString(2, usuario.getSenha());
		stmt.setString(3, usuario.getAtivo());
		stmt.setString(4, usuario.getNome());
		stmt.setString(5, usuario.getDtAdmissao());
		
		stmt.executeUpdate();
		stmt.close();
		
	}

	@Override
	public void atualizar(UsuarioTO usuario) throws SQLException, EntidadeNaoEncontradaException {
		PreparedStatement stmt = conexao.prepareStatement("UPDATE T_BETWO_USUARIO"
				+ " SET DS_LOGIN = ?, DS_SENHA = ?, ST_ATIVO = ?, NM_COMPLETO = ?, DT_ADMISSAO = ?"
				+ " WHERE CD_USUARIO = ?");
		
		stmt.setString(1, usuario.getLogin());
		stmt.setString(2, usuario.getSenha());
		stmt.setString(3, usuario.getAtivo());
		stmt.setString(4, usuario.getNome());
		stmt.setString(5, usuario.getDtAdmissao());
		stmt.setInt(6, usuario.getCodigo());
		
		int qntd = stmt.executeUpdate();
		stmt.close();
		
		if(qntd == 0)
			throw new EntidadeNaoEncontradaException();	
	}

	@Override
	public void remover(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		PreparedStatement stmt = conexao.prepareStatement(
			"DELETE FROM T_BETWO_USUARIO WHERE CD_USUARIO = ?");
			
		stmt.setInt(1, codigo);
		
		int qntd = stmt.executeUpdate();
		stmt.close();
		
		if(qntd == 0)
		throw new EntidadeNaoEncontradaException();
	}

	@Override
	public UsuarioTO buscar(int codigo) throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement(
				"SELECT * FROM T_BETWO_USUARIO WHERE CD_USUARIO = ?");
		
		stmt.setInt(1, codigo);
		
		ResultSet result = stmt.executeQuery();
		
		
		if(result.next())
			return parse(result);
		
		stmt.close();
		return null;
	}

	@Override
	public List<UsuarioTO> listar() throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement(
				"SELECT * FROM T_BETWO_USUARIO");
		
		List<UsuarioTO> lista = new ArrayList<UsuarioTO>();
		
		ResultSet result = stmt.executeQuery();
		while(result.next()) {
			lista.add(parse(result));
		}
		stmt.close();
		return lista;
	}
	
	private UsuarioTO parse(ResultSet result) throws SQLException {
		int cd = result.getInt("CD_USUARIO");
		String login = result.getString("DS_LOGIN");
		String senha = result.getString("DS_SENHA");
		String ativo = result.getString("ST_ATIVO");
		String nome = result.getString("NM_COMPLETO");
		String dtAdmissao = result.getString("DT_ADMISSAO");
		
		return new UsuarioTO(cd, login, senha, ativo, nome, dtAdmissao);
	}
}
