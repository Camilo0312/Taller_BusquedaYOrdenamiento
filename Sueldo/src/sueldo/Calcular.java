/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo;
import javax.swing.JOptionPane;

public class Calcular{

double salario;
int horaExtraDiurna;
int horaExtraNocturna;
int horaExtraDiurnaDominical;
int horaExtraNocturnaDominical;
int recargoNocturnoDominical;
double sueldo;



public Calcular(){
    
}

public Calcular(double salario, int horaExtraDiurna, int horaExtraNocturna, double sueldo,int horaExtraDiurnaDominical,int horaExtraNocturnaDominical,int recargoNocturnoDominical) {
        this.salario = salario;
        this.horaExtraDiurna = horaExtraDiurna;
        this.horaExtraNocturna = horaExtraNocturna;
        this.sueldo = sueldo;
        this.horaExtraDiurnaDominical = horaExtraDiurnaDominical;
        this.horaExtraNocturnaDominical =horaExtraNocturnaDominical;
        this.recargoNocturnoDominical = recargoNocturnoDominical;
}

   
    
 public double Deducciones() {
     
     salario= Double.parseDouble(JOptionPane.showInputDialog("ingrese el  valor del salario"));
     
    
     salario= salario- (salario*0.08);
      
         
      return salario;
 }


public int calcularHorasExtraDiurna (){
 
 horaExtraDiurna= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de horas Diernas"));
 horaExtraDiurna= horaExtraDiurna *4731;

 
 return horaExtraDiurna;
}
public int calcularHorasExtraNocturna (){
 
 horaExtraNocturna= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de horas Nocturnas"));

 horaExtraNocturna= horaExtraNocturna *6623;
 
 return horaExtraNocturna;
}

public int calcularHorasExtraDiurnaDomincal (){
 
 horaExtraDiurnaDominical= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de horas Diurnas Dominicales"));

 horaExtraDiurnaDominical= horaExtraDiurnaDominical *7570;
 
 return horaExtraDiurnaDominical;
}

public int calcularHorasExtraNocturnaDominical (){
 
 horaExtraNocturnaDominical= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de horas Nocturnas Dominicales"));

 horaExtraNocturnaDominical= horaExtraNocturnaDominical *9462;
 
 return horaExtraNocturnaDominical;
}
    
public int calcularRecargoNocturno (){
 
 recargoNocturnoDominical= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de horas de recargo nocturno dominical"));

 recargoNocturnoDominical= recargoNocturnoDominical *7948;
 
 return recargoNocturnoDominical;
 
 
}
public void calcularSueldo(){
   
    sueldo= Deducciones()+calcularHorasExtraDiurna()+calcularHorasExtraNocturna()+calcularHorasExtraDiurnaDomincal()+calcularHorasExtraNocturnaDominical ();
  
    System.out.println("El valor total de su salario es: "+ sueldo);
    
} 

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHoraExtraDiurna() {
        return horaExtraDiurna;
    }

    public void setHoraExtraDiurna(int horaExtraDiurna) {
        this.horaExtraDiurna = horaExtraDiurna;
    }

    public int getHoraExtraNocturna() {
        return horaExtraNocturna;
    }

    public void setHoraExtraNocturna(int horaExtraNocturna) {
        this.horaExtraNocturna = horaExtraNocturna;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
   
    public int getHoraExtraDiurnaDominical() {
        return horaExtraDiurnaDominical;
    }

    public void setHoraExtraDiurnaDominical(int horaExtraDiurnaDominical) {
        this.horaExtraDiurnaDominical = horaExtraDiurnaDominical;
    }

    public int getHoraExtraNocturnaDominical() {
        return horaExtraNocturnaDominical;
    }

    public void setHoraExtraNocturnaDominical(int horaExtraNocturnaDominical) {
        this.horaExtraNocturnaDominical = horaExtraNocturnaDominical;
    }

    public int getRecargoNocturnoDominical() {
        return recargoNocturnoDominical;
    }

    public void setRecargoNocturnoDominical(int recargoNocturnoDominical) {
        this.recargoNocturnoDominical = recargoNocturnoDominical;
    }
}
