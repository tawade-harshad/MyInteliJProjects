import { Component, OnInit } from '@angular/core';
import {CompinteractionService} from '../compinteraction.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private service: CompinteractionService, private router: Router) { }

  ngOnInit() {
    console.log('Logout Init Called');
    console.log(this.service.loginStatus);
    this.service.loginStatus.next('notlogged');
    sessionStorage.removeItem('userlogged');
    this.router.navigate(['/login']);
  }
}
