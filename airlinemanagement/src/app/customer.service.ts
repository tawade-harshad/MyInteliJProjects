import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {LoanCustomer} from './loan-customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  baseURL = 'http://localhost:5050/customer';
  /*getCustomerURL = 'http://localhost:5050/customer/';*/

  constructor(private client: HttpClient) {
  }

  findAll(): Observable<LoanCustomer[]> {
  return this.client.get<LoanCustomer[]>(this.baseURL);
  }

  findById(id: string): Observable<LoanCustomer> {
    return this.client.get<LoanCustomer>(this.baseURL + '/' + id);
  }

  add(loan: LoanCustomer): Observable<LoanCustomer> {
    return this.client.post<LoanCustomer>(this.baseURL, loan);
  }

  remove(loan: LoanCustomer): Observable<LoanCustomer> {
    const headers = new HttpHeaders().set('content-type' , 'application/json');

   /* return this.client.request<LoanCustomer>('Delete', this.baseURL,{headers, body: loan})*/
    return this.client.delete<LoanCustomer>(this.baseURL + '/' + loan.loanId);
  }

  update(loan: LoanCustomer): Observable<LoanCustomer> {
    return this.client.put<LoanCustomer>(this.baseURL, loan);
  }
}
