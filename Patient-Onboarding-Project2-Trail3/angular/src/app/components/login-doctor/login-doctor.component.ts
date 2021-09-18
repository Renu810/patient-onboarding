import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-doctor',
  templateUrl: './login-doctor.component.html',
  styleUrls: ['./login-doctor.component.css']
})
export class LoginDoctorComponent implements OnInit {
  DLoginForm?: FormGroup;


  constructor(public router:Router) { }

  ngOnInit(): void {
  }
  doctorMain(){this.router.navigate(['doctor']);}
}
