package br.com.fiap.rateldev.beans;

import java.sql.Date;

/**
 * **
 * class log é responsável por carregar as propriedades do log contendo metodo get e set
 * @param id
 * @param local
 * @param metodo 
 * @param descricao 
 * @author RatelDev
 * @version 1.0
 *
 */
public class Log {
	private int id;
	private String local;
	private String metodo;
	private String descricao;
	private Date data;
	
	public Log(int id, String local, String metodo, String descricao, Date data) {
		this.id = id;
		this.local = local;
		this.metodo = metodo;
		this.descricao = descricao;
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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
