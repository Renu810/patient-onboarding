import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddPatientReceComponent } from './add-patient-rece.component';

describe('AddPatientReceComponent', () => {
  let component: AddPatientReceComponent;
  let fixture: ComponentFixture<AddPatientReceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddPatientReceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddPatientReceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
