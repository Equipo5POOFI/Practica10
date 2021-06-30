/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10miexcepcion;

/**
 *
 * @author Propietario
 */
public class Cajero {
    public static void main(String[] args){
       
        CuentaBancaria cuenta = new CuentaBancaria();
        try{
            cuenta.depositar(1000);
            cuenta.getSaldo();
            cuenta.retirarmonto(2000);
            cuenta.getSaldo();
        }catch(SaldoInsuficienteException sie){
            System.out.println("No tienes saldo suficiente");
        }catch(NoMasDosMilException nmdme){
            System.out.println("Po ahora solo puedes depositar $20,000");
        }catch(Maximo3 m3){
            System.out.println("Solo se pueden ralizar tres retiros");
        }
        
        System.out.println("\n############### Actividades Extra ###############\n");
        
        System.out.println("\t No pueden ingresar mas de $20,000\n");
        CuentaBancaria cuenta2 =  new CuentaBancaria();
        try{
            cuenta2.depositar(5000);
            cuenta2.getSaldo();
            cuenta2.depositar(21000);
        }catch(NoMasDosMilException nmdme){
            System.out.println("Por ahora solo puedes depositar $20,000");
        }
        
        System.out.println("\n\n\t Solo pueden realizar maximo 3 retiros\n");
        CuentaBancaria cuenta3 = new CuentaBancaria();
        try{
            cuenta3.depositar(15000);
            cuenta3.getSaldo();
            cuenta3.retirarmonto(1000);
            cuenta3.getSaldo();
            cuenta3.retirarmonto(1000);
            cuenta3.getSaldo();
            cuenta3.retirarmonto(1000);
            cuenta3.getSaldo();
            cuenta3.retirarmonto(1000);
            cuenta3.getSaldo();            
        }catch(NoMasDosMilException nmdme){
            System.out.println("Por ahora solo puedes depositar $20,000");
        }catch(Maximo3 m3){
            System.out.println("Solo se pueden ralizar tres retiros");
        }catch(SaldoInsuficienteException sie){
            System.out.println("No tienes saldo suficiente");
        }
        
        
        
        
    }
    
}
