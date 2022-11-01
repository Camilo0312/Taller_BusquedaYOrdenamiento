/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PILA;

/**
 *
 * @author estudiante
 */
public class Pila<E> {
    
    private Nodo<E> cima;

    public Pila() {
    }
    
    public void apilar(E dato){
        
        Nodo<E> nuevo = new Nodo(dato, cima);
       cima = nuevo; 
    }
    
    public E desapilar(){
        E resultado;
        
        if (cima == null) {
           return null; 
        }
        resultado = cima.getInformacion();
       
        
        cima = cima.getSiguiente();
        
        return  resultado;
    }

    
     public void imprimir() {
        Nodo<E> aux = cima;
        while (aux != null) {
            System.out.println("Dato" + aux.getInformacion());
            aux = aux.getSiguiente();
        }
    }
  

   


   

    public Nodo<E> getCima() {
        return cima;
    }
    
    public Nodo<E> getCimaSiguiente(){
        return cima.getSiguiente();
    }
    

    public void setCima(Nodo<E> cima) {
        this.cima = cima;
    }

    
    
   
    
    
}
