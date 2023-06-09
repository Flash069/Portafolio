/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BACK.Portafolio.Interface;

import com.BACK.Portafolio.Ente.Usuario;
import java.util.List;

/**
 *
 * @author Euge
 */
public interface IUsuarioServicio {
    public List<Usuario> getUsuario ();
    
    public void saveUsuario(Usuario Usuario);
    
    public void deleteUsuario(Long id);
    public Usuario findUsuario(Long id);
}
