package br.com.empresa.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.function.*;

import br.com.empresa.cm.excecao.ExplosaoException;

public class Campo {
	
	private final int linha;
	private final int coluna;
	private boolean minado;
	private boolean aberto;
	private boolean marcado;
	private List<Campo> vizinhos = new ArrayList<>();
	
	
	public boolean isMinado() {
		return minado;
	}

	public void setMinado(boolean minado) {
		this.minado = minado;
	}

	public List<Campo> getVizinhos() {
		return vizinhos;
	}

	public void setVizinhos(List<Campo> vizinhos) {
		this.vizinhos = vizinhos;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}


	
	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}


	
	public boolean isMarcado() {
		return marcado;
	}

	public void setMarcado(boolean marcado) {
		this.marcado = marcado;
	}



	Campo(int linha, int coluna){
			this.linha = linha;
			this.coluna = coluna;
			
		}
	
	boolean adicionarVizinho(Campo campo) {
		
		boolean linhaDiferente = campo.linha != linha;
		boolean colunaDiferente = campo.coluna != coluna;
		boolean diagonal =  linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(campo.linha - linha);
		int deltaColuna = Math.abs(campo.coluna - coluna);
		
		int deltaGeral = deltaColuna+deltaLinha;

			if(deltaGeral == 1 && !diagonal) {
				vizinhos.add(campo);
				return true;
			}else if (deltaGeral == 2 && diagonal) {
				vizinhos.add(campo);
				return true;

			}else {
				return false;
			}
		
	}
	
	
	
	void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
		}
	}
	
	
	boolean abrir() {
		
		if(!aberto && !marcado) {
			
			aberto = true;
			
			if(minado) {
				
                 throw new ExplosaoException();
			
		    }
			
			if(vizinhancaSegura()) {
				
				vizinhos.forEach(v -> v.abrir());
			}
			
			
			return true;
		}
		
		return false;
	}
	
	
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v-> v.minado);
	}
	
	
	
	long vizinhosMinados() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}
	
	
	void minar() {
		minado = true;
	}
	
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado && protegido;
		
		
	}
	
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	
	
	public String toString() {
		
	
		
		
		if(marcado) {
			return "X";
		}else if(aberto && minado) {
			return "*";
		}else if(aberto && vizinhosMinados() > 0) {
			return Long.toString(vizinhosMinados());
			
		}else if(aberto){
			return "■";
		}else {
			return "?";
		}
	}
	
	
	
	
	
	
	
	
}
