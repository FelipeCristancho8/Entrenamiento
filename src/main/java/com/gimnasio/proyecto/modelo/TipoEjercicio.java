/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gimnasio.proyecto.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author felip
 */
@Entity
@Table(name = "TIPO_EJERCICIO")
public class TipoEjercicio implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPO_EJERCICIO")
    private Integer id;
    
    @Column(name = "DSC_TIPO_EJERCICIO",length = 50)
    private String descripcion;

    public TipoEjercicio() {
    }   

    public TipoEjercicio(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }  

    @Override
    public String toString() {
        return "TipoEjercicio{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }   
}
