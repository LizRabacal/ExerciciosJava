package POO.polimorfismo;

public class Pessoa {
	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}
	
	public void Comer(Alimento alimento) {
		peso+=alimento.getPeso();
		
	}
	
	@Override 
	public String toString() {
		return "Estou pesando " + this.peso + "kg";
		
	}

	public void setPeso(double peso) {
		if(peso>=0)
		this.peso = peso;
	}


}
