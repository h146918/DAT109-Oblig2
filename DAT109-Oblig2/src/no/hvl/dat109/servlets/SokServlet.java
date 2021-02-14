package no.hvl.dat109.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;

import no.hvl.dat109.bil.Bil;
import no.hvl.dat109.controller.Controller;
import no.hvl.dat109.utleiekontor.Utleiekontor;


@WebServlet("/SokServlet")
public class SokServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/sok.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession sesjon = request.getSession(true);
		
		
		Controller controller = new Controller();
		controller.opprettBilerOgKontorer();
		
		// Legg til returmeding hvis parameterene er feil
		
		String utleieavdeling = request.getParameter("utleieavdeling");
		String returavdeling = request.getParameter("returavdeling");
		String fraDato = request.getParameter("fraDato");
		String tilDato = request.getParameter("tilDato");
		
		Utleiekontor utleiekontor = controller.finnUtleieKontor(utleieavdeling);
		
		
		List<Bil> biler = utleiekontor.listeOverLedigeBiler();
		
		sesjon.setAttribute("biler", biler);
		
		response.sendRedirect("ReserverServlet");

		
		
	}

}
