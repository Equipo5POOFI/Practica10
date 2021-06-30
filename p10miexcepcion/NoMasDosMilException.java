/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10miexcepcion;

/**
 *
 * @author DanielEsteban
 */
public class NoMasDosMilException extends Exception{

    public NoMasDosMilException() {
        super("No puedes hacer un depósito de más de $20,000");
    }    
    
}


