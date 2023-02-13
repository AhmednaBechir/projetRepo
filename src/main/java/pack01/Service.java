package pack01;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Service {

	private Integer idService;
	private String name;
	private Responsable responsable;
	

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public void setIdService(Integer idService) {
		this.idService = idService;
	}

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
