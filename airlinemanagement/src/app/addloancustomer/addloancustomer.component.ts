import {Component, OnInit, ViewChild, ViewChildren} from '@angular/core';
import {LoanCustomer} from '../loan-customer';
import {CustomerService} from '../customer.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-addloancustomer',
  templateUrl: './addloancustomer.component.html',
  styleUrls: ['./addloancustomer.component.css']
})
export class AddloancustomerComponent implements OnInit {

  srchString = '';

  @ViewChild('frm', {static: false}) form: any;

  customerList: LoanCustomer[];
  idxPos = 0;
  customer: LoanCustomer = {
    loanId: 0,
    loanType: ' ',
    closeDate: new Date(),
    openDate: new Date(),
    loanAmount: 0
  };

  loanType = ['Car', 'Home', 'Jewel', 'Personal'];
  btnText = 'Add';
  constructor(private service: CustomerService, private router: Router) { }

  ngOnInit() {
    const loggedStatus = sessionStorage.getItem('userlogged');
    if (loggedStatus !== 'yes') {
       this.router.navigate(['/login']);
    } else {
      this.service.findAll().subscribe(data => this.customerList = data);
    }
  }

  onSubmit(values) {
    this.customer = values;

    if (this.btnText === 'Add') {
      console.log(this.customer);
      this.service.add(this.customer).subscribe(data => this.customerList.push(data));
    } else {
      this.service.update(this.customer).subscribe(data => this.customerList[this.idxPos] = data);
    }

    this.form.reset();
    }


  delete(obj) {
    const idxPos = this.customerList.indexOf(obj);
    this.service.remove(obj).subscribe(data =>
    this.customerList.splice(idxPos, 1));
  }

  edit(obj) {
       this.idxPos = this.customerList.indexOf(obj);
       this.customer = obj;
       this.btnText = 'Update';
  }
}
