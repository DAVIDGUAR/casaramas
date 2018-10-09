/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5;

import java.util.Scanner;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin1_5 {
public static Scanner sca = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double millas, metros ;
        millas = pedirNumero("las millas marinas: ");
        metros = millas*1852;
        System.out.println();
        System.out.println("Las millas en metros son " +  metros);
        
        
        
        
        
        
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