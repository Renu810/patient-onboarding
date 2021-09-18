package com.revature.service;

import java.util.List;

import com.revature.model.Appointment;

public interface AppointmentService {
	public boolean addPatientForAppointment(Appointment appointment);
	public boolean deletePatientForAppointment(int patientId);
	public List<Appointment> getAllAppointments();
}
