package br.com.fiap.rateldev.beans;

public class Menu {
	private int id;
	private String nome;
	private String url;	
	private String descricao;
		
	public Menu(int id, String nome, String url, String descricao) {
		this.id = id;
		this.nome = nome;
		this.url = url;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}