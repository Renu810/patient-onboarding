import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SignupReceptionistComponent } from './signup-receptionist.component';

describe('SignupReceptionistComponent', () => {
  let component: SignupReceptionistComponent;
  let fixture: ComponentFixture<SignupReceptionistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SignupReceptionistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SignupReceptionistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
