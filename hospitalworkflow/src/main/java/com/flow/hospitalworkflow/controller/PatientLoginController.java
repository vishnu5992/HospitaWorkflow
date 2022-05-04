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

import com.flow.hospitalworkflow.model.PatientLogin;
import com.flow.hospitalworkflow.repository.PatientLoginRepo;

@RestController
public class PatientLoginController {
     
	@Autowired
	private PatientLoginRepo plrepo;
	
	@PostMapping("addpl")
	public PatientLogin addPatientLogin(@RequestBody PatientLogin pl) {
		 return plrepo.save(pl);
	}
	
	@PutMapping("addpl")
	public PatientLogin editPatientLogin(@RequestBody PatientLogin pl) {
		 return plrepo.save(pl);
	}
	@DeleteMapping("deletepl") 
	public String deleteAllPatientLogin() {
		String result = " ";
        try {
	       plrepo.deleteAll();
	       result = " All Patient login records deleted Sucessfully";
	}
      catch(Exception e) {
    	  result = " Error occured";
      }  
        return result;
	}
	
	@DeleteMapping("deleteplByName/{username}") 
	public String deletePatientLoginByUsername(@PathVariable String username) {
		String result = " ";
        try {
	       plrepo.deleteByUsername(username);
	       result = " All records deleted Sucessfully";
	}
      catch(Exception e) {
    	  result = " Error occured";
      }  
        return result;
	}
   @GetMapping("getpl")
   public List<PatientLogin> getPatientLogin() {
	   return plrepo.findAll();
   }
   
   @GetMapping("getpl/{username}")
   public List<PatientLogin> getPatientLoginByUsername(@PathVariable String username) {
	   return plrepo.findByUsername(username);
   }
   
}
