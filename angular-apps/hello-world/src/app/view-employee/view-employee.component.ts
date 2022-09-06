import { Component, OnInit } from '@angular/core';
import { Employee } from '../Employee';
import { EmployeeClientService } from '../employee-client.service';

import { EmployeeDataService } from '../employee-data.service';

@Component({
  selector: 'app-view-employee',
  templateUrl: './view-employee.component.html',
  styleUrls: ['./view-employee.component.css']
})
export class ViewEmployeeComponent implements OnInit {

  constructor(public _employeeClient:EmployeeClientService, public _employeeData:EmployeeDataService) { }


  ngOnInit(): void {

    this._employeeClient.getAllEmployees().subscribe(
        data => {
          
          this._employeeData.employeeList=data;
        }

    )

  }


  deleteEmployee(employeeId:number){
    
  }

}
