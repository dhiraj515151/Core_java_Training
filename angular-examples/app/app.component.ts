import { Component, OnInit, Input, NgModule } from "@angular/core";

import { NgModel } from '@angular/forms';

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html"
})
export class AppComponent {
 
  // message = ""

  // personDetail = {
  //   "FirstName" : "James",
  //   "LastName" : "Gigi",
  //   "email" : "d@gmail.com"
  // }
  
  // names = ["mark", "James", "Dhiraj", "Raj"];
  // employees = [];
  // constructor() {
  //   this.employees = [
  //     { empId: "1", empName: "Mark", age: 20 },
  //     { empId: "2", empName: "James", age: 25 },
  //     { empId: "3", empName: "Dhiraj", age: 30 },
  //     { empId: "4", empName: "Raj", age: 50 }
  //   ];
  // }
  // onButtonClicked() {
  //   this.employees = [
  //     { empId: "1", empName: "Mark", age: 20 },
  //     { empId: "2", empName: "James", age: 25 },
  //     { empId: "3", empName: "Dhiraj", age: 30 },
  //     { empId: "4", empName: "Raj", age: 50 },
  //     { empId: "5", empName: "Yash", age: 90 }
  //   ];
  // }
  
  // trackByEmpId(employee, index) {
  //   return employee.empId;
  // }
}
