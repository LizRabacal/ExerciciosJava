package Fundamentos;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		System.out.println("Digite sua altura e peso: ");
		Scanner sc = new Scanner(System.in);
		double h = sc.nextDouble();
		double w = sc.nextDouble();
		double imc = w/(h*h);
		System.out.printf("Seu IMC é %.2f", imc);
		sc.close();
	}

}
