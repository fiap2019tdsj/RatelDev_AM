package br.com.fiap.rateldev.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.rateldev.beans.Menu;
import br.com.fiap.rateldev.conexao.Conexao;

public class MenuDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public MenuDAO() throws Exception {
		con = Conexao.conectar();
	}
	
	/**
	*Método gerarMenu retornará uma lista de menus cadastrados no banco
	*@throws Exception
	*@return retorna uma lista de menus cadastrados
	*/
	public List<Menu> gerarMenu() throws Exception {
		stmt = con.prepareStatement("select * from T_RD_MENU)");
		rs = stmt.executeQuery();
		List<Menu> lm = new ArrayList<Menu>();
		
		while(rs.next()) {
			Menu m = new Menu(rs.getInt("id_menu"),
					rs.getString("nm_menu"),
					rs.getString("ds_url"),
					rs.getString("ds_menu")
					);
			
			lm.add(m);
		}
		
		return lm;
	}
	
	/**
	 * Método responsável por fechar a conexão com o banco após uma tarefa
	 * @throws Exception
	 */
	public void fecharConexao() throws Exception {
		con.close();
	}
}