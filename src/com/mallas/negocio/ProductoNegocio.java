/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallas.negocio;

import com.mallas.entidades.EntProductos;
import com.mallas.persistencia.DaosProductos;

/**
 *
 * @author samsung
 */
public class ProductoNegocio {
    
    /*Se crean unos objetos tipo DaosProductos y EntProductos*/
    DaosProductos daoP = new DaosProductos();
    EntProductos entP = new EntProductos();
    
    
    /**
     *
     * @param prod
     * @return true si no hay producto con el mismo código
     * @return false si no se guardo correctamente
     */
    public boolean guardarProducto(EntProductos prod){
        
        boolean resp = false;
        
        String codigo_producto = prod.getCodigo_producto();
        String nombre = prod.getNombre();
        int precio = prod.getPrecio();
        int stock = prod.getStock();
        String descripcion = prod.getDescripcion();
        int cantidad = prod.getCantidad();
        
        entP = daoP.consultarProducto(codigo_producto);
        
        if(entP == null){
            resp = daoP.guardarProducto(codigo_producto, nombre, precio, stock, descripcion, cantidad);
        }
        
        return resp;                
    }
    
    
    /**
     *
     * @param codigo_producto
     * @return lo que retorna el método consultarProducto en DaosProductos
     */  
    public EntProductos consutlarProducto(String codigo_producto){
        return daoP.consultarProducto(codigo_producto);        
    }
    
    /**
     *
     * @param codigo_producto
     * @return lo que retorna el método eliminarProducto en DaosProductos
     */
    public boolean eliminarProducto(String codigo_producto){
        return daoP.eliminarProducto(codigo_producto);
    }
    
    /**
     *
     * @param prod (Producto que se va a actualizar)
     * @return true si se encuentra el producto
     * @return false si no encuentra el producto
     */
    public boolean actualizarProducto(EntProductos prod){
        
        boolean resp = false;
        
        String codigo_producto = prod.getCodigo_producto();
        String nombre = prod.getNombre();
        int precio = prod.getPrecio();
        int stock = prod.getStock();
        String descripcion = prod.getDescripcion();
        int cantidad = prod.getCantidad();
        
        entP = daoP.consultarProducto(codigo_producto);
        
        if(entP != null){
            resp = daoP.actualizarProducto(codigo_producto, nombre, precio, stock, descripcion, cantidad);
        }
        return resp;
    }
    
    /*Método que imprime los datos de la lista en consola*/
    public void imprimirLista(){
        daoP.imprimir();
    }
}
