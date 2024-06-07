package Collections;
import java.util.*;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.offer("laura"); //retorna false se n conseguir
		fila.add("ana"); //retorna exception se n conseguir
		fila.add("jao");
		fila.offer("luis");
		fila.offer("leni");
		fila.add("pablo");
		
		System.out.println(fila);
		
		
		//obter 1 elemento da fila
		System.out.println(fila.peek());//retorna false se n conseguir
		System.out.println(fila.element());//retorna exception se n conseguir

		
		//remover
		System.out.println(fila.remove()); //lanca exception
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila);


		
	}

}
