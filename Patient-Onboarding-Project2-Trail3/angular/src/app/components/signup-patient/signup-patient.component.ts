import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-signup-patient',
  templateUrl: './signup-patient.component.html',
  styleUrls: ['./signup-patient.component.css']
})
export class SignupPatientComponent implements OnInit {
  // PSignupForm?: FormGroup;
  // patient?:Patient;
  constructor(public formBuilder: FormBuilder) { }

  ngOnInit(): void {


    // this.PSignupForm = this.formBuilder.group({
    //   patientName: ['', Validators.required],
    //   emailId: ['', [Validators.required]],
    //   pNumber: ['', [Validators.required]],
    //   password: ['', [Validators.required]],
    //   cPassword: ['', [Validators.required]]
    // })
  }


  // saveProduct(){
  //   console.log("saved")
  // }

}
