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
class Camarero implements VisitadorPersona {

    void servir(Persona persona) {
        persona.aceptar(this);
    }

    void recoger() {
        System.out.println("SOy un camarero que recoge la mesa");
    }

    @Override
    public void visitar(Mujer mujer) {
        System.out.println("Soy un camarero que invita a un campari");
    }

    @Override
    public void visitar(Hombre hombre) {
        System.out.println("Soy un camarero que inivita a un fernet");
    }
    
}
