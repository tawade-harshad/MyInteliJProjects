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
import {Routes, RouterModule} from '@angular/router';
import { LogoutComponent } from './logout/logout.component';
import { FilterPipe } from './filter.pipe';
import {NgxPaginationModule} from 'ngx-pagination';

const routes: Routes = [
  {path: '', redirectTo: 'login', pathMatch: 'full'},
  {path: 'login', component: LoginComponent },
  {path: 'addcustomer', component: AddloancustomerComponent },
  {path: 'showcustomer', component: ShowcustomerComponent},
  {path: 'passenger', component: ShowpassengerComponent},
  {path: 'logout', component: LogoutComponent},
  {path: '**', redirectTo: 'login'}
  ];
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
    LoginComponent,
    LogoutComponent,
    FilterPipe
  ],
  imports: [
    BrowserModule, HttpClientModule, FormsModule, ReactiveFormsModule, RouterModule.forRoot(routes), NgxPaginationModule
  ],
  providers: [HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
