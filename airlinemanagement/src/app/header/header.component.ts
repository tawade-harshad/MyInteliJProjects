import { Component, OnInit } from '@angular/core';
import {Navlink} from '../navlink';
import {CompinteractionService} from '../compinteraction.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  showLogin = 'inline';
  showLogout = 'none';
  links: Navlink[] = [
    /*{link: 'login', text: 'Login'},*/
    {link: 'addcustomer', text: 'Add Customer'},
    {link: 'showcustomer', text: 'Show Customers'},
    {link: 'passenger', text: 'Show Passengers'}
  ];
  constructor(private service: CompinteractionService) { }

  ngOnInit() {
    this.service.loginStatus.subscribe(resp => {
      console.log(resp);
      if ( resp === 'logged') {
        this.showLogin = 'none';
        this.showLogout = 'inline';
      } else {
        this.showLogin = 'inline';
        this.showLogout = 'none';
      }
    });
  }

}
