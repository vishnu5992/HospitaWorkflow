package com.flow.hospitalworkflow.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientAppoinment {
	
	@Id
     private String doctorname;
     private String patientname;
     private String description;
 	private String date;

     public PatientAppoinment(String doctorname, String patientname, String description, String date) {
		super();
		this.doctorname = doctorname;
		this.patientname = patientname;
		this.description = description;
		this.date = date;
	}

	public PatientAppoinment() {
		super();
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
     
	
}
