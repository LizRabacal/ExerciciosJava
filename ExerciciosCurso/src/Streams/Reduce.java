package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.*;

public class Reduce {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Stream<Integer> stream = lista.stream();
		
		List<String> lista2 = Arrays.asList("macarrão", "folha", "arroz", "feijao", "salada", "carne");
		Stream<String> stream2 = lista2.stream();
		
		System.out.println(stream.reduce((x, y) -> x + y).get());
		
		
		System.out.println(stream2.reduce((x, y) -> x + ", " + y).get());
		
		Integer reduce = lista.stream().filter(n-> n>5).map(n->n+10).reduce(1, (x, y) -> x + y);
		
		System.out.println(reduce);
	}
}
