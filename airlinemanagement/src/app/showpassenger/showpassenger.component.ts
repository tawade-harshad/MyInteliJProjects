import { Component, OnInit } from '@angular/core';
import {Passenger} from '../passenger'
@Component({
  selector: 'app-showpassenger',
  templateUrl: './showpassenger.component.html',
  styleUrls: ['./showpassenger.component.css']
})
export class ShowpassengerComponent implements OnInit {

  passList: Passenger[] = [ {passName: 'Ramesh', source: 'Mumbai', destination: 'Goa'},
    {passName: 'Suresh', source: 'Mumbai', destination: 'Delhi'},
    {passName: 'Karan', source: 'Mumbai', destination: 'London'}]
  constructor() { }

  ngOnInit() {
  }

}
