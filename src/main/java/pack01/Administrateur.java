package pack01;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Administrateur {
	
	@JsonProperty
	private String login = "admin";
	@JsonProperty
	private String password = "admin";
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
