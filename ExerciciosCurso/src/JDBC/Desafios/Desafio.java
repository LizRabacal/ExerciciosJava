package JDBC.Desafios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import JDBC.Conexao;
import JDBC.Pessoa;

import java.util.*;

//Desafio pra fazer um mecanismo de pesquisa no banco de dados
public class Desafio {
	public static void main(String[] args) throws SQLException {

		Connection conexao = new Conexao().getConexao();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome que deseja pesquisar: ");
		String search = sc.next();

		List<Pessoa> lista = new ArrayList<>();
		String str = """
				SELECT * FROM pessoas where nome like ?;

				""";

		PreparedStatement stmt = conexao.prepareStatement(str);
		stmt.setString(1, "%" + search + "%");
		ResultSet resultado = stmt.executeQuery();

		if (resultado != null) {
			while (resultado.next()) {
				lista.add(new Pessoa(resultado.getInt("codigo"), resultado.getString("nome")));
			}
			System.out.println("Resultado da pesquisa: ");
			lista.stream().forEach(p -> System.out.println(p.getCodigo() + "==>" + p.getNome()));
		} else {
			System.out.println("Sem resultados ;(");
		}
		sc.close();
		conexao.close();

	}
}
