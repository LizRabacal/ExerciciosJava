package br.com.empresa.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.empresa.cm.excecao.ExplosaoException;

class CampoTest {
	private Campo campo;
	@BeforeEach
	void iniciarCampo() {
		 campo = new Campo(3, 3);
		
	}
	
	
	@Test
	void test() {
		
		boolean r = campo.adicionarVizinho(new Campo(3, 2));
		boolean r2 = campo.adicionarVizinho(new Campo(3, 4));
		boolean r3 = campo.adicionarVizinho(new Campo(4, 4));
		boolean r4 = campo.adicionarVizinho(new Campo(2, 3));
		boolean r5 = campo.adicionarVizinho(new Campo(4, 4));
		boolean r6 = campo.adicionarVizinho(new Campo(2, 3));
		boolean r7 = campo.adicionarVizinho(new Campo(4, 4));
		boolean r8 = campo.adicionarVizinho(new Campo(4, 2));
		assertTrue(r && r2 && r3 && r4 && r5 && r6 && r7 && r8);
		

	}

	@Test
	void testPadraoAlternar() {
		assertFalse(campo.isMarcado());
	}
	
	

	@Test
	void testAlternar() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testAlternarDesamarcar() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testAbrir() {		
		assertTrue(campo.abrir());
	}
	
	
	@Test
	void testFechar() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testAbriCampoMinado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	@Test
	void testAbrirOutroCampoMinado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () ->{
			campo.abrir();
		});
	}
	
	
	@Test
	void testAbrirOutros() {
	Campo campo11= new Campo(1, 1);
	Campo campo12= new Campo(1, 2);
	campo12.minar();
	Campo campo22= new Campo(2, 2);

	campo22.adicionarVizinho(campo11);
	campo22.adicionarVizinho(campo12);
	campo22.abrir();

assertTrue(campo22.isAberto());

	}
	
	
	@Test
	void testAbrirOutros2() {
	Campo campo11= new Campo(1, 1);
	Campo campo12= new Campo(1, 2);
	campo12.minar();
	Campo campo22= new Campo(2, 2);

	campo22.adicionarVizinho(campo11);
	campo22.adicionarVizinho(campo12);
	campo22.abrir();

    assertTrue(campo12.toString() == "?");

	}
}
