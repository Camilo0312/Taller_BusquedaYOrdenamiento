/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajero;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class test {
    
    
    public static void main(String[] args) {
        
            Viaje va = new Viaje();
            
            
            Scanner s = new Scanner(System.in);
            
         for(int i=0; i<va.getGa().length; i++){
             
             System.out.println("1.Comida");
             System.out.println("2.Hospedaje");
             System.out.println("3.Transporte");
             System.out.println("4.Ropa");
             
             int tipo=s.nextInt();
             double valor=s.nextDouble();
             
             va.getGa()[i]= new Gasto(tipo,valor);
         }
            System.out.println("Gastos totales discriminados por tipos: ");
            System.out.println("Comida: "+ va.totales(1));
            System.out.println("Hospedaje: "+ va.totales(2));
            System.out.println("Transporte: "+ va.totales(3));
            System.out.println("Ropa: "+ va.totales(4));
            System.out.println("La cantidad de gastos que realizo en comida fue: ");
            System.out.println(""+ va.totales(1));
            System.out.println("El tipo de gasto donde mas invirtio fue: ");
            System.out.println(""+ va.mayor());
           
       }
               
 }
    

