package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletAdministrateur extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
	// positionne le type MIME pour la réponse
	response.setContentType("text/html");
	// récupère une référence vers le flux d'écriture
	PrintWriter out = response.getWriter();
	// création de la page HTML
	out.println("<HTML>");
	out.println("<HEAD><TITLE>Authentification</TITLE>"
			+ "<link rel=\"stylesheet\" type=\"texts/css\" href=\"D:\\workspace01\\ProjetServicesDeTransfert\\src\\main\\webapp\\CSS\">"
			+ "</HEAD>");
	out.println("<BODY>");
	out.println("<H1>Bienvenue Administrateur par default</H1>");
	out.println("</BODY></HTML>");
	// toujours fermer le flux d'écriture
	out.close();

	}

}
