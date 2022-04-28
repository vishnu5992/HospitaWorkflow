import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-createappoinment',
  templateUrl: './createappoinment.component.html',
  styleUrls: ['./createappoinment.component.css'],
})
export class CreateappoinmentComponent implements OnInit {
  constructor() {}
  DoctorName: string = '';
  PatientName: string = '';
  Description: string = '';
  Date: any = '';
  ngOnInit(): void {}
  Submit() {
    const Data = {
      Date: this.Date,
      Desc: this.Description,
      DocName: this.DoctorName,
      PatientName: this.PatientName,
    };
    localStorage.setItem("check", JSON.stringify(Data))
    console.log(this.DoctorName, this.PatientName, this.Description, this.Date);
    alert('created Appinment sucessfully')
  }
 
}
