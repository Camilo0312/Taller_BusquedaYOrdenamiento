/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author estudiante
 */
public class Test {
    
    public static void main(String[] args) {
        
       
        Ejercicio1 ej = new Ejercicio1();
          
        ej.insertarDato1(0);
        ej.insertarDato1(3);
        ej.insertarDato1(2);
        ej.insertarDato1(1);
        ej.insertarDato1(5);
        ej.insertarDato1(6);
        
        ej.insertarDato2(0);
        ej.insertarDato2(3);
        ej.insertarDato2(2);
        ej.insertarDato2(4);
        
        
        ej.extraerComun(ej.Listal1, ej.Listal2, ej.ListalComun);
        
        ej.imprimir();
        
      
        
    }
}
