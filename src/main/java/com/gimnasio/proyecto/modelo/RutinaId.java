/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gimnasio.proyecto.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author felip
 */
@Embeddable
public class RutinaId implements Serializable{
    
    @ManyToOne
    @JoinColumn(name = "ID_ESPECIALISTA")
    private Especialista especialista;
    
    @ManyToOne
    @JoinColumn(name = "ID_EJERCICIO")
    private Ejercicio ejercicio;
    
    @Column(name = "DIA",length = 3)
    private String dia;

    public RutinaId() {
    }

    public RutinaId(Especialista especialista, Ejercicio ejercicio, String dia) {
        this.especialista = especialista;
        this.ejercicio = ejercicio;
        this.dia = dia;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public Ejercicio getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }    

    @Override
    public String toString() {
        return "RutinaId{" + "especialista=" + especialista + ", ejercicio=" + ejercicio + ", dia=" + dia + '}';
    }
    
    
}
