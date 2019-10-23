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
 * essa servlet é responsável por fazer a requisição de alteração de dados do usuario.
 * a servlet de alteração acessa a classe UsuarioBO, e chama o metodo alterar
 * 
 * @author RatelDev
 * @version 1.0
 *
 */
@WebServlet(urlPatterns="/alterarUsuario")
public class AlterarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 2935530492758106970L;

	/**
	 * metodo doPost envia dados para serem processados. 
	 * @version 1.0
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		try {
			UsuarioBO.alterar(Integer.parseInt(req.getParameter("id")),
								req.getParameter("nome"), 
								req.getParameter("senha"), 
								req.getParameter("confirmarSenha"));
			
			
			out.println("Ok");
		} catch (Exception e) {
			out.println(e.getMessage());
		}
	}	
}