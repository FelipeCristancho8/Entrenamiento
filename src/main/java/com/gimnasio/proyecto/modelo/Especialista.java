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
import javax.persistence.Table;

/**
 *
 * @author felip
 */
@Entity
@Table(name = "ESPECIALISTA")
public class Especialista implements Serializable{
    
    @Id
    @Column(name = "ID_ESPECILISTA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEspecialista;    
    @Column(name = "NOMBRE",length = 50)
    private String nombre;
    @Column(name = "FECHA_NACIMIENTO")
    private LocalDate fechaNacimiento;
    @Column(name = "TARJETA_PROFESIONAL", length = 12)
    private String tarjetaProfesional;

    public Especialista() {
    }
    
    

    public Especialista(String nombre, LocalDate fechaNacimiento, String tarjetaProfesional) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public Long getIdEspecialista() {
        return idEspecialista;
    }

    public void setIdEspecialista(Long idEspecialista) {
        this.idEspecialista = idEspecialista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    @Override
    public String toString() {
        return "Especialista{" + "idEspecialista=" + idEspecialista + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", tarjetaProfesional=" + tarjetaProfesional + '}';
    }    
}
