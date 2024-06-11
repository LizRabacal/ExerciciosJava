package Lambdas;
import java.util.*;

public class ForeachTest {
	
	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("Luisa", "Matheus", "Josue", "Paulo", "Lara", "Leon");
		
		
		//forma tradicional
		
		for(String a: lista) {
			System.out.println(a);
		}
		
		//Lambda
		
		System.out.println("-------- Lambda ------");
		
		lista.forEach(nome -> {System.out.println(nome);});
		
	System.out.println("-------- Lambda2 ------");
		
		lista.forEach(nome -> {meuImprimir(nome);});
		
		
		System.out.println("------- Method Reference -------");
		lista.forEach(System.out::println);
		
		
		System.out.println("------- Method Reference 2 -------");
		lista.forEach(ForeachTest::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
	System.out.println("Oi, meu nome é " + nome);
	}

}
