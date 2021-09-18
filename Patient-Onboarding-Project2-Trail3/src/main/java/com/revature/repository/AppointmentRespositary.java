package com.revature.repository;

import org.springframework.data.repository.CrudRepository;
import com.revature.model.Appointment;

public interface AppointmentRespositary extends CrudRepository<Appointment, Integer> {

}
