import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-twowaydatabinding',
  templateUrl: './twowaydatabinding.component.html',
  styleUrls: ['./twowaydatabinding.component.css']
})
export class TwowaydatabindingComponent implements OnInit {
name= "dhiraj";
  onButtonClicked(value){
    console.log(value);

  }

  constructor() { }

  ngOnInit(): void {
  }
 
}
