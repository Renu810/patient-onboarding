package com.revature.service;

import java.util.List;
import com.revature.model.Doctor;
import com.revature.model.Patient;
import com.revature.model.Receptionist;



public interface ReceptionistService {
	
	public List<Receptionist> loginReceptionistCheck(int receptionistId, String password);
	
	public boolean addPatient(Patient patient);
	public boolean deletePatient(int patientId);
	public boolean updatePatient(Patient patient);
	public boolean isPatientExists(int patientId);
	public List<Patient> getAllPatients();
	public List<Patient> findByPatientId (int patientId);
	
	public List<Doctor> findByDoctorId (int doctorId);
	public List<Doctor> getAllDoctors();
	public boolean isDoctorExists(int doctorId);
	public boolean updateDoctor(Doctor doctor);
}
