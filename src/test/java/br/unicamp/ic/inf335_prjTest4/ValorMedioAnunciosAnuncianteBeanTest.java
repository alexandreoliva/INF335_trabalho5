package br.unicamp.ic.inf335_prjTest4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValorMedioAnunciosAnuncianteBeanTest {
		
	private AnuncioBean anuncioA = new AnuncioBean();
	private AnuncioBean anuncioB = new AnuncioBean();
	private AnuncioBean anuncioC = new AnuncioBean();
	
	private AnuncianteBean anuncianteX = new AnuncianteBean();
	private AnuncianteBean anuncianteY = new AnuncianteBean();
	
	private ProdutoBean produto1 = new ProdutoBean();
	private ProdutoBean produto2 = new ProdutoBean();
	private ProdutoBean produto3 = new ProdutoBean();
	
	
	@Test
	void testAdicionarAnuncio() {
	
		anuncianteX.setCPF("123.321.555-15");
		anuncianteX.setNome("João Silva");
		
		produto1.setValor((double) 1000);
		
		anuncioA.setProduto(produto1);

		anuncianteX.addAnuncio(anuncioA);
		//se não teve erro, os anúncios foram salvos corretamente

	}	
	
	@Test
	void testMediaValores() {
		
		anuncianteX.setCPF("123.321.555-15");
		
		produto1.setValor((double) 1000);
		produto2.setValor((double) 2000);
		produto3.setValor((double) 3000);
		
		anuncioA.setProduto(produto1);
		anuncioB.setProduto(produto2);
		anuncioC.setProduto(produto3);
		
		anuncianteX.addAnuncio(anuncioA);
		anuncianteX.addAnuncio(anuncioB);
		anuncianteX.addAnuncio(anuncioC);
				
		double valorMedio = anuncianteX.valorMedioAnuncios();
		assertEquals(valorMedio, 2000);

	}	
		@Test
		void testMediaValoresAnunciosPorCPF() {
			
			anuncianteX.setCPF("123.321.555-15");
			anuncianteY.setCPF("123.123.005-15");
			
			produto1.setValor((double) 1000);
			produto2.setValor((double) 2000);
			produto3.setValor((double) 3000);
			
			anuncioA.setProduto(produto1);
			anuncioB.setProduto(produto2);
			anuncioC.setProduto(produto3);
			
			anuncianteX.addAnuncio(anuncioA);
			anuncianteX.addAnuncio(anuncioB);
			anuncianteX.addAnuncio(anuncioC);
					
			double valorMedioY = anuncianteY.valorMedioAnuncios();
			assertEquals(valorMedioY, 0);
			double valorMedioX = anuncianteX.valorMedioAnuncios();
			assertEquals(valorMedioX, 2000);
		}	
		
		
	@Test
	void testRemoveAnuncios() {
	
		anuncianteX.setCPF("123.321.555-15");
		
		produto1.setValor((double) 1000);
		produto2.setValor((double) 2000);
		produto3.setValor((double) 3000);
		
		anuncioA.setProduto(produto1);
		anuncioB.setProduto(produto2);
		anuncioC.setProduto(produto3);
	
		anuncianteX.addAnuncio(anuncioA);
		anuncianteX.addAnuncio(anuncioB);
		anuncianteX.addAnuncio(anuncioC);
		
		double valorMedio = anuncianteX.valorMedioAnuncios();
		assertEquals(valorMedio, 2000);
		
		anuncianteX.removeAnuncio(0);
		
		double valorMedioX = anuncianteX.valorMedioAnuncios();
		assertEquals(valorMedioX, 2500);
		
		
	}

}
