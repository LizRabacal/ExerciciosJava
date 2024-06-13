package Generics.Exemplo4;

public class ParesTeste {
	public static void main(String[] args) {
		Pares<Integer, String> resultado = new Pares<>();
		
		resultado.adicionar(2, "Luizao");
		resultado.adicionar(2, "Mel");

		resultado.adicionar(4, "Luiza");
		resultado.adicionar(5, "Marina");
		resultado.adicionar(6, "pessoa");
		
		
//		System.out.println(resultado.getValor(5));
		
		resultado.itens.stream().map(m -> m.getValor()).forEach(System.out::println);

		
	}
}
