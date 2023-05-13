/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.BACK.Portafolio.Repositorio;


import com.BACK.Portafolio.Ente.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Euge
 */
@Repository

public interface IUsuarioRepositorio extends JpaRepository<Usuario,Long> {
    
}
