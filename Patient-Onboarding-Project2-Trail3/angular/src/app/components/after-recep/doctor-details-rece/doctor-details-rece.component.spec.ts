import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctorDetailsReceComponent } from './doctor-details-rece.component';

describe('DoctorDetailsReceComponent', () => {
  let component: DoctorDetailsReceComponent;
  let fixture: ComponentFixture<DoctorDetailsReceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DoctorDetailsReceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DoctorDetailsReceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
