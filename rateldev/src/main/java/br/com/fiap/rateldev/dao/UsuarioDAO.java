package br.com.fiap.rateldev.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.rateldev.beans.Usuario;
import br.com.fiap.rateldev.conexao.Conexao;

public class UsuarioDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public UsuarioDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	/**
	 * Método responsável por fechar a conexão com o banco após uma tarefa
	 * @throws Exception
	 */
	public void fecharConexao() throws Exception {
		con.close();
	}
	
	/**
	 * Método buscarUsuarioPorId é responsável por buscar algum usuário no sistema
	 * através do id dele
	 * @param id, id que representa o usuário selecionado
	 * @throws Exception
	 * @return null ou usuário encontrado
	 */
	public Usuario buscarUsuarioPorId(int id) throws Exception {
		stmt = con.prepareStatement("select * from T_RD_USUARIO where id_usuario = ?");
		stmt.setInt(1, id);
		
		rs = stmt.executeQuery();
		
		if(rs.next()) {
			return new Usuario(rs.getInt("id_usuario"),
					rs.getString("nm_usuario"),
					rs.getString("ds_email"),
					rs.getString("ds_senha")
					);
		}
		
		return null;
	}
	
	/**
	 * Método buscarUsuarioPorEmail é responsável por buscar algum usuário no sistema
	 * atraves do email do mesmo(a)
	 * @param email, email que representa o usuário selecionado
	 * @throws Exception
	 * @return null ou o usuario encontrado
	 */
	public Usuario buscarUsuarioPorEmail(String email) throws Exception {
		stmt = con.prepareStatement("select * from T_RD_USUARIO where ds_email = ?");
		stmt.setString(1, email);
		
		rs = stmt.executeQuery();
		
		if(rs.next()) {
			return new Usuario(rs.getInt("id_usuario"),
					rs.getString("nm_usuario"),
					rs.getString("ds_email"),
					rs.getString("ds_senha")
					);
		}
		
		return null;
	}
	
	/**
	 * Método login é responsável por retornar um usuário do banco para permitir o login no site
	 * @param email, email digitado pelo usuário
	 * @param senha, senha digitada pelo usuário
	 * @throws Exception
	 * @return null ou usuário encontrado
	 */
	public Usuario login(String email, String senha) throws Exception {
		stmt = con.prepareStatement("select * from T_RD_USUARIO where ds_email = ? and ds_senha = ?");
		stmt.setString(1, email);
		stmt.setString(2, senha);
		
		rs = stmt.executeQuery();
		
		if(rs.next()) {
			return new Usuario(rs.getInt("id_usuario"),
					rs.getString("nm_usuario"),
					rs.getString("ds_email"),
					rs.getString("ds_senha")
					);
		}
		
		return null;
	}
	
	/**
	 * Método cadastrar é responsável por inserir um usuário no sistema
	 * @param nome, nome digitado pelo usuário
	 * @param email, email digitado pelo usuário
	 * @param senha, senha digitado pelo usuário
	 * @throws Exception
	 * @return retorna true caso o usuário seja inserido no banco, caso contrário retorna false
	 */
	public boolean cadastrar(String nome, String email, String senha) throws Exception {
		stmt = con.prepareStatement("insert into T_RD_USUARIO (id_usuario, nm_usuario, ds_email, ds_senha) values (sequence_id_usuario.nextval, ?, ?, ?)");
		stmt.setString(1, nome);
		stmt.setString(2, email);
		stmt.setString(3, senha);
		
		if(stmt.executeUpdate() > 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Método de alterar, é responsável por alterar dados do usuario.
	 * @param id, id do usuário logado
	 * @param nome, nome digitado pelo usuário
	 * @param senha, senha digitado pelo usuário
	 * @throws Exception
	 * @return retorna true caso o usuário seja alterado no banco, caso contrário retorna false
	 */
	public boolean alterar(int id, String nome, String senha) throws Exception {
		stmt = con.prepareStatement("update T_RD_USUARIO set nm_usuario = ?, ds_senha = ? where id_usuario = ?");
		stmt.setString(1, nome);
		stmt.setString(2, senha);
		stmt.setInt(3, id);
		
		if(stmt.executeUpdate() > 0) {
			return true;
		}
		
		return false;
	}
}
