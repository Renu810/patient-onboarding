package com.revature.service.implimentation;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.model.Doctor;
import com.revature.repository.DoctorRespository;
import com.revature.service.DoctorService;


@Service
public class DoctorServiceImplementation implements DoctorService {
	@Autowired
	DoctorRespository doctorRepository;

	@Override
	public boolean addDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
		return true;
	}

	@Override
	public boolean deleteDoctor(int doctorId) {
		doctorRepository.deleteById(doctorId);
		return true;
	}

	@Override
	public boolean updateDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
		return true;
	}

	@Override
	public boolean isDoctorExists(int doctorId) {
		Optional<Doctor> doctorDetials = doctorRepository.findById(doctorId);
		return doctorDetials.isPresent();
	}

	@Override
	public List<Doctor> loginDoctorCheck(int doctorId, String password) {
		return doctorRepository.findByDoctorIdAndPassword(doctorId, password);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> allDoctor =  (List<Doctor>) doctorRepository.findAll();
		return allDoctor;
	}
	
}
