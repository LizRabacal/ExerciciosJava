package Generics.Exemplo2;

import Generics.Exemplo1.Caixa;

public class CaixaIntTeste {
	public static void main(String[] args) {
		Caixa<Integer> c = new CaixaInt();
		
		c.setCoisa(6);
		
		System.out.println(c.getCoisa().getClass());
			
	}
}
