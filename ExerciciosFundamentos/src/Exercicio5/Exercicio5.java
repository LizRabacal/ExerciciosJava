package Exercicio5;
import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base e altura do triângulo: ");
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double area = (b*h)/2;
		System.out.println("A área do triângulo é " + area);
		sc.close();
	}

}
