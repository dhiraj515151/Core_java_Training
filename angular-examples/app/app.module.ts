import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { MaincontentComponent } from './maincontent/maincontent.component';
import { FooterComponent } from './footer/footer.component';
import { TwowaydatabindingComponent } from './twowaydatabinding/twowaydatabinding.component';
import { ParentchildrelationComponent } from './parentchildrelation/parentchildrelation.component';
import { PipesComponent } from './pipes/pipes.component';
import { TitlePipe } from './title.pipes';
import { EmployeelistComponent } from './employeelist/employeelist.component';
import { EmployeeComponent } from './employee/employee.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    NavbarComponent,
    SidebarComponent,
    MaincontentComponent,
    FooterComponent,
    TwowaydatabindingComponent,
    ParentchildrelationComponent,
    PipesComponent,
    TitlePipe,
    EmployeelistComponent,
    EmployeeComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [ AppComponent]
})
export class AppModule { }
