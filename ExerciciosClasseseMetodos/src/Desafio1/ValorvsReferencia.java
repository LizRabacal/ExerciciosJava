package Desafio1;

public class ValorvsReferencia {
		public static void main(String[] args) {
			//valor
			int a  = 6;
			int b = a;
			b = 12;
			System.out.println(a);
			
			
			//referencia
			Data data4 = new Data();
			Data data5 = data4;
			data4.dia =3;
			data4.mes = 8;
			data4.ano = 2005;
			data5.dia = 13;
			System.out.println(data4.dia);
			
			//referencia - metodo
			mudadata(data4);
			System.out.println(data4.dia +"/" +data4.mes + "/" + data4.ano);
			System.out.println(a);
			
			
			//valor - metodo
			alterarprimitivo(a);
			System.out.println(a);
		}
		
		static void mudadata(Data data) {
			data.dia = 1;
			data.mes = 1;
			data.ano = 1970;
		}
		
		static void alterarprimitivo(int a) {
			a++;
		}
}
