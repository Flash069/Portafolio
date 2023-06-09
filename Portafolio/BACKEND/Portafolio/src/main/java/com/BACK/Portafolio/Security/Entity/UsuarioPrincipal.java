package com.BACK.Portafolio.Security.Entity;

//import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import static org.hibernate.internal.util.PropertiesHelper.map;
//import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UsuarioPrincipal implements UserDetails {

    public static UserDetails build(com.BACK.Portafolio.Ente.Usuario usuario) {
        return null;
    }

    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

       public UsuarioPrincipal(String nombre, String nombreUsuario, String email, String password,  Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public static UsuarioPrincipal build(User user) {
        List<GrantedAuthority> authorities = user.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect(Collectors.toList());
        return new UsuarioPrincipal(user.getNombre(), user.getNombreUsuario(), user.getEmail(), user.getPassword(), authorities);
    }
  //private List<GrantedAuthority> buildAuthorities(List<String> roles) {
    //    List<GrantedAuthority> authorities = new ArrayList<>();
      //  for (String role : roles) {
        //    authorities.add(new SimpleGrantedAuthority(role));
        //}
        //return authorities;
    //}
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getUsername() {
        return nombreUsuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
