/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.BACK.Portafolio.Security.Service;

import com.BACK.Portafolio.Security.Repository.RolRepository;
import com.BACK.Portafolio.Seguridad.Ente.Nombre;
import com.BACK.Portafolio.Seguridad.Enums.RolNombre;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Euge
 */
@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository RolRepository;
    public Optional<Nombre> getByrolNombre(RolNombre RolNombre);
}
