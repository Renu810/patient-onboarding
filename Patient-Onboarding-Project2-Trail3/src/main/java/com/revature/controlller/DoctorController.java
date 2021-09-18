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
import com.revature.service.DoctorService;



@RestController
@RequestMapping("doctors")
@CrossOrigin(origins = "http://localhost:64330")
public class DoctorController {
	@Autowired
	DoctorService doctorService;
	
	@GetMapping
	public ResponseEntity<List<Doctor>> getDoctor(){
		ResponseEntity<List<Doctor>> responseEntity = null;
		List<Doctor> allDoctor = doctorService.getAllDoctors();
		if(allDoctor.size()==0) {
			responseEntity = new ResponseEntity<List<Doctor>>(allDoctor,HttpStatus.OK);
		}
		else {
			responseEntity = new ResponseEntity<List<Doctor>>(allDoctor,HttpStatus.OK);
		}
		return responseEntity;
	}

	@PostMapping
	public ResponseEntity<String> addDoctor(@RequestBody Doctor doctor){
		ResponseEntity<String> responseEntity = null;
		int doctorId = doctor.getDoctorId();
		String message = null;
		if(doctorService.isDoctorExists(doctorId)) {
			message = "Doctor with doctor id : " + doctorId + " Alerady exists";
			responseEntity = new ResponseEntity<String> (message,HttpStatus.OK);
		} else {
			doctorService.addDoctor(doctor);
			message = "Doctor with doctor id : " + doctorId + " saved successfully" ;
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@PutMapping
	public ResponseEntity<String> updateDoctor(@RequestBody Doctor doctor) {
		ResponseEntity<String> responseEntity = null;
		int doctorId = doctor.getDoctorId();
		String message = null;
				 
		if(doctorService.isDoctorExists(doctorId)) {
			doctorService.updateDoctor(doctor);
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
	
	@DeleteMapping("{doctorId}")
	public ResponseEntity<String> deleteDoctor(@PathVariable("doctorId") int doctorId) {
		ResponseEntity<String> responseEntity = null;
		String message = null;
				 
		if(doctorService.isDoctorExists(doctorId)) 
		{
			doctorService.deleteDoctor(doctorId);
			message = "Doctor with doctor Id : " + doctorId + " deleted successfully"; 
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		}
		else
		{
			message = "Doctor with doctor Id : " + doctorId + " not found in database"; 
			responseEntity = new ResponseEntity<String>(message,HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@GetMapping("/{doctorId}/{password}")
	public ResponseEntity<List<Doctor>> loginDoctor(@PathVariable("doctorId") int doctorId , @PathVariable("password") String password)
	{
		ResponseEntity<List<Doctor>> responseEntity = null;
		List<Doctor>  doctor = (List<Doctor>) doctorService.loginDoctorCheck(doctorId, password);
		if(doctor.size()!=0) {
			responseEntity = new ResponseEntity<List<Doctor>> (doctor,HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<List<Doctor>> (doctor,HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}
	
}
