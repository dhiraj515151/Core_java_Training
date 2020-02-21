import { Component, OnInit } from '@angular/core';
import { FormsModule } from "@angular/forms";
import {NgForm} from '@angular/forms';
import { User } from 'src/app/models/user.model';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
public categories=['bakeries', 'Drinks', 'Desserts'];
public userModel = new User('Dhiraj','dt@gmail.com','9891204389','','male',true)
  constructor() { }

  ngOnInit(): void {
  }

}
