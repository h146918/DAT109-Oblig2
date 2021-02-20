package no.hvl.dat109.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import no.hvl.dat109.controller.Controller;
import no.hvl.dat109.kunder.KundeServer;
import no.hvl.dat109.kunder.Kundeinformasjon;


@WebServlet("/LeverServlet")
public class LeverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/lever.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		HttpSession sesjon = request.getSession(true);
		Controller controller = new Controller();
		
		String regnr = request.getParameter("regnr");
		String kmstand = request.getParameter("kilometerstand");
		String returDatoString = request.getParameter("returDato");
		String faktiskReturAvdeling = request.getParameter("returavdeling");
		
		Date returDato = controller.stringTilDato(returDatoString);
		
		Kundeinformasjon kunde = KundeServer.finnKunde(regnr);
		
	//	int pris = controller.regnUtPris(kunde.getBil().getResFra(), kunde.getBil().getResTil(), returDato, kunde.getLeieinformasjon().getReturavdeling(),faktiskReturAvdeling );
		
		int fastpris = 550;
		int gebyr = 750;

		int dager = returDato.getDate() - kunde.getBil().getResFra().getDate() + 1;
		int mnd = (returDato.getMonth() - kunde.getBil().getResFra().getMonth()) * 30;
		int aar = (returDato.getYear() - kunde.getBil().getResFra().getYear()) * 365;

		int totalDager = dager + mnd + aar;
		int totalPris = (dager + mnd + aar) * fastpris;
		String gebyrMelding = "";

		if (!kunde.getLeieinformasjon().getReturavdeling().equals(faktiskReturAvdeling)) {
			totalPris += gebyr;
			gebyrMelding = "Beløpet er inkludert " + gebyr + "kr i gebyr for å ha levert bilen til feil avdeling";
		}
		
		
		kunde.getBil().setResFra(null);
		kunde.getBil().setResTil(null);
	
		int km= Integer.parseInt(kmstand);
		kunde.getBil().setKm(km);
	
		
		//sesjon.setAttribute("kundeinformasjon", kunde);
		sesjon.setAttribute("totalDager", totalDager);
		sesjon.setAttribute("totalPris", totalPris);
		sesjon.setAttribute("gebyrMelding", gebyrMelding);
		
		request.getRequestDispatcher("WEB-INF/betaling.jsp").forward(request, response);
		
	}

}
