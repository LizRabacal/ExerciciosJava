package POO.heranca.desafio;

public class Carro {
	public final int velocidadeMaxima;
	public int velocidadeAtual;
	private int delta = 5;
	
	public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}


	
	public Carro(int vm){
		velocidadeMaxima = vm;
	}
	
	
	protected boolean acelerar() {
		if(velocidadeAtual + getDelta() > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		}else {
		 velocidadeAtual+=getDelta();
		}
		return true;
		
	}
	
	
	public boolean frear() {
		if(velocidadeAtual>=getDelta()) {
		velocidadeAtual-=getDelta();
		return true;
		}
		
		return false;
	}
	
	

}
