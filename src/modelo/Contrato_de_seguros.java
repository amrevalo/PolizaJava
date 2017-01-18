/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

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
    
    private Persona titular;
    private Poliza_de_seguros poliza;
    private Compañia_de_seguros compañia;
    private ArrayList<Contrato_de_seguros> contrato = new ArrayList<Contrato_de_seguros>();      
    
    
    
    public Contrato_de_seguros(){}
    
    public Contrato_de_seguros(String id, Persona titular, Poliza_de_seguros poliza, Compañia_de_seguros compañia){
        this.id = id;
        this.titular = titular;
        this.poliza = poliza;
        this.compañia = compañia;
        
         
    
    } 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public Poliza_de_seguros getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza_de_seguros poliza) {
        this.poliza = poliza;
    }

    public Compañia_de_seguros getCompañia() {
        return compañia;
    }

    public void setCompañia(Compañia_de_seguros compañia) {
        this.compañia = compañia;
    }

    public ArrayList<Contrato_de_seguros> getContrato() {
        return contrato;
    }

    public void setContrato(ArrayList<Contrato_de_seguros> contrato) {
        this.contrato = contrato;
    }

    
    @Override
    public String toString() {
        return "Contrato{" + "Id del contrato" + id + "Informacion Persona=" + titular + ", Informacion poliza=" + poliza + ", Informacion compañia=" + compañia +'}';
    }

    
    
}
