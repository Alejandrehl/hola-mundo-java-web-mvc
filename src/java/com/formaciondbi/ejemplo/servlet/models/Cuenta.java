/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formaciondbi.ejemplo.servlet.models;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author alejandro
 */
public class Cuenta {
    
    private String nombre;
    private String email;
    private BigDecimal saldo = new BigDecimal("5000");
    private BigDecimal nivelEndeudamiento = new BigDecimal(".05");
    private Date fechaRenovacion = new Date( new Date().getTime() + 21425000000L);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getNivelEndeudamiento() {
        return nivelEndeudamiento;
    }

    public void setNivelEndeudamiento(BigDecimal nivelEndeudamiento) {
        this.nivelEndeudamiento = nivelEndeudamiento;
    }

    public Date getFechaRenovacion() {
        return fechaRenovacion;
    }

    public void setFechaRenovacion(Date fechaRenovacion) {
        this.fechaRenovacion = fechaRenovacion;
    }
    
    
}
