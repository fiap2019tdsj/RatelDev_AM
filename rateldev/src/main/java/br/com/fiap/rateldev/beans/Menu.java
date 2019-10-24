package br.com.fiap.rateldev.beans;

/**
 * ** Representa um menu do sistema
 * @author RatelDev
 * @version 1.0
 */
public class Menu {
	private int id;
	private String nome;
	private String url;	
	private String descricao;
	
	/**
	 * ** Cria um menu do sistema
	 * @param id, id do menu
	 * @param nome, nome do menu
	 * @param url, url do menu
	 * @param descricao, descricao da funcionalidade do menu
	 */
	public Menu(int id, String nome, String url, String descricao) {
		this.id = id;
		this.nome = nome;
		this.url = url;
		this.descricao = descricao;
	}
	
	/**
	 * ** Pega o id do menu
	 * @return retorna um inteiro que representa o id do menu
	 */
	public int getId() {
		return id;
	}

	/**
	 * ** Define o id do menu
	 * @param id, id do menu
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * ** Pega o nome do menu
	 * @return retorna uma String que representa o nome do menu
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * ** Define o nome do menu
	 * @param nome, nome do menu
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * ** Pega a url do menu
	 * @return retorna uma String que representa a url do menu
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * ** Define a url do menu
	 * @param url, url do menu
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * ** Pega a descricao do menu
	 * @return retorna uma String que representa a descricao do menu
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * ** Define a descricao do menu
	 * @param descricao, descricão do menu
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}