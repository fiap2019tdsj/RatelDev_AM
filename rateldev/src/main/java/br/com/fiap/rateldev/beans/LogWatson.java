package br.com.fiap.rateldev.beans;

import java.sql.Date;

/**
 * ** Representa um histórico de perguntas não entendidas pelo chatbot
 * @author RatelDev
 * @version 1.0
 */
public class LogWatson {
	private int id;
	private String sentenca;
	private Usuario usuario;
	private Date data;
	
	
	/**
	 * ** Cria um histórico de perguntas não entendidas pelo chatbot
	 * @param id, id do histórico
	 * @param sentenca, a pergunta feita pelo usuário
	 * @param usuario, o usuário que fez a pergunta
	 * @param data, data que a pergunta foi feita
	 */
	public LogWatson(int id, String sentenca, Usuario usuario, Date data) {
		this.id = id;
		this.sentenca = sentenca;
		this.usuario = usuario;
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
	 * ** Pega a pergunta feita pelo usuário
	 * @return retorna uma String que representa a pergunta feita pelo usuário
	 */
	public String getSentenca() {
		return sentenca;
	}

	/**
	 * ** Define a pergunta feita pelo usuário
	 * @param sentenca, sentenca feita pelo usuário
	 */
	public void setSentenca(String sentenca) {
		this.sentenca = sentenca;
	}

	/**
	 * ** Pega a data que a pergunta foi feita
	 * @return retorna um Date que representa a data que a pergunta foi feita
	 */
	public Date getData() {
		return data;
	}

	/**
	 * ** Define a data que a pergunta foi feita
	 * @param data, data do histórico
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * ** Pega o usuário que fez a pergunta
	 * @return retorna um usuário que representa o usuário que fez a pergunta
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * ** Define o usuário que fez a pergunta
	 * @param usuario, usuário que fez a pergunta
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}