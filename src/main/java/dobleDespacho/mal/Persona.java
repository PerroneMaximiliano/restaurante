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
public  abstract class Persona {

    void saludar() {
        System.out.println("Soy una personoa que saluda al entrar");
    }

    void despedirse() {
        System.out.println("Soy una persona que se despide al salir");
    }
    
}
