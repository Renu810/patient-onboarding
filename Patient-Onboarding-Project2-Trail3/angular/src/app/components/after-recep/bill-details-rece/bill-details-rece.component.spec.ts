import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BillDetailsReceComponent } from './bill-details-rece.component';

describe('BillDetailsReceComponent', () => {
  let component: BillDetailsReceComponent;
  let fixture: ComponentFixture<BillDetailsReceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BillDetailsReceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BillDetailsReceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
