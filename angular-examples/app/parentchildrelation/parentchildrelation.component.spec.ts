import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentchildrelationComponent } from './parentchildrelation.component';

describe('ParentchildrelationComponent', () => {
  let component: ParentchildrelationComponent;
  let fixture: ComponentFixture<ParentchildrelationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParentchildrelationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParentchildrelationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
