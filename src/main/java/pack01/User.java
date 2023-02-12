package pack01;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
public class User extends HttpServlet{

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
				
		// positionne le type MIME pour la réponse
	response.setContentType("text/html");
	// récupère une référence vers le flux d'écriture
	PrintWriter out = response.getWriter();
	// création de la page HTML
	out.println("<!DOCTYPE html>\r\n"
			+ "<html>\r\n"
			+ "<head>\r\n"
			+ "	<title>Authentification</title>\r\n"
			+ "	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n"
			+ "<style>body {background-color: powderblue; } label ,button{\r\n"
			+ "    width:180px;\r\n"
			+ "    clear:left;\r\n"
			+ "    \r\n"
			+ "    \r\n"
			+ "}\r\n"
			+ "\r\n"
			+ "input, label,select,button {\r\n"
			+ "    float:left; width:180px;\r\n"
			+ "}</style></head>\r\n"
			+ "<body>\r\n"
			+ "	\r\n"
			+ "	<div class=\"container\">\r\n"
			+ "		<div class=\"row\">\r\n"
			+ "			<form method=\"post\" action=\"/ProjetServicesDeTransfert/authent/pageuser\">\r\n"
			+ "				<div class=\"form-group\">\r\n"
			+ "					<label>User Name : </label>\r\n"
			+ "					<input type=\"text\" name=\"login\" class=\"form-control\">\r\n"
			+ "				\r\n"
			+ "				</div>\r\n"
			+ "				<div class=\"form-group\">\r\n"
			+ "				<label>Password : </label>\r\n"
			+ "					<input type=\"password\" name=\"password\" class=\"form-control\">\r\n"
			+ "			</div>\r\n"
			+ "\r\n"
			+ "					<input type=\"submit\" value=\"Connecter\" class=\"btn-success\">\r\n"
			+ "			</div>\r\n"
			+ "			</form>\r\n"
			+ "		</div>\r\n"
			+ "	</div>\r\n"
			+ "\r\n");
			out.println("<br><br><h3>OU creer un compte</h3>");
			out.println(
					"			<form method=\"post\" action=\"\">\r\n"
					+ "					<label>User Name : </label>\r\n"
					+ "					<input type=\"text\" name=\"login\" >\r\n"
					+ "				\r\n"
					+ "				<br><label>Password : </label>\r\n"
					+ "					<input type=\"password\" name=\"password\" >\r\n"
					+ "\r\n"
					+ "					<br><label>Numero du Compte  : </label>\r\n"
					+ "					<input type=\"text\" name=\"numCompte\" >\r\n"
					+ "				\r\n"
					+ "					<br><label>Solde du Compte  : </label>\r\n"
					+ "					<input type=\"number\" name=\"solde\" >\r\n"
					+ "				\r\n"
					+ "					<br><label>La service de Transfert   : </label>\r\n"

					+ "				\r\n");
			out.println("<select name=\"servTransf\" >");

			String servicesNames="";		
			for ( java.util.Iterator i = Resources.services.keySet().iterator(); i.hasNext();) 
			{
					servicesNames= Resources.services.get(i.next()).getName();
					out.println("<option value='"+servicesNames+"'>"+servicesNames+"</option>");
					
			}

					out.println( "<br><br><br><input type=\"submit\" value='Creer le compte'>\r\n"
					+ "			</form>\r\n"
					+ "\r\n");
			out.println( "</body></html>");

	// fermer le flux d'écriture
	out.close();
	
	}

}
