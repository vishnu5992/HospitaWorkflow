import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Register } from './Models/Register';
@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private http : HttpClient) { }
  //public url = "http://localhost:8080/addpr"
  public getval(pr : Register){
    return this.http.post("http://localhost:8080/addpr",pr);
   
  }
}
