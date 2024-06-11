package Lambdas;
import java.util.function.*;
public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> par = (n) -> n%2==0;
		Predicate<Integer> tred = (n) -> n>=100 && n<=999;
		
		System.out.println(par.and(tred).test(188));
		
		System.out.println(par.and(tred).negate().test(187));

	}

}
