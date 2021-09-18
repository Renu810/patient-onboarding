package com.revature.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.revature.model.Doctor;

public interface DoctorRespository extends CrudRepository<Doctor, Integer>{
	public List<Doctor> findByDoctorIdAndPassword (int doctorId , String password);
	public List<Doctor> findByDoctorId (int doctorId);
}
