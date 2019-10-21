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
	
	public boolean cadastrar(String sentenca, int idUsuario, Date data) throws Exception {
		stmt = con.prepareStatement("insert into T_RD_LOG_WATSON (id_log_watson, ds_sentenca, id_usuario, dt_data) values (sequence_id_log_watson, ?, ?, ?)");
		stmt.setString(1, sentenca);
		stmt.setInt(2, idUsuario);
		stmt.setDate(3, data);
		
		if (stmt.executeUpdate() > 0)
			return true;
		
		return false;
	}
	
	public void fecharConexao() throws Exception {
		con.close();
	}
}