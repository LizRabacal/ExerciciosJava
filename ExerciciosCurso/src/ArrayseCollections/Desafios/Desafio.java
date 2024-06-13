package ArrayseCollections.Desafios;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		
		//Ler a quantidade de notas de um aluno e printar a media das notas
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de notas: ");
		int qtd = sc.nextInt();
		double total = 0;
		double[] notas = new double[qtd];

		for (int i = 0; i < qtd; i++) {
			System.out.println("Me informe a nota " + (i + 1));
			notas[i] = sc.nextDouble();
		}

		for (double nota : notas) {
			total += nota;
		}
		System.out.printf("A sua média é %.2f", total / qtd);

		sc.close();
	}

}
