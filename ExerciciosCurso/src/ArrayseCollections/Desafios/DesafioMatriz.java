package ArrayseCollections.Desafios;
import java.util.Scanner;

public class DesafioMatriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de alunos e notas por aluno respectivamente: ");
		int alunos = sc.nextInt();	
		int notas = sc.nextInt();	
		double total = 0;
		
		double[][] todas_as_notas = new double[alunos][notas];
		
		for(int i=0; i<alunos; i++) {
			for(int j=0; j<notas; j++) {
				System.out.println("Informe a nota " + (j+1) + " do aluno " + (i+1) + ":");
				todas_as_notas[i][j] = sc.nextDouble();
				total+=todas_as_notas[i][j];
			}
		}
		
		
		System.out.println("A média de total de todos os alunos é " + (total/(alunos*notas)));
		sc.close();
		}
	
}
