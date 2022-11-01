/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import previo.Calculadora;
/**
 *
 * @author Usuario
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("       MENU       ");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        
        Calculadora C = new Calculadora();
        
        
        C.menu();
    }
    
}
