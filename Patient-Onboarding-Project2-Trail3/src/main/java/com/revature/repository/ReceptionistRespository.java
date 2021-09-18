package com.revature.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.revature.model.Receptionist;

public interface ReceptionistRespository extends CrudRepository<Receptionist, Integer>{

	public List<Receptionist> findByReceptionistIdAndPassword (int receptionistId , String password);
	
}
