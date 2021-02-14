package no.hvl.dat109.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import no.hvl.dat109.person.Person;


@WebServlet("/ReserverServlet")
public class ReserverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
   


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession sesjon = request.getSession();
		
		System.out.println("Fra reserver: " + sesjon.getAttribute("biler").toString());
		
		request.getRequestDispatcher("WEB-INF/reserver.jsp").forward(request, response);
		
		
		
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String regnr = request.getParameter("leidbil");
		String fornavn = request.getParameter("fornavn");
		String etternavn = request.getParameter("etternavn");
		String adresse = request.getParameter("adresse");
		String telefonString = request.getParameter("telefon");
		
		int telefon = Integer.parseInt(telefonString);
		
		Person p = new Person(fornavn,etternavn,adresse,telefon);
		
		System.out.println(p.toString());
		System.out.println("Regnr: " + regnr);
		
		HttpSession sesjon = request.getSession();
		sesjon.setAttribute("Person", p);
		
		
		//System.out.println("Fra POST: " + sesjon.getAttribute("biler").toString());
		
		
	
	}

}
