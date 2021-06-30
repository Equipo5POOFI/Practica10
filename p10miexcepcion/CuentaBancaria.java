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
public class CuentaBancaria {
    
    private double saldo;
    private int contador;

    public CuentaBancaria() {
        saldo = 0;
        contador = 0;
    }

    public double getSaldo() {
        System.out.println("Saldo: "+saldo);
        return saldo;
    }
    
    public void depositar(double monto) throws NoMasDosMilException{
        if (monto > 20000)
            throw new NoMasDosMilException();
        else{        
            System.out.println("Depositando "+monto+" pesos");
            saldo += monto;
        }
    }
    
    public void retirarmonto(double monto) throws SaldoInsuficienteException, Maximo3{
        if (contador < 3){          
            System.out.println("Retirando " + monto);
            if (saldo < monto){
                throw new SaldoInsuficienteException();
            }else{
                saldo -= monto;
                contador += 1;
            }
        }else
            throw new Maximo3();
    }
    
    
    
    
    
    
}
