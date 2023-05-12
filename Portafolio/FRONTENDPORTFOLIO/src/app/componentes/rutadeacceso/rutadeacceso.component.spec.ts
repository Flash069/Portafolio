import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RutadeaccesoComponent } from './rutadeacceso.component';

describe('RutadeaccesoComponent', () => {
  let component: RutadeaccesoComponent;
  let fixture: ComponentFixture<RutadeaccesoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RutadeaccesoComponent]
    });
    fixture = TestBed.createComponent(RutadeaccesoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
