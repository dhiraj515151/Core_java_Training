import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
  providers: [DataService]
})
export class EmployeeComponent implements OnInit {
public empDetails;
  constructor(private abc : DataService) {
 this.empDetails = abc.getEmployees();
    
   }

  ngOnInit(): void {
  }

}
