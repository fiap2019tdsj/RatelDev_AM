package br.com.fiap.rateldev.beans;

public class Log {
	private int id;
	private String local;
	private String metodo;
	private String descricao;
	
	public Log(int id, String local, String metodo, String descricao) {
		this.id = id;
		this.local = local;
		this.metodo = metodo;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
