/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LS;

/**
 *
 * @author estudiante
 */
public class Nodo<E> {
    
    private E informacion;
    private Nodo<E> siguiente;

    public Nodo() {
    }

    public Nodo(E informacion, Nodo<E> siguiente) {
        this.informacion = informacion;
        this.siguiente = siguiente;
    }

    
    
    public E getInformacion() {
        return informacion;
    }

    public void setInformacion(E informacion) {
        this.informacion = informacion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
