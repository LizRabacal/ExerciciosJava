package POO.heranca.teste;

import POO.heranca.desafio.Civic;
import POO.heranca.desafio.Ferrari;

public class TesteCarro {
	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		Civic civic = new Civic();
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		
		ferrari.acelerar();
		civic.acelerar();
	
		
	
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		
		System.out.println(civic.frear());
		System.out.println(civic.frear());
		
		
	}

}
