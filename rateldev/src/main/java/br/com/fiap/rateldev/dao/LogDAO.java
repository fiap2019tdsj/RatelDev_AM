package br.com.fiap.rateldev.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.fiap.rateldev.conexao.Conexao;

public class LogDAO {
	private Connection con;
	private PreparedStatement stmt;
	
	public LogDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	/**
	 * O método cadastrar salvará os dados no banco de dados com os parâmetros enviados
	 * @param local, local onde o método foi chamado
	 * @param metodo, método utilizado
	 * @param descricao, descrição da ação do usuário
	 * @throws Exception
	 * @return retorna true caso o cadastro tenha sido bem sucedido, caso contrário, retorna false
	 * @author RatelDev
	 * @version 1.0
	 */
	public boolean cadastrar(String local, String metodo, String descricao) throws Exception {
		stmt = con.prepareStatement("insert into T_RD_LOG (id_log, local, metodo, descricao) values (sequence_id_log, ?, ?, ?)");
		stmt.setString(1, local);
		stmt.setString(2, metodo);
		stmt.setString(3, descricao);
		
		if (stmt.executeUpdate() > 0)
			return true;
		
		return false;
	}
	
	/**
	 * Método responsável por fechar a conexão com o banco após uma tarefa
	 * @throws Exception
	 */
	public void fecharConexao() throws Exception {
		con.close();
	}
}
