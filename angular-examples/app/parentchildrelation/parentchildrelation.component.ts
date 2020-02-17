import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';

@Component({
  selector: 'app-parentchildrelation',
  templateUrl: './parentchildrelation.component.html',
  styleUrls: ['./parentchildrelation.component.css']
})
export class ParentchildrelationComponent implements OnInit {
  // @Input()
  // parentvalue1;
  // @Input()
  // parentvalue2;
  // @Input()
  // parentvalue3;
  // @Input()
  // person;
  @Output()
  childEvent = new EventEmitter();

  onButtonClick(){
    this.childEvent.emit("message");
  }
  constructor() { }

  ngOnInit(): void {
  }

}
