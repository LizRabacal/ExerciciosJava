package POO.heranca.desafio;
public class Teste {
	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		Civic civic = new Civic();
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		
		
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.acelerar();
		civic.acelerar();
		
	
		
	
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		
		System.out.println(civic.frear());
		System.out.println(civic.frear());
		
		
	}

}
