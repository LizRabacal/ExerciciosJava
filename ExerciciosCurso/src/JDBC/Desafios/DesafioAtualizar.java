package JDBC.Desafios;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import JDBC.Conexao;


//Desafio pra fazer um mecanismo de atualizar registro no banco de dados

public class DesafioAtualizar {
	public static void main(String[] args) throws SQLException{
		
		Connection conexao = Conexao.getConexao();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o id de quem vc quer atualizar: ");
		int id = sc.nextInt();
		System.out.println("Digite o novo nome: ");
		String nome = sc.next();

		String str = """
				UPDATE PESSOAS SET NOME = ? WHERE CODIGO = ?;
				""";

			PreparedStatement stmt = conexao.prepareStatement(str);
			stmt.setString(1, nome);
			stmt.setInt(2, id);
			stmt.execute();
	

		System.out.println("Pessoa atualizada com sucesso!");
		conexao.close();
		sc.close();
	}

}
