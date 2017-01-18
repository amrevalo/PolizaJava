/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alberto
 */
public class Poliza_de_seguros {
    
     /**
     * variable id numero de poliza
     */
    private String id;
    /**
     * variable privada tipopoliza para su descripcion aa
     */
    private String tipoPoliza1;
   
    
    
    public Poliza_de_seguros(){}
    
    public Poliza_de_seguros (String id, String t){
        this.id = id;
        this.tipoPoliza1 = t;
       
    } 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoPoliza1() {
        return tipoPoliza1;
    }

    public void setTipoPoliza1(String tipoPoliza1) {
        this.tipoPoliza1 = tipoPoliza1;
    }

    
    
    
    
}
