/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import LS.*;
/**
 *
 * @author estudiante
 */
public class Ejercicio2 {
    
    ListaSimple Lista;
     
     public Ejercicio2(){
    
        Lista = new ListaSimple();
                
    }    

    public ListaSimple getLista() {
        return Lista;
    }

    public void setLista(ListaSimple Lista) {
        this.Lista = Lista;
    }
    
    public void insertarDato1(int x){
       
        Lista.insertarFinal2(x);
           
    }
     
     
    public void rota(ListaSimple Lista, int n){
        
        Nodo <Integer> aux=Lista.getInicio();
        int i=0;
        while(i<n){
           if(aux!=null){
           Lista.insertarFinal2(aux.getInformacion());
           Lista.removerPrimero();
           i++;
           aux=aux.getSiguiente();
           } 
           
        }
        
    }
    
    public void imprimir(){
    
      System.out.println("Lista : ");
      Lista.imprimir();
      
    }
}
