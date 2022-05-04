import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Register } from './Models/Register';
@Injectable({
  providedIn: 'root'
})
export class DocserveService {

  constructor(private http : HttpClient) { }

  public postValue(dr:Register){
    return this.http.post("http://localhost:8080/adddr",dr)
  }
}
