package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.function.*;


public class Teste {
	public static void main(String[] args) {
		Consumer<Object> println = System.out::println;
		List<String> lista = Arrays.asList("Pao", "Queijo", "Presunto", "Pata de dente");
		
		lista.forEach(p -> {System.out.println(p);});
		System.out.println("--------------------------");

		lista.forEach(System.out::println);
		System.out.println("--------------------------");

		Iterator<String> ite = lista.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("--------------------------");

		Stream<String> stream = lista.stream();


		System.out.println("--------------------------");

		stream.filter(p -> p.equals("Pao"));
		
		System.out.println(stream.parallel());
		System.out.println("--------------------------");
		Stream<String> langs = Stream.of("Python", "Java", "JavaScript", "Go");
		
		int[] array =  {3, 5, 6, 7};
		
		Stream<int[]> SI = Stream.of(array);
		
		Stream.iterate(0, n->n+1).forEach(println);;
		


	}

}
