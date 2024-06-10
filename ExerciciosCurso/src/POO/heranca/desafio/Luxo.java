package POO.heranca.desafio;

public interface Luxo {
	//implementacao implicitamente abstract
	 void ligarAr();
	 void desligarAr();
	 
	
	 //implementacao padrao de metodo para classes q herdem
	 default int nivelDoAr() {;
	 return 1;
	 }
	

}
