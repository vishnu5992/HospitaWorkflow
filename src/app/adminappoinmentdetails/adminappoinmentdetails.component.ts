import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-adminappoinmentdetails',
  templateUrl: './adminappoinmentdetails.component.html',
  styleUrls: ['./adminappoinmentdetails.component.css']
})
export class AdminappoinmentdetailsComponent implements OnInit {
  patientDetails: any = null;
  patientFeedback:any=null;
  constructor() { }

  ngOnInit(): void {
    const detail = localStorage.getItem('check');
    if (detail) {
      this.patientDetails = JSON.parse(detail);
      console.log(this.patientDetails);
    }
    
  }
  
}
