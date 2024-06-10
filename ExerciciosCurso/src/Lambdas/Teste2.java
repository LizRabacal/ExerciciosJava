package Lambdas;

public class Teste2 {
	public static void main(String[] args) {
		Calculo soma = (x, y) -> {return x+y;};
		
		System.out.println(soma.executar(7, 5));
		
		soma = (x, y) -> x*y;
		
		System.out.println(soma.executar(7, 5));

	}

}
