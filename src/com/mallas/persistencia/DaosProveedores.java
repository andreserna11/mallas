/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallas.persistencia;

import com.mallas.entidades.EntProveedores;

/**
 *
 * @author samsung
 */
public class DaosProveedores {
    
    int tamaño = 0; //Variable que almacena el Tamaño de la lista
    EntProveedores cabeza; //Apuntador al primer nodo de la lista
    
     /**Método constructor*/
    public DaosProveedores(){
        this.tamaño = 0;
        this.cabeza = null;
    }
    
    /**
     *
     * @return 0 si la lista esta vacia
     * @return un numero entero dependiendo de la cantidad de nodos en la lista
     */
    public int getTamaño(){
        return tamaño;
    }
    
    /**
     *
     * @param NIT
     * @param razon_social
     * @param direccion
     * @param telefono
     * @param representante_legal
     * @param regimen_tributario
     * @return true si se guardo correctamente
     */
    public boolean guardarUsuario(String NIT, String razon_social, String direccion, String telefono, String representante_legal,
            String regimen_tributario) {
        //Insertar al final
        EntProveedores N = new EntProveedores();
        EntProveedores Aux;

        N.NIT = NIT;
        N.razon_social = razon_social;
        N.direccion = direccion;
        N.telefono = telefono;
        N.representante_legal = representante_legal;
        N.regimen_tributario = regimen_tributario;

        if (cabeza == null) {
            cabeza = N;
        } else {
            Aux = getUltimoNodo();
            if (Aux != null) {
                Aux.next = N;
            }
        }
        tamaño++;
        return true;

    }
    
    /**
     *@return null si no hay anterior
     *@return un objeto EntProveedores si hay anterior*/
    private EntProveedores getUltimoNodo() {
        //Buscar el ultimo nodo
        EntProveedores N, Ant;
        N = cabeza;
        Ant = null;

        while (N != null) {
            Ant = N;
            N = N.next;
        }
        return Ant;
    }
    
    /*Método para imprimir los datos en consola*/
    public void imprimir() {
        EntProveedores aux;
        aux = cabeza;

        while (aux != null) {
            System.out.println(aux.NIT + "\n" + aux.razon_social + "\n" + aux.direccion + "\n" + aux.telefono + "\n" + aux.representante_legal + "\n"
                    + aux.regimen_tributario);
            aux = aux.next;
        }
    }
    
    /**
     *
     * @param NIT (NIT del proveedor)
     * @return null si no encuentra el proveedor
     * @return un objeto EntProveedores
     */
    public EntProveedores consultarProveedor(String NIT) {

        int sw = 0;
        EntProveedores aux;
        aux = cabeza;

        if (cabeza == null) {
            return null;
        } else {
            while (aux != null && sw == 0) {
                if(aux.getNIT().equals(NIT)){
                    sw=1;
                }else{
                    aux = aux.next;
                }
            }
        }
        return aux;
    }
    
    /**
     *
     * @param prov (Proveedor)
     * @return true si se encontro el proveedor y lo modifica
     * @return false si no lo encontro
     */
    public boolean actualizarProveedor(EntProveedores prov) {

        EntProveedores aux = cabeza;
        int sw = 0;

        while (aux != null && sw == 0) {
            if (aux.NIT.equals(prov.NIT)) {
                sw++;
                aux.razon_social = prov.getRazon_social();
                aux.direccion = prov.getDireccion();
                aux.telefono = prov.getTelefono();
                aux.representante_legal = prov.getRepresentante_legal();
                aux.regimen_tributario = prov.getRegimen_tributario();
            }
            aux = aux.next;
        }

        if (sw == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    /**
     *
     * @param NIT
     * @return true si encuentra al proveedor y lo elimina     
     */
    public boolean eliminarProveedor(String NIT) {

        if (cabeza.NIT.equals(NIT)) {
            cabeza = cabeza.next;
            return true;
        } else {
            try {
                EntProveedores aux = cabeza;
                while (aux != null) {
                    if (aux.next.NIT.equals(NIT)) {
                        EntProveedores aux2 = aux.next;
                        aux.next = aux2.next;
                    }
                    aux = aux.next;
                }
            } catch (Exception e) {
            }
        }
        tamaño--;
        return false;
    }
}
