/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LS;

/**
 *
 * @author estudiante
 */
public class Nodo<E> {
    private E informacion;
    private Nodo siguiente;

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

    public Nodo() {
    }
    
}
