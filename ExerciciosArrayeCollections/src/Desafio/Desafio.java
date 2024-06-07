package Desafio;
import java.util.Scanner;
public class Desafio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de notas: ");
		int qtd = sc.nextInt();
		double total = 0;
		double[] notas = new double[qtd];
		
		for(int i = 0; i<qtd; i++) {
			System.out.println("Me informe a nota " + (i+1));
			notas[i] = sc.nextDouble();
		}
		
		for(double nota : notas) {
			total+=nota;
		}
		
		System.out.println("Sua média é " + total/notas.length);
		
		sc.close();	
		}
	

}
