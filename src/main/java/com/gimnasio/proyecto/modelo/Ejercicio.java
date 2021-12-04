/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gimnasio.proyecto.modelo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author felip
 */
@Entity
@Table(name = "EJERCICIO")
public class Ejercicio implements Serializable{
    
    @Id
    @Column(name = "ID_EJERCICIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEjercicio;
    @ManyToOne()
    @JoinColumn(name = "ID_TIPO_EJERCICIO", nullable = false)
    private TipoEjercicio tipoEjercicio;   
    @Column(name = "NOMBRE_EJERCICIO", length = 50)
    private String nombreEjercicio;
    @Column(name = "DSC_EJERCICIO", length = 200)
    private String dscEjercicio;
    
    @JoinTable(
            name = "MUSCULO_EJERCICIO",
            joinColumns = @JoinColumn(name = "ID_EJERCICIO", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "ID_MUSCULO", nullable = false)
    )
    @ManyToMany
    private Set<ParteCuerpo> partesCuerpo;

    public Ejercicio() {
    }    
    

    public Ejercicio(TipoEjercicio tipoEjercicio, String nombreEjercicio, String dscEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
        this.nombreEjercicio = nombreEjercicio;
        this.dscEjercicio = dscEjercicio;
    }

    public Long getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(Long idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public TipoEjercicio getTipoEjercicio() {
        return tipoEjercicio;
    }

    public void setTipoEjercicio(TipoEjercicio tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }

    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }

    public String getDscEjercicio() {
        return dscEjercicio;
    }

    public void setDscEjercicio(String dscEjercicio) {
        this.dscEjercicio = dscEjercicio;
    }   

    @Override
    public String toString() {
        return "Ejercicio{" + "idEjercicio=" + idEjercicio + ", tipoEjercicio=" + tipoEjercicio + ", nombreEjercicio=" + nombreEjercicio + ", dscEjercicio=" + dscEjercicio + '}';
    }
    
    
}
