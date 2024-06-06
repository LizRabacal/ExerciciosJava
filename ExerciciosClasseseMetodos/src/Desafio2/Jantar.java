package Desafio2;

public class Jantar {
	public static void main(String[] args) {
		Pessoa pessoa1 =  new Pessoa("Matheus", 90);
		Comida comida1 = new Comida("Macarrão", 2);
		Comida comida2 = new Comida("Arroz", 4);
		Comida comida3 = new Comida("Feijão", 3);
		pessoa1.comer(comida1);
		pessoa1.comer(comida3);
		pessoa1.comer(comida2);

		
	}

}
