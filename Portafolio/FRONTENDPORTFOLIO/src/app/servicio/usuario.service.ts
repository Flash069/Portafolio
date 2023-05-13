import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { usuario } from '../Modelo/usuario.module';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
URL = 'http://localhost.8080/usuario/';
  constructor(private http: HttpClient) { }
  public getUsuario(): Observable<usuario>{
return this.http.get<usuario>(this.URL+'traer/perfil');
  }
}
