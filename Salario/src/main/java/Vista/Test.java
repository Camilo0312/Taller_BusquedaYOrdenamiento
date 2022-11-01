/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.util.Scanner;
import miSalario.Calcular;        

public class Test {
    
    public static void main(String[] args) {
        
        
      
       Calcular calcular= new Calcular(leerDouble("Digite el salario"));
       double salario=leerDouble("Digite el salario");
       calcular.calcular(salario); 
    }
       
   
    
    private static int leerEntero(String msg){
        System.out.print(msg);
        Scanner in = new Scanner(System.in);
       
             return in.nextInt();
            
}
     private static double leerDouble(String msg){
        System.out.print(msg);
        Scanner in = new Scanner(System.in);
       
             return in.nextDouble();
     }
    
}
