package pack01;
import java.util.HashMap;
import java.util.Map;

import jakarta.annotation.*;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/map")
public class Resources {
	
	public static Map<String,String> map = new HashMap<>();
	
	@GET
	@Produces("application/json")
	public Map getMap() {
		return map;
	}
	
	@PUT
	public void setMap(Administrateur admin) {
		map.put(admin.getLogin(),admin.getPassword());
	}
	@PUT
	@Path("/changepwd")
	public void setMap(@QueryParam("newpassword") String pwd,@QueryParam("login") String login) {
		map.put(login,pwd);
	}
}
