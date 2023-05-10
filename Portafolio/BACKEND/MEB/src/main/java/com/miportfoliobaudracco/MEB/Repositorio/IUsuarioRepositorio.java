/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.miportfoliobaudracco.MEB.Repositorio;

import com.miportfoliobaudracco.MEB.Ente.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/**
 *
 * @author Euge
 */
public interface IUsuarioRepositorio extends JpaRepository<Usuario,Long> {
    
}
