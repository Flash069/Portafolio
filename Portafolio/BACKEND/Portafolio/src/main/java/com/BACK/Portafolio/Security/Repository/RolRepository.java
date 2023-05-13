/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BACK.Portafolio.Security.Repository;

import com.BACK.Portafolio.Seguridad.Ente.Nombre;
import com.BACK.Portafolio.Seguridad.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Euge
 */
@Repository

public interface RolRepository extends JpaRepository<Nombre, Integer> {
    Optional<Nombre> findByRolNombre(RolNombre RolNombre)
}
