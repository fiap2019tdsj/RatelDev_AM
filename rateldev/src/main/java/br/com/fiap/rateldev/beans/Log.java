package br.com.fiap.rateldev.beans;

import java.sql.Date;

/**
 * ** Representa um histórico de informações
 * @author RatelDev
 * @version 1.0
 */
public class Log {
	private int id;
	private String local;
	private String metodo;
	private String descricao;
	private Date data;
	
	/**
	 * ** Cria um histórico de ações feitas pelo usuário
	 * @param id, id do histórico
	 * @param local, local onde o método foi chamado
	 * @param metodo, método utilizado
	 * @param descricao, descrição da ação do usuário
	 * @param data, data que a pergunta foi feita
	 */
	public Log(int id, String local, String metodo, String descricao, Date data) {
		this.id = id;
		this.local = local;
		this.metodo = metodo;
		this.descricao = descricao;
		this.data = data;
	}

	/**
	 * ** Pega a data do histórico
	 * @return retorna um date que representa a data do histórico
	 */
	public Date getData() {
		return data;
	}

	/**
	 * ** Define a data do histórico
	 * @param data, data do histórico
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * ** Pega o id do histórico
	 * @return retorna um inteiro que representa o id do histórico
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * ** Define o id do histórico
	 * @param id, id do histórico
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * ** Pega o local onde a ação do usuário ocorreu
	 * @return retorna uma String que representa o local onde a ação do usuário ocorreu
	 */
	public String getLocal() {
		return local;
	}

	/**
	 * ** Define o local onde a ação do usuário ocorreu
	 * @param local, o local onde a ação do usuário ocorreu
	 */
	public void setLocal(String local) {
		this.local = local;
	}

	/**
	 * ** Pega o método onde a ação do usuário ocorreu
	 * @return retorna uma String que representa o método onde a ação do usuário ocorreu
	 */
	public String getMetodo() {
		return metodo;
	}

	/**
	 * ** Define o método onde a ação do usuário ocorreu
	 * @param metodo, metodo do histórico
	 */
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	/**
	 * ** Pega a descrição da ação do usuário
	 * @return retorna uma String que representa a descrição da ação do usuário
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * ** Define a descrição da ação do usuário
	 * @param descricao, descricao do histórico
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
