package com.revature.controlller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.revature.model.Appointment;
import com.revature.service.AppointmentService;

@RestController
@RequestMapping("appointment")
@CrossOrigin(origins = "http://localhost:64330")
public class AppointmentController {

	@Autowired
	AppointmentService appointmentService;
	
	@GetMapping
	public ResponseEntity<List<Appointment>> getAllAppointmentDetials(){
		ResponseEntity<List<Appointment>> responseEntity = null;
		List<Appointment> allAppointment = appointmentService.getAllAppointments();
	if(allAppointment.size()==0) {
		responseEntity = new ResponseEntity<List<Appointment>>(allAppointment,HttpStatus.NO_CONTENT);
	}
	else {
		responseEntity = new ResponseEntity<List<Appointment>>(allAppointment,HttpStatus.OK);
	}
	return responseEntity;
	}
	
	@PostMapping
	public ResponseEntity<String> addAppointment(@RequestBody Appointment appointment)
	{
		ResponseEntity<String> responseEntity = null;
		int patientId = appointment.getPatientId();
		String message = null;
		appointmentService.addPatientForAppointment(appointment);
			message = "Patient with patient id : " + patientId + " get successfully appointment" ;
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		return responseEntity;
	}
	
	@DeleteMapping("{patientId}")
	public ResponseEntity<String> deletePatient(@PathVariable("patientId") int patientId) {
		ResponseEntity<String> responseEntity = null;
		String message = null;
				 
		appointmentService.deletePatientForAppointment(patientId);
			message = "Patient with patient Id : " + patientId + " deleted appointment successfully"; 
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);

		return responseEntity;
	}
	
}
