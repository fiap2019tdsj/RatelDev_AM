package br.com.fiap.rateldev.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.rateldev.dao.LogWatsonDAO;

@WebServlet(urlPatterns="/logWatson")
public class LogWatsonServlet extends HttpServlet {
	private static final long serialVersionUID = -8493414141725990094L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(true);
		int idUsuario = (int) session.getAttribute("idusuario");
		
		Date data = new Date();
		java.sql.Date sqlData = new java.sql.Date(data.getTime());
		
		try {
			LogWatsonDAO lwd = new LogWatsonDAO();
			lwd.cadastrar(req.getParameter("msg"), idUsuario, sqlData);
		} catch (Exception e) {
			out.println(e.getMessage());
		}
	}
	
	
}
