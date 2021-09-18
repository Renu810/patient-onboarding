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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.revature.model.Doctor;
import com.revature.model.Patient;
import com.revature.model.Receptionist;
import com.revature.repository.DoctorRespository;
import com.revature.repository.PatientRespository;
import com.revature.service.ReceptionistService;


@RestController
@RequestMapping("receptionists")
@CrossOrigin(origins = "http://localhost:64330")
public class ReceptionistController {
	
	@Autowired
	ReceptionistService receptionistService;
	@Autowired
	DoctorRespository doctorRespository;
	@Autowired
	PatientRespository patientRespository;
	
	@GetMapping("patients")
	public ResponseEntity<List<Patient>> getPatient() {
		System.out.println("called from controller get");
		ResponseEntity<List<Patient>> responseEntity = null;
		List<Patient> allPatient = receptionistService.getAllPatients(); 
		if(allPatient.size()==0) {
			responseEntity = new ResponseEntity<List<Patient>>(allPatient,HttpStatus.OK);
		}
		else {
			responseEntity = new ResponseEntity<List<Patient>>(allPatient,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@GetMapping("patients/{patientId}")
	public ResponseEntity<List<Patient>> getPatientById(@PathVariable("patientId") int patientId) {
		System.out.println("called from controller get");
		ResponseEntity<List<Patient>> responseEntity = null;
		List<Patient> allPatient = receptionistService.findByPatientId(patientId);
		if(allPatient.size()==0) {
			responseEntity = new ResponseEntity<List<Patient>>(allPatient,HttpStatus.NO_CONTENT);
		}
		else {
			responseEntity = new ResponseEntity<List<Patient>>(allPatient,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@PostMapping("patients")
	public ResponseEntity<String> addPatient(@RequestBody Patient patient)
	{
		ResponseEntity<String> responseEntity = null;
		int patientId = patient.getPatientId();
		String message = null;
		if(receptionistService.isPatientExists(patientId))
		{
			message = "Patient with patient id : " + patientId + " Alerady exists" ;
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		}
		else
		{
			receptionistService.addPatient(patient);
			message = "Product with product id : " + patientId + " saved successfully" ;
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@PutMapping("patients")
	public ResponseEntity<String> updatePatient(@RequestBody Patient patient) {
		ResponseEntity<String> responseEntity = null;
		int patientId = patient.getPatientId();
		String message = null;
				 
		if(receptionistService.isPatientExists(patientId)) {
			receptionistService.updatePatient(patient);
			message = "Patient with patient Id : " + patientId + " updated successfully"; 
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		}
		else
		{
			message = "Patient with patient Id : " + patientId + " not found in database"; 
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@DeleteMapping("patients/{patientId}")
	public ResponseEntity<String> deletePatient(@PathVariable("patientId") int patientId) {
		ResponseEntity<String> responseEntity = null;
		String message = null;
				 
		if(receptionistService.isPatientExists(patientId)) 
		{
			receptionistService.deletePatient(patientId);
			message = "Patient with patient Id : " + patientId + " deleted successfully"; 
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		}
		else
		{
			message = "Patient with patient Id : " + patientId + " not found in database"; 
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@PutMapping("doctors")
	public ResponseEntity<String> updateDoctor(@RequestBody Doctor doctor) {
		ResponseEntity<String> responseEntity = null;
		int doctorId = doctor.getDoctorId();
		String message = null;
				 
		if(receptionistService.isDoctorExists(doctorId)) {
			receptionistService.updateDoctor(doctor);
			message = "Doctor with doctor Id : " + doctorId + " updated successfully"; 
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		}
		else
		{
			message = "Doctor with doctor Id : " + doctorId + " not found in database"; 
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@GetMapping("doctors")
	public ResponseEntity<List<Doctor>> getDoctor(){
		ResponseEntity<List<Doctor>> responseEntity = null;
		List<Doctor> allDoctor = receptionistService.getAllDoctors();
		if(allDoctor.size()==0) {
			responseEntity = new ResponseEntity<List<Doctor>>(allDoctor,HttpStatus.OK);
		}
		else {
			responseEntity = new ResponseEntity<List<Doctor>>(allDoctor,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@GetMapping("doctors/{doctorId}")
	public ResponseEntity<List<Doctor>> getDoctorById(@PathVariable("doctorId") int doctorId) {
		System.out.println("called from controller get");
		ResponseEntity<List<Doctor>> responseEntity = null;
		List<Doctor> allPatient = receptionistService.findByDoctorId(doctorId);
		if(allPatient.size()==0) {
			responseEntity = new ResponseEntity<List<Doctor>>(allPatient,HttpStatus.NO_CONTENT);
		}
		else {
			responseEntity = new ResponseEntity<List<Doctor>>(allPatient,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@GetMapping("/{receptionistId}/{password}")
	public ResponseEntity<List<Receptionist>> loginReceptionist(@PathVariable("receptionistId") int receptionistId , @PathVariable("password") String password)
	{
		ResponseEntity<List<Receptionist>> responseEntity = null;
		List<Receptionist> receptionist = (List<Receptionist>) receptionistService.loginReceptionistCheck(receptionistId,password);
		if(receptionist.size()!=0) {
			responseEntity = new ResponseEntity<List<Receptionist>> (receptionist,HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<List<Receptionist>> (receptionist,HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}
	
}
