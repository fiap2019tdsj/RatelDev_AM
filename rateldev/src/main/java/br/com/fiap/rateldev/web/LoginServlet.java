package br.com.fiap.rateldev.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.rateldev.beans.Usuario;
import br.com.fiap.rateldev.business.UsuarioBO;

/**
 * loginServlet responsável por fazer a requisição de login no sistema da class UsuarioBO acessando
 * o metodo login dela e possui dois parametros
 * @param email que é o login do usuario
 * @param senha que é responsável por receber a senha do usuario 
 * @author RatelDev
 * @version 1.0
 *
 */
@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = -6391586299833544717L;

	/**
	 * metodo doPost envia dados para serem processados. 
	 * @version 1.0
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		try {
			Usuario usuario = UsuarioBO.login(req.getParameter("email"), req.getParameter("senha"));
			
			HttpSession session = req.getSession();
			session.setAttribute("idusuario", usuario.getId());
			session.setAttribute("nome", usuario.getNome());
			out.println("Ok");
		} catch (Exception e) {
			out.println(e.getMessage());
		}
	}
	
	
}
