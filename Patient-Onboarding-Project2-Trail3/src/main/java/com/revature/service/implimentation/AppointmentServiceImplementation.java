package com.revature.service.implimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Appointment;
import com.revature.repository.AppointmentRespositary;
import com.revature.service.AppointmentService;

@Service
public class AppointmentServiceImplementation implements AppointmentService {

	@Autowired
	AppointmentRespositary appointmentRespositary;
	@Override
	public boolean addPatientForAppointment(Appointment appointment) {
		appointmentRespositary.save(appointment);
		return true;
	}

	@Override
	public boolean deletePatientForAppointment(int patientId) {
		appointmentRespositary.deleteById(patientId);
		return true;
	}

	@Override
	public List<Appointment> getAllAppointments() {
		List<Appointment> allAppointments = (List<Appointment>) appointmentRespositary.findAll();
		return allAppointments;
	}

}
