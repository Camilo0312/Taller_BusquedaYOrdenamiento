/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;



/**
 *
 * @author estudiante
 */
public class Test {
    
    public static void main(String[] args) {
        
       
        Ejercicio2 ej = new Ejercicio2();
          
        ej.insertarDato1(1);
        ej.insertarDato1(3);
        ej.insertarDato1(5);
        ej.insertarDato1(4);
        ej.insertarDato1(2);
        ej.insertarDato1(6);
        
        
        ej.rota(ej.Lista, 2);
        
        ej.imprimir();
    }    
}
