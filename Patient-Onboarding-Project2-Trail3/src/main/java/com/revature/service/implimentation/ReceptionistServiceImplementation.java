package com.revature.service.implimentation;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.model.Doctor;
import com.revature.model.Patient;
import com.revature.model.Receptionist;
import com.revature.repository.DoctorRespository;
import com.revature.repository.PatientRespository;
import com.revature.repository.ReceptionistRespository;
import com.revature.service.ReceptionistService;


@Service
public class ReceptionistServiceImplementation implements ReceptionistService {
	@Autowired
	ReceptionistRespository receptionistRespository;
	@Autowired
	PatientRespository patientRespository;
	@Autowired
	DoctorRespository doctorRespository;
	
	@Override
	public boolean addPatient(Patient patient) {
		patientRespository.save(patient);
		return true;
	}

	@Override
	public boolean deletePatient(int patientId) {
		patientRespository.deleteById(patientId);
		return true;
	}

	@Override
	public boolean updatePatient(Patient patient) {
		patientRespository.save(patient);
		return true;
	}

	@Override
	public boolean isPatientExists(int patientId) {
		Optional<Patient> patientDetails = patientRespository.findById(patientId);
		return patientDetails.isPresent();
	}

	@Override
	public List<Patient> getAllPatients() {
		List<Patient> allPatient = (List<Patient>) patientRespository.findAll();
		return allPatient;
	}

	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> allDoctor = (List<Doctor>) doctorRespository.findAll();
		return allDoctor;
	}

	@Override
	public boolean isDoctorExists(int doctorId) {
		Optional<Doctor> doctorDetails = doctorRespository.findById(doctorId);
		return doctorDetails.isPresent();
	}

	@Override
	public boolean updateDoctor(Doctor doctor) {
		doctorRespository.save(doctor);
		return true;
	}

	@Override
	public List<Patient> findByPatientId(int patientId) {
		List<Patient> patient = patientRespository.findByPatientId(patientId);
		return patient;
	}
	
	@Override
	public List<Doctor> findByDoctorId(int doctorId) {
		List<Doctor> doctor = doctorRespository.findByDoctorId(doctorId);
		return doctor;
	}

	@Override
	public List<Receptionist> loginReceptionistCheck(int receptionistId, String password) {
		return receptionistRespository.findByReceptionistIdAndPassword(receptionistId, password);
	}


}
