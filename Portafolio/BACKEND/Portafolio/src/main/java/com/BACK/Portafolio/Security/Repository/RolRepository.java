
package com.BACK.Portafolio.Security.Repository;

import com.BACK.Portafolio.Security.Entity.Rol;
import com.BACK.Portafolio.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
