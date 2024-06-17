/**
 * 
 */
/**
 * 
 */
 module app.calculo {
	
	exports br.com.sinerji.app.calculo;
	requires transitive app.loggin;
	
	
	exports br.com.sinerji.app.calculo.interno 
	to app.financeiro;
	

	requires app.api;
	//com o provides-with da pra passar diversas implementaçoes de uma interface pra outros projetos 
	provides br.com.sinerji.app.Calculadora with br.com.sinerji.app.calculo.CalculadoraImpl;

	//opens posibilita que outro projeto acesse os atributos privados atraves de reflection de determinada classe
	opens br.com.sinerji.app.calculo to app.financeiro;


}