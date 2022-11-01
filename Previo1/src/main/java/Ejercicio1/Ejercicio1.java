/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import LS.*;
/**
 *
 * @author estudiante
 */
public class Ejercicio1 {
    
    ListaSimple Listal1;
    ListaSimple Listal2;
    ListaSimple ListalComun;
    
    
    public Ejercicio1(){
    
        Listal1 = new ListaSimple();
        Listal2 = new ListaSimple();
        ListalComun = new ListaSimple();
    }

    public ListaSimple getListal1() {
        return Listal1;
    }

    public void setListal1(ListaSimple Listal1) {
        this.Listal1 = Listal1;
    }

    public ListaSimple getListal2() {
        return Listal2;
    }

    public void setListal2(ListaSimple Listal2) {
        this.Listal2 = Listal2;
    }

    public ListaSimple getListalComun() {
        return ListalComun;
    }

    public void setListalComun(ListaSimple ListalComun) {
        this.ListalComun = ListalComun;
    }
    
    public void insertarDato1(int x){
       
        Listal1.insertarFinal2(x);
           
    }
    
     public void insertarDato2(int x){
       
        Listal2.insertarFinal2(x);
           
    }
     
     
    
    public void extraerComun(ListaSimple Listal1, ListaSimple Listal2, ListaSimple ListalComun ){
    
        Nodo <Integer> aux=Listal1.getInicio();
        Nodo <Integer> aux2=Listal2.getInicio();
        
        while(aux!=null && aux2!=null){
            if((int)aux.getInformacion()==(int)aux2.getInformacion()){
            
               ListalComun.insertarFinal2(aux2.getInformacion());
               Listal1.removerPrimero();
               Listal2.removerPrimero();
               aux=aux.getSiguiente();
               aux2=aux2.getSiguiente();
            
            }else{
            
                aux=aux.getSiguiente();
                aux2=aux2.getSiguiente();
                
            }
            
        }
    
    }
    
    
    public void imprimir(){
    
      System.out.println("Lista 1: ");
      Listal1.imprimir();
      System.out.println("Lista 2: ");
      Listal2.imprimir();
      System.out.println("Lista Comun: ");
      ListalComun.imprimir();
    }
}
