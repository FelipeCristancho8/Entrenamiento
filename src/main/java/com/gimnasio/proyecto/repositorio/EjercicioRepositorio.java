/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gimnasio.proyecto.repositorio;

import com.gimnasio.proyecto.modelo.Ejercicio;
import com.gimnasio.proyecto.modelo.TipoEjercicio;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author felip
 */
@Repository
public interface EjercicioRepositorio extends JpaRepository<Ejercicio, Long>{
    
    List<Ejercicio> findByNombreEjercicio(String nombre);
    List<Ejercicio> findByTipoEjercicio(TipoEjercicio tipoEjercicio);
    
    boolean existsByNombreEjercicio(String nombre);
    List<Ejercicio> findByNombreEjercicioStartingWith(String nombre);
    List<Ejercicio> findByOrderByNombreEjercicioDesc();
    List<Ejercicio> findByNombreEjercicioIgnoreCase(String nombre);
    
    //nativas-jpql-paginator-
}
