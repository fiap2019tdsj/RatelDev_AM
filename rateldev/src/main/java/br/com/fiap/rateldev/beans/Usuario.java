package br.com.fiap.rateldev.beans;

/**
 * **
 * essa class tem as propriedades do Usuario e possui os metodos get e set
 * @param nome recebe o nome do usuario 
 * @param email recebe o email do usuario
 * @param  senha recebe senha do usuario
 * @author RatelDev
 * @version 1.0
 * 
 *
 */
public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String senha;
	
	public Usuario(int id, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	public Usuario() {}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
