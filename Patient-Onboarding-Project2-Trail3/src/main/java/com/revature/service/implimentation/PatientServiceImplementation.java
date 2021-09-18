package com.revature.service.implimentation;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.model.Patient;
import com.revature.repository.PatientRespository;
import com.revature.service.PatientService;


@Service
public class PatientServiceImplementation implements PatientService {
	@Autowired
	PatientRespository patientRepository;
	
	@Override
	public boolean addPatient(Patient patient) {
		System.out.println("### Add Patient called - service");
		patientRepository.save(patient);
		return true;
	}

	@Override
	public boolean deletePatient(int patientId) {
		patientRepository.deleteById(patientId);
		return true;
	}

	@Override
	public boolean updatePatient(Patient patient) {
		patientRepository.save(patient);
		return true;
	}

	@Override
	public boolean isPatientExists(int patientId) {
		Optional<Patient> patientDetails = patientRepository.findById(patientId);
		return patientDetails.isPresent();
	}

	@Override
	public List<Patient> loginPatientCheck(int patientId, String password) {
		return patientRepository.findByPatientIdAndPassword(patientId, password);
	}

	@Override
	public List<Patient> getAllPatients() {
		List<Patient> allPatient = (List<Patient>) patientRepository.findAll();
		return allPatient;
	}
}
