import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { StatusService } from '../status.service';
@Component({
  selector: 'app-appoinmentstatus',
  templateUrl: './appoinmentstatus.component.html',
  styleUrls: ['./appoinmentstatus.component.css']
})
export class AppoinmentstatusComponent implements OnInit {

  constructor(public http:HttpClient,public router:Router ,private st:StatusService) { }
  private readonly newProperty  = "your status in progress";

  ngOnInit(): void {
    this.newProperty

  }
status(){
  this.st.status="Your Appoinment In progress !! "
}
appoin(){
  this.st.status="Your Appoinment Created Sucessfully!!"
}
}
