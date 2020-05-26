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
public class Mujer extends Persona {

    void escucharHalago() {
        System.out.println("Soy una mujer que escucha un halago");
    }

    @Override
    public void aceptar(Recepcionista recepcionista) {
        recepcionista.visitarMujer(this);
    }
    
}
