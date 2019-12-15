import { Injectable } from '@angular/core';
import {BehaviorSubject} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CompinteractionService {

  loginStatus = new BehaviorSubject<string>('notlogged');
  constructor() { }

  changeLoginStatus(message: string): void {
    console.log('Message Sent from Service' + message);
    this.loginStatus.next(message);

}
}
