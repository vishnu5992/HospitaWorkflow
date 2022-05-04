import { Component, OnInit } from '@angular/core';
import { Appoinment } from '../Models/Appoinment';
import { AppoinmentService } from '../appoinment.service';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-createappoinment',
  templateUrl: './createappoinment.component.html',
  styleUrls: ['./createappoinment.component.css'],
})
export class CreateappoinmentComponent implements OnInit {
  app:Appoinment= new Appoinment("","","","");
  detail:any

  constructor(private service:AppoinmentService,private http:HttpClient) {}
  DoctorName: string = '';
  PatientName: string = '';
  Description: string = '';
  Date: any = '';
  ngOnInit(): void {
  }
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
    let resp = this.service.getAppoin(this.app)
     resp.subscribe((data)=>this.detail=data);

  }
//  public appoin(){
//     let resp = this.service.getAppoin(this.app)
//     resp.subscribe((data)=>this.detail=data);
//  }

}
