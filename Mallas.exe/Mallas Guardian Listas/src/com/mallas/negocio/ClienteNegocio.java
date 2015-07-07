/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallas.negocio;

import com.mallas.entidades.EntClientes;
import com.mallas.persistencia.DaosClientes;
/**
 *
 * @author samsung
 */
public class ClienteNegocio {

    /*Se crean unos objetos tipo DaosClientes y EntClientes*/
    DaosClientes daoP = new DaosClientes();
    EntClientes provE = new EntClientes();
    
    /**
     *
     * @param cli (Cliente que va a guardar)
     * @return true si no hay cliente con el mismo NIT
     * @return false si no se guardo correctamente
     */
    public boolean guardarCliente(EntClientes cli) {

        boolean resp = false;

        String NIT = cli.getNIT();
        String razon_social = cli.getRazon_social();
        String direccion = cli.getDireccion();
        String telefono = cli.getTelefono();
        String representante_legal = cli.getRepresentante_legal();
        String regimen_tributario = cli.getRegimen_tributario();

        provE = daoP.consultarCliente(NIT);

        if (provE == null) {
            resp = daoP.guardarCliente(NIT, razon_social, direccion, telefono, representante_legal, regimen_tributario);
        }

        return resp;
    }
    
    /**
     *
     * @param NIT
     * @return lo que retorna el método consultarCliente en DaosCliente
     */
    public EntClientes consultarCliente(String NIT) {
        return daoP.consultarCliente(NIT);
    }
    
    /**
     *
     * @param NIT
     * @return lo que retorna el método eliminarCliente en DaosCliente
     */
    public boolean eliminarCliente(String NIT) {
        return daoP.eliminarCliente(NIT);
    }
    
    /**
     *
     * @param cli (Cliente que se va a actualizar)
     * @return false si no encuentra cliente
     * @return true si encuentra el cliente
     */
    public boolean actualizarCliente(EntClientes cli) {

        boolean resp = false;

        String NIT = cli.getNIT();
        String razon_social = cli.getRazon_social();
        String direccion = cli.getDireccion();
        String telefono = cli.getTelefono();
        String representante_legal = cli.getRepresentante_legal();
        String regimen_tributario = cli.getRegimen_tributario();

        provE = daoP.consultarCliente(NIT);

        if (provE != null) {
            resp = daoP.actualizarCliente(cli);
        }

        return resp;
    }
    
    /*Método que imprime los datos de la lista en consola*/
    public void imprimirLista(){
        daoP.imprimir();
    }
    
    /*Método que trae el cliente*/
    public EntClientes traerCliente(){        
        return daoP.traerCliente();
    }
}
