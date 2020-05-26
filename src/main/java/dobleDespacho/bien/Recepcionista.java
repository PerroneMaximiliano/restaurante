/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobleDespacho.bien;

import dobleDespacho.mal.*;

/**
 *
 * @author maramax
 */
public class Recepcionista {

    public void recibir(Persona persona) {
        System.out.println("Soy un recepcionista");
        persona.aceptar(this);
    }
    
    public void visitarMujer(Mujer mujer) {
         System.out.println("Soy un recepcionista que se admira de su belleza");
         mujer.escucharHalago();
    }
    
    public void visitarHombre(Hombre hombre) {
        hombre.recibirPalmada(this);
    }

    public void recibirPropina(int pesos) {
        System.out.println("Soy un recepcionista que gane " + pesos);
    }

    public void agradecerVisita() {
        System.out.println("Soy un recepcionista que agradece su visita!!!!!");
    }
    
}
