/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfoliobaudracco.MEB.Servicios;

import com.miportfoliobaudracco.MEB.Ente.Usuario;
import com.miportfoliobaudracco.MEB.Interface.IUsuarioServicio;
import com.miportfoliobaudracco.MEB.Repositorio.IUsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

/**
 *
 * @author Euge
 */
public class ImplemUsuarioServicio implements IUsuarioServicio{
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
