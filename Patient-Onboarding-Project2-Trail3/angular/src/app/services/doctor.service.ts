import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { Doctor } from '../models/doctor.model';
import { retry, catchError } from 'rxjs/operators';


const doctorURL="http://localhost:9098/doctors"
@Injectable({
  providedIn: 'root'
})
export class DoctorService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  constructor(public http:HttpClient) { }

  saveDoctor(doctor:Doctor):Observable<Doctor>{
    return this.http.post<Doctor>(doctorURL,doctor,this.httpOptions)
    .pipe(
      retry(1),
      catchError(this.errorHandler)
      
    )
   }




  errorHandler(error: { error: { message: string; }; status: any; message: any; }) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      // Get client-side error
  errorMessage = error.error.message;
    } else {
      // Get server-side error
  errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(errorMessage);
  }

}
