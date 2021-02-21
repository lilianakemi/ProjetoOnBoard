package br.com.b2w.factory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import br.com.b2w.dao.UsuarioDao;

public abstract class AbstractDaoFactory {
//	Constantes que define o tipo de banco de dados
	public static final int ORACLE = 1;
	public static final int MYSQL = 2;
	
	/**
	 * Atributos que armazenam as intancias das fabricas de dados do oracle/mysql
	 */
	private static AbstractDaoFactory oracleDaoFactory;
	private static AbstractDaoFactory mysqlDaoFactory;
	
	/**
	 * Método que retorna a instancia da fabrica de acordo com o parametro
	 */
	public static AbstractDaoFactory getDaoFactory(int fabrica) {
		switch(fabrica) {
		case 1:
			if (oracleDaoFactory == null)
				oracleDaoFactory = new OracleDaoFactory();
			return oracleDaoFactory;
		case 2:
			if (mysqlDaoFactory == null)
				mysqlDaoFactory = new MySqlDaoFactory();
			return mysqlDaoFactory;
		default:
			return null;
		}
	}
	
	/**
	 * Metodo abstratos (sem corpo) que as filhas devem implementar
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public abstract UsuarioDao getUsuarioDao() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
}
