package Lambdas;
import java.util.function.*;

import Lambdas.Desafios.Produto;


public class Predicado {
	
	public static void main(String[] args) {
		Predicate<Integer> par = (n) ->  n%2==0;
		Predicate<Produto> isCaro = prod -> prod.preco*(1-prod.desconto) >=750; 
		
		System.out.println(par.test(6));
		System.out.println(par.test(9));


	}

}
