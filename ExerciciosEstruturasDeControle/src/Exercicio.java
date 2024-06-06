import java.time.LocalDate;
import java.util.*;

public class Exercicio {

	public static void main(String[] args) {

//		
//		Exercícios: Estruturas de Controle
//		Estruturas de Controle
//
//		1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
		System.out.print("Digite um numero: \n");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num % 2 == 0 && num >= 0 && num <= 10) {
			System.out.print("O numero é par e esta entre 0 e 10 \n");
		}

//
//		2. Criar um programa informa se o ano atual é um ano bissexto;

		int current_year = LocalDate.now().getYear();
		if (current_year % 4 == 0) {
			System.out.print("ano atual bisexto ;D \n");

		} else {
			System.out.print("ano atul nao bissexto \n");
		}

//
//		3. Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
		System.out.print("Digite suas notas \n");

		double p1 = sc.nextDouble();
		double p2 = sc.nextDouble();
		double media = (p1+p2)/2;
		if(media >= 7) {
			System.out.print("Aprovado! \n");
		}else if (media > 4) {
			System.out.print("Recuperação \n");
		}else {
			System.out.print("Reprovado \n");
		}

//
//		4. Criar um programa que receba um número e diga se ele é um número primo.
		System.out.print("Digite um numero pra verificar se é primo: \n");

		 num = sc.nextInt();
		 int i;
		 int cont = 0;
			
			for (i = 2; i<num; i++) {
				if(i == num) continue;
				if(num%i== 0) {
					cont++;
				}
			}
			
			if(cont==0) {
				System.out.print("O numero é primo! \n");
			}else {
				System.out.print("O numero não é primo \n");

			}
//
//		5. Refatorar o exercício 04, utilizando a estrutura switch.
			
//		switch(cont) {
//		case 0:
//			System.out.print("O número é primo \n");
//			break;
//		default:
//			System.out.print("O numero não é primo \n");
//		}

//
//		6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
			int random = new Random().nextInt(101);
			int cont2 = 10;
		
			while(cont2 > 0) {
				System.out.print("Digite um valor entr 0 e 100 \n");
				int n1 = sc.nextInt();
				if(n1 == random) { 
					System.out.print("Parabéns! Você acertou o número \n");
					break;
				}else {
					String str = n1 > random ? " maior " : " menor ";
					cont2--;
					System.out.print("Você ainda tem " + cont2 +" tentativas e o número é " + str + "que o numero armazenado \n");
				}
				
			 
				
			}

//
//		7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
//
		double total = 0;
		double n5 = 0;
		while(n5>=0) {
			System.out.println("Digite um numero positivo: ");
			n5 = sc.nextDouble();
			if(n5<0)break;
			total+=n5;
			System.out.println("Total: " + total);
		}
			
		
//		8. Criar um programa que receba uma palavra e imprime no console letra por letra.
		String word = sc.next();
		for(i=0;i<word.length();i++) {
			System.out.println(word.charAt(i));
		}
		
//
//		9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
		
		int cont3 = 0;
		double value;
		double bigger=0;
		System.out.println("Digite 10 numeros pra ver qual é maior: ");
		while(cont3<10) {
			value = sc.nextDouble();
			if(cont3==0) { 
				bigger=value;
			} else{

				if(value > bigger) { 
					bigger = value; 
					}
			}
			cont3++;
	
		}
		System.out.println("O maior numero é: " + bigger);
		
		sc.close();

	}

}
