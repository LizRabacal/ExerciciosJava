package Exercicio2;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double c = sc.nextDouble();
		double f =  (c*1.8) + 32;
		System.out.printf("Em Fahrenheit fica aproximadamente %.2f", f);
		sc.close();
	}
}
