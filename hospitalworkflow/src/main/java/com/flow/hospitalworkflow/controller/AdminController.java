package com.flow.hospitalworkflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flow.hospitalworkflow.model.AdminModel;
import com.flow.hospitalworkflow.repository.AdminRepo;

@RestController
public class AdminController {
     
	@Autowired
	private AdminRepo admin;
	
	@PostMapping("addadmin")
	public AdminModel addAdmin(@RequestBody AdminModel aml) {
		return admin.save(aml);
	}
	@PutMapping("editadmin")
	public AdminModel editAdmin(@RequestBody AdminModel aml) {
		return admin.save(aml);
	}
	@DeleteMapping("deleteadmin")
	 public String deleteAdminLogin() {
   	 String result = " ";
        try {
	       admin.deleteAll();
	       result = " All  admin records deleted Sucessfully";
	}
      catch(Exception e) {
    	  result = " Error occured";
      }  
        return result;

    }
	@GetMapping("getAdmin")
	public List<AdminModel> getAdmin() {
		return admin.findAll();
	}
}
