package br.com.fiap.rateldev.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.rateldev.business.UsuarioBO;

/**
 * servlet CadastroUsuarioServlet é responsável por fazer a requisição de cadastro do usuario
 * acessando  a class UsuarioBO chamando o metodo cadastrar e pegando os atributo  (nome,email,senha e confirmarSenha)
 * @author RatelDev
 * @version 1.0
 *
 */
@WebServlet(urlPatterns="/cadastroUsuario")
public class CadastroUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1022799369117097786L;

	/**
	 * metodo doPost envia dados para serem processados. 
	 * @version 1.0
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		try {
			UsuarioBO.cadastrar(req.getParameter("nome"), 
								req.getParameter("email"),
								req.getParameter("senha"), 
								req.getParameter("confirmarSenha"));
			
			out.println("Ok");
		} catch (Exception e) {
			out.println(e.getMessage());
		}
	}
	
	
}
