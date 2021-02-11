package no.hvl.dat109.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SokServlet")
public class SokServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/sok.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String utleieavdeling = request.getParameter("utleieavdeling");
		String returavdeling = request.getParameter("returavdeling");
		String fraDato = request.getParameter("fraDato");
		String tilDato = request.getParameter("tilDato");
		
		System.out.println(utleieavdeling + returavdeling + fraDato + tilDato);
		
	}

}
