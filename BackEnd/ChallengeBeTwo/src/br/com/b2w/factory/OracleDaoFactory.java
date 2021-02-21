package br.com.b2w.factory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import br.com.b2w.dao.UsuarioDao;
import br.com.b2w.dao.oracle.UsuarioOracleDao;
import br.com.b2w.factory.AbstractDaoFactory;

public class OracleDaoFactory extends AbstractDaoFactory{

	@Override
	public UsuarioDao getUsuarioDao() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return new UsuarioOracleDao();
	}
}
