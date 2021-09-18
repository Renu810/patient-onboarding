import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelfDetailsDoctorComponent } from './self-details-doctor.component';

describe('SelfDetailsDoctorComponent', () => {
  let component: SelfDetailsDoctorComponent;
  let fixture: ComponentFixture<SelfDetailsDoctorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SelfDetailsDoctorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SelfDetailsDoctorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
