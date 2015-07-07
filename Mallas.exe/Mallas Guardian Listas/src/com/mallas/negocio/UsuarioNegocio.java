/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mallas.negocio;

import com.mallas.entidades.EntUsuario;
import com.mallas.persistencia.DaosUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samsung
 */
public class UsuarioNegocio{
 
    /*Se crean unos objetos tipo DaosUsuario y EntUsuario*/
    DaosUsuario daoU;
    EntUsuario entU = new EntUsuario();
    
    /*Método constructor*/
    public UsuarioNegocio()  {
        try {
            /*Se inicializa la variable DaosUsuario*/
            this.daoU = new DaosUsuario();
        } catch (Exception ex) {
            Logger.getLogger(UsuarioNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @return un objeto EntUsuario de DaosUsuario
     */
    public EntUsuario getUltimoNodo(){
        return daoU.getUltimoNodo();
    }
    
    /**
     *
     * @param user
     * @return true si no hay usuario con el mismo DNI
     * @return false si no se guardo correctamente
     * @throws Exception
     */
    public boolean guardarUsuario(EntUsuario user) throws Exception {
        
        boolean resp = false;
        
        String usuario = user.getUsuario();
        String clave = user.getClave();
        String rol = user.getRol();
        int DNI = user.getDNI();
        String nombre = user.getNombre();
        String apellido = user.getApellido();
        String correo = user.getCorreo();
        String estado = user.getEstado();       
        
        entU = daoU.consultarUsuario(DNI);
        
        if(entU == null){
            resp = daoU.guardarUsuario(usuario, clave, rol, DNI, nombre, apellido, correo, estado);
        }
        
        return resp;                
    }
    
    /**
     *
     * @param dni
     * @return lo que retorna el método consultarUsuario en DaosUsuario
     */
    public EntUsuario consultarUsuarioEnt(int dni) { //Consultar usuarios existentes dentro del sistema
        return daoU.consultarUsuario(dni);
    }
    
    /**
     *
     * @param dni
     * @return lo que retorna el método eliminarUsuario en DaosUsuario
     * @throws Exception
     */
    public boolean eliminarUsuarioEnt(int dni) throws Exception {
        return daoU.eliminarUsuario(dni);
    }
    
    /**
     *
     * @param user
     * @return true si se encuentra el usuario
     * @return false si no se encuentra el usuario
     * @throws Exception
     */
    public boolean actualizarUsuarioEnt(EntUsuario user) throws Exception {        
        boolean resp = false;
        
        String clave = user.getClave();
        String rol = user.getRol();               
        String correo = user.getCorreo();
        String estado = user.getEstado();
        int dni = user.getDNI();
        
        entU = daoU.consultarUsuario(dni);
        
        if (entU != null){
            resp = daoU.actualizarUsuario(dni, clave, estado, rol, correo);
        }        
        return resp;
    }
    
    /*Método que imprime los datos de la lista en consola*/
    public void imprimirLista(){
        daoU.imprimir();
    }
    
    /**
     * Método que verifica la existencia del usuario en el sistema
     * @param NombreUsuario
     * @param clave
     * @return el perfil del usuario
     * @return none si no encuentra el usuario, o si la clave está errada
     */
    public String verificarUsuario(String NombreUsuario, String clave) {

        entU = daoU.buscarUsuario(NombreUsuario);

        if (entU != null) {
            //Si Encuentra el usuario
            if (clave.equals(entU.getClave())) {
                //Verifico si la clave es correcta
                if (entU.getRol().equals("Administrador")) {
                    return "Administrador";
                } else {
                    return "Empleado";
                }
            } else {
                //lo encuentra pero la clave esta errada
                return "none";
            }
        } else {
            //No encuentra el usuario
            return "none";
        }
    }
    
    /**
     *
     * @param userName
     * @return un objeto EntUsuario que sale del método buscarUsuario en 
       DaosUsuario
     */
    public EntUsuario getUsuario(String userName){
        return daoU.buscarUsuario(userName);
    }        
    
    /**
     *
     * @param mail
     * @return un objeto EntUsuario que se busca por medio del e-mail
       para la recuperación de contraseña
     */
    public EntUsuario buscarCorreoEnt(String mail){
        return daoU.buscarCorreo(mail);
    }
    
    /**
     *
     * @return un objeto EntUsuario que inició sesión
     */
    public EntUsuario configUser(){
        return daoU.configUser();
    }
    
    public int tamañoLista(){
        return daoU.getTamaño();
    }
      
}
