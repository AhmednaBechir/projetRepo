package pack01;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
public class F2 implements Filter{

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
	           // session retrieved, continue with servlet operations
		String user= arg0.getParameter("login");
		String pwd= arg0.getParameter("password");
		
		for ( java.util.Iterator i = Resources.comptes.keySet().iterator(); i.hasNext();) {
		String login = (String)i.next();
		 String password = (String)Resources.comptes.get(login).getPassword();
			if(user.equals(login) && pwd.equals(password)) {
				
				arg2.doFilter(arg0, arg1);
		}	
		
	
		}
			arg1.setContentType("text/html");
		// récupère une référence vers le flux d'écriture
		PrintWriter out = arg1.getWriter();
		// création de la page HTML
				out.println("<HTML>");
				out.println("<HEAD><TITLE>Erreur</TITLE>"
						+ "<meta http-equiv=\"Refresh\" content=\"3; url='../user'\" />");
				out.println("<style>body {background-color : powderblue;}</style></HEAD>");
				out.println("</head><BODY>");
				out.println("<h1>Votre mot de passe n'est pas compatible avec votre login veuillez le resaisir</h1>");
				out.println("</BODY></HTML>");
				out.close();
		 
	    	 //MySession.invalidate();
	}


}
