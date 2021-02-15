package no.hvl.dat109.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.Date;
import java.util.List;

import no.hvl.dat109.bil.Bil;
import no.hvl.dat109.controller.Controller;
import no.hvl.dat109.person.Leieinformasjon;
import no.hvl.dat109.utleiekontor.Utleiekontor;

@WebServlet("/SokServlet")
public class SokServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Controller controller = new Controller();

	@Override
	public void init() throws ServletException {
		controller.opprettBilerOgKontorer();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/sok.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sesjon = request.getSession(true);
		Controller controller = new Controller();

		// Legg til returmeding hvis parameterene er feil

		String utleieavdeling = request.getParameter("utleieavdeling");
		String returavdeling = request.getParameter("returavdeling");
		String fraDatoString = request.getParameter("fraDato");
		String tilDatoString = request.getParameter("tilDato");

		Date fraDato = controller.stringTilDato(fraDatoString);
		Date tilDato = controller.stringTilDato(tilDatoString);
		
		
		
		
		Leieinformasjon leieinformasjon = new Leieinformasjon(utleieavdeling, returavdeling, fraDato, tilDato);
		Utleiekontor utleiekontor = controller.finnUtleieKontor(utleieavdeling);

		List<Bil> biler = utleiekontor.listeOverLedigeBiler();

		sesjon.setAttribute("leieinformasjon", leieinformasjon);
		sesjon.setAttribute("biler", biler);

		response.sendRedirect("ReserverServlet");

	}

}
