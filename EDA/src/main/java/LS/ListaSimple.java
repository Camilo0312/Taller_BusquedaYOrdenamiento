/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LS;

/**
 *
 * @author estudiante
 */
public class ListaSimple<E> {
    
    private Nodo<E> inicio;
    private Nodo<E> ultimo;

    public ListaSimple() {
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    
    
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    
    
    public boolean isVacia(){
        if (this.inicio==null) {
             return true;
        }
        
        return false;
    }
    ///sin final
    public void agregarInicio(E dato){
        Nodo nuevo = new Nodo();
        nuevo.setInformacion(dato);
        if (inicio==null) {
            inicio=nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }
    }
    
    public void agregarFinal(E dato){
        
        Nodo nuevo = new Nodo();
        nuevo.setInformacion(dato);
        if (inicio==null) {
            inicio=nuevo;
        }else{
            Nodo aux = inicio;
            while(aux.getSiguiente()!=null){   
                aux = aux.getSiguiente();
                
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(null);
        }
    }
    //con final
    public void agregarInicio2(E dato){
        Nodo nuevo = new Nodo();
        nuevo.setInformacion(dato);
        if (inicio==null) {
            inicio=nuevo;
            ultimo = nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }
    }
    
    //con final
    public void agregarFinal2(E dato){
        
        Nodo nuevo = new Nodo();
        nuevo.setInformacion(dato);
        if (inicio==null) {
            inicio=nuevo;
            ultimo = nuevo;
        }else{
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

    public E removerPrimero(){
        Nodo<E> aux = inicio;
        inicio = inicio.getSiguiente();
        
        
        return aux.getInformacion();
    }
    
    public E removerFinal(){
       
        
        Nodo<E> aux2 = inicio;
        while(aux2!=null){   
                aux2 = inicio.getSiguiente().getSiguiente();
                
            }
        aux2.setSiguiente(null);
        
        return aux2.getInformacion();
    }
    
    public void imprimir(){
        Nodo<E> aux = inicio;
        while(aux != null){
            System.out.println("Dato: "+ aux.getInformacion());
            aux = aux.getSiguiente();
        }
    }

   
    
    
    
}
