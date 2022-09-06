import { Component, OnInit } from '@angular/core';
import { Employee } from '../Employee';
import { EmployeeClientService } from '../employee-client.service';
import { EmployeeDataService } from '../employee-data.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {


  constructor(private _employeeClient:EmployeeClientService, private _employeeData:EmployeeDataService) { }

  ngOnInit(): void {
  }

  addEmployee(employee:Employee){
    this._employeeClient.addEmployee(employee).subscribe(
      data => this._employeeData.addEmployee(data)
    )
  }

}
