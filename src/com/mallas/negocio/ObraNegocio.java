/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallas.negocio;

import com.mallas.entidades.EntObras;
import com.mallas.persistencia.DaosObras;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author samsung
 */
public class ObraNegocio {
    
    /*Se crean unos objetos tipo DaosObras y EntObras*/
    DaosObras daoO = new DaosObras();
    EntObras entO = new EntObras();
    
    
    /**
     *
     * @param obra
     * @return true si no hay obra con la misma referencia
     * @return false si no se guardo correctamente
     */
    public boolean guardarObraEnt(EntObras obra) {

        boolean resp = false;

        String referencia = obra.getReferencia();
        String nombre = obra.getNombre();
        String nombre_cliente = obra.getNombre_cliente();
        String fecha_inicio = obra.getFecha_inicio();
        String fecha_final = obra.getFecha_final();
        String direccion = obra.getDireccion();
        String ciudad = obra.getCiudad();
        String estado = obra.getEstado();

        entO = daoO.consultarObra(referencia);                

        if (entO == null) {
            resp = daoO.guardarObra(referencia, nombre, nombre_cliente, fecha_inicio, fecha_final, ciudad, direccion, estado);
        }

        return resp;
    }
    
    /**
     *
     * @param referencia
     * @return lo que retorna el método consultarObra en DaosObras
     */
    public EntObras consultarObraEnt(String referencia) {
        return daoO.consultarObra(referencia);
    }
    
    /**
     *
     * @param referencia
     * @return lo que retorna el método eliminarObra en DaosObra
     */
    public boolean eliminarObraEnt(String referencia) {
        return daoO.eliminarObra(referencia);
    }
    
    /**
     *
     * @param obra (Obra que se va a actualizar)
     * @return true si encuentra la obra
     * @return false si no encuentra la obra
     */
    public boolean actualizarObraEnt(EntObras obra) {

        boolean resp = false;

        String referencia = obra.getReferencia();
        String nombre = obra.getNombre();
        String nombre_cliente = obra.getNombre_cliente();
        String fecha_inicio = obra.getFecha_inicio();
        String fecha_final = obra.getFecha_final();
        String ciudad = obra.getCiudad();
        String direccion = obra.getDireccion();
        String estado = obra.getEstado();

        entO = daoO.consultarObra(referencia);

        if (entO != null) {
            resp = daoO.actualizarObra(referencia, nombre, nombre_cliente, fecha_inicio, fecha_final, ciudad, direccion, estado);
        }
        return resp;
    }
    
    /*Método que imprime los datos de la lista en consola*/
    public void imprimirLista(){
        daoO.imprimir();
    }
    /*Método que retorna los clientes consultados en verificarCliente
     de DaosObras*/
    public void verificarCliente(){
        daoO.verificarCliente();
    }
}
