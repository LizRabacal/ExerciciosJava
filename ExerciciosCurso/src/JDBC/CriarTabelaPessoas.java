package JDBC;
import java.sql.*;

public class CriarTabelaPessoas {
	public static void main(String[] args){
		Connection conexao = Conexao.getConexao();
		String str = """
				CREATE TABLE pessoas(
				codigo INT AUTO_INCREMENT PRIMARY KEY,
				nome VARCHAR(80) NOT NULL
				);
				
				
				""";
		
		try {
			Statement stmt = conexao.createStatement();
			stmt.execute(str);
		} catch (SQLException e) {
			System.out.println("erro: " + e.getMessage());
		}

	}

}
