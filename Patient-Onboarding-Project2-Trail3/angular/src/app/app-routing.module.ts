import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { AppointmentDetailsDoctorComponent } from './components/after-doctor/appointment-details-doctor/appointment-details-doctor.component';
import { SelfDetailsDoctorComponent } from './components/after-doctor/self-details-doctor/self-details-doctor.component';
import { AppointmentDetailsPatientComponent } from './components/after-patient/appointment-details-patient/appointment-details-patient.component';
import { AppointmentFormPatientComponent } from './components/after-patient/appointment-form-patient/appointment-form-patient.component';
import { DoctorTimePatientComponent } from './components/after-patient/doctor-time-patient/doctor-time-patient.component';
import { SelfDetailsPatientComponent } from './components/after-patient/self-details-patient/self-details-patient.component';
import { AddPatientReceComponent } from './components/after-recep/add-patient-rece/add-patient-rece.component';
import { BillDetailsReceComponent } from './components/after-recep/bill-details-rece/bill-details-rece.component';
import { DoctorDetailsReceComponent } from './components/after-recep/doctor-details-rece/doctor-details-rece.component';
import { PatientDetailsReceComponent } from './components/after-recep/patient-details-rece/patient-details-rece.component';
import { SelfDetailsReceComponent } from './components/after-recep/self-details-rece/self-details-rece.component';
import { ContactComponent } from './components/contact/contact.component';
import { DoctorComponent } from './components/doctor/doctor.component';
import { HomeComponent } from './components/home/home.component';
import { LoginDoctorComponent } from './components/login-doctor/login-doctor.component';
import { LoginPatientComponent } from './components/login-patient/login-patient.component';
import { LoginReceptionistComponent } from './components/login-receptionist/login-receptionist.component';
import { MainComponent } from './components/main/main.component';
import { PatientComponent } from './components/patient/patient.component';
import { ReceptionistComponent } from './components/receptionist/receptionist.component';
import { ServicesComponent } from './components/services/services.component';
import { SignupDoctorComponent } from './components/signup-doctor/signup-doctor.component';
import { SignupPatientComponent } from './components/signup-patient/signup-patient.component';
import { SignupReceptionistComponent } from './components/signup-receptionist/signup-receptionist.component';

const routes: Routes =
 [
  { path: '', component: HomeComponent},
  { path: 'main', component: MainComponent},
  { path: 'about', component: AboutComponent},
  { path: 'service', component: ServicesComponent},
  { path: 'contact', component: ContactComponent},
  { path: 'dlogin', component: LoginDoctorComponent},
  { path: 'plogin', component: LoginPatientComponent},
  { path: 'rlogin', component: LoginReceptionistComponent},
  { path: 'dsignup', component: SignupDoctorComponent},
  { path: 'psignup', component: SignupPatientComponent},
  { path: 'rsignup', component: SignupReceptionistComponent},
  { path: 'doctor', component:DoctorComponent },
  { path: 'patient', component:PatientComponent },
  { path: 'receptionist', component: ReceptionistComponent},
  { path: 'afterDAppointment', component: AppointmentDetailsDoctorComponent},
  { path: 'afterDself', component: SelfDetailsDoctorComponent},
  { path: 'afterPAppoiDetail', component: AppointmentDetailsPatientComponent},
  { path: 'afterPAppoiForm', component: AppointmentFormPatientComponent},
  { path: 'afterPDoctorTime', component: DoctorTimePatientComponent},
  { path: 'afterPSelfDetails', component: SelfDetailsPatientComponent},
  { path: 'afterRAddP', component: AddPatientReceComponent},
  { path: 'afterRBill', component: BillDetailsReceComponent},
  { path: 'afterRDdetails', component: DoctorDetailsReceComponent},
  { path: 'afterRPdetails', component: PatientDetailsReceComponent},
  { path: 'afterRSelfDetails', component: SelfDetailsReceComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
