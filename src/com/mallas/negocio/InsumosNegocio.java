/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallas.negocio;

import com.mallas.entidades.EntInsumo;
import com.mallas.persistencia.DaosInsumo;

/**
 *
 * @author samsung
 */
public class InsumosNegocio {
    
    /*Se crean unos objetos tipo DaosInsumo y EntInsumo*/
    DaosInsumo daoU = new DaosInsumo();
    EntInsumo entI = new EntInsumo();
    
    /**
     *
     * @param ins
     * @return true si no hay insumo con el mismo código
     * @return false si no se guardo correctamente
     */
    public boolean guardarInsumo(EntInsumo ins) {

        boolean resp = false;

        String codigo = ins.getCodigo();
        String nombre = ins.getNombre();
        int cantidad = ins.getCantidad();
        int precio = ins.getPrecio();
        String descripcion = ins.getDescripcion();

        entI = daoU.consultarInsumo(codigo);
   
        if (entI == null) {
            resp = daoU.guardarInsumo(codigo, nombre, cantidad, precio, descripcion);
        }

        return resp;

    }
    
    /**
     *
     * @param codigo
     * @return lo que retorna el método consultarInsumo en DaosInsumo
     */
    
    public EntInsumo consultarInsumoEnt(String codigo) { //Consultar usuarios existentes dentro del sistema
        return daoU.consultarInsumo(codigo);
    }
    
    /**
     *
     * @param codigo
     * @return lo que retorna el método eliminarInsumo en DaosInsumo
     */
    public boolean eliminarInsumoEnt(String codigo) {
        return daoU.eliminarInsumo(codigo);
    }
    
    /**
     *
     * @param ins (Insumo que se va a actualizar)
     * @return true si encuentra el insumo
     * @return false si no encuentra el insumo
     */
    public boolean actualizarInsumoEnt(EntInsumo ins) {

        boolean resp = false;

        String codigo = ins.getCodigo();
        String nombre = ins.getNombre();
        int cantidad = ins.getCantidad();
        int precio = ins.getPrecio();
        String descripcion = ins.getDescripcion();
        
        entI = daoU.consultarInsumo(codigo);
        
        if (entI != null){
            resp = daoU.actualizarInsumo(ins);
        }
        
        return resp;
    }
    
    /*Método que imprime los datos de la lista en consola*/
    public void imprimirLista(){
        daoU.imprimir();
    }
      
}
