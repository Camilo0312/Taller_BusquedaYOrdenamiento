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
public class Punto3 {
    
    Pila  Ppe = new Pila();
    Pila  Pgra = new Pila();

    public Punto3() {
    }

    public Pila getP1() {
        return Ppe;
    }

    public void setP1(Pila Ppe) {
        this.Ppe = Ppe;
    }

    public Pila getP2() {
        return Pgra;
    }

    public void setP2(Pila Pgra) {
        this.Pgra = Pgra;
    }


   
    
    
    public boolean pertenece(){
     boolean pertenece = true;
     Nodo<Integer> aux1=Ppe.getCima();   
     Nodo<Integer> aux2=Pgra.getCima();
     while(aux2!=null && aux1!=null ){
            if(aux1.getInformacion()==aux2.getInformacion()){
                
              pertenece = true;
              aux2=aux2.getSiguiente();
              aux1=aux1.getSiguiente();
              
            }else{
                if(aux1.getInformacion()>aux2.getInformacion()){
                   
                   pertenece = false;
                   aux1=null;
                   aux2=null;
                }else{
                   if(aux1.getInformacion()<aux2.getInformacion()){ 
                   
                   aux2=aux2.getSiguiente();
                   
                   }else{
                       pertenece = false;
                   }
                }
            }
           
        }
        return pertenece;
    }

   

    
    
    
    
    
    
    
    
    
    
  
    
    
}
