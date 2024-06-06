package Exercicio6;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores de a, b e c para calcular a equação do segundo grau (ax2 + bx + c = 0)");
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double c = sc.nextDouble();
		Double delta = (b*b) - (4*a*c);
		Double x1 = (-b-Math.sqrt(delta))/(2*a);
		Double x2 = (-b+Math.sqrt(delta))/(2*a);
		System.out.printf("Os valores de x1 e x2 são: %.2f e %.2f", x1, x2);
		sc.close();


	}
	

}
