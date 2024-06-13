package JDBC;

import java.sql.*;

public class TesteConexao {
	public static void main(String[] args) throws SQLException{
		
		Connection c = Conexao.getConexao();

			Statement stmt = c.createStatement();
			stmt.execute("CREATE DATABASE IF NOT EXISTS CURSO_JAVA");
		
		c.close();

	}

}
