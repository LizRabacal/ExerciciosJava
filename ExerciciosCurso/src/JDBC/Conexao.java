package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static String url = "jdbc:mysql://localhost/curso_java";
	private final static String usuario = "root";
	private final static String senha = "12345";
	
	public static Connection getConexao()  {
		try {
		return  DriverManager.getConnection(url, usuario, senha);
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static Properties getProperties() throws IOException {
		Properties p = new Properties();
		System.out.println(senha);
		String caminho = "/caminho.properties";
		 p.load(Conexao.class.getResourceAsStream(caminho));
		 
		 return p;
	}

	
}
