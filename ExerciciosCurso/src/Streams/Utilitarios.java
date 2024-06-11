package Streams;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Utilitarios {
	private Utilitarios() {
		
	}
	public static final Consumer<Object> println = System.out::println;
	public static final UnaryOperator<String> upperCase = p -> p.toUpperCase();
	public static final UnaryOperator<String> primeiraLetra = p -> p.charAt(0) + " ";
//	public final UnaryOperator<String> grito = p -> p + "!!!!!";
	
	public static final String grito(String s) {
		return s + "!!!!!";
		
	}
}
