/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_1;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author palonsovazquez
 */
public class Boletin1_1 {

    public static Scanner sca = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        triangulo();
        
        
        
        
    }
    
    public static void triangulo(){
    Double base,area,altura;
    
    
    base = pedirNumero("base"); 
    altura = pedirNumero("altura");
    area = (base*altura)/2;
    System.out.println("El area del triangulo de base: " +base+ " y altura: "+altura+" es: "+ area);
    
    
    }
    
    public static Double pedirNumero(String nombreDato){
    Double res;
        do {
    System.out.println("Introduzca la "+ nombreDato+":");
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
      if (x <= 0)         //compruebo si es un numero valido, es decir, si es positivo y distinto de 0.
      {
      x = null;
      }      
            
            
            return x;
      
        
        



}    
    
    
}
