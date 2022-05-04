package com.flow.hospitalworkflow.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DoctorRegister {
      
	 @Id
	 private String fullname;
	 private String username;
	 private String email;
	 private String password;
	 private String mobilenumber;
	 private String gender;
	 private String address;
	public DoctorRegister(String fullname, String username, String email, String password, String mobilenumber,
			String gender, String address) {
		super();
		this.fullname = fullname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.address = address;
	}
	public DoctorRegister() {
		super();
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
