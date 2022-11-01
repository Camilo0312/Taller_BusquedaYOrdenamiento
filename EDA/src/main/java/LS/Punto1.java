/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LS;

/**
 *
 * @author Ryzen
 */
public class Punto1 {
    
    ListaSimple lista1 = new ListaSimple();
    ListaSimple lista2 = new ListaSimple();
    
    

    public Punto1() {
    }

    public ListaSimple getLista1() {
        return lista1;
    }

    public void setLista1(ListaSimple lista1) {
        this.lista1 = lista1;
    }

    public ListaSimple getLista2() {
        return lista2;
    }

    public void setLista2(ListaSimple lista2) {
        this.lista2 = lista2;
    }

 

    
    
    
    public ListaSimple Mezcla2(ListaSimple lista1, ListaSimple lista2){
        ListaSimple listaUnion = new ListaSimple();
        
       Nodo<Integer> aux1=listaUnion.getInicio();
       Nodo<Integer> aux2=listaUnion.getInicio();
            
        while((aux1!=null && aux1!=null || aux2!=null && aux2!=null)){
            if((int)aux1.getInformacion()<(int)aux2.getInformacion()) {
                  listaUnion.agregarFinal2(aux1.getInformacion());
                  aux1 = aux1.getSiguiente();
            }else{
                if((int)aux1.getInformacion()>(int)aux2.getInformacion()){
                      listaUnion.agregarFinal2(aux2.getInformacion());
                      aux2 = aux2.getSiguiente();
                    }else{
                      if((int)aux1.getInformacion()==(int)aux2.getInformacion()){
                          listaUnion.agregarFinal2(aux1.getInformacion());
                          listaUnion.agregarFinal(aux2.getInformacion());
                         aux2 = aux1.getSiguiente();
                         aux2 = aux2.getSiguiente();
                      }
                              
                    }
                }
             
        }
        
       
        
        return listaUnion;
    }
    
    
   
    
   
    
    
    
}
