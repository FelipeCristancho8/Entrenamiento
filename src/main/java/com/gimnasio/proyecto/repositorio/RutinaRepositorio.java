/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gimnasio.proyecto.repositorio;

import com.gimnasio.proyecto.modelo.Rutina;
import com.gimnasio.proyecto.modelo.RutinaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author felip
 */
@Repository
public interface RutinaRepositorio extends JpaRepository<Rutina, RutinaId>{
    
}
