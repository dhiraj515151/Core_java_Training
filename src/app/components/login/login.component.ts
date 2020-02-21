import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl ,FormBuilder,Validators} from "@angular/forms";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  // userForm = new FormGroup({
  //   email: new FormControl('yash@gmail.com'),
  //   password: new FormControl('123456'),
  //   houseNumber: new FormControl('A/73'),
  //   city: new FormControl('Varanasi')

  // })

  constructor(private formbuilder: FormBuilder) { }
  userForm = this.formbuilder.group({

    email: ['Prince',[ Validators.required,Validators.minLength(3),Validators.maxLength(15)]],
    password: ['r@gmail.com',[ Validators.required,Validators.minLength(6),Validators.maxLength(20)]],
    houseNumber: ['A/23'],
    city: ['Bombay']


  })

  ngOnInit(): void {
  }

}
