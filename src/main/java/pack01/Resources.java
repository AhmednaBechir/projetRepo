package pack01;
import java.util.HashMap;
import java.util.Map;

import jakarta.annotation.*;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/wservices")
public class Resources {
	
	public static Map<String,String> admins = new HashMap<>();
	
	@GET
	@Path("/admins")
	@Produces("application/json")
	public Map getMap() {
		return admins;
	}
	
	@PUT
	@Path("/admins")
	public void setMap(Administrateur admin) {
		admins.put(admin.getLogin(),admin.getPassword());
	}
	@PUT
	@Path("/adminschangepwd")
	public void setMap(@QueryParam("newpassword") String pwd,@QueryParam("login") String login) {
		admins.put(login,pwd);
	}
public static Map<Integer,Service> services = new HashMap<>();
	
	@GET
	@Path("/servicesTransf")
//	@Produces(MediaType.APPLICATION_JSON)
	public static String getServices() {
			String servicesNames="";		
		for ( java.util.Iterator i = services.keySet().iterator(); i.hasNext();) 
				servicesNames+=" || "+services.get(i.next()).getName()+" ||";

            return "Voila tous les services de trasfert d'argent : "+servicesNames;	
}
	
	@PUT
	@Path("/servicesTransf")
	@Consumes(MediaType.APPLICATION_JSON)
	public void setService(Service service) {
		services.put(service.getIdService(),service);
	}
	
	@DELETE
	@Path("/servicesTransf")
	@Consumes(MediaType.APPLICATION_JSON)
	public void removeService(Service service) {
		services.remove(service.getIdService());
	}
	
	public static Map<String,Comptes> comptes = new HashMap<>();
	
	@GET
	@Path("/compte")
	@Produces(MediaType.APPLICATION_JSON)
	public Map getComptes() {
		return comptes;
	}
	
	@PUT
	@Path("/compte")
	@Consumes(MediaType.APPLICATION_JSON)
	public void setComptes(Comptes compte) {
		comptes.put(compte.getLogin(), compte);
	}
}
