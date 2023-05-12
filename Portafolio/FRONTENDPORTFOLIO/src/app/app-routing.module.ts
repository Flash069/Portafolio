import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RutadeaccesoComponent } from './componentes/rutadeacceso/rutadeacceso.component';
import { IngresoComponent } from './componentes/ingreso/ingreso.component';

const routes: Routes = [
  {path: '', component: RutadeaccesoComponent},
  {path: 'ingreso', component: IngresoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
