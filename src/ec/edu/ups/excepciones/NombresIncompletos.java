/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.excepciones;

/**
 *
 * @author Byron PC
 */
public class NombresIncompletos extends Exception {
    
    public NombresIncompletos(){        
        super("Sus nombres no se encuentran completos\n"+"Por favor Verificar");        
    }
}