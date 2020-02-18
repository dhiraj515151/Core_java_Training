import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private dataservice: DataService) { }
  categories: any;
  ngOnInit(): void {
    this.dataservice.getCategories().subscribe(x=> this.categories=x.data);
  }

}
