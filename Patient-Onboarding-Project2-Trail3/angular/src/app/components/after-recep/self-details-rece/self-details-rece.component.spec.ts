import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelfDetailsReceComponent } from './self-details-rece.component';

describe('SelfDetailsReceComponent', () => {
  let component: SelfDetailsReceComponent;
  let fixture: ComponentFixture<SelfDetailsReceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SelfDetailsReceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SelfDetailsReceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
