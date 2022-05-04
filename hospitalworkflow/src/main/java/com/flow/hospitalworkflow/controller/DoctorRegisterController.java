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

import com.flow.hospitalworkflow.model.DoctorRegister;
import com.flow.hospitalworkflow.repository.DoctorRegisterRepo;

@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RestController
public class DoctorRegisterController {
     @Autowired 
	private DoctorRegisterRepo drp;
     
     @PostMapping("adddr")
     public DoctorRegister addDoctorRegister(@RequestBody DoctorRegister dr) {
    	 return drp.save(dr);
     }
     
     @PutMapping("editdr")
     public DoctorRegister editDoctorRegister(@RequestBody DoctorRegister dr) {
    	 return drp.save(dr);
     }
     @DeleteMapping("deletedr")
     public String deleteAllPatientRegister() {
    	 String result = " ";
         try {
 	       drp.deleteAll();
 	       result = " All Doctor Register records deleted Sucessfully";
 	}
       catch(Exception e) {
     	  result = " Error occured";
       }  
         return result;

     }
     
     @DeleteMapping("deletepdrByName/{username}") 
 	public String deletePatientLoginByUsername(@PathVariable String username) {
 		String result = " ";
         try {
 	       drp.deleteByUsername(username);
 	       result = " All records deleted Sucessfully";
 	}
       catch(Exception e) {
     	  result = " Error occured";
       }  
         return result;
 	}

     @GetMapping("getdr")
     public List<DoctorRegister> getDoctorRegister() {
    	 return drp.findAll();
     }
     
     @GetMapping("getByDrUsername/{username}")
     public List<DoctorRegister> getbyusername(@PathVariable String username) {
    	 return drp.findByUsername(username);
    	 
     }
     
}
