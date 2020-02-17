import { Component, OnInit } from "@angular/core";
import { DataService } from "../data.service";

@Component({
  selector: "app-employeelist",
  templateUrl: "./employeelist.component.html",
  styleUrls: ["./employeelist.component.css"],
  providers: [DataService]
})
export class EmployeelistComponent implements OnInit {
  public empDetails;
  constructor(private abc: DataService) {
    this.empDetails = abc.getEmployees();
  }
  ngOnInit(): void {}
}
