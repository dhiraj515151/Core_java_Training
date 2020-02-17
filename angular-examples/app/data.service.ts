import { Injectable } from "@angular/core";

@Injectable({
  providedIn: "root"
})
export class DataService {
  constructor() {}

  getEmployees() {
    return [
      {
        empId: 101,
        empName: "James",
        gender: "Male",
        salary: 25000,
        email: "ja@gmail.com",
        dob: "8 / 15 / 1997"
      },
      {
        empId: 102,
        empName: "Lala",
        gender: "Male",
        salary: 25095,
        email: "gigi@gmail.com",
        dob: "7 / 12 / 2020"
      },

      {
        empId: 103,
        empName: "Lala3",
        gender: "Female",
        salary: 25095,
        email: "gigi@gmail.com",
        dob: "6 / 15 / 97"
      }
    ];
  }
}
