package com.flow.hospitalworkflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flow.hospitalworkflow.model.DoctorLogin;
import com.flow.hospitalworkflow.repository.DoctorLoginRepo;

@RestController
public class DoctorLoginController {

	   @Autowired
	  private DoctorLoginRepo doctorrepo;
	  
	   @PostMapping("addlogin")
	   public DoctorLogin addLogin(@RequestBody DoctorLogin log) {
		    return doctorrepo.save(log);
	   }
	   @PutMapping("editlogin")
	   public DoctorLogin editLogin(@RequestBody DoctorLogin log) {
		   return doctorrepo.save(log);
	   }
	   @DeleteMapping("deletelogin")
	   public String deleteLogin() {
	    	 String result = " ";
	         try {
	 	       doctorrepo.deleteAll();
	 	       result = " All  Doctor login records deleted Sucessfully";
	 	}
	       catch(Exception e) {
	     	  result = " Error occured";
	       }  
	         return result;

	     }
	   @GetMapping("getlogin")
	   public List<DoctorLogin> getLogin() {
		   return doctorrepo.findAll();
	   }
}
