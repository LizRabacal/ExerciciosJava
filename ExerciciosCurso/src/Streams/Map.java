package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.function.*;

public class Map {
	public static void main(String[] args) {
		Consumer<Object> println = System.out::println;
//		UnaryOperator<String> upperCase = p -> p.toUpperCase();
//		UnaryOperator<String> primeiraLetra = p -> p.charAt(0) + " ";
		UnaryOperator<String> grito = p -> p + "!!!!!";


		List<String> lista = Arrays.asList("Banana", "Maca", "Melao", "Pera");
		Stream stream = lista.stream();
		
		stream.map(Utilitarios.upperCase).map(grito).forEach(println);
		
		System.out.println(lista);
		
		
		
		
		
		
	}

}
