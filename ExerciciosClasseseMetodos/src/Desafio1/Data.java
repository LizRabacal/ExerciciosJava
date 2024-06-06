package Desafio1;

public class Data {
	//desafio 1
	public int dia;
	public int mes;
	public int ano;
	//desafio 2
	public String formatarData() {
		return dia +"/" + mes + "/" + ano + "\n";
	}
	
	//desafio 3 
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes= mes;
		this.ano = ano;
	}
	
	public Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		
		this(1, 1, 1970);
	}
	
	public String obterDataFormatada(){
		String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
		
	}
	
	public void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
	
	
	

}
