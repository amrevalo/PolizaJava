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
public class Compañia_de_seguros {
    /**
     * variable privada para nombre de actor
     */
    private String id;
    /**
     * variable privada id de la compañia
     */
    private String nombre;
    /**
     * variable privada del nombre de la compañia
     */
    public Compañia_de_seguros(){}
    
    public Compañia_de_seguros(String i, String n){
        this.nombre = n;
        this.id = i;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
