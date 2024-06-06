package Desafio2;


public class Pessoa {

	String nome;
	double peso;

	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	public void comer(Comida comida) {
		if(comida != null) {
		this.peso = this.peso + comida.peso;
		System.out.println("Agora vc esta pesando " + this.peso);
		}
		
	}

	
	
}
