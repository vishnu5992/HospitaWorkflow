package com.flow.hospitalworkflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flow.hospitalworkflow.model.PatientAppoinment;
import com.flow.hospitalworkflow.repository.PatientAppoinmentRepo;

@RestController
public class PatientAppoimentController {
	@Autowired
   private PatientAppoinmentRepo papp;
   
	@PostMapping("addappoin")
	public PatientAppoinment addAppoiment(@RequestBody PatientAppoinment pappoin) {
		return papp.save(pappoin);
	}
	@PutMapping("editappoin")
	 public PatientAppoinment editappoin(@RequestBody PatientAppoinment pappoin ) {
		return papp.save(pappoin);
	}
	@DeleteMapping("deleteappoin")
	
	public String deleteAllPatientAppoinment() {
   	 String result = " ";
        try {
	       papp.deleteAll();
	       result = " All Doctor Patient Appoinment records deleted Sucessfully";
	}
      catch(Exception e) {
    	  result = " Error occured";
      }  
        return result;

    }
	@GetMapping("getallappoin")
	public List<PatientAppoinment> getAllAppoin() {
		return papp.findAll();
	}
	
	@GetMapping("findbyappoinusername/{patientname}")
	public List<PatientAppoinment> gAllAppoin(@PathVariable String patientname) {
		return papp.findByPatientname(patientname);
	}
	
}
