package pack01;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Service {

	private Integer idService;
	private String name;

	public int getIdService() {
		return idService;
	}

	public void setIdService(int idService) {
		this.idService = idService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
