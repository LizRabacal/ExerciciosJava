package Generics.Exemplo5;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		//praticas usando objeto q possui atributo (coisa) Objeto
		CaixaObject c1 = new CaixaObject();
		CaixaObject c2 = new CaixaObject();

		c1.setCoisa(2);
		
		c2.setCoisa("aaaa");
		
		
		Integer i = (Integer) c1.getCoisa();
		
		String s = (String) c2.getCoisa();		
		
		System.out.println(i);
		
		
		System.out.println(s);

		
	}
}
