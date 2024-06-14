package JDBC;

import javax.swing.JOptionPane;

import JDBC.DAO.NonExistentIDException;
import JDBC.DAO.PessoasDAO;

public class DAOTeste {
	public static void main(String[] args) {
		PessoasDAO dao = new PessoasDAO();
		StringBuilder lista = new StringBuilder();
		dao.read().stream().map(a-> a.getCodigo() +"==>" + a.getNome()).forEach(m -> lista.append(m).append("\n"));


		String resposta = JOptionPane.showInputDialog(null,
				"O que deseja fazer? \n 1-inserir pessoa 2-excluir pessoa pelo id 3-atualizar pessoa 4-consultar pessoas",
				"");

		switch (resposta) {
			case "1":
				String nome = JOptionPane.showInputDialog(null,
						"Digite o nome da pessoa q deseja inserir",
						"");
				Pessoa p = new Pessoa(2, nome);
				dao.create(p);
				break;
			case "2":
				int excluir = Integer.parseInt(JOptionPane.showInputDialog(null,
						lista + "\n Digite o id da pessoa q deseja inserir",
						""));
			try {
				dao.delete(excluir);
			} catch (NonExistentIDException e) {
				System.out.println("Digite um ID válido!!");
			}
				break;
			case "3":
				int atualizar = Integer.parseInt(JOptionPane.showInputDialog(null,
						lista + "\n Digite o id da pessoa q deseja atualizar",
						""));
				String nome_atualizado = JOptionPane.showInputDialog(null,
						"Digite o novo nome: ",
						"");
			try {
				dao.update(atualizar, nome_atualizado);
			} catch (NonExistentIDException e) {
				System.out.println("Digite um ID válido!!");
			}
				break;
				
				
			case "4":
				JOptionPane.showMessageDialog(null, lista);
				
		}

	}

}
