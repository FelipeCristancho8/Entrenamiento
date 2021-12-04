/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gimnasio.proyecto.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author felip
 */
@Entity
@Table(name = "RUTINA")
public class Rutina implements Serializable{
    
    @EmbeddedId
    private RutinaId rutinaId;
    
    @Column(name = "REPETICIONES")
    private Integer repeticiones;
    
    @Column(name = "DURACION")
    private Integer duracion;

    public Rutina() {
    }

    public Rutina(RutinaId rutinaId, Integer repeticiones, Integer duracion) {
        this.rutinaId = rutinaId;
        this.repeticiones = repeticiones;
        this.duracion = duracion;
    }

    public RutinaId getRutinaId() {
        return rutinaId;
    }

    public void setRutinaId(RutinaId rutinaId) {
        this.rutinaId = rutinaId;
    }

    public Integer getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(Integer repeticiones) {
        this.repeticiones = repeticiones;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }    

    @Override
    public String toString() {
        return "Rutina{" + "rutinaId=" + rutinaId + ", repeticiones=" + repeticiones + ", duracion=" + duracion + '}';
    }
    
}
