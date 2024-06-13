package JDBC;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import JDBC.Conexao;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {


		//Desafio pra fazer um mecanismo de atualizar registro no banco de dados


				
				Connection conexao = Conexao.getConexao();
				Scanner sc = new Scanner(System.in);
				System.out.println("Digite o id de quem vc quer excluir: ");
				int id = sc.nextInt();
		

				String str = """
						DELETE FROM PESSOAS WHERE CODIGO = ?;
						""";

					PreparedStatement stmt = conexao.prepareStatement(str);
					stmt.setInt(1, id);
					
					if(stmt.executeUpdate() >0) {
						System.out.println("Registro deletado com sucesso");
					}else {
						System.out.println("Nao foi deletado :(");
					}
				conexao.close();
				sc.close();
			}

		

	

}
