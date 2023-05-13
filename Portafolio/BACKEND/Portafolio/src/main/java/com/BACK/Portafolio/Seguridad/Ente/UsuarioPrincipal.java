/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BACK.Portafolio.Seguridad.Ente;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Euge
 */
public class UsuarioPrincipal implements UserDetail {
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities ;

    public UsuarioPrincipal(String nombre, String nombreUsuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }
public static UsuarioPrincipal build(Usuario usuario){
    List<GrantedAuthority> authorities = usuario.getRoles().stream().map(nombre -> new SimpleGrantedAuthority(nombre.getNombrenombre().name())).collect(Collectors.toList());
return new UsuarioPrincipal(usuario.getNombre(), usuario.getNombreUsuario(), usuario.getEmail(), usuario.getPassword(),authotities);
}

}
