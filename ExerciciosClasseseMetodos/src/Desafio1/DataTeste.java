package Desafio1;

public class DataTeste {
	public static void main(String[] args) {
			Data data = new Data();
			Data data2 = new Data();
			Data Data3 = new Data();

			data.dia = 12;
			data.mes = 5;
			data.ano = 2003;
			
			data2.dia = 9;
			data2.mes = 12;
			data2.ano = 2023;
			
			System.out.printf("%d/%d/%d \n", data.dia, data.mes, data.ano);
			System.out.printf("%d/%d/%d \n", data2.dia, data2.mes, data2.ano);
			
			System.out.println(data.formatarData());
			
			System.out.println(data2.formatarData());
			
			System.out.println(Data3.formatarData());

	}
}
