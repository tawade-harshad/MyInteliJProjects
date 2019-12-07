import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {
  private copyLeft: string;
  constructor() {
    this.copyLeft = 'Designed by ABC Software - 2019-2020';
  }

  ngOnInit() {
  }

}
