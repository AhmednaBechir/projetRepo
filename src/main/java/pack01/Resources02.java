package pack01;
import jakarta.annotation.*;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



@Path("/services")
public class Resources02 {
	public static Set<String> set = new HashSet<>();
	
	@GET
	//@Produces("application/json")
	public static String getSet() {
		Iterator<String> iterator = set.iterator();
		String services=" ";

        // loop through the set using the iterator
        while (iterator.hasNext()) {
		services +=" || "+iterator.next()+" || ";
        }
        return "Voila les services qui existe : "+services;
	}
	
	@PUT
	public String setSet(@QueryParam("service") String service) {
	
		Boolean bool=set.add(service);
		if(bool)
			return "Service ajoute avec success";
		else
			return "Erreur, La service existe deja";
	}
	
	
}
