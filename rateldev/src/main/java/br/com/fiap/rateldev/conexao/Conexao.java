package br.com.fiap.rateldev.conexao;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
	
	/**
	 * O método conectar é responsável por fazer a conexão com o banco de dados
	 * @throws Exception
	 * @return retorna uma conexão com o banco
	 * @author RatelDev
	 * @version 1.0
	 */
	public static Connection conectar() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
											"RM83183",
											"050891");
	}
}
