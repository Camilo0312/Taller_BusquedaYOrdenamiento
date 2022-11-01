/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajero;


public class Viaje {
    
    Gasto ga[]= new Gasto[4];

    public Viaje() {
    }

    public Viaje(Gasto ga[]) {
        this.ga = ga;
    }

    public Gasto[] getGa() {
        return ga;
    }

    public void setGa(Gasto[] ga) {
        this.ga = ga;
    }
    
    
    public double totales(int x){
     
       double total=0;
       
       
       
       for(int i=0;i<ga.length;i++){
           
           
        
         if(ga[i].getTipo()==x){
         
           total += ga[i].getValor();
         
        }
          
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
}
