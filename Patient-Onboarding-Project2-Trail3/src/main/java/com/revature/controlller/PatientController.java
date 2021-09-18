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
import com.revature.model.Patient;
import com.revature.service.PatientService;


@RestController
@RequestMapping("patients")
@CrossOrigin(origins = "http://localhost:64330")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@GetMapping
	public ResponseEntity<List<Patient>> getPatient() {
		ResponseEntity<List<Patient>> responseEntity = null;
		List<Patient> allPatient = patientService.getAllPatients(); 
		if(allPatient.size()==0) {
			responseEntity = new ResponseEntity<List<Patient>>(allPatient,HttpStatus.OK);
		}
		else {
			responseEntity = new ResponseEntity<List<Patient>>(allPatient,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@PostMapping
	public ResponseEntity<String> addPatient(@RequestBody Patient patient)
	{
		ResponseEntity<String> responseEntity = null;
		int patientId = patient.getPatientId();
		String message = null;
		if(patientService.isPatientExists(patientId))
		{
			message = "Patient with patient id : " + patientId + " Alerady exists" ;
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		}
		else
		{
			patientService.addPatient(patient);
			message = "Product with product id : " + patientId + " saved successfully" ;
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@PutMapping
	public ResponseEntity<String> updatePatient(@RequestBody Patient patient) {
		ResponseEntity<String> responseEntity = null;
		int patientId = patient.getPatientId();
		String message = null;
				 
		if(patientService.isPatientExists(patientId)) {
			patientService.updatePatient(patient);
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
	
	@DeleteMapping("{patientId}")
	public ResponseEntity<String> deletePatient(@PathVariable("patientId") int patientId) {
		ResponseEntity<String> responseEntity = null;
		String message = null;
				 
		if(patientService.isPatientExists(patientId)) 
		{
			patientService.deletePatient(patientId);
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
	
	@GetMapping("/{patientId}/{password}")
	public ResponseEntity<List<Patient>> loginPatient(@PathVariable("patientId") int patientId , @PathVariable("password") String password)
	{
		ResponseEntity<List<Patient>> responseEntity = null;
		List<Patient> patient = (List<Patient>) patientService.loginPatientCheck(patientId,password);
		if(patient.size()!=0) {
			responseEntity = new ResponseEntity<List<Patient>> (patient,HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<List<Patient>> (patient,HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}
}
