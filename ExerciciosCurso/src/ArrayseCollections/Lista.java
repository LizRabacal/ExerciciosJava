  package ArrayseCollections;
import java.util.*;

public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario("Liz");
		Usuario u2 = u1;
		lista.add(u1);
		lista.add(new Usuario("Julia"));
		lista.add(new Usuario("Matheus"));
		lista.add(new Usuario("Joao"));

		System.out.println(lista.get(2));
	
		System.out.printf("Tem??? %s  \n", lista.contains(new Usuario("Liz")));
		
		System.out.printf("%b + \n", lista.remove(u2));
	
		for(Usuario p : lista) {
			System.out.println(p);
		}
		
	}

}
