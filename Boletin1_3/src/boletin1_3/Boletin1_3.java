/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3;

import java.util.Scanner;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin1_3 {
public static Scanner sca = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double euros,dolares,cambio;
        euros = pedirNumero("Los Euros");
        cambio = pedirNumero("el Cambio");
        dolares = euros*cambio;
        System.out.println(" dolares = "+ dolares);
        
        
    }
    
    
    
    
    
    public static Double pedirNumero(String nombreDato){
    Double res;
        do {
    System.out.println("Introduzca "+ nombreDato+":");
    res = comprobarNum( sca.nextLine());
    }while(res == null);  // pedira el dato hasta que e introduzca un numero valido.
    return res;
    
    
    }
     public static  Double comprobarNum(String numero){
         Double x ;
        try{   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
           x =  Double.parseDouble(numero); 
        }catch(Exception ex){
            x=null;
            
     }
      if (x < 0)         //compruebo si es un numero valido, es decir, si es positivo o 0.
      {
      x = null;
      }      
            
            
            return x;
      
        
        



}    
    
}
