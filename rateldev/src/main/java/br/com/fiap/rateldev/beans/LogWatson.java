package br.com.fiap.rateldev.beans;

import java.sql.Date;

/**
 * class responsável por receber a mensagens que não conseguimos responder no watson
 * contendo os metodo get e set para cada parametro
 * @param id recebe o id 
 * @param setenca ira receber as setencas do watson
 * @param data
 * @author bruno
 * @version 1.0
 *
 */
public class LogWatson {
	private int id;
	private String sentenca;
	private Usuario usuario;
	private Date data;
	
	public LogWatson(int id, String sentenca, Usuario usuario, Date data) {
		this.id = id;
		this.sentenca = sentenca;
		this.usuario = usuario;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSentenca() {
		return sentenca;
	}

	public void setSentenca(String sentenca) {
		this.sentenca = sentenca;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}