package Streams.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import Streams.Produto;
import Streams.Utilitarios;

import java.util.function.*;

public class DesafioFilter {
	public static void main(String[] args) {
		//Desafio de aplicar stream para filtrar os objetos q tem o desconto maior ou igual 
		// a 30% e frete gratis e dps printar os nomes
		Produto p1 = new Produto("tablet", 3000, 0.35, false);
		Produto p2 = new Produto("IPhone 16", 12000, 0.45, true);
		Produto p3 = new Produto("TV", 4678, 0.25, true);
		Produto p4 = new Produto("Fone", 1350, 0.33, true);
		Produto p5 = new Produto("Garrafa térmica", 1700, 0.15, false);
		Produto p6 = new Produto("Capa", 60, 0.35, true);

		Predicate<Produto> op = p -> p.getDesconto() >= 0.3 && p.isFreteGratis(); 
		
		List<Produto> lista = Arrays.asList(p1, p2, p3, p4, p5, p6);
		Stream<Produto> stream = lista.stream();
		
		
		
		stream.filter(op).map(p -> p.getNome()).forEach(Utilitarios.println);
		
		
		
		
		
		
		
		
//		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		Stream<Integer> stream = lista.stream();
//		
//		stream.filter(n->n%2==0);
//		
//		stream.forEach(Utilitarios.println);


	}

}
