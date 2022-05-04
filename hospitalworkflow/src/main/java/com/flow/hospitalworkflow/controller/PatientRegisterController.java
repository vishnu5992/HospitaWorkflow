package com.flow.hospitalworkflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flow.hospitalworkflow.model.PatientRegister;
import com.flow.hospitalworkflow.repository.PatientRegisterRepo;

@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RestController
public class PatientRegisterController {
     @Autowired
	private PatientRegisterRepo  prrepo;
     @PostMapping("addpr")     
	public PatientRegister addPateientRegister(@RequestBody PatientRegister pr) {
		 return prrepo.save(pr);
		 
	}
     @PutMapping("editpr")     
 	public PatientRegister updatePateientRegister(@RequestBody PatientRegister pr) {
 		 return prrepo.save(pr);
 	}
    @DeleteMapping("deletepr") 
    	public String deleteAllpatientregister() {
    		String result = " ";
            try {
    	       prrepo.deleteAll();
    	       result = " All Patient Register records deleted Sucessfully";
    	}
          catch(Exception e) {
        	  result = " Error occured";
          }  
            return result;
    	}
   
    @DeleteMapping("deleteprbyusername/{username}") 
	public String deletepatientregisterByUsername(@PathVariable String username) {
		String result = " ";
        try {
	       prrepo.deleteByUsername(username);
	       result = "username deleted Sucessfully";
	}
      catch(Exception e) {
    	  result = " Error occured";
      }  
        return result;
	}
    
    @GetMapping("getallpr")
    public List<PatientRegister> getAllpr() {
    	 return prrepo.findAll();
    	
    }
    @GetMapping("getallprbyname/{username}")
    public List<PatientRegister> getAllByUsername(@PathVariable String username) {
    	 return prrepo.findByUsername(username);
   
}
}
 

