package com.flow.hospitalworkflow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flow.hospitalworkflow.model.PatientAppoinment;

@Repository
public interface PatientAppoinmentRepo extends JpaRepository<PatientAppoinment,String> {

	public List<PatientAppoinment> findByPatientname(String patientname);
    
}
