package ArrayseCollections;

import java.util.*;

public class HashTeste {
	public static void main(String[] args) {
		
		HashSet<Usuario> hash = new HashSet<>();
		
		hash.add(new Usuario("Matheus"));
		hash.add(new Usuario("Joao"));
		hash.add(new Usuario("Laiza"));
		hash.add(new Usuario("Liz"));
		
		System.out.println(hash.contains(new Usuario("Liz")));


	}

}
