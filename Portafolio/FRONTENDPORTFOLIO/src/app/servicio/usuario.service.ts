import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
URL = 'http://localhost.4200/usuario/';
  constructor(private http: HttpClient) { }
  public getUsuario(): Observable<usuario>{
    
  };
}
