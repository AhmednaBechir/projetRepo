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
public class ServletUser extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
	// positionne le type MIME pour la réponse
	response.setContentType("text/html");
	// récupère une référence vers le flux d'écriture
	PrintWriter out = response.getWriter();
	// création de la page HTML
	out.println("<HTML>");
	out.println("<HEAD><TITLE>Utilisateur</TITLE>");
	out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n"
			+ "	<style >"
			+ "		body {"
			+ "              background-color : powderblue;\r\n"
			+ "              }"
			+ "	</style>");
			out.println("</HEAD>");
	out.println("<BODY>");
	out.println("<H6>Bienvenue Cher Client<br></H6>");
	
	 
	out.println("<H6>Vous pouvez changez votre mot de passe si vous voulez.<br>entrez vos informations encore pour changer votre mot de passe !</H6>");
	out.println(
			"	<div class=\"container\">\r\n"
			+ "		<div class=\"row\">\r\n"
			+ "			<form method=\"get\" action=\"http://localhost:8080/ProjetServicesDeTransfert/ws/wservices/compte\">\r\n"
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
			+ "\r\n");
	out.println("<h6>Vous pouver transferer l'argent de votre compte a un autre compte<br>Entrez le numero de votre compte ,le numero de l'autre compte et le montant a transferer! </h6>"+
			"	<div class=\"container\">\r\n"
			+ "		<div class=\"row\">\r\n"
			+ "			<form method=\"get\" action=\"http://localhost:8080/ProjetServicesDeTransfert/ws/wservices/compte\">\r\n"
			+ "					<input type=\"text\" name=\"CompteUser\" placeholder='Numero de votre compte'>\r\n"
			+ "				\r\n"
			+ "					<input type=\"text\" name=\"AutreCompte\" placeholder=\"Numero de l'autre compte\">\r\n"
			+ "				\r\n"
			+ "					<br><input type=\"number\" name=\"AutreCompte\" placeholder='Le montant a transferer' >\r\n"
			+ "				\r\n"

			+"<input type=\"submit\" value=\"Transferer le montant\" class=\"btn-success\">\r\n"
			+ "			</form>\r\n"
			+ "		</div>\r\n"
			+ "	</div>\r\n"
			+ "\r\n");
	out.println("<br><form method='get' action='http://localhost:8080/ProjetServicesDeTransfert/ws/wservices/compte'><h6 >Saisir un montant pour le crediter en cash a un compte(Peut etre votre compte ou un autre compte) ! : </h6>");
	out.println("<input type='number' placeholder='le montant'><input text='text' placeholder='le compte a crediter'>");
	out.println("<input type='submit' value='Crediter' ></form>");
	out.println( "</body>\r\n"
			+ "</html>\r\n"
			);
	

	out.close();
	
	}

}
