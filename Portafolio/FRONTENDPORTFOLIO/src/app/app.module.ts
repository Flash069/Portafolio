import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component';
import { LogoAPComponent } from './componentes/logo-ap/logo-ap.component';
import { BannerComponent } from './componentes/banner/banner.component';
import { InfopersonalComponent } from './componentes/infopersonal/infopersonal.component';
import { ExperienciaComponent } from './componentes/experiencia/experiencia.component';
import { EducacionComponent } from './componentes/educacion/educacion.component';
import  {  NgCircleProgressModule  }  from  'ng-circle-progress';
import { CirculosComponent } from './componentes/circulos/circulos.component';
import { ProyectoFinalComponent } from './componentes/proyecto-final/proyecto-final.component';
import { FooterComponent } from './componentes/footer/footer.component' ;

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    BannerComponent,
    InfopersonalComponent,
    ExperienciaComponent,
    EducacionComponent,
    CirculosComponent,
    ProyectoFinalComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule . forRoot ( { })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
