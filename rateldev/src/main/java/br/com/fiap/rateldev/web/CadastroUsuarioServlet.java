package br.com.fiap.rateldev.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.rateldev.business.UsuarioBO;

@WebServlet(urlPatterns="/cadastroUsuario")
public class CadastroUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1022799369117097786L;

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
