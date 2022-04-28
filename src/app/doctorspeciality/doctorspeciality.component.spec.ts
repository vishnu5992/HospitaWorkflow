import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctorspecialityComponent } from './doctorspeciality.component';

describe('DoctorspecialityComponent', () => {
  let component: DoctorspecialityComponent;
  let fixture: ComponentFixture<DoctorspecialityComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DoctorspecialityComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DoctorspecialityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
