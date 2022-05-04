package com.flow.hospitalworkflow.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientLogin {
    @Id
	private String username;
	private String password;
	public PatientLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public PatientLogin() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
