package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
public class Reduce2 {
	public static void main(String[] args) {
		List<Double> lista = Arrays.asList(7.3, 8.4, 8.3, 9.4, 7.5, 7.9, 7.4, 8.1, 9.2);
		Predicate<Double> aprovado = n-> n>=7;
		Predicate<Double> reprovado = aprovado.negate();
		BiFunction<Media, Double, Media> media = (med, nota) -> med.adc(nota);
		   Comparator<Double> comp = (n1, n2) -> {
	            if (n1 < n2) {
	                return 1; // Retorna 1 se n1 for menor do que n2 (para ordenação decrescente)
	            } else if (n1 > n2) {
	                return -1; // Retorna -1 se n1 for maior do que n2 (para ordenação decrescente)
	            } else {
	                return 0; // Retorna 0 se n1 e n2 forem iguais
	            }
	        };
		BinaryOperator<Media> comb = (x, y) -> x.combinar(x, y);	
		
		Double d = lista.stream().filter(aprovado).reduce(new Media(), media, comb).getMedia();
		
		System.out.println(d);
		
		System.out.println(lista.stream().max(comp));
		
		System.out.println(lista.stream().noneMatch(reprovado));

	}
}
