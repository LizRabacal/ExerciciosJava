package Streams;

public class Produto {
	public Produto(String nome, double preco, double desconto, boolean freteGratis) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.freteGratis = freteGratis;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public boolean isFreteGratis() {
		return freteGratis;
	}
	public void setFreteGratis(boolean freteGratis) {
		this.freteGratis = freteGratis;
	}
	private String nome;
	private double preco, desconto;
	private boolean freteGratis;
	

}
