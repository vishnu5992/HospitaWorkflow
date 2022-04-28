import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminappoinmentdetailsComponent } from './adminappoinmentdetails.component';

describe('AdminappoinmentdetailsComponent', () => {
  let component: AdminappoinmentdetailsComponent;
  let fixture: ComponentFixture<AdminappoinmentdetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminappoinmentdetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminappoinmentdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
