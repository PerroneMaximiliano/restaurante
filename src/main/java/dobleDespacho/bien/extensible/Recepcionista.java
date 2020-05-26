/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobleDespacho.bien.extensible;

/**
 *
 * @author maramax
 */
public class Recepcionista implements VisitadorPersona {

    public void recibir(Persona persona) {
        System.out.println("Soy un recepcionista");
        persona.aceptar(this);
    }
    
    @Override
    public void visitar(Mujer mujer) {
         System.out.println("Soy un recepcionista que se admira de su belleza");
         mujer.escucharHalago();
    }

    @Override
    public void visitar(Hombre hombre) {
        hombre.recibirPalmada(this);
    }

    public void recibirPropina(int pesos) {
        System.out.println("Soy un recepcionista que gane " + pesos);
    }

    public void agradecerVisita() {
        System.out.println("Soy un recepcionista que agradece su visita!!!!!");
    }

    
    
}
