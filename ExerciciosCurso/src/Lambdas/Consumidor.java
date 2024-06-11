package Lambdas;
import java.util.Arrays;
import java.util.function.*;
import java.util.*;



public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> nome = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 2, 0.25);
		Produto p2 = new Produto("Mouse", 8, 0.25);
		Produto p3 = new Produto("Celular", 2000, 0.25);
		Produto p4 = new Produto("Fone", 26, 0.25);
		Produto p5 = new Produto("Anel", 2789, 0.25);
		
		nome.accept(p1);
		
		List<Produto> lista = Arrays.asList(p1, p2, p3, p4, p5);
		
		lista.forEach(nome);
		lista.forEach(p -> System.out.println(p.nome));
		
		
	}

}
