package JDBC.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import JDBC.Pessoa;
import JDBC.Conexao;

public class PessoasDAO {
	private Connection conexao = Conexao.getConexao();

	public void Create(Pessoa p) throws SQLException {
		String str = """
				INSERT INTO PESSOAS(NOME) VALUES (?);

				""";

		PreparedStatement stmt = conexao.prepareStatement(str);
		stmt.setString(1, p.getNome());
		stmt.execute();


	}

	public List<Pessoa> read() throws SQLException {
		List<Pessoa> lista = new ArrayList<>();
		String str = """
				SELECT * FROM pessoas;

				""";

		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(str);

		if (resultado != null) {
			while (resultado.next()) {
				lista.add(new Pessoa(resultado.getInt("codigo"), resultado.getString("nome")));
			}
		}

		return lista;

	}

}
