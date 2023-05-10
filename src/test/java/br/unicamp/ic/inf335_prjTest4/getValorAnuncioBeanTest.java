package br.unicamp.ic.inf335_prjTest4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class getValorAnuncioBeanTest {

	private AnuncioBean anuncio = new AnuncioBean();
	private ProdutoBean produto = new ProdutoBean();
	
	
	@Test
	void testGetValor() {
		
						
				produto.setNome("Iphone");
				produto.setCodigo("14");
				produto.setDescricao("Pro");
				produto.setEstado("Novo");
				produto.setValor((double) 10000);
				
				anuncio.setProduto(produto);
				anuncio.setDesconto(0.9);
				
		double getValor = anuncio.getValor();
		assertEquals(getValor, 1000);
	}

}
