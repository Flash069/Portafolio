import { Component, OnInit } from '@angular/core';
import { usuario } from 'src/app/Modelo/usuario.module';
import { UsuarioService } from 'src/app/servicio/usuario.service';

@Component({
  selector: 'app-infopersonal',
  templateUrl: './infopersonal.component.html',
  styleUrls: ['./infopersonal.component.css']
})
export class InfopersonalComponent {
usuario: usuario =new usuario("nombre", "apellido", "imagen");
constructor(public usuarioServicio: UsuarioService){}
rgOnInti(): void{}
}
