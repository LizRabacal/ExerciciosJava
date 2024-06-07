package ArrayseCollections;

import java.util.*;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		//nao permite duplicidade de chave
		Map<Integer, String> mapa = new HashMap<>();
		
		mapa.put(1, "luana");
		mapa.put(1, "lerry");
		mapa.put(2, "liza");
		mapa.put(2, "gery");
		mapa.put(3, "porta");
		mapa.put(34, "cadeira");
		System.out.println(mapa);
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		System.out.println(mapa.entrySet());
		System.out.println(mapa.get(3));
		System.out.println(mapa.containsKey(3));
		for (int i : mapa.keySet()) {
			System.out.println(mapa.get(i));
		}
		System.out.println(mapa.remove(2));
		for(Entry<Integer, String> registo : mapa.entrySet()) {
			System.out.print(registo.getKey() + "==>");
			System.out.println(registo.getValue());

			
		}


	}

}
