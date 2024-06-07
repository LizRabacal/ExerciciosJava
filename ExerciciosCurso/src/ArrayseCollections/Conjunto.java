package ArrayseCollections;
import java.util.*;

public class Conjunto {
	public static void main(String[] args) {
		
		//Set sao conjuntos que nao permitem duplicação de dados com o mesmo valor/ref
		TreeSet<String> lista = new TreeSet<>();
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro");
		
		for(String candidato : lista) {
			System.out.println(candidato);
		}
		
		
		Set<String> lista2 = new HashSet<>();
		lista2.add("Ana");
		lista2.add("Carlos");
		lista2.add("Luca");
		lista2.add("Pedro");
		
		for(String candidato : lista2) {
			System.out.println(candidato);
		}
		
	}
}
