import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-receptionist',
  templateUrl: './login-receptionist.component.html',
  styleUrls: ['./login-receptionist.component.css']
})
export class LoginReceptionistComponent implements OnInit {

  constructor(public router:Router) { }

  ngOnInit(): void {
  }
  resMain(){this.router.navigate(['receptionist']);}
}
