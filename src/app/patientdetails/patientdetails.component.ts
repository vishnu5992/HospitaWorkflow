import { Component, OnInit, OnDestroy } from '@angular/core';
@Component({
  selector: 'app-patientdetails',
  templateUrl: './patientdetails.component.html',
  styleUrls: ['./patientdetails.component.css'],
})
export class PatientdetailsComponent implements OnInit, OnDestroy {
  patientDetails: any = null;

  constructor() {}
  ngOnDestroy(): void {
    console.log('destroy');
  }

  ngOnInit(): void {
    const detail = localStorage.getItem('check');
    if (detail) {
      this.patientDetails = JSON.parse(detail);
      console.log(this.patientDetails);
    }
  }
}
