import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {
  name = "mark"; 
  currentDate  = new Date;
  constructor() { }
  public employees = [
    {"empId": 101, "empName" : "James", "gender" : 
    "Male","salary" : 25000, "email" : "ja@gmail.com","dob": 6/15/15},
    {"empId": 102, "empName" : "Lala", "gender" : 
    "Male","salary" : 25095, "email" : "gigi@gmail.com","dob": 6/15/97},

    {"empId": 103, "empName" : "Lala3", "gender" : 
    "Female","salary" : 25095, "email" : "gigi@gmail.com","dob": 6/15/97}
  ]

  ngOnInit(): void {
  }

}
