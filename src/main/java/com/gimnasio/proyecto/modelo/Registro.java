/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gimnasio.proyecto.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author felip
 */
@Entity
@Table(name = "REGISTRO")
public class Registro implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_REGISTRO")
    private Long idRegistro;
    
    @Column(name = "FECHA_REGISTRO")
    private LocalDate fechaRegistro;
    
    @OneToOne
    @JoinColumn(name = "ID_ESPECIALISTA",nullable = false,unique = true)
    private Especialista especialista;

    public Registro() {
    }

    public Registro(LocalDate fechaRegistro, Especialista especialista) {
        this.fechaRegistro = fechaRegistro;
        this.especialista = especialista;
    }

    public Long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    @Override
    public String toString() {
        return "Registro{" + "idRegistro=" + idRegistro + ", fechaRegistro=" + fechaRegistro + ", especialista=" + especialista + '}';
    }   
}
