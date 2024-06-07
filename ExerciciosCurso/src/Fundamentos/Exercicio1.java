package Fundamentos;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double f = sc.nextDouble();
		double c =  (f-32)/1.8;
		System.out.printf("Em Celsius fica aproximadamente %.2f", c);
		sc.close();
	}

}
