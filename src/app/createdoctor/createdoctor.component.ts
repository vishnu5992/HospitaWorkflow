import { Component, OnInit } from '@angular/core';
import { Register } from '../Models/Register';
import { DocserveService } from '../docserve.service';
@Component({
  selector: 'app-createdoctor',
  templateUrl: './createdoctor.component.html',
  styleUrls: ['./createdoctor.component.css']
})
export class CreatedoctorComponent implements OnInit {
public dr:Register = new Register("","","","","","","")
msg:any
  constructor(private service: DocserveService) { }
  ngOnInit(): void {
    
  }
  getValues(value:any){
      console.warn(value)
  }
  drSubmit(){
      let result = this.service.postValue(this.dr)
      result.subscribe((data)=>this.msg=data)
  }
}
