package com.flow.hospitalworkflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flow.hospitalworkflow.model.AdminModel;

@Repository
public interface  AdminRepo extends JpaRepository<AdminModel,String> {

	
	   
}
