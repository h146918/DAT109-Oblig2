package no.hvl.dat109.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
		Controller controller = new Controller();
		
		String regnr = request.getParameter("regnr");
		String kmstand = request.getParameter("kilometerstand");
		String returDatoString = request.getParameter("returDato");
		String faktiskReturAvdeling = request.getParameter("returavdeling");
		
		Date returDato = controller.stringTilDato(returDatoString);
		
		Kundeinformasjon kunde = KundeServer.finnKunde(regnr);
		
		//Metode som regner ut km og pris
		
		int pris = controller.regnUtPris(kunde.getBil().getResFra(), kunde.getBil().getResTil(), returDato, kunde.getLeieinformasjon().getReturavdeling(),faktiskReturAvdeling );
		
		
		kunde.getBil().setResFra(null);
		kunde.getBil().setResTil(null);
	
		int km= Integer.parseInt(kmstand);
		kunde.getBil().setKm(km);
	
		
		System.out.println("Din pris er " + pris);
		

		
		response.sendRedirect("SokServlet");
		
	}

}
