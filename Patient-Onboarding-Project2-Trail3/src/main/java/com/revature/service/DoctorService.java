package com.revature.service;

import java.util.List;

import com.revature.model.Doctor;


public interface DoctorService {
	public boolean addDoctor(Doctor doctor);
	public boolean deleteDoctor(int doctorId);
	public boolean updateDoctor(Doctor doctor);
	public boolean isDoctorExists(int doctorId);
	public List<Doctor> loginDoctorCheck(int doctorId, String password);
	public List<Doctor> getAllDoctors();
}
