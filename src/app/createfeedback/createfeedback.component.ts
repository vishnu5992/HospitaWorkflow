import { Component, OnInit } from '@angular/core';
@Component({
  selector: 'app-createfeedback',
  templateUrl: './createfeedback.component.html',
  styleUrls: ['./createfeedback.component.css']
})
export class CreatefeedbackComponent implements OnInit {
  
   patientName:string='';
   phoneNumber:any='';
   Email:any='';
   Comments:any='';
  constructor() { }

  ngOnInit(): void {
  }
  submit(){
    const Datas = {
      patientname:this.patientName,
      patientphno:this.phoneNumber,
      patientemail:this.Email,
      patientcomm:this.Comments,
    };

    console.log(this.patientName,this.phoneNumber,this.Email,this.Comments);
    localStorage.setItem("check", JSON.stringify(Datas))
  alert("Feedback sucessfully Submitted");
  }
}
