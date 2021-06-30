/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop10;

/**
 *
 * @author Propietario
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String mensajes[] = {"Primero", "Segundo", "Tercero"};
        try{
            for (int i = 0; i <= 3; i++) {
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Error: Tu apuntador esta fuera de rango");
        }
        
        System.out.println("\n##############################\n");
        
        int a = 8, b = 1;
                
        try{
           float c = (float) a/b; 
            System.out.println("C = "+c);
        }catch(ArithmeticException ae){
            System.out.println("Error: no hay divison entre cero");
        }finally{
            System.out.println("A pesar de todo este bloque se ejecuta");
        }
        
        
        System.out.println("\n##############################\n");
        //Try Catch Anidados
        //Siempre debe ir de lo mas particular a lo más general
        
        try{
            int d = 99/0;
            System.out.println("D = "+d);
        }catch(ArithmeticException ae){
            System.out.println("Error: división entre 0");
        }catch(Exception e){
            System.out.println("Error generla");
        }finally{
            System.out.println("El bloque finally siempre se ejecuta");
        }
        
        System.out.println("\n##############################\n");
        
        try{
            int division = metodoPopagaExc(55, 0);
            System.out.println("Division "+division);
        }catch(ArithmeticException ae){
            System.out.println("Error: división entre 0");
        }
        
        
    }
    
    
    public static int metodoPopagaExc(int x, int y) throws ArithmeticException{
        if (y==0){
            throw new ArithmeticException();
        }
        return x/y;
    }
    
    
}
