/**
 * 
 */
package br.unicamp.ic.inf335_prjTest4;

import java.util.ArrayList;

/**
 * @author bonacin
 * Classe que representa um anunciante, com respectivos dados e anuncios associados
 */
public class AnuncianteBean {
	/**
	 * Nome do anunciante
	 */
	private String nome;
	/**
	 * CFP do anuncioante
	 */
	private String CPF;
	/**
	 * Lista de anuncios de um anunciante
	 */
	private ArrayList<AnuncioBean> anuncios;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public ArrayList<AnuncioBean> getAnuncios() {
		return anuncios;
	}
	public void setAnuncios(ArrayList<AnuncioBean> anuncios) {
		this.anuncios = anuncios;
	}
	
	/**
	 * Construtor default
	 */
	public AnuncianteBean() {
		nome = new String();
		CPF = new String();
		anuncios = new ArrayList<AnuncioBean>();
	}
	
	
	/**
	 * Construtor com parametros
	 * @param nome
	 * @param cPF
	 * @param anuncios
	 */
	public AnuncianteBean(String nome, String cPF, ArrayList<AnuncioBean> anuncios) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.anuncios = anuncios;
	}
	

	/**
	 * Inclui novo anuncio na lista de anuncios de um anunciante
	 * @param nAnuncio Anuncio a ser incluido
	 */
	public void addAnuncio (AnuncioBean nAnuncio) {
		anuncios.add(nAnuncio);	
	}
	
	/**
	 * Inclui novo anuncio na lista de anuncios de um anunciante
	 * @param nAnuncio Anuncio a ser incluido
	 */
	public void removeAnuncio (int i) {
		anuncios.remove(i);	
	}
	
	/**
	 * Calcula o valor medio de anuncios de um anuciante
	 * @return valor medio dos anuncios 
	 */
	public Double valorMedioAnuncios() {
		Double soma = 0.0;
		for (AnuncioBean an:anuncios) {
			soma += an.getValor();
		}
		if (anuncios.size() > 0) {
			return soma/anuncios.size();	
		}
		else {
			return (double)0;
		}
		
	}

}
