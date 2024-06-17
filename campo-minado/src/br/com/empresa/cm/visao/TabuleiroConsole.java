package br.com.empresa.cm.visao;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.empresa.cm.excecao.ExplosaoException;
import br.com.empresa.cm.excecao.SairException;
import br.com.empresa.cm.modelo.Tabuleiro;

public class TabuleiroConsole {
	Tabuleiro tabuleiro;
	private Scanner sc = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		executar();
	}

	public void executar() {
		try {
			boolean continuar = true;
			while (continuar) {
				ciclodoJogo();
				System.out.println("Quer jogar de novo? S/n");
				String r = sc.nextLine();
				if ("n".equalsIgnoreCase(r)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
		} catch (SairException e) {
			System.out.println("Tchauu");
		} finally {
			sc.close();
		}
	}

	private void ciclodoJogo() {
		try {
			while (!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				System.out.println("Digite as coordenadas (linha e coluna):");

				boolean leu = false;
				int l = 0;
				int c = 0;

				while (!leu) {
					try {
						l = sc.nextInt();
						c = sc.nextInt();
						leu = true;
					} catch (InputMismatchException e) {
						System.out.println("Digite apenas números!");
						sc.next(); // Consome a entrada inválida
					}
				}

				sc.nextLine(); // Consumir o resto da linha após os números

				String res = "";

				while (!res.equalsIgnoreCase("m") && !res.equalsIgnoreCase("a")) {
					System.out.println("Digite se quer abrir ou marcar (A/m):");
					res = sc.nextLine();

					if (res.equalsIgnoreCase("m")) {
						tabuleiro.marcar(l - 1, c - 1);
					} else if (res.equalsIgnoreCase("a")) {
						tabuleiro.abrir(l - 1, c - 1);
					} else {
						System.out.println("Entrada inválida! Digite 'A' para abrir ou 'M' para marcar.");
					}
				}
			}

			System.out.println("GANHOUUU!");
		} catch(ExplosaoException e) {
			System.out.println("UMA BOMBA EXPLODIU!");
		}
	}
}
