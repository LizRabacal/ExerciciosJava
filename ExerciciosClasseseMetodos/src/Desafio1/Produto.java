package Desafio1;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	Produto (){
	}
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco =preco;
	}
	
	double precoComDesconto() {
		return preco * (1-desconto);
	}
	
	double precoComDesconto(double desconto) {
		return preco * (1-desconto);
	}
}
