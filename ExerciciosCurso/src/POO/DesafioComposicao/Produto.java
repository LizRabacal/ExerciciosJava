package POO.DesafioComposicao;
import java.util.ArrayList;

public class Produto {
	String nome;
	double preco;
	ArrayList<Item> itens;
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		itens = new ArrayList<>();
	}
	
	

}
