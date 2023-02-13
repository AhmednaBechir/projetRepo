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
	out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n"
			+ "	<style >"
			+ "		body {"
			+ "              background-color : powderblue;\r\n"
			+ "              }"
			+ "	</style>");
			out.println("</HEAD>");
	out.println("<BODY>");
	
	 
	out.println("<H3 style='color : red'>Vous pouvez changez votre mot de passe si vous voulez.</h3><h6>entrez vos informations pour changer votre mot de passe !</H6>");
	out.println(
			"	<div class=\"container\">\r\n"
			+ "		<div class=\"row\">\r\n"
			+ "			<form method=\"get\" action=\"http://localhost:8080/ProjetServicesDeTransfert/ws/wservices/admins\">\r\n"
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
			+ "				<label >new Password : </label>\r\n"
			+ "					<input type=\"password\" name=\"newpassword\" class=\"form-control\">\r\n"
			+ "			</div>\r\n"
			+ "\r\n"
			+ "					<input type=\"submit\" value=\"Envoyer\" class=\"btn-success\">\r\n"
			+ "			</div>\r\n"
			+ "			</form>\r\n"
			+ "		</div>\r\n"
			+ "	</div>\r\n"
			+ "\r\n");
	
	out.println("<hr>");
	
	out.println("<br><br><h3 style='color : red'>Vous pouver ajouter ou retirer une service :</h3>");
	out.println("<label>Entrez le nom du service a ajouter</label>"+
			"	<div class=\"container\">\r\n"
			+ "		<div class=\"row\">\r\n"
			+ "			<form method=\"get\" action=\"http://localhost:8080/ProjetServicesDeTransfert/ws/wservices/servicesTransf\">\r\n"
			+ "				<div class=\"form-group\">\r\n"
			+ "					<input type=\"text\" name=\"service\" class=\"form-control\">\r\n"
			+ "				\r\n"
			+ "				</div>\r\n"
			+"<input type=\"submit\" value=\"Ajouter\" class=\"btn-success\">\r\n"
			+ "			</form>\r\n"
			+ "		</div>\r\n"
			+ "	</div>\r\n"
			+ "\r\n");
	out.println("<form method='get' action='http://localhost:8080/ProjetServicesDeTransfert/ws/wservices/servicesTransf'><label for=\"servTransf\">Chooisir une service de transfert pour la retirer : </label>");
	out.println("<select name=\"servTransf\" >");

	String servicesNames="";		
	for ( java.util.Iterator i = Resources.services.keySet().iterator(); i.hasNext();) 
	{
			servicesNames= Resources.services.get(i.next()).getName();
			out.println("<option value='"+servicesNames+"'>"+servicesNames+"</option>");
			
	}
	out.println("</select>    <input type='submit' value='Retirer' ></form>");


	out.println("<hr>");

	
	out.println("<br><br><h3 style='color : red'>Vous pouver ajouter ou retirer un responsable :</h3>");
	out.println(
			"	<div class=\"container\">\r\n"
			+ "		<div class=\"row\">\r\n"
			+ "			<form method=\"get\" action=\"http://localhost:8080/ProjetServicesDeTransfert/ws/wservices/responsable\"><label for=\"responsable\">Entrez le nom du responsable a ajouter : </label>\r\n"
			+ "				<div class=\"form-group\">\r\n"
			+ "					<input type=\"text\" name=\"responsable\" class=\"form-control\">\r\n"
			+ "				\r\n"
			+ "				</div>\r\n"
			+"<input type=\"submit\" value=\"Ajouter\" class=\"btn-success\">\r\n"
			+ "			</form>\r\n"
			+ "		</div>\r\n"
			+ "	</div>\r\n"
			+ "\r\n");
	out.println("<form method='get' action='http://localhost:8080/ProjetServicesDeTransfert/ws/wservices/responsable'><label for=\"responsable\">Choisir un responsable pour le retirer : </label>");
	out.println("<select name=\"Responsable\" >");

	String responsableNames="";		
	for ( java.util.Iterator i = Resources.responsables.keySet().iterator(); i.hasNext();) 
	{
			responsableNames= Resources.responsables.get(i.next()).getNom();
			out.println("<option value='"+responsableNames+"'>"+responsableNames+"</option>");
			
	}
	out.println("</select>    <input type='submit' value='Retirer' ></form>");
	

	out.println("<hr>");
	
	

	out.println("<br><br><h3 style='color : red'>Choisir un responsable pour l'affecter a une service :</h3>");
			out.println("<form method='get' action='http://localhost:8080/ProjetServicesDeTransfert/ws/wservices/affectation'><label for=\"responsable\">Le responsable : </label>");
	out.println("<select name=\"Responsable\" >");

	String responsableNames2="";		
	for ( java.util.Iterator i = Resources.responsables.keySet().iterator(); i.hasNext();) 
	{
			responsableNames2= Resources.responsables.get(i.next()).getNom();
			out.println("<option value='"+responsableNames2+"'>"+responsableNames2+"</option>");
			
	}
	out.println("</select> ");
	out.println("<label for=\"servTransf\">La service : </label><select name=\"servTransf\" >");

	String servicesNames2="";		
	for ( java.util.Iterator i = Resources.services.keySet().iterator(); i.hasNext();) 
	{
			servicesNames2= Resources.services.get(i.next()).getName();
			out.println("<option value='"+servicesNames2+"'>"+servicesNames2+"</option>");
			
	}

	out.println("       <input type='submit' value='Affectez' ></form>");

	
	out.println( "</body>\r\n"
			+ "</html>\r\n"
			);
	

	out.close();
	
	}

}
