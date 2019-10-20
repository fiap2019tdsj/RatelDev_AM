package br.com.fiap.rateldev.test;

import br.com.fiap.rateldev.business.UsuarioBO;

public class Teste {

	public static void main(String[] args) {
		//Cadastro de Usuário: correto
		try {
			boolean retorno = UsuarioBO.cadastrar("Ratel Dev", "rateldevd@gmail.com", "xablau973164", "xablau973164");
			
			if (retorno == true)
				System.out.println("Usuário incluido com sucesso");
			else
				System.out.println("Erro ao incluir usuário");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}
