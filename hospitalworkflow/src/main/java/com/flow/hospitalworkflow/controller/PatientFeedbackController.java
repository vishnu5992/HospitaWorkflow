package com.flow.hospitalworkflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flow.hospitalworkflow.model.PatientFeedback;
import com.flow.hospitalworkflow.repository.PatientFeedbackRepo;

@RestController
public class PatientFeedbackController {

	 @Autowired
	private PatientFeedbackRepo feedrepo;
	
	 @PostMapping("addfeedback")
	  public PatientFeedback addFeedback(@RequestBody PatientFeedback pf) {
		 return feedrepo.save(pf);
	 }
	 
	 @PutMapping("editfeedback")
	 public PatientFeedback editFeedback(@RequestBody PatientFeedback pf) {
		 return feedrepo.save(pf);
	 }
	 
	 @DeleteMapping("deletefeedback")
	 public String deleteAllPatientFeeedback() {
	   	 String result = " ";
	        try {
		       feedrepo.deleteAll();
		       result = " All Patient Feedback records deleted Sucessfully";
		}
	      catch(Exception e) {
	    	  result = " Error occured";
	      }  
	        return result;

	    }
	 
	 @GetMapping("getallfeedback")
	 public List<PatientFeedback> getallFeedback() {
		 return feedrepo.findAll();
	 }
}
