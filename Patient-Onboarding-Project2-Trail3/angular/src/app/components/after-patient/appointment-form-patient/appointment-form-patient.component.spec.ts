import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AppointmentFormPatientComponent } from './appointment-form-patient.component';

describe('AppointmentFormPatientComponent', () => {
  let component: AppointmentFormPatientComponent;
  let fixture: ComponentFixture<AppointmentFormPatientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AppointmentFormPatientComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AppointmentFormPatientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
