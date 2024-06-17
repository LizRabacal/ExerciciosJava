package br.com.sinerji.app.calculo;

import br.com.sinerji.app.Calculadora;
import br.com.sinerji.app.calculo.interno.OperacoesAritmeticas;
import br.com.sinerji.app.logging.Logger;

public class CalculadoraImpl implements Calculadora{
	private String id = "abc";
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();
	
	private Logger logger = new Logger();
	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
	
	public Class<Logger> getLoggerClass(){
		return Logger.class;
	}

	
}
