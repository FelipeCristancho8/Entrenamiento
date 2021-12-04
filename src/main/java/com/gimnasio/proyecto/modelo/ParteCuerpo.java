/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gimnasio.proyecto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "PARTE_CUERPO")
public class ParteCuerpo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MUSCULO")
    private Long idMusculo;    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PAR_ID_MUSCULO")
    private ParteCuerpo parIdMusculo;
    @Column(name = "DSC_MUSCULO",nullable = false,length = 50)
    private String dscMusculo;

    public ParteCuerpo() {
    }   

    public ParteCuerpo(ParteCuerpo parIdMusculo, String dscMusculo) {
        this.parIdMusculo = parIdMusculo;
        this.dscMusculo = dscMusculo;
    }

    public ParteCuerpo(String dscMusculo) {
        this.dscMusculo = dscMusculo;
    }

    public Long getIdMusculo() {
        return idMusculo;
    }

    public void setIdMusculo(Long idMusculo) {
        this.idMusculo = idMusculo;
    }

    public ParteCuerpo getParIdMusculo() {
        return parIdMusculo;
    }

    public void setParIdMusculo(ParteCuerpo parIdMusculo) {
        this.parIdMusculo = parIdMusculo;
    }

    public String getDscMusculo() {
        return dscMusculo;
    }

    public void setDscMusculo(String dscMusculo) {
        this.dscMusculo = dscMusculo;
    }

    @Override
    public String toString() {
        return "ParteCuerpo{" + "idMusculo=" + idMusculo + ", parIdMusculo=" + parIdMusculo + ", dscMusculo=" + dscMusculo + '}';
    }   
}
