package no.hvl.dat109.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import no.hvl.dat109.bil.Bil;
import no.hvl.dat109.controller.Controller;
import no.hvl.dat109.person.Person;

@WebServlet("/ReserverServlet")
public class ReserverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("WEB-INF/reserver.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Controller controller = new Controller();
		HttpSession sesjon = request.getSession();

		String regnr = request.getParameter("leidbil");
		String fornavn = request.getParameter("fornavn");
		String etternavn = request.getParameter("etternavn");
		String adresse = request.getParameter("adresse");
		String telefonString = request.getParameter("telefon");
		String kreditkortString = request.getParameter("kreditkort");

		int telefon = Integer.parseInt(telefonString);
		int kreditkort = Integer.parseInt(kreditkortString);

		Person p = new Person(fornavn, etternavn, adresse, telefon, kreditkort);

		@SuppressWarnings("unchecked")
		Bil bil = controller.finnBilMedReg(regnr, (List<Bil>) sesjon.getAttribute("biler"));
		//bil.setErLedig(false);
		
		bil.setResFra((String) sesjon.getAttribute("fraDato"));
		bil.setResTil((String) sesjon.getAttribute("tilDato"));
		
		//LocalDate date = new LocalDate((LocalDate)sesjon.getAttribute("fraDato"));
	

		sesjon.setAttribute("Bil", bil);
		sesjon.setAttribute("Person", p);

		response.sendRedirect("BekreftelseServet");

	}

}
