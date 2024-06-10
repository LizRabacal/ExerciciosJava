package POO.DesafioComposicao;

import java.util.ArrayList;

public class Compra {
	Cliente cliente;
	ArrayList<Item> itens;
	
	Compra(Cliente cliente){
		this.cliente = cliente;
		itens = new ArrayList<>();
		
	}
	
	public void additem(Item item) {
		itens.add(item);
	}
	
	public double valorTotal() {
		double total = 0;
		for(Item item : itens) {
			
			total+= item.produto.preco * item.qtd;
		}
		
		return total;
	}
	

}
