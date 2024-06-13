package ArrayseCollections;
import java.util.*;
public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<>();
		pilha.push("luisa"); //retorna false se der errado
		pilha.push("ariana");
		pilha.push("kayne"); //exception se der errado
		
		System.out.println(pilha + "\n");
		
		System.out.println(pilha.peek()); //se der errado retorna null
		System.out.println(pilha.element() + "\n");//exception
		
		System.out.println(pilha.pop());//se der errado retorna exception
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());// se der errado retorna null
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());

		
	}

}
