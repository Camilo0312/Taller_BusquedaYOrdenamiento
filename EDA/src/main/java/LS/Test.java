/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LS;

/**
 *
 * @author estudiante
 */
public class Test {
    public static void main(String[] args) {
       
        Punto1 punto1 = new Punto1();
        
        punto1.lista1.agregarFinal2(1);
        punto1.lista1.agregarFinal2(3);
        punto1.lista1.agregarFinal2(5);
        punto1.lista1.agregarFinal2(7);
        punto1.lista1.agregarFinal2(9);
        punto1.lista1.agregarFinal2(11);
        
        punto1.lista2.agregarFinal2(2);
        punto1.lista2.agregarFinal2(4);
        punto1.lista2.agregarFinal2(6);
        punto1.lista2.agregarFinal2(8);
        punto1.lista2.agregarFinal2(10);
        

         System.out.println("lista 1: ");
         punto1.lista1.imprimir();
         System.out.println("lista 2: ");
         punto1.lista2.imprimir();
         System.out.println("Lista mezcla");
         punto1.Mezcla2(punto1.lista1 , punto1.lista2).imprimir();
         
         
    }
}
