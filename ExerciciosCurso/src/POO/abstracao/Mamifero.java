package POO.abstracao;


//classe abstrata nunca sera instanciada serve so pra ser herdada e pode estar inacabada em termos de implementaçao
public abstract class Mamifero extends Animal {
//	
//	@Override
//	public String mover() {
//		return "se move com as patas";
//		
//	}
//	
	
	//metodo abstrato que deve ser implementado pela classe concreta q herdar essa classe abstrata
	public abstract void mamar();
	
	

}
