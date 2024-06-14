package JDBC.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import JDBC.Pessoa;
import JDBC.Conexao;

//Data Access Object 
public class PessoasDAO {
	private Connection conexao;

	private Connection getConnection() {
		try {
			if (conexao != null && !conexao.isClosed())
				return conexao;
		} catch (SQLException e) {
		}

		conexao = Conexao.getConexao();
		return conexao;

	}

	public void create(Pessoa pessoa) {
		try {
			if (pessoa != null) {
				String str = "INSERT INTO PESSOAS (nome) VALUES (?)";
				PreparedStatement stmt = getConnection().prepareStatement(str, PreparedStatement.RETURN_GENERATED_KEYS);
				stmt.setString(1, pessoa.getNome());
				if (stmt.executeUpdate() > 0) {
					System.out.println("Pessoa inserida no banco ID:" + stmt.getGeneratedKeys());
				}
			}
		} catch (SQLException e) {
			// o tratamento laca uma exceção nao checada
			throw new RuntimeException(e);
		}

	}

	public List<Pessoa> read() {
		List<Pessoa> lista = new ArrayList<>();
		String str = "SELECT * FROM PESSOAS";

		try {
			Statement stmt = getConnection().createStatement();
			ResultSet resultado = stmt.executeQuery(str);
			
			while(resultado.next()) {
				lista.add(new Pessoa(resultado.getInt("codigo"), resultado.getString("nome")));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return lista;

	}
	
	
	public void update(int id, String nome) throws NonExistentIDException {
		if(read().stream().map(p->p.getCodigo()).anyMatch(i -> i==id)) {
		String str = "UPDATE PESSOAS SET NOME = ? WHERE CODIGO = ?";
		try {
			PreparedStatement stmt = getConnection().prepareStatement(str);
			stmt.setString(1, nome);
			stmt.setInt(2, id);
			if(stmt.executeUpdate()>0) {
				System.out.println("Pessoa atualizada com sucesso!");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		}else {
			throw new NonExistentIDException();
		}	
		
	}
		
	
	public void delete(int id) throws NonExistentIDException {
		if(read().stream().map(p->p.getCodigo()).anyMatch(i -> i==id)) {
		String str = "DELETE FROM PESSOAS WHERE CODIGO = ?";
		try {
			PreparedStatement stmt = getConnection().prepareStatement(str);
			stmt.setInt(1, id);
			if(stmt.executeUpdate()>0) {
				System.out.println("Pessoa deletada com sucesso!");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}	
		}else {
			throw new NonExistentIDException();
		}
		
	}
	
	
	
	
	
	

	public void close() {
		try {
			getConnection().close();
		} catch (SQLException e) {
		}
	}



}
