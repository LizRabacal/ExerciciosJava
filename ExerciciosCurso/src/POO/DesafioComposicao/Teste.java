package POO.DesafioComposicao;

public class Teste {
	public static void main(String[] args) {
		Cliente cliente =  new Cliente("Luiza");
		Produto p1 = new Produto("Salto", 600);
		Produto p2 = new Produto("Vestido", 30);
		Produto p3 = new Produto("Sandalia", 25);
		Produto p4 = new Produto("Calça", 70);
		
		Item item1 = new Item(1, p1);
		Item item2 = new Item(3, p2);
		Item item3 = new Item(2, p3);
		Item item4 = new Item(1, p4);
		
		Compra compra1 = new Compra(cliente);
		Compra compra2 = new Compra(cliente);

		
		compra1.additem(item1);
		compra1.additem(item2);
		
		compra2.additem(item3);
		compra2.additem(item4);
		
		cliente.addcompra(compra2);
		cliente.addcompra(compra1);
		
		System.out.println(cliente.total());




		

		
	}

}
