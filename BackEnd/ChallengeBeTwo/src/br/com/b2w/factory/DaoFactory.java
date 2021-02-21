package br.com.b2w.factory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import br.com.b2w.dao.UsuarioDao;
import br.com.b2w.dao.oracle.UsuarioOracleDao;

public abstract class DaoFactory {

	public static UsuarioDao getVeiculoDao() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return new UsuarioOracleDao();
	}
}
