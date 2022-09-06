import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './Employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeClientService {

  constructor(private _http:HttpClient) { }

  baseUrl = "http://localhost:8500/employees";

  getAllEmployees():Observable<Array<Employee>>{
    
        return this._http.get<Array<Employee>>(this.baseUrl);
  }

  addEmployee(employee:Employee):Observable<Employee>{
    return this._http.post<Employee>(this.baseUrl,employee);
  }

  deleteEmployee(id:number):Observable<any>{
    return this._http.delete(this.baseUrl+"/"+id);
  }

}
