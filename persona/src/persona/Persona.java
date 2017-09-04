/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author felipe
 */

public class Persona {

    /**
     * @argumentos
     */
    private String nombre;
    public int cedula;
    private String direccion;
    private String telefono;

    public static void main(String[] args) {
            public persona(int cedula) {
        this.cedula = cedula;
       
        
    }
    public int getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        //Codifico las reglas de negocio para cambiar un atributo.
        this.nombre = nombre;
    }

    }
    
}
