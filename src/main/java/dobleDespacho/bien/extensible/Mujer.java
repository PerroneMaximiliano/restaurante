/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobleDespacho.bien.extensible;

import dobleDespacho.bien.*;
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
    public void aceptar(VisitadorPersona visitadorPersona) {
        visitadorPersona.visitar(this);
    }
    
}
