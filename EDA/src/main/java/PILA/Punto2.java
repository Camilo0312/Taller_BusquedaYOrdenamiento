/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PILA;



/**
 *
 * @author estudiante
 */
public class Punto2 {
    
    Pila  p1 = new Pila();
    Pila  p2 = new Pila();
    Pila  paux = new Pila();

    public Punto2() {
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

    public Pila getPaux() {
        return paux;
    }

    public void setPaux(Pila paux) {
        this.paux = paux;
    }
    
    
    
    public void ordenar(){
        Nodo<Integer> aux1=p1.getCima();
        Nodo<Integer> aux2=p2.getCima();
        Nodo<Integer> aux3=paux.getCima();
        while(aux1!=null && aux2!=null ){
          if(aux1.getInformacion()== aux2.getInformacion()){
             p1.desapilar();
             aux1= aux1.getSiguiente();
             aux2= aux2.getSiguiente();
             
          }else{
              if(aux1.getInformacion()>aux2.getInformacion()){
               paux.apilar(aux1.getInformacion());
               aux1 = aux1.getSiguiente();
               p1.desapilar();
              }else{
                  if(aux1.getInformacion()<aux2.getInformacion()){
                     
                   aux2 = aux2.getSiguiente();
                    
                }   
              }
           }
        }
        Nodo<Integer> aux=paux.getCima();  
        while(aux!=null){
          p1.apilar(aux.getInformacion());
          aux=aux.getSiguiente();
        
        }
    }
       
    

    public void imprimir(){
    
      System.out.println("Pila 1");
      p1.imprimir();
      System.out.println("Pila 2");
      p2.imprimir();
    }
    
    
}

