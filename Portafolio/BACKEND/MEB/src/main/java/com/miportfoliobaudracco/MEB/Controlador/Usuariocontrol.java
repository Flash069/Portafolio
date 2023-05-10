/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miportfoliobaudracco.MEB.Controlador;

import com.miportfoliobaudracco.MEB.Ente.Usuario;
import com.miportfoliobaudracco.MEB.Interface.IUsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

/**
 *
 * @author Euge
 */
public class Usuariocontrol {
  @Autowired IUsuarioServicio iusuarioServicio;
 @GetMapping ("usuarios/traer")
  public List<Usuario> getUsuario()
  {
  return iusuarioServicio.getUsuario();
  }
  @PostMapping ("/usuarios/crear")
  public String createUsuario(@RequestBody Usuario usuario)
  {iusuarioServicio.saveUsuario(usuario);
  return "El usuario fue creado correctamente";
  }
  @DeleteMapping ("/usuario/borrar/{id}")
public String deleteUsuario(@PathVariable Long id)
{iusuarioServicio.deleteUsuario(id);
return "Has eliminado el usuario";
}
@PutMapping("/usuario/editar/{id}")
public Usuario editUsuario(
        @PathVariable Long id, 
        @RequestParam("nombre") String nuevoNombre,
        @RequestParam("apellido") String nuevoApellido,
       @RequestParam("img") String nuevoImg)
{Usuario usuario = iusuarioServicio.findUsuario(id);
usuario.setNombre(nuevoNombre);
        usuario.setApellido(nuevoApellido);
                usuario.setImg(nuevoImg);
iusuarioServicio.saveUsuario(usuario);
return usuario;
}
@GetMapping("/usuario/traer/perfil")
public Usuario findUsuario(){
    return iusuarioServicio.findUsuario(Long.1);
}
}
