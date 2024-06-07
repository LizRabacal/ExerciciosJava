package ClasseseMetodos;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto produto = new Produto("Televisao", 1350);
		Produto produto2 = new Produto("Celular", 6000);
		
		System.out.println("nome: " +produto.nome + " preco: " +produto.preco + " com desconto: " + produto.precoComDesconto());
		System.out.println("nome: " +produto2.nome + " preco: " +produto2.preco + " com desconto: " + produto2.precoComDesconto());

		Produto.desconto = 0.3;

		System.out.println("nome: " +produto.nome + " preco: " +produto.preco + " com desconto: " + produto.precoComDesconto());
		System.out.println("nome: " +produto2.nome + " preco: " +produto2.preco + " com desconto: " + produto2.precoComDesconto());

	}

}
