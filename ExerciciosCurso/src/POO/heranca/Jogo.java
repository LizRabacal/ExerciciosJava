package POO.heranca;

public class Jogo {
	public static void main(String[] args) {
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 11;
		
		Heroi heroi = new Heroi(10, 10);
		heroi.x = 10;
		heroi.y = 10;
		
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
		
		monstro.atacar(heroi);
		
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
		

		
	}

}
