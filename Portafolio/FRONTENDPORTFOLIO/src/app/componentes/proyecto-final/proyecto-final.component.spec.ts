import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProyectoFinalComponent } from './proyecto-final.component';

describe('ProyectoFinalComponent', () => {
  let component: ProyectoFinalComponent;
  let fixture: ComponentFixture<ProyectoFinalComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProyectoFinalComponent]
    });
    fixture = TestBed.createComponent(ProyectoFinalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
