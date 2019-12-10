import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetpassengerdetailsComponent } from './getpassengerdetails.component';

describe('GetpassengerdetailsComponent', () => {
  let component: GetpassengerdetailsComponent;
  let fixture: ComponentFixture<GetpassengerdetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetpassengerdetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetpassengerdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
