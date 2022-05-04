package com.flow.hospitalworkflow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flow.hospitalworkflow.model.PatientLogin;

@Repository
public interface PatientLoginRepo extends JpaRepository<PatientLogin,String>{
  
	public List<PatientLogin> findByUsername(String username);
	public List<PatientLogin> deleteByUsername(String username);
}
