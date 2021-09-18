import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctorTimePatientComponent } from './doctor-time-patient.component';

describe('DoctorTimePatientComponent', () => {
  let component: DoctorTimePatientComponent;
  let fixture: ComponentFixture<DoctorTimePatientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DoctorTimePatientComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DoctorTimePatientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
