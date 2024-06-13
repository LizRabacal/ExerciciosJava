package Streams.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import Streams.Utilitarios;

import java.util.function.*;
import java.lang.StringBuilder;
public class DesafioMap {
	public static void main(String[] args) {
		//desafio de converter arraylist de int pra binario, dps inverter o binario e dps tranformar em int dnv 
		// utilizando lambdas
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Function<Integer, String> toBinary = n -> n.toBinaryString(n);
		UnaryOperator<String> Inverse = n -> new StringBuilder(n).reverse().toString();
		Function<String, Integer> toIntegerAgain = n -> Integer.parseInt(Inverse.apply(n), 2);
		Stream<Integer> stream = lista.stream();
		
		stream.map(Integer::toBinaryString).map(Inverse).map(toIntegerAgain).forEach(Utilitarios.println);
		

	}
}
