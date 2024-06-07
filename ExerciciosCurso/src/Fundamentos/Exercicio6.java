package Fundamentos;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores de a, b e c para calcular a equação do segundo grau (ax2 + bx + c = 0)");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double delta = (b*b) - (4*a*c);
		double x1 = (-b-Math.sqrt(delta))/(2*a);
		double x2 = (-b+Math.sqrt(delta))/(2*a);
		System.out.printf("Os valores de x1 e x2 são: %.2f e %.2f", x1, x2);
		sc.close();


	}
	

}
