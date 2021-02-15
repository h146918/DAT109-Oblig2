package no.hvl.dat109.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import no.hvl.dat109.bil.Bil;
import no.hvl.dat109.kunder.KundeServer;
import no.hvl.dat109.kunder.Kundeinformasjon;
import no.hvl.dat109.person.Leieinformasjon;
import no.hvl.dat109.person.Person;


@WebServlet("/BekreftelseServet")
public class BekreftelseServet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/bekreftelse.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesjon = request.getSession();
//		
//		
//		Bil bil = (Bil) sesjon.getAttribute("Bil");
//		Leieinformasjon leieinformasjon = (Leieinformasjon) sesjon.getAttribute("leieinformasjon");
//		
//		//se over
//		
//		KundeServer.leggTilKunde(kunde);
//		KundeServer.finnKunde(bil.getRegnr());
//		KundeServer.SkrivUtServer();
//		sesjon.invalidate();
//		
		
		sesjon.invalidate();
		
		response.sendRedirect("LeverServlet");
	}

}
