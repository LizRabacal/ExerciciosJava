package Lambdas;
import java.util.function.*;
public class Teste3 {
	public static void main(String[] args) {
		//interface funcional java:
		BinaryOperator<Double> soma = (x, y) -> {return x+y;};
		
		System.out.println(soma.apply(7.0, 5.0));
		
		soma = (x, y) -> x*y;
		
		System.out.println(soma.apply(6.0, 9.0));

	}

}
