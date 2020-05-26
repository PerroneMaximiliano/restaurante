/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobleDespacho.mal;

/**
 *
 * @author maramax
 */
public class Recepcionista {

    public void recibir(Persona persona) {
        System.out.println("Soy un recepcionista");
        if (persona instanceof Mujer) {
            System.out.println("Soy un recepcionista que se admira de su belleza");
            ((Mujer) persona).escucharHalago();
        } else {
            ((Hombre) persona).recibirPalmada(this);
        }
    }

    public void recibirPropina(int pesos) {
        System.out.println("Soy un recepcionista que gane " + pesos);
    }

    public void agradecerVisita() {
        System.out.println("Soy un recepcionista que agradece su visita!!!!!");
    }
    
}
