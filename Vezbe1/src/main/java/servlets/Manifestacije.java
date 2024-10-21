package servlets;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Manifestacija;

/**
 * Servlet implementation class Manifestacija
 */
@WebServlet(description = "Lista svih unetih manifestacija", urlPatterns = { "/Manifestacije", "/man",
		"/manifestacije" })
public class Manifestacije extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ArrayList<Manifestacija> Manifestacije = new ArrayList<Manifestacija>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Manifestacije() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");

		String ime = request.getParameter("ime");
		String mesto = request.getParameter("mesto");
		int kapacitet = Integer.parseInt(request.getParameter("kapacitet"));
		String cena = request.getParameter("cena");

		Manifestacija manifestacija = new Manifestacija(ime, mesto, kapacitet, cena);

		Manifestacije.add(manifestacija);

		response.getWriter().append("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Lista manifestacija</title>\r\n" + "</head>\r\n" + "<body>\r\n");

		for (int i = 0; i < Manifestacije.size(); i++) {
			int ivece = i + 1;
			response.getWriter()
					.append("<h1>Manifestacija broj: " + ivece + "<h1>Ime manifestacije: "
							+ Manifestacije.get(i).getIme() + "</h1>\r\n" + "<p>Mesto odrzavanja: "
							+ Manifestacije.get(i).getMesto() + "</p>\r\n" + "<p>Kapacitet: "
							+ Manifestacije.get(i).getKapacitet() + "</p>\r\n" + "<p>Cena ulaznice: "
							+ Manifestacije.get(i).getCena() + "</p>" + "<p>Datum dodavanja na server:  "
							+ Manifestacije.get(i).getDatum() + "</p>");
		}

		response.getWriter().append("<a href=\"pocetna.html\">Unesi jos</a>\r\n" + "</body>\r\n" + "</html>");

		doGet(request, response);
	}

}
