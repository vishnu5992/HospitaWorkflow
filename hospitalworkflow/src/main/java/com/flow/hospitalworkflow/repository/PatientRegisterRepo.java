package com.flow.hospitalworkflow.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flow.hospitalworkflow.model.PatientRegister;


@Repository
public interface PatientRegisterRepo extends JpaRepository<PatientRegister, String> {

   public List<PatientRegister>findByUsername(String username);
   public List<PatientRegister>deleteByUsername(String username);

}
