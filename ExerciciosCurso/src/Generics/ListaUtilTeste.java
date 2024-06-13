package Generics;

import java.util.*;

public class ListaUtilTeste {
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("php", "js", "java", "c#");
		List<Integer> nums = Arrays.asList(1,2 ,3 ,4 ,5 ,6);
		
		String ultimaLang = (String) ListaUtil.getUltimo(langs);
		int ultimoNum = (Integer) ListaUtil.getUltimo(nums);
		
		System.out.println(ultimaLang);
		System.out.println(ultimoNum);
		
		
		System.out.println(ListaUtil.getUltimo2(nums));
		System.out.println(ListaUtil.getUltimo2(langs));

		System.out.println(ListaUtil.getUltimo2(langs));

	}
	

}
