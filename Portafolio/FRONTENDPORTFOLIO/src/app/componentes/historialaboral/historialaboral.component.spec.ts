import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HistorialaboralComponent } from './historialaboral.component';

describe('HistorialaboralComponent', () => {
  let component: HistorialaboralComponent;
  let fixture: ComponentFixture<HistorialaboralComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HistorialaboralComponent]
    });
    fixture = TestBed.createComponent(HistorialaboralComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
