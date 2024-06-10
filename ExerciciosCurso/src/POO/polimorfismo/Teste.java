package POO.polimorfismo;

public class Teste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(90);
		Alimento arroz = new Arroz(0.2);
		Alimento feijao = new Feijao(0.25);
		Alimento sorvete = new Sorvete(0.5);

		
		System.out.println(p1);
		p1.Comer(sorvete);
		System.out.println(p1);
		p1.Comer(arroz);
		System.out.println(p1);
		p1.Comer(feijao);
		System.out.println(p1);

	}

}
