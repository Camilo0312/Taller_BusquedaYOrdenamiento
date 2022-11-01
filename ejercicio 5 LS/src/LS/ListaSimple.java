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
public class ListaSimple<E> {

    private Nodo<E> inicio;
    private Nodo<E> fin;

    public ListaSimple() {
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public boolean isVacia() {
        if (this.inicio == null) {
            return true;
        }
        return false;
    }

    public void insertarInicio(E dato) {
        Nodo nuevo = new Nodo();
        nuevo.setInformacion(dato);

        if (inicio == null) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);

            inicio = nuevo;
        }
    }

    public void insertarFinal(E dato) {
        Nodo nuevo = new Nodo();
        nuevo.setInformacion(dato);

        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();

                aux.setSiguiente(nuevo);
            }
        }
    }

    public void insertarFinal2(E dato) {
        Nodo nuevo = new Nodo();
        nuevo.setInformacion(dato);

        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void imprimir() {
        Nodo<E> aux = inicio;
        while (aux != null) {
            System.out.println("Dato" + aux.getInformacion());
            aux = aux.getSiguiente();
        }
    }

    public E removerPrimero() {
        Nodo<E> aux = inicio;
        inicio = inicio.getSiguiente();
        return aux.getInformacion();
    }

    public E removerFinal() {
        Nodo<E> aux = new Nodo();
        Nodo<E> e;

        if (inicio.getSiguiente() == null) {
        e = inicio;
            inicio=null;
            System.out.println("dato eliminado: "+e.getInformacion());
        } else {
            aux = inicio;
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();

            }
            e = aux.getSiguiente();
            aux.setSiguiente(null);
            System.out.println("dato eliminado: "+e.getInformacion());
            return e.getInformacion();
        }
        return null;
    }
}
