package JDBC;

import java.sql.*;
import java.util.*;
import java.util.Scanner;

public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException {
		Connection conexao = Conexao.getConexao();
		List<Pessoa> lista = new ArrayList<>();
		String str = """
				SELECT * FROM pessoas;

				""";
			Statement stmt = conexao.createStatement();
			ResultSet resultado = stmt.executeQuery(str);
			while(resultado.next()) {
					lista.add(new Pessoa(resultado.getInt("codigo"), resultado.getString("nome")));				
			}
			
			lista.stream().forEach(p -> System.out.println(p.getCodigo() + "==>" + p.getNome()));
			

		
			conexao.close();
		


	}
}
