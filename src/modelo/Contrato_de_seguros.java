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
public class Contrato_de_seguros {
    /**
     * id del contrato
     */
    private String id;
    /**
     * a que persona pertenece el contrato
     */
    private String titular1;
    
    public Contrato_de_seguros(){}
    
    public Contrato_de_seguros(String id, String t){
        this.id = id;
        this.titular1 = t;
        
         
    
    } 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitular1() {
        return titular1;
    }

    public void setTitular1(String titular1) {
        this.titular1 = titular1;
    }

    
    
}
