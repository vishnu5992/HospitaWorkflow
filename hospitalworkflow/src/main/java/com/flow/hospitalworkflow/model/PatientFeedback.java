package com.flow.hospitalworkflow.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientFeedback {

	@Id
	private String patientname;
	private String phonenumber;
	private String email;
	private String comments;
	public PatientFeedback(String patientname, String phonenumber, String email, String comments) {
		super();
		this.patientname = patientname;
		this.phonenumber = phonenumber;
		this.email = email;
		this.comments = comments;
	}
	public PatientFeedback() {
		super();
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
