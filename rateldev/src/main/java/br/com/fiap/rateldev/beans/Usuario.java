package br.com.fiap.rateldev.beans;

/**
 * ** Representa um usuário do sistema
 * @author RatelDev
 * @version 1.0
 */
public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String senha;
	
	/**
	 * ** Cria um usuário do sistema
	 * @param id, id do usuário
	 * @param nome, nome do usuário
	 * @param email, email do usuário
	 * @param senha, senha do usuário
	 */
	public Usuario(int id, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	/**
	 * ** Cria um usuário do sistema
	 */
	public Usuario() {}

	/**
	 * ** Pega o id do usuário
	 * @return retorna um inteiro que representa o id do usuário
	 */
	public int getId() {
		return id;
	}

	/**
	 * ** Define o id do usuário
	 * @param id, id do usuário
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * ** Pega o nome do menu
	 * @return retorna uma String que representa o nome do usuário
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * ** Define o nome do usuário
	 * @param nome, nome do usuário
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * ** Pega o email do usuário
	 * @return retorna uma String que representa o email do usuário
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * ** Define o email do usuário
	 * @param email, email do usuário
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * ** Pega a senha do usuário
	 * @return retorna uma String que representa a senha do usuário
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * ** Define a senha do usuário
	 * @param senha, senha do usuário
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
