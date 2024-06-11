package Lambdas;
import java.util.function.*;
public class Unario {
	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = n -> n+2;
		UnaryOperator<Integer> vezesDois = n -> n*2;
		UnaryOperator<Integer> sqrt = n -> n*n;
		
		System.out.println(maisDois.andThen(vezesDois).andThen(sqrt).apply(2));
		System.out.println(maisDois.compose(vezesDois).compose(sqrt).apply(2));


		

		
	}

}
