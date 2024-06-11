package POO.abstracao;


//classe concreta deve implementar TODOS os metodos abstratos do pai/avô/bisavô
public class Cachorro extends Mamifero{

	@Override
	public void mamar() {
		
	}

	@Override
	public String mover() {
		return "com as patas";
	}
	

}
