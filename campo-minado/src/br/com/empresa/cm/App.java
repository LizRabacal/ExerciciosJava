package br.com.empresa.cm;

import br.com.empresa.cm.modelo.Tabuleiro;
import br.com.empresa.cm.visao.TabuleiroConsole;

import java.util.*;

public class App {
	
	public static void main(String[] args) {
		Tabuleiro tab = new Tabuleiro(10, 10, 10);
		TabuleiroConsole console = new TabuleiroConsole(tab);
		
		console.executar();


	}

}
