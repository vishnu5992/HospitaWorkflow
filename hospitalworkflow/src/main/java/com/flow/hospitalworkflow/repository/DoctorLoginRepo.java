package com.flow.hospitalworkflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flow.hospitalworkflow.model.DoctorLogin;

@Repository
public interface DoctorLoginRepo  extends JpaRepository<DoctorLogin,String>{
	
}
