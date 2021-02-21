package br.com.b2w.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

	private static ConnectionManager manager;
	
	private Properties prop;
	
	private ConnectionManager() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream("banco.properties"));
	}
	
	public static ConnectionManager getInstance() throws FileNotFoundException, IOException {
		if(manager == null) {
			manager = new ConnectionManager();
		}
		return manager;
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conexao = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("usuario"), prop.getProperty("senha"));
		return conexao;
	}
}
