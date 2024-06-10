package POO.heranca.desafio;

public class Civic extends Carro{
	
	public Civic(int vm){
		super(vm);
		
	}
	
	public Civic(){
		this(500);
		
	}
	
	@Override
	public boolean acelerar() {
		velocidadeAtual+=5;
		return true;
	}

}
