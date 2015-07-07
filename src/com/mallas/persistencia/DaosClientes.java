/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallas.persistencia;

import com.mallas.entidades.EntClientes;

/**
 *
 * @author samsung
 */
public class DaosClientes {
      
    int tamaño = 0; /*Variable tamaño para guardar la cantidad de nodos de la lista*/
    EntClientes cabeza; /*Variable cabeza que indica el primer nodo de la lista*/
    
    /*Método Constructor*/
    public DaosClientes(){
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
    public boolean guardarCliente(String NIT, String razon_social, String direccion, String telefono, String representante_legal,
            String regimen_tributario) {
        //Insertar al final
        EntClientes N = new EntClientes();
        EntClientes Aux;

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
     *@return un objeto EntClientes si hay anterior*/
    private EntClientes getUltimoNodo() {
        //Buscar el ultimo nodo
        EntClientes N, Ant;
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
        EntClientes aux;
        aux = cabeza;

        while (aux != null) {
            System.out.println(aux.NIT + "\n" + aux.razon_social + "\n" + aux.direccion + "\n" + aux.telefono + "\n" + aux.representante_legal + "\n"
                    + aux.regimen_tributario);
            aux = aux.next;
        }
    }
    
    /**
     *@return null si no hay cliente
     *@return un objeto EntCliente*/
    
    public EntClientes traerCliente() {
        EntClientes aux;
        aux = cabeza;

        while (aux != null) {
            aux = aux.next;
        }
        
        return aux;
    }
    
    /**
     *
     * @param NIT (NIT del cliente)
     * @return null si no encuentra el cliente
     * @return un objeto EntCliente
     */
    public EntClientes consultarCliente(String NIT) {

        int sw = 0;
        EntClientes aux;
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
     * @param cli (Cliente)
     * @return true si se encontro el cliente y lo modifica
     * @return false si no lo encontro
     */
    public boolean actualizarCliente(EntClientes cli) {

        EntClientes aux = cabeza;
        int sw = 0;

        while (aux != null && sw == 0) {
            if (aux.NIT.equals(cli.NIT)) {
                sw++;
                aux.razon_social = cli.getRazon_social();
                aux.direccion = cli.getDireccion();
                aux.telefono = cli.getTelefono();
                aux.representante_legal = cli.getRepresentante_legal();
                aux.regimen_tributario = cli.getRegimen_tributario();
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
     * @return true si encuentra al cliente y lo elimina     
     */
    public boolean eliminarCliente(String NIT) {

        if (cabeza.NIT.equals(NIT)) {
            cabeza = cabeza.next;
            return true;
        } else {
            try {
                EntClientes aux = cabeza;
                while (aux != null) {
                    if (aux.next.NIT.equals(NIT)) {
                        EntClientes aux2 = aux.next;
                        aux.next = aux2.next;
                    }
                    aux = aux.next;
                }
            } catch (Exception e) {
            }
        }
        tamaño--; /*Se le resta uno al tamaño de la lista*/
        return false;
    }
}
