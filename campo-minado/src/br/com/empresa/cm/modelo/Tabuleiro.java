package br.com.empresa.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<>();
	
	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinar();
		
	}
	
	
	public void abrir(int linha, int coluna) {
		campos.stream()
		.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
		.findFirst()
		.ifPresent(c ->c.abrir());
		}
	
	
	
	public void marcar(int linha, int coluna) {
		campos.stream()
		.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
		.findFirst()
		.ifPresent(c -> c.alternarMarcacao());
		
		
		}

	private void sortearMinar() {
		long minasArmadas;
		do {
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(v -> v.isMinado()).count();
		}while(minasArmadas < minas);
	}

	private void associarVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
		
	}

	private void gerarCampos() {
		for(int i = 0; i<linhas; i++) {
			for(int j = 0; j<colunas; j++) {
				campos.add(new Campo(i, j));
				
			}
		}
	}
	
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c-> c.objetivoAlcancado());
	}
	
	
	public void reiniciar() {
		campos.stream().forEach(c-> c.reiniciar());
		sortearMinar();
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int c = 0;
		
		for(int i = 0; i<linhas; i++) {
			
			for(int j = 0; j<colunas; j++) {
			
				sb.append(" ");
				sb.append(campos.get(c));
				sb.append(" ");
				c++;


			}
			sb.append("\n");
		}
		
		
		return sb.toString();
	}


}
