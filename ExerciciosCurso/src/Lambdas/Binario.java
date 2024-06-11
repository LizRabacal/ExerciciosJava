package Lambdas;
import java.util.function.*;

public class Binario {
	
	public static void main(String[] args) {
		BinaryOperator<Double> media = (x, y) -> (x+y)/2;
		UnaryOperator<Double> maisTres = (n) -> n+3;
		BiFunction<Double, Double, String> aprovado = (n1, n2) -> media.apply(n1, n2)>= 7 ? "Aprovado" : "Reprovado";
	
		
		System.out.println(media.andThen(maisTres).apply(5.0, 3.0));
		
		
		System.out.println(aprovado.apply(9.1, 6.8));
		
		
	}

}
