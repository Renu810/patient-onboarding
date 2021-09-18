import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelfDetailsPatientComponent } from './self-details-patient.component';

describe('SelfDetailsPatientComponent', () => {
  let component: SelfDetailsPatientComponent;
  let fixture: ComponentFixture<SelfDetailsPatientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SelfDetailsPatientComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SelfDetailsPatientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
