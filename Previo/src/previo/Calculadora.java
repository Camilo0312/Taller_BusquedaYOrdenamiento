/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package previo;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Calculadora {
    
    int opcion;
    int primerNumero;
    int segundoNumero;
    double resultado;
    
    public Calculadora(){

}
    public Calculadora(int primerNumero, int segundoNumero, double resultado){
      this.primerNumero=primerNumero;
      this.segundoNumero=segundoNumero;
      this.resultado=resultado;
      this.opcion=opcion;
    }
    
    public void menu(){
        
     opcion= Integer.parseInt(JOptionPane.showInputDialog("Digite una opción:"));
        
    switch(opcion){
        case 1:
            
            primerNumero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
            segundoNumero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));           
            resultado=primerNumero+segundoNumero;
            System.out.println("El resultado de su SUMA es: "+resultado);
            break;
        case 2:
            primerNumero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
            segundoNumero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
            resultado=primerNumero-segundoNumero;
            System.out.println("El resultado de su RESTA es: "+resultado);
            break;
        case 3:
            primerNumero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
            segundoNumero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
            resultado=primerNumero*segundoNumero;
            System.out.println("El resultado de su MULTIPLICACIÓN es: "+resultado);
            break;
        case 4:
            primerNumero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
            segundoNumero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
            resultado=primerNumero/segundoNumero;
            System.out.println("El resultado de su DIVISIÓN es: "+resultado);
            break;
        default:
            System.out.println("Opción no encontrada");
    }
    
       
    } 
   
    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
}
