package com.revature.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.revature.model.Patient;

public interface PatientRespository extends CrudRepository<Patient, Integer>{
	
	public List<Patient> findByPatientIdAndPassword (int patientId , String password);
	public List<Patient> findByPatientId (int patientId);
}
