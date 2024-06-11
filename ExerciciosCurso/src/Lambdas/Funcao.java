package Lambdas;
import java.util.Arrays;
import java.util.function.*;
import java.util.*;

public class Funcao {
	public static void main(String[] args) {
		
		Function<Integer, String> parOuimpar = n -> n%2 ==0 ? "par" : "impar";
		Function<String, String> txt = n -> "O resultado é: " + n;
		Function<String, String> exc = n -> n + "!!!!!";

		System.out.println(parOuimpar.andThen(txt).andThen(exc).apply(5));
		System.out.println(parOuimpar.andThen(txt).apply(2));
		
	}

}
