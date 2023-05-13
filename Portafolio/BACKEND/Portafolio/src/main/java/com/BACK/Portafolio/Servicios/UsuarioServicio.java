/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BACK.Portafolio.Servicios;

import com.BACK.Portafolio.Ente.Usuario;
import com.BACK.Portafolio.Interface.IUsuarioServicio;
import com.BACK.Portafolio.Repositorio.IUsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

/**
 *
 * @author Euge
 */
public class UsuarioServicio implements IUsuarioServicio{
@Autowired IUsuarioRepositorio iusuarioRespositorio;
    @Override
    public List<Usuario> getUsuario() {
    List<Usuario> usuario = iusuarioRespositorio.findAll() ;
    return usuario;
    }

    @Override
    public void saveUsuario(Usuario Usuario) {
        iusuarioRespositorio.save(Usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
iusuarioRespositorio.deleteById(id);  
    }

    @Override
    public Usuario findUsuario(Long id) {
Usuario usuario = iusuarioRespositorio.findById(id).orElse(null);
return usuario;
    }
    
}
