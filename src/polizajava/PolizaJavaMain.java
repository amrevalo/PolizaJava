/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polizajava;

import java.util.ArrayList;
import modelo.Compañia_de_seguros;
import modelo.Contrato_de_seguros;
import modelo.Persona;
import modelo.Poliza_de_seguros;

/**
 *
 * @author alberto
 */
public class PolizaJavaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Persona persona1 = new Persona("Alberto","2245678S", "Calle Guada", 27);
    Compañia_de_seguros compañia1 = new Compañia_de_seguros("Mafre","211");
    Poliza_de_seguros poliza1 = new Poliza_de_seguros("2001","Completa");
    ArrayList<Contrato_de_seguros> contrato1 = new ArrayList<Contrato_de_seguros>();
    
    
    contrato1.add(persona1, poliza1, compañia1);
    
   System.out.println(contrato1);
   
   
    }
   
    
    
}
