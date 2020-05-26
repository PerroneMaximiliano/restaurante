/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobleDespacho.mal;

import java.util.Random;

/**
 *
 * @author maramax
 */
public class Restaurante {
    
    private Recepcionista recepcionista;
    
    private Restaurante() {
        recepcionista = new Recepcionista();
    }
    
    public static void main(String[] args) {
        new Restaurante().simularEscenario();
    }

    private void simularEscenario() {
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            Persona persona;
            if (random.nextInt(2) == 0) {
                persona = new Hombre();
            } else {
                persona = new Mujer();
            }
            this.simularEscenario(persona);
        }
    }

    private void simularEscenario(Persona persona) {
        persona.saludar();
        recepcionista.recibir(persona);
        persona.despedirse();
        recepcionista.agradecerVisita();
        System.out.println(".................. FINAL ..........................");
    }
    
    
}
