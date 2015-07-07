/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallas.persistencia;

import com.mallas.entidades.EntEmpleado;

/**
 *
 * @author JONATAN
 */
public class DaosEmpleado {
    
    int tamaño = 0; // Variable que almacena el Tamaño de la lista
    EntEmpleado cabeza; //Apuntador al primer nodo de la lista

    /**Método constructor*/
    public DaosEmpleado() {
        this.tamaño = 0;
        this.cabeza = null;
    }
    
    /**
     *
     * @return 0 si la lista esta vacia
     * @return un numero entero dependiendo de la cantidad de nodos en la lista
     */
    public int getTamaño() {
        return tamaño;
    }
    
    /**
     *
     * @param cedula
     * @param nombre
     * @param apellido
     * @param edad
     * @param telefono
     * @param direccion
     * @return true si se guardo correctamente
     */
    public boolean guardarEmpleado(String cedula, String nombre, String apellido,
            String edad, String telefono, String direccion) {
        //Insertar al final
        EntEmpleado N = new EntEmpleado();
        EntEmpleado Aux;

        N.cedula = cedula;
        N.nombre = nombre;
        N.apellido = apellido;
        N.edad = edad;
        N.telefono = telefono;
        N.direccion = direccion;

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

    /**Método que imprime en consola los nodos de la lista*/
    public void imprimir() {
        EntEmpleado aux;
        aux = cabeza;

        while (aux != null) {
            System.out.println(aux.cedula + "\n" + aux.nombre + "\n" + aux.apellido + "\n" 
                    + aux.edad + "\n" + aux.telefono + "\n" + aux.direccion);
            aux = aux.next;
        }
    }

    /**     
     *@return null si no hay anterior
     *@return un objeto EntEmpleado si hay anterior*/
    private EntEmpleado getUltimoNodo() {
        //Buscar el ultimo nodo
        EntEmpleado N, Ant;
        N = cabeza;
        Ant = null;

        while (N != null) {
            Ant = N;
            N = N.next;
        }
        return Ant;
    }

    /**
     *@return null si no hay empleado
     *@return un objeto EntEmpleado*/
    public EntEmpleado consultarEmpleado(String cedula){
        
        int sw = 0;
        EntEmpleado aux;
        aux = cabeza;

        if (cabeza == null) {
            return null;
        } else {
            while (aux != null && sw == 0) {
                if (aux.cedula.equals(cedula)) {
                    sw = 1;
                } else {
                    aux = aux.next;
                }
            }
        }
        return aux;
    }
    
    /**
     *
     * @param emp (Empleado)
     * @return false si no encuentra el empleado
     * @return true si encuentra el empleado y lo modifica
     */
    public boolean actualizarEmpleado(EntEmpleado emp) {

        EntEmpleado aux = cabeza;
        int sw = 0;

        while (aux != null && sw == 0) {
            if (aux.cedula.equals(emp.cedula)) {
                sw++;
                aux.nombre = emp.getNombre();
                aux.apellido = emp.getApellido();
                aux.edad = emp.getEdad();
                aux.telefono = emp.getTelefono();
                aux.direccion = emp.getDireccion();
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
     * @param cedula
     * @return true si encuentra al empleado y lo elimina     
     */
    public boolean eliminarEmpleado(String cedula) {

        if (cabeza.cedula.equals(cedula)) {
            cabeza = cabeza.next;
            return true;
        } else {
            try {
                EntEmpleado aux = cabeza;
                while (aux != null) {
                    if (aux.next.cedula.equals(cedula)) {
                        EntEmpleado aux2 = aux.next;
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
