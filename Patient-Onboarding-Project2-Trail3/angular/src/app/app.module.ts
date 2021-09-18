import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PatientComponent } from './components/patient/patient.component';
import { DoctorComponent } from './components/doctor/doctor.component';
import { ReceptionistComponent } from './components/receptionist/receptionist.component';
import { HomeComponent } from './components/home/home.component';
import { LoginPatientComponent } from './components/login-patient/login-patient.component';
import { LoginDoctorComponent } from './components/login-doctor/login-doctor.component';
import { LoginReceptionistComponent } from './components/login-receptionist/login-receptionist.component';
import { SignupDoctorComponent } from './components/signup-doctor/signup-doctor.component';
import { SignupPatientComponent } from './components/signup-patient/signup-patient.component';
import { SignupReceptionistComponent } from './components/signup-receptionist/signup-receptionist.component';

import { AboutComponent } from './components/about/about.component';
import { MainComponent } from './components/main/main.component';
import { ServicesComponent } from './components/services/services.component';
import { ContactComponent } from './components/contact/contact.component';
import { FormGroup, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { BillDetailsReceComponent } from './components/after-recep/bill-details-rece/bill-details-rece.component';
import { SelfDetailsReceComponent } from './components/after-recep/self-details-rece/self-details-rece.component';
import { DoctorDetailsReceComponent } from './components/after-recep/doctor-details-rece/doctor-details-rece.component';
import { PatientDetailsReceComponent } from './components/after-recep/patient-details-rece/patient-details-rece.component';
import { AddPatientReceComponent } from './components/after-recep/add-patient-rece/add-patient-rece.component';
import { DoctorTimePatientComponent } from './components/after-patient/doctor-time-patient/doctor-time-patient.component';
import { SelfDetailsPatientComponent } from './components/after-patient/self-details-patient/self-details-patient.component';
import { AppointmentDetailsPatientComponent } from './components/after-patient/appointment-details-patient/appointment-details-patient.component';
import { AppointmentFormPatientComponent } from './components/after-patient/appointment-form-patient/appointment-form-patient.component';
import { AppointmentDetailsDoctorComponent } from './components/after-doctor/appointment-details-doctor/appointment-details-doctor.component';
import { SelfDetailsDoctorComponent } from './components/after-doctor/self-details-doctor/self-details-doctor.component';



@NgModule({
  declarations: [
    AppComponent,
    PatientComponent,
    DoctorComponent,
    ReceptionistComponent,
    HomeComponent,
    LoginPatientComponent,
    LoginDoctorComponent,
    LoginReceptionistComponent,
    SignupDoctorComponent,
    SignupPatientComponent,
    SignupReceptionistComponent,
  
    AboutComponent,
    MainComponent,
    ServicesComponent,
    ContactComponent,
    BillDetailsReceComponent,
    SelfDetailsReceComponent,
    DoctorDetailsReceComponent,
    PatientDetailsReceComponent,
    AddPatientReceComponent,
    DoctorTimePatientComponent,
    SelfDetailsPatientComponent,
    AppointmentDetailsPatientComponent,
    AppointmentFormPatientComponent,
    AppointmentDetailsDoctorComponent,
    SelfDetailsDoctorComponent
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
