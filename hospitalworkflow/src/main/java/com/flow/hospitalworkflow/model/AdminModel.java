package com.flow.hospitalworkflow.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminModel {
  
	@Id
	private String username;
	private String password;
	public AdminModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public AdminModel() {
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
