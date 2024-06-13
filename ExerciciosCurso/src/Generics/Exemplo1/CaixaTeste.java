package Generics.Exemplo1;

public class CaixaTeste {
	

	public static void main(String[] args) {
		//praticando generics
		Caixa<String> c1 = new Caixa();
		Caixa<Integer> c2 = new Caixa();
		c1.setCoisa("aaa");
		
		c2.setCoisa(3);
		
		String str =  c1.getCoisa();
		
		int i = c2.getCoisa();
		System.out.println(c2.getCoisa().getClass());
		
		System.out.println(c1.getCoisa().getClass());
		
	}

}
