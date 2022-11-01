/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViajeLS;

/**
 *
 * @author estudiante
 */
public class Test {
    public static void main(String[] args){
        Viaje v = new Viaje();
        
        v.addGasto(new Gasto(1, 45000));
        v.addGasto(new Gasto(2, 30000));
        v.addGasto(new Gasto(2, 30000));
        v.addGasto(new Gasto(1, 10000));
        v.addGasto(new Gasto(3, 45000));
        v.addGasto(new Gasto(4, 30000));
        v.addGasto(new Gasto(1, 30000));
        v.addGasto(new Gasto(3, 10000));
        
        
        
        System.out.println(""+v.gastoComida());
        
        v.totales(1);
        System.out.println("v = " + v.totales(1));
    
        
        System.out.println("mayor= " + v.mayor());
    }
    
    
}
