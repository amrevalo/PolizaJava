/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliza_de_seguros;

/**
 *
 * @author a022593391p
 */
public class Persona {   
   /**
     * variable privada para nombre de persona
     */
    private String nombre;
    /**
     * variable privada direccion de la persona
     */
    private String direccion;
    /**
     * variable privada dni de la persona
     */
    private String dni;
    /**
     * variable privada edad de la persona
     */
    private int edad;
    
    
    public Persona(){}
    
    public Persona(String n, String d1, String d2, int e){
        this.nombre = n;
        this.direccion = d1;
        this.dni = d2;
        this.edad = e;
         
    
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
