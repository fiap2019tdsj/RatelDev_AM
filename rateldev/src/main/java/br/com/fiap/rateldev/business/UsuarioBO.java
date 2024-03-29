package br.com.fiap.rateldev.business;

import java.util.regex.Pattern;

import br.com.fiap.rateldev.beans.Usuario;
import br.com.fiap.rateldev.dao.LogDAO;
import br.com.fiap.rateldev.dao.UsuarioDAO;

public class UsuarioBO {
	/**
	 * Método isValid será responsável pela validação do email
	 * @param email, recebe o email do usuário
	 * @return retorna true caso o email se encaixe no padrão definido pela variável emailRegex
	 * caso contrário, retorna false
	 * @author RatelDev
	 * @version 1.0
	 */
	public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern padrao = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return padrao.matcher(email).matches(); 
    } 
	
	/**
	 * O método cadastrar é responsável pelo cadastro do usuário no sistema e pelo registro
	 * desse cadastro no histórico.
	 * @param nome, recebe nome do usuário
	 * @param email, recebe email do usuário
	 * @param senha, recebe a senha do usuário
	 * @param confirmarSenha, recebe a confirmação de senha do usuario
	 * @exception Exception caso qualquer uma das validações realizadas não retorne vazia.
	 * @return retorna true caso o cadastro tenha sido bem sucedido, caso contrário, retorna false
	 * @author RatelDev
	 * @version 1.0
	 */
	public static boolean cadastrar(String nome, String email, String senha, String confirmarSenha) throws Exception  {
		UsuarioDAO udao = new UsuarioDAO();
		LogDAO ldao = new LogDAO();
		
		String exceptionMsg = "";
		email = email.toLowerCase();
		
		if (email.equals("") && exceptionMsg == "")
			exceptionMsg = "Email não pode estar em branco";
		
		if (email.length() < 7 && exceptionMsg == "")
			exceptionMsg = "Email deve ter no mínimo 7 caracteres";
		
		if (email.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Email deve ter no máximo 100 caracteres";
		
		if (!isValid(email) && exceptionMsg == "")
			exceptionMsg = "Email inválido";
		
		if (nome.equals("") && exceptionMsg == "")
			exceptionMsg = "Nome não pode estar em branco";
		
		if (nome.length() < 4 && exceptionMsg == "")
			exceptionMsg = "Nome deve ter no mínimo 4 caracteres";
		
		if (nome.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Nome deve ter no máximo 100 caracteres";
		
		if (senha.equals("") && exceptionMsg == "")
			exceptionMsg = "Senha não pode estar em branco";
		
		if (senha.length() < 8 && exceptionMsg == "")
			exceptionMsg = "Nome deve ter no mínimo 8 caracteres";
		
		if (senha.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Senha deve ter no máximo 100 caracteres";
		
		if (!senha.equals(confirmarSenha) && exceptionMsg == "")
			exceptionMsg = "Senhas não conferem";
		
		if (udao.buscarUsuarioPorEmail(email) != null && exceptionMsg == "")
			exceptionMsg = "Email já está em uso";
		
		if (exceptionMsg != "") {
			udao.fecharConexao();
			ldao.cadastrar("Usuario", "Cadastrar", exceptionMsg);
			ldao.fecharConexao();
			throw new Exception(exceptionMsg);
		}
		
		boolean retorno = udao.cadastrar(nome, email, senha);
		
		if (!retorno) {
			udao.fecharConexao();
			ldao.cadastrar("Usuario", "Cadastrar", "Falha ao cadastrar usuário");
			ldao.fecharConexao();
			throw new Exception("Falha ao cadastrar usuário. Caso o erro persista favor entrar em contato com o suporte técnico.");
		}
		
		udao.fecharConexao();
		ldao.cadastrar("Usuario", "Cadastrar", "Usuário cadastrado com sucesso. Email: " + email);
		ldao.fecharConexao();
		return retorno;
	}
	
	/**
	 * O método alterar, realizará alterarações nos dados do usuario
	 * @param id, recebe id do usuário
	 * @param nome, recebe nome do usuário
	 * @param senha, recebe a senha do usuário
	 * @param confirmarSenha, recebe a confirmação de senha do usuario
	 * @exception Exception caso qualquer uma das validações realizadas não retorne vazia.
	 * @return retorna true caso a alteração tenha sido bem sucedida, caso contrário, retorna false
	 * @author RatelDev
	 * @version 1.0
	 */
	public static boolean alterar(int id, String nome, String senha, String confirmarSenha) throws Exception {
		UsuarioDAO udao = new UsuarioDAO();
		LogDAO ldao = new LogDAO();
		
		String exceptionMsg = "";
		
		if (nome.equals("") && exceptionMsg == "")
			exceptionMsg = "Nome não pode estar em branco";
		
		if (nome.length() < 4 && exceptionMsg == "")
			exceptionMsg = "Nome deve ter no mínimo 4 caracteres";
		
		if (nome.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Nome deve ter no máximo 100 caracteres";
		
		if (senha.equals("") && exceptionMsg == "")
			exceptionMsg = "Senha não pode estar em branco";
		
		if (senha.length() < 8 && exceptionMsg == "")
			exceptionMsg = "Senha deve ter no mínimo 8 caracteres";
		
		if (senha.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Senha deve ter no máximo 100 caracteres";
		
		if (!senha.equals(confirmarSenha) && exceptionMsg == "")
			exceptionMsg = "Senhas não conferem";
		
		if (udao.buscarUsuarioPorId(id) == null && exceptionMsg == "")
			exceptionMsg = "Usuário inválido";
		
		if (exceptionMsg != "") {
			udao.fecharConexao();
			ldao.cadastrar("Usuario", "Alterar", exceptionMsg);
			ldao.fecharConexao();
			throw new Exception(exceptionMsg);
		}
		
		boolean retorno = udao.alterar(id, nome, senha);

		if (!retorno) {
			udao.fecharConexao();
			ldao.cadastrar("Usuario", "Alterar", "Falha ao alterar usuário");
			ldao.fecharConexao();
			throw new Exception("Falha ao alterar usuário. Caso o erro persista favor entrar em contato com o suporte técnico.");
		}
		
		udao.fecharConexao();
		ldao.cadastrar("Usuario", "Alterar", "Usuário " + id + " alterado com sucesso." );
		ldao.fecharConexao();
		
		return retorno;
	}
	
	/**
	 * O método login é responsável pela realização do login do usuário no sistema
	 * @param email, recebe email do usuário
	 * @param senha, recebe a senha do usuário
	 * @exception Exception caso qualquer uma das validações realizadas não retorne vazia.
	 * @return retorna um usuario caso os parâmetros enviados sejam encontrados no banco de dados
	 * caso contrário, retorna null
	 * @author RatelDev
	 * @version 1.0
	 */
	public static Usuario login(String email, String senha) throws Exception {
		UsuarioDAO udao = new UsuarioDAO();
		LogDAO ldao = new LogDAO();
		
		String exceptionMsg = "";
		email = email.toLowerCase();
		
		if (email.equals("") && exceptionMsg == "")
			exceptionMsg = "Email não pode estar em branco";
		
		if (email.length() < 7 && exceptionMsg == "")
			exceptionMsg = "Email deve ter no mínimo 7 caracteres";
		
		if (email.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Emails têm no máximo 100 caracteres";
		
		if (!isValid(email) && exceptionMsg == "")
			exceptionMsg = "Email inválido";
		
		if (senha.equals("") && exceptionMsg == "")
			exceptionMsg = "Senha não pode estar em branco";
		
		if (senha.length() < 8 && exceptionMsg == "")
			exceptionMsg = "Email deve ter no mínimo 8 caracteres";
		
		if (senha.length() > 100 && exceptionMsg == "")
			exceptionMsg = "Senhas têm no máximo 100 caracteres";
		
		if (exceptionMsg != "") {
			udao.fecharConexao();
			ldao.cadastrar("Usuario", "Login", exceptionMsg);
			ldao.fecharConexao();
			throw new Exception(exceptionMsg);
		}
		
		Usuario usuario = udao.login(email, senha);
		
		if (usuario == null) {
			udao.fecharConexao();
			ldao.cadastrar("Usuario", "Login", "Usuário inválido");
			ldao.fecharConexao();
			throw new Exception("Usuário inválido");
		}

		udao.fecharConexao();
		ldao.cadastrar("Usuario", "Login", "Usuário " +  usuario.getEmail() + " logado.");
		ldao.fecharConexao();
		
		return usuario;
	}
}
