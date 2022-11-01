/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PILA;

/**
 *
 * @author Ryzen
 */
public class Punto4 {
       
    Pila  p1 = new Pila();
 
    Pila  p2 = new Pila();
    

    public Punto4() {
        
    }

    public Pila getP1() {
        return p1;
    }

    public void setP1(Pila p1) {
        this.p1 = p1;
    }

  

    public Pila getP2() {
        return p2;
    }

    public void setP2(Pila p2) {
        this.p2 = p2;
    }

    
    
    
    public void reemplazar(int nuevo, int viejo){
        Nodo<Integer> aux1=p1.getCima();
       
        while(aux1!=null){
            if(aux1.getInformacion()!=viejo){
              p1.desapilar();
              p2.apilar(aux1.getInformacion());
              aux1=aux1.getSiguiente();
            }else{
              p1.desapilar();
              p2.apilar(nuevo);
              aux1=aux1.getSiguiente();
            }
        }
        Nodo<Integer> aux2=p2.getCima();
        while(aux2!=null){ 
            p1.apilar(aux2.getInformacion());
            aux2=aux2.getSiguiente();
        }
       
    }

    public void imprimir2(){
    
      System.out.println("Pila 1");
      p1.imprimir();
    
    }

   
    
    
    
    
    
    
}
