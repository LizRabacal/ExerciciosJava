package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConexao() {
		try {
			Properties prop = getProperties();
			String url = prop.getProperty("banco.url");
			String usuario =  prop.getProperty("banco.usuario");
			String senha =  prop.getProperty("banco.senha");

			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException |  IOException e) {
			throw new RuntimeException(e);
		}
	}

	//pegando dados sensiveis externalizados
	public static Properties getProperties() throws IOException {
		Properties p = new Properties();
		String caminho = "/conexao.properties";
		p.load(Conexao.class.getResourceAsStream(caminho));

		return p;
	}

}
