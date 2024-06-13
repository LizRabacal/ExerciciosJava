package Generics;

import java.util.List;

public class ListaUtil {
	
	public static Object getUltimo(List<?> lista) {
		return lista.get(lista.size() -1);
	}
	
	
	
	//nao preciso me preocupar com cast, o metodo ja retorna o tipo T que for passado
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() -1);
	}
	
	
	public static <A, B> B exemplo(){ 
		B b = null;
		
		return b;
		
	}

}
