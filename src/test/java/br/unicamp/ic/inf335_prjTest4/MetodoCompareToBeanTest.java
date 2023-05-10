package br.unicamp.ic.inf335_prjTest4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MetodoCompareToBeanTest {

	private ProdutoBean produtoA = new ProdutoBean();
	private ProdutoBean produtoB = new ProdutoBean();
	
	@Test
	void testGreaterThan() {
		
		//produtoA
		produtoA.setNome("Iphone");
		produtoA.setCodigo("14");
		produtoA.setDescricao("Pro");
		produtoA.setEstado("Novo");
		produtoA.setValor((double) 10000);

		//produtoB
		produtoB.setNome("Iphone");
		produtoB.setCodigo("13");
		produtoB.setDescricao("Pro");
		produtoB.setEstado("Usado");
		produtoB.setValor((double) 5000);


		int compareTo = produtoA.compareTo(produtoB);
		assertEquals(compareTo, 1);
	}
		
	@Test
	void testLessThan() {
			
			//produtoA
			produtoA.setNome("Iphone");
			produtoA.setCodigo("14");
			produtoA.setDescricao("Pro");
			produtoA.setValor((double) 10000);
			produtoA.setEstado("Novo");
			
			//produtoB
			produtoB.setNome("Iphone");
			produtoB.setCodigo("13");
			produtoB.setDescricao("Pro");
			produtoB.setValor((double) 5000);
			produtoB.setEstado("Usado");
			
		int compareTo = produtoB.compareTo(produtoA);
		assertEquals(compareTo, -1);


	}
	
	@Test	
	void testEqual() {
			
			//produtoA
			produtoA.setNome("Iphone");
			produtoA.setCodigo("14");
			produtoA.setDescricao("Pro");
			produtoA.setValor((double) 10000);
			produtoA.setEstado("Novo");
			
			//produtoB
			produtoB.setNome("Iphone");
			produtoB.setCodigo("13");
			produtoB.setDescricao("Pro");
			produtoB.setValor((double) 5000);
			produtoB.setEstado("Usado");
			
			
		int compareTo1 = produtoA.compareTo(produtoA);
		assertEquals(compareTo1, 0);
		int compareTo2 = produtoB.compareTo(produtoB);
		assertEquals(compareTo2, 0);
	}
}
