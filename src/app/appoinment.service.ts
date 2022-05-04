import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Appoinment } from './Models/Appoinment';
@Injectable({
  providedIn: 'root'
})
export class AppoinmentService {

  constructor(private http : HttpClient) { }
 public getAppoin(app:Appoinment ){
   return this.http.post("http://localhost:8080/addappoin",app);
 }
}
