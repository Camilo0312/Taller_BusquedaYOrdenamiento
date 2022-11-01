/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PILA;

/**
 *
 * @author estudiante
 */
public class TestPila {
    
    public static void main(String[] args) {
      
       Punto2 pila = new Punto2();
      
       pila.p1.apilar(3);
       pila.p1.apilar(4);
       pila.p1.apilar(5);
       pila.p1.apilar(9);
       pila.p1.apilar(10);
       pila.p1.apilar(11);
       
       pila.p2.apilar(3);
       pila.p2.apilar(9);
       pila.p2.apilar(10);
       pila.p2.apilar(11);

       pila.ordenar();
       
       pila.imprimir();
       
       
       Punto3 pila2 = new Punto3();
       
       pila2.Ppe.apilar(1);
       pila2.Ppe.apilar(2);
       pila2.Ppe.apilar(3);
       pila2.Ppe.apilar(4);
       
       pila2.Pgra.apilar(1);
       pila2.Pgra.apilar(2);
       pila2.Pgra.apilar(3);
       pila2.Pgra.apilar(4);
       pila2.Pgra.apilar(6);

      
       System.out.println("¿La pila grande contiene la pequeña? = " + pila2.pertenece());
       
        
       Punto4 pila3 = new Punto4();
       
       pila3.p1.apilar(1);
       pila3.p1.apilar(2);
       pila3.p1.apilar(5);
       pila3.p1.apilar(8);
       pila3.p1.apilar(7);
       pila3.p1.apilar(4);
        
       pila3.reemplazar(9, 8);
       
        
      pila3.imprimir2();
        
        
        
        
    }
    
}
