package com.flow.hospitalworkflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flow.hospitalworkflow.model.PatientFeedback;

@Repository
public interface  PatientFeedbackRepo  extends JpaRepository<PatientFeedback,String>{


}
