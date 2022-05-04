package com.flow.hospitalworkflow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flow.hospitalworkflow.model.DoctorRegister;

@Repository
public interface   DoctorRegisterRepo  extends JpaRepository<DoctorRegister,String> {
	     public List<DoctorRegister>  deleteByUsername(String username);
         public List<DoctorRegister>  findByUsername(String username);
}
