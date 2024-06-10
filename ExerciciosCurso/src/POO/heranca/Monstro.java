package POO.heranca;

public class Monstro extends Jogador{
	
	public Monstro(int x, int y){
		super(x, y);
	}
	public Monstro(){
		this(0,0);
	}
	
	public boolean atacar(Jogador oponente) {
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//		
//		if(deltaX == 0 && deltaY == 1) {
//			oponente.vida -=30;
//			return true;
//		}else if (deltaX == 1 && deltaY == 0) {
//			oponente.vida -=30;
//			return true;
//		}
//		return false;
		
		boolean a1  = super.atacar(oponente);
		boolean a2 = super.atacar(oponente);
		
		return a1 || a2;

		
	}
	
}
