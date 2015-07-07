/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallas.negocio;

import com.mallas.entidades.EntProveedores;
import com.mallas.persistencia.DaosProveedores;

/**
 *
 * @author samsung
 */
public class ProveedorNegocio {
    
    /*Se crean unos objetos tipo DaosProveedores y EntProveedores*/
    DaosProveedores daoP = new DaosProveedores();
    EntProveedores provE = new EntProveedores();

    /**
     *
     * @param prov (Proveedor que se va a guardar)
     * @return true si no hay proveedor con el mismo NIT
     * @return false si no se guardo correctamente
     */
    public boolean guardarProveedor(EntProveedores prov) {

        boolean resp = false;

        String NIT = prov.getNIT();
        String razon_social = prov.getRazon_social();
        String direccion = prov.getDireccion();
        String telefono = prov.getTelefono();
        String representante_legal = prov.getRepresentante_legal();
        String regimen_tributario = prov.getRegimen_tributario();

        provE = daoP.consultarProveedor(NIT);

        if (provE == null) {
            resp = daoP.guardarUsuario(NIT, razon_social, direccion, telefono, representante_legal, regimen_tributario);
        }

        return resp;
    }
    
    /**
     *
     * @param NIT
     * @return lo que retorna el método consultarProveedor en DaosProveedores
     */
    public EntProveedores consultarProveedor(String NIT) {
        return daoP.consultarProveedor(NIT);
    }
    
    /**
     *
     * @param NIT
     * @return lo que retorna el método eliminarProveedor en DaosProveedores
     */
    public boolean eliminarProveedor(String NIT) {
        return daoP.eliminarProveedor(NIT);
    }
    
    /**
     *
     * @param prov (Proveedor que se va a actualizar)
     * @return false si no encuentra el proveedor
     * @return true si encuentra el proveedor
     */
    public boolean actualizarProveedor(EntProveedores prov) {

        boolean resp = false;

        String NIT = prov.getNIT();
        String razon_social = prov.getRazon_social();
        String direccion = prov.getDireccion();
        String telefono = prov.getTelefono();
        String representante_legal = prov.getRepresentante_legal();
        String regimen_tributario = prov.getRegimen_tributario();

        provE = daoP.consultarProveedor(NIT);

        if (provE != null) {
            resp = daoP.actualizarProveedor(prov);
        }

        return resp;
    }
    
    /*Método que imprime los datos de la lista en consola*/
    public void imprimirLista(){
        daoP.imprimir();
    }
}
