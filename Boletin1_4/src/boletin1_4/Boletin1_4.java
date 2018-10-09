/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4;

import java.util.Scanner;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin1_4 {
public static Scanner sca = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double numA,numB,suma,resta,producto,division;
        numA = pedirNumero("el primer numero");
        numB = pedirNumero(" el segundo numero"); 
        suma = numA +numB;
        resta = numA-numB;
        producto = numA*numB;
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la producto es: "+producto);
        if ( numB != 0){
        division = numA/numB;
        System.out.println("la division es: "+division);
        
        
        }
        
        
    }
    
    public static Double pedirNumero(String nombreDato){
    Double res;
        do {
    System.out.println("Introduzca "+ nombreDato+":");
    res = comprobarNum( sca.nextLine());
    }while(res == null);  // pedira el dato hasta que e introduzca un numero valido.
    return res;
    
    
    }
     public static  Double comprobarNum(String numero ){
         Double x ;
        try{   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
           x =  Double.parseDouble(numero); 
        }catch(Exception ex){
            x=null;
            
     }
      
            
            
            return x;
      
        
        



}    
    
}
