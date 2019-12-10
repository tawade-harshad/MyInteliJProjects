import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { ShowpassengerComponent } from './showpassenger/showpassenger.component';
import { FooterComponent } from './footer/footer.component';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import { ShowcustomerComponent } from './showcustomer/showcustomer.component';
import { SearchpassengerComponent } from './searchpassenger/searchpassenger.component';
import { GetpassengerdetailsComponent } from './getpassengerdetails/getpassengerdetails.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AddloancustomerComponent } from './addloancustomer/addloancustomer.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ShowpassengerComponent,
    FooterComponent,
    ShowcustomerComponent,
    SearchpassengerComponent,
    GetpassengerdetailsComponent,
    AddloancustomerComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule, HttpClientModule, FormsModule, ReactiveFormsModule
  ],
  providers: [HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
