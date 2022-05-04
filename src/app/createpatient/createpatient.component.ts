import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../register.service';
import{Register} from '../Models/Register'
@Component({
  selector: 'app-createpatient',
  templateUrl: './createpatient.component.html',
  styleUrls: ['./createpatient.component.css']
})
export class CreatepatientComponent implements OnInit {
public patientRegister:any
message:any;
public pr:Register= new Register("","","","","","","");
  constructor(private rs : RegisterService) { }
  ngOnInit(): void {
    
  }

getValues(value: any){
   console.warn(value);
}
public registerNow(){
  let res = this.rs.getval(this.pr)
  res.subscribe((data)=>this.message= data);
}

}
