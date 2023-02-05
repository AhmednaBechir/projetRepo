package pack01;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class F1 implements Filter{

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		String user= arg0.getParameter("login");
		String pwd= arg0.getParameter("password");
		Administrateur admin = new Administrateur();
		String login= admin.getLogin();
		String password = "admin";
		if(user.equals(login) && pwd.equals(password))
			arg2.doFilter(arg0, arg1);;

	}

}
