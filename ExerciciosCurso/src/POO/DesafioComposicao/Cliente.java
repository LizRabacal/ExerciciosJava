package POO.DesafioComposicao;

import java.util.ArrayList;

public class Cliente {
	String nome;
	ArrayList<Compra> compras;

	public Cliente(String nome) {

		this.nome = nome;
		this.compras = new ArrayList<>();

	}

	public void addcompra(Compra compra) {
		compras.add(compra);
	}

	public double total() {
		double total = 0;

		for (Compra compra : compras) {
			total += compra.valorTotal();

		}

		return total;
	}

}
