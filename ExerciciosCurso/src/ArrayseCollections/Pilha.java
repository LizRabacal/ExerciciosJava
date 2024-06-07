package ArrayseCollections;
import java.util.*;
public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<>();
		pilha.push("luisa"); //retorna false
		pilha.push("ariana");
		pilha.push("kayne"); //exception
		
		System.out.println(pilha + "\n");
		
		System.out.println(pilha.peek()); //false
		System.out.println(pilha.element() + "\n");//exception
		
		System.out.println(pilha.pop());//exception
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());//false
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());

		
	}

}
