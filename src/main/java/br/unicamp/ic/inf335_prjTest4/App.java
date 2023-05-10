package br.unicamp.ic.inf335_prjTest4;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// TODO Auto-generated method stub !!
		
    			AnuncioBean anuncio = new AnuncioBean();
    			ProdutoBean produto = new ProdutoBean();
    			
    			Scanner sc = new Scanner(System.in);
    			
    			System.out.println("Informe os dados do produto para o Anuncio!");
    			
    			System.out.println("Informe o nome");
    			produto.setNome(sc.nextLine());
    			
    			System.out.println("Informe o codigo do produto");
    			produto.setCodigo(sc.nextLine());
    			
    			System.out.println("Informe a descricao do produto");
    			produto.setDescricao(sc.nextLine());
    			
    			System.out.println("Informe o estado do produto");
    			produto.setEstado(sc.nextLine());
    			
    			System.out.println("Informe o valor do produto!");
    			produto.setValor(sc.nextDouble());
    			
    			System.out.println("Informe o valor do desconto!");
    			anuncio.setDesconto(sc.nextDouble() / 100);
    			anuncio.setProduto(produto);
    			
    			sc.close();
    			
    	//		double valorAnuncio = anuncio.getValor();	
    			
    			System.out.println("-------------------------ANUNCIO-------------------------");
    			
    			System.out.println("O valor do anuncio com o desconto é: R$" + (anuncio.getValor()));
    			System.out.println("O desconto foi de:" + (anuncio.getDesconto() * 100) + "%");
    			System.out.println( "O produto anunciado:" +anuncio.getProduto().getNome());	
    			
    			System.out.println("----------------------------------------------------------");;
    }
}
