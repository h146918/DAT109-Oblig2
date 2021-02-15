package no.hvl.dat109.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.hvl.dat109.kunder.KundeServer;
import no.hvl.dat109.kunder.Kundeinformasjon;


@WebServlet("/LeverServlet")
public class LeverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/lever.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String regnr = request.getParameter("regnr");
		String kmstand = request.getParameter("kilometerstand");
		String returDato = request.getParameter("returDato");
		
		Kundeinformasjon kunde = KundeServer.finnKunde(regnr);
		kunde.getBil().setResFra(null);
		kunde.getBil().setResTil(null);
	
		//Metode som regner ut km og pris
		
		//Sjekk returdato mot innleveringsdag
		
		int km= Integer.parseInt(kmstand);
		
//		System.out.println("String: " + kmstand);
//		System.out.println("int: " + km);
//		
		kunde.getBil().setKm(km);
		
		response.sendRedirect("SokServlet");
		
	}

}
