package Lambdas.Desafios;

import java.text.DecimalFormat;
import java.util.function.*;

public class Desafio {
	public static void main(String[] args) {
		Produto p1 = new Produto("IPad", 3235.885759, 0.13);
		Function<Produto, Double> comDesconto = p -> p.preco * (1-p.desconto);
		UnaryOperator<Double> impostoMunincipal = p2 -> p2 >=2500 ? p2 + (p2 * 0.085) : p2;
		UnaryOperator<Double> valorComFrete = p2 -> p2 >=3000 ? p2 + 100 : p2 + 50;
		Function<Double, String> Arredondar = p2 -> new DecimalFormat("#.##").format(p2);
		UnaryOperator<String> Formatar = p2 -> "R$" + p2;
		

		
		
		System.out.println(comDesconto.andThen(impostoMunincipal).andThen(valorComFrete).andThen(Arredondar).andThen(Formatar).apply(p1));
		
		
	


		
		
	}

}
