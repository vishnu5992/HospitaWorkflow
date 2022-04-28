import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AppoinmentstatusforpatientComponent } from './appoinmentstatusforpatient.component';

describe('AppoinmentstatusforpatientComponent', () => {
  let component: AppoinmentstatusforpatientComponent;
  let fixture: ComponentFixture<AppoinmentstatusforpatientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AppoinmentstatusforpatientComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AppoinmentstatusforpatientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
