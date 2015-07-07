/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallas.entidades;

/**
 *
 * @author samsung
 */
public class EntClientes {
    public String NIT;
    public String razon_social;
    public String direccion;
    public String telefono;
    public String representante_legal;
    public String regimen_tributario;
    public EntClientes next;
    
    public EntClientes(){
        next = null;
        NIT = null;
        razon_social = null;
        direccion = null;
        telefono = null;
        representante_legal = null;
        regimen_tributario = null;                
    }
    
    /**
     *
     * @param NIT
     * @param razon_social
     * @param direccion
     * @param telefono
     * @param representante_legal
     * @param regimen_tributario
     */
    
    public EntClientes(String NIT, String razon_social, String direccion, String telefono, String representante_legal,
            String regimen_tributario){        
        this();
        this.NIT = NIT;
        this.razon_social = razon_social;
        this.direccion = direccion;
        this.telefono = telefono;
        this.representante_legal = representante_legal;
        this.regimen_tributario = regimen_tributario;        
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRepresentante_legal() {
        return representante_legal;
    }

    public void setRepresentante_legal(String representante_legal) {
        this.representante_legal = representante_legal;
    }

    public String getRegimen_tributario() {
        return regimen_tributario;
    }

    public void setRegimen_tributario(String regimen_tributario) {
        this.regimen_tributario = regimen_tributario;
    }

    public EntClientes getNext() {
        return next;
    }

    public void setNext(EntClientes next) {
        this.next = next;
    }
    
    
}
