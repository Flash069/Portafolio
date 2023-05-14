

package com.BACK.Portafolio.Security.Service;

import com.BACK.Portafolio.Ente.Usuario;
import com.BACK.Portafolio.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class UserDetailsImp implements UserDetailsService {
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
   return UsuarioPrincipal.build(usuario);
    }
}
