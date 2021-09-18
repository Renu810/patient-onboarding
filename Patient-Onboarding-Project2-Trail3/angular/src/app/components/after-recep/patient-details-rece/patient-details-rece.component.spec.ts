import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PatientDetailsReceComponent } from './patient-details-rece.component';

describe('PatientDetailsReceComponent', () => {
  let component: PatientDetailsReceComponent;
  let fixture: ComponentFixture<PatientDetailsReceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PatientDetailsReceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PatientDetailsReceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
