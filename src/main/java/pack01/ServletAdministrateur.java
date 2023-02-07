package pack01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ServletAdministrateur extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
	// positionne le type MIME pour la réponse
	response.setContentType("text/html");
	// récupère une référence vers le flux d'écriture
	PrintWriter out = response.getWriter();
	// création de la page HTML
	out.println("<HTML>");
	out.println("<HEAD><TITLE>Administrateur</TITLE>");
			out.println("<style>body {background-color : powderblue;}</style></HEAD>");
	out.println("<BODY>");
	out.println("<H1>Bienvenue Administrateur par default<br><br><br><br></H1>");
	
	 
	out.println("<H3>Vous pouvez changez votre mot de passe si vous voulez.<br>entrez vos informations encore pour changer votre mot de passe !</H3>");
	out.println("<!DOCTYPE html>\r\n"
			+ "<html>\r\n"
			+ "<head>\r\n"
			+ "	<title></title>\r\n"
			+ "	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n"
			+ "	<style >\r\n"
			+ "		body {\r\n"
			+ "              background-color : powderblue;\r\n"
			+ "              }\r\n"
			+ "	</style>\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "	\r\n"
			+ "	<div class=\"container\">\r\n"
			+ "		<div class=\"row\">\r\n"
			+ "			<form method=\"get\" action=\"http://localhost:8080/ProjetServicesDeTransfert/ws/map/\">\r\n"
			+ "				<div class=\"form-group\">\r\n"
			+ "					<label>User Name : </label>\r\n"
			+ "					<input type=\"text\" name=\"login\" class=\"form-control\">\r\n"
			+ "				\r\n"
			+ "				</div>\r\n"
			+ "				<div class=\"form-group\">\r\n"
			+ "				<label>Password : </label>\r\n"
			+ "					<input type=\"password\" name=\"password\" class=\"form-control\">\r\n"
			+ "			</div>\r\n"
			+ "			<div class=\"form-group\">\r\n"
			+ "				<label>new Password : </label>\r\n"
			+ "					<input type=\"password\" name=\"newpassword\" class=\"form-control\">\r\n"
			+ "			</div>\r\n"
			+ "\r\n"
			+ "					<input type=\"submit\" value=\"Envoyer\" class=\"btn-success\">\r\n"
			+ "			</div>\r\n"
			+ "			</form>\r\n"
			+ "		</div>\r\n"
			+ "	</div>\r\n"
			+ "\r\n"
			+ "</body>\r\n"
			+ "</html>\r\n"
			);

	out.close();
	
	}

}
