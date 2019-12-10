import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-searchpassenger',
  templateUrl: './searchpassenger.component.html',
  styleUrls: ['./searchpassenger.component.css']
})
export class SearchpassengerComponent implements OnInit {
  pnr = '';
  result = '';
  constructor() { }

  ngOnInit() {
  }

  onReceipt(val) {
    this.result = val;
  }
}
