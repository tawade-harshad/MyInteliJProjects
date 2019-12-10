import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddloancustomerComponent } from './addloancustomer.component';

describe('AddloancustomerComponent', () => {
  let component: AddloancustomerComponent;
  let fixture: ComponentFixture<AddloancustomerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddloancustomerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddloancustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
