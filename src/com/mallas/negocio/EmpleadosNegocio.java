/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallas.negocio;

import com.mallas.entidades.EntEmpleado;
import com.mallas.persistencia.DaosEmpleado;
/**
 *
 * @author JONATAN
 */
public class EmpleadosNegocio {

    /*Se crean unos objetos tipo DaosEmpleados y EntEmpleado*/
    DaosEmpleado daoU = new DaosEmpleado();
    EntEmpleado entU = new EntEmpleado();
    
    /**
     *
     * @param emp
     * @return true si no hay empleado con la misma cédula
     * @return false si no se guardo correctamente
     */
    public boolean guardarEmpleado(EntEmpleado emp) {
        
        boolean resp = false;
        
        String cedula = emp.getCedula();
        String nombre = emp.getNombre();
        String apellido = emp.getApellido();
        String edad = emp.getEdad();
        String telefono = emp.getTelefono();
        String direccion = emp.getDireccion();     
        
        entU = daoU.consultarEmpleado(cedula);         
   
        if (entU == null) {
            resp = daoU.guardarEmpleado(cedula, nombre, apellido, edad, telefono, direccion);
        }
        
        return resp;

    }
    
    /**
     *
     * @param cedula
     * @return lo que retorna el método consultarEmpleado en DaosEmpleado
     */
    public EntEmpleado consulEntEmpleado(String cedula) {
        return daoU.consultarEmpleado(cedula);
    }
    
    /**
     *
     * @param cedula
     * @return lo que retorna el método eliminarEmpleado en DaosEmpleado
     */
    public boolean eliminarEmpleadoEnt(String cedula) {
        return daoU.eliminarEmpleado(cedula);
    }
    
    /**
     *
     * @param emp (Empleado que se va a actualizar)
     * @return true si encuentra el empleado
     * @return false si no encuentra el empleado
     */
    public boolean actualizarEmpleadoEnt(EntEmpleado emp) {
        
        boolean resp = false;
        
        String cedula = emp.getCedula();
        String edad = emp.getEdad();
        String telefono = emp.getTelefono();
        String direccion = emp.getDireccion();
        
        entU = daoU.consultarEmpleado(cedula);
        
        if (entU != null){
            resp = daoU.actualizarEmpleado(emp);
        }
        
        return resp;
    }
    
    /*Método que imprime los datos de la lista en consola*/
    public void imprimirLista(){
        daoU.imprimir();
    }
}
