package com.revature.service;

import java.util.List;

import com.revature.model.Patient;


public interface PatientService {
	public boolean addPatient(Patient patient);
	public boolean deletePatient(int patientId);
	public boolean updatePatient(Patient patient);
	public boolean isPatientExists(int patientId);
	public List<Patient> loginPatientCheck(int patientId, String password);
	public List<Patient> getAllPatients();
}
