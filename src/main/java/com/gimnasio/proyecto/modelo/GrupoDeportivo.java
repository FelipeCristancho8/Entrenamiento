/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gimnasio.proyecto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author felip
 */
@Entity
@Table(name = "GRUPO_DEPORTIVO")
public class GrupoDeportivo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CSC_INTENTOS")
    private Long cscIntentos;    
    @ManyToOne()
    @JoinColumn(name = "ID_ESPECIALISTA")
    private Especialista idEspecialista;
    @ManyToOne()
    @JoinColumn(name = "ESP_ID_ESPECIALISTA")
    private Especialista espIdEspecialista;
    @Column(name = "INTENTO")
    private Long intento;    

    public GrupoDeportivo() {
    }

    public GrupoDeportivo(Especialista idEspecialista, Especialista espIdEspecialista, Long intento) {
        this.idEspecialista = idEspecialista;
        this.espIdEspecialista = espIdEspecialista;
        this.intento = intento;
    }

    public Long getCscIntentos() {
        return cscIntentos;
    }

    public void setCscIntentos(Long cscIntentos) {
        this.cscIntentos = cscIntentos;
    }

    public Especialista getIdEspecialista() {
        return idEspecialista;
    }

    public void setIdEspecialista(Especialista idEspecialista) {
        this.idEspecialista = idEspecialista;
    }

    public Especialista getEspIdEspecialista() {
        return espIdEspecialista;
    }

    public void setEspIdEspecialista(Especialista espIdEspecialista) {
        this.espIdEspecialista = espIdEspecialista;
    }

    public Long getIntento() {
        return intento;
    }

    public void setIntento(Long intento) {
        this.intento = intento;
    }

    @Override
    public String toString() {
        return "GrupoDeportivo{" + "cscIntentos=" + cscIntentos + ", idEspecialista=" + idEspecialista + ", espIdEspecialista=" + espIdEspecialista + ", intento=" + intento + '}';
    }    
}
