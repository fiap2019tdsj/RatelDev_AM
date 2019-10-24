package br.com.fiap.rateldev.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import br.com.fiap.rateldev.conexao.Conexao;

public class LogWatsonDAO {
	private Connection con;
	private PreparedStatement stmt;
	
	
	public LogWatsonDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	/**
	 * O método cadastrar é responsável por fazer o cadastro de histórico de perguntas não entendidas, 
	 * pelo chatbot 
	 * @param sentenca, recebe a pergunta feita pelo usuário
	 * @param idUsuario, id que representa o usuário que fez a pergunta
	 * @param data, data que a pergunta foi feita
	 * @throws Exception
	 * @return retorna true caso o cadastro tenha sido bem sucedido, caso contrário, retorna false
	 * @author RatelDev
	 * @version 1.0
	 */
	public boolean cadastrar(String sentenca, int idUsuario, Date data) throws Exception {
		stmt = con.prepareStatement("insert into T_RD_LOG_WATSON (id_log_watson, ds_sentenca, id_usuario, dt_data) values (sequence_id_log_watson, ?, ?, ?)");
		stmt.setString(1, sentenca);
		stmt.setInt(2, idUsuario);
		stmt.setDate(3, data);
		
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