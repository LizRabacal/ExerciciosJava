package POO.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	private boolean ligarTurbo;
	private boolean ligarAr;

	
	public Ferrari(int vm){
		super(vm);
		
	}
	
	public Ferrari(){
		super(1000);
		
	}
	
	
	@Override
	public boolean acelerar() {
		boolean a1 = super.acelerar();
		boolean a2 = super.acelerar();
		boolean a3 = super.acelerar();
		
		return a1 || a2 || a3;
	}
	
	
	@Override
	public void ligarTurbo(){
		ligarTurbo = true;


		
		
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;

		
	}
	
	@Override
	public void ligarAr(){
		ligarAr = true;


		
		
	}

	@Override
	public void desligarAr() {
		ligarAr = false;

		
	}
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 15;
		}else if (ligarTurbo && ligarAr){
			return 10;
		}else {
			return 5;
		}

		
	}

}
