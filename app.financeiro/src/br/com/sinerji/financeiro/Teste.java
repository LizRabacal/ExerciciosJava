package br.com.sinerji.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.sinerji.app.Calculadora;

public class Teste {
	public static void main(String[] args) {
		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
		
		System.out.println(calc.soma(2, 5));
		

//		System.out.println(calc.getLoggerClass());
		
		
		
//		OperacoesAritmeticas op = new OperacoesAritmeticas();
//		
//		System.out.println(op.soma(5, 6,7));
//		
//		
//		System.out.println(CalculadoraImpl.class.getName());
		Field fid = calc.getClass().getDeclaredFields()[0];
		fid.setAccessible(true);
		try {
			fid.set(calc, "dehbtf");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(calc.getId());
			fid.setAccessible(false);

		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	} 
		
	}

}
