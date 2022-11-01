/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViajeLS;

import LS.*;


/**
 *
 * @author estudiante
 */
public class Viaje {
    ListaSimple<Gasto> gastos;

    public Viaje() {
        gastos = new ListaSimple();
    }
    
    
    public double gastoComida(){
    double totalComida = 0;
    Nodo<Gasto> aux = gastos.getInicio();
    while(aux != null){
        if(aux.getInformacion().getTipo() == 1){
            totalComida += aux.getInformacion().getValor();
        }
        aux = aux.getSiguiente();
    }
    return totalComida;
    }
    
    
    public double totales(int x){
       double total=0;
       Nodo<Gasto> aux = gastos.getInicio();
       while(aux != null){
         if(aux.getInformacion().getTipo()==x){
            total += aux.getInformacion().getValor();
        }
        aux = aux.getSiguiente();
    }
     return total;
    }
    
    
    
    
    public String mayor(){
       
      String mayorcito="";
      
      double a=totales(1);//comida
      double b=totales(2);//hospedaje
      double c=totales(3);//transporte
      double d=totales(4);//ropa
     
     if(a > b && a > c && a > d) {
            mayorcito = "Comida";
        } else if(b > a && b > c && b > d) {
            mayorcito = "Hospedaje";
        } else if(c > a && c > b && c > d) {
            mayorcito = "transporte";
        } else 
           mayorcito = "ropa";
        return mayorcito;
    }
    
    
    
    
    public void addGasto(Gasto gasto){
    gastos.insertarInicio(gasto);
    }
   

    @Override
    public String toString() {
        return "Viaje{" + "gastos=" + gastos + '}';
    }
    
    
    
}
