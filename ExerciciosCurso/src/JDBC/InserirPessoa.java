package JDBC;

import java.sql.*;
import java.util.Scanner;

public class InserirPessoa {
	public static void main(String[] args) {
		Connection conexao =  Conexao.getConexao();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		String str = """
				INSERT INTO PESSOAS(NOME) VALUES (?);
				
				""";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(str);
			stmt.setString(1, nome);
			stmt.execute();
		}catch(SQLException e){
			System.out.println("erro: " + e);
			
		}
		
		System.out.println("Pessoa incluida com sucesso!");
		sc.close();


	}

}
