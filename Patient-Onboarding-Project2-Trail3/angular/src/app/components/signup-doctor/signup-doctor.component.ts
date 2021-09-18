import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Doctor } from 'src/app/models/doctor.model';
import { DoctorService } from 'src/app/services/doctor.service';

@Component({
  selector: 'app-signup-doctor',
  templateUrl: './signup-doctor.component.html',
  styleUrls: ['./signup-doctor.component.css']
})
export class SignupDoctorComponent implements OnInit {
  doctor?:Doctor;
  doctorForm?: FormGroup;
  constructor(public doctorService:DoctorService,public formBuilder: FormBuilder) { }

  ngOnInit(): void {
  }
 saveDoctor(){
  this.doctorService.saveDoctor(this.doctorForm?.value)
  .subscribe(
    response => {
      console.log(response);
      console.log("#######Saved successfully ");
    },
    error => {
      // this.router.navigate([''])
      console.log(error);
    });
  }

}
