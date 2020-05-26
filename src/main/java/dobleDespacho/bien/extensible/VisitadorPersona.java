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
public interface VisitadorPersona {
    void visitar(Mujer mujer);
    
    void visitar(Hombre hombre);
}
