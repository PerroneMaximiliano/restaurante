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
public class Hombre extends Persona {

    public void recibirPalmada(Recepcionista recepcionista) {
        System.out.println("Soy un hombre que recibe una palmada");
        recepcionista.recibirPropina(5);
    }
    
}
