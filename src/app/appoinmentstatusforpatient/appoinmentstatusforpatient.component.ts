import { Component, OnInit } from '@angular/core';
import { StatusService } from '../status.service';
@Component({
  selector: 'app-appoinmentstatusforpatient',
  templateUrl: './appoinmentstatusforpatient.component.html',
  styleUrls: ['./appoinmentstatusforpatient.component.css']
})
export class AppoinmentstatusforpatientComponent implements OnInit {
   status:string=this.st.status
  constructor(private st:StatusService) { }

  ngOnInit(): void {
  }

}
