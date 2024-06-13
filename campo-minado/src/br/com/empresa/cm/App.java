package br.com.empresa.cm;

import br.com.empresa.cm.modelo.Tabuleiro;
import br.com.empresa.cm.visao.TabuleiroConsole;

import java.util.*;

public class App {
	
	public static void main(String[] args) {
		Tabuleiro tab = new Tabuleiro(5, 5, 5);
		TabuleiroConsole console = new TabuleiroConsole(tab);
		
		console.executar();


	}

}
