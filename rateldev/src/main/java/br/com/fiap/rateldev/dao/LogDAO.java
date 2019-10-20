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
	
	public boolean cadastrar(String local, String metodo, String descricao) throws Exception {
		stmt = con.prepareStatement("insert into T_RD_LOG (id_log, local, metodo, descricao) values (sequence_id_log, ?, ?, ?)");
		stmt.setString(1, local);
		stmt.setString(2, metodo);
		stmt.setString(3, descricao);
		
		if (stmt.executeUpdate() > 0)
			return true;
		
		return false;
	}
	
	public void fecharConexao() throws Exception {
		con.close();
	}
}
