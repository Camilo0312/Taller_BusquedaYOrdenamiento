package miSalario;
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

public Calcular(double salario, int horaExtraDiurna, int horaExtraNocturna, double sueldo) {
        this.salario = salario;
        this.horaExtraDiurna = horaExtraDiurna;
        this.horaExtraNocturna = horaExtraNocturna;
        this.sueldo = sueldo;
        this.horaExtraDiurnaDominical = horaExtraDiurnaDominical;
        this.horaExtraNocturnaDominical =horaExtraNocturnaDominical;
        this.recargoNocturnoDominical = recargoNocturnoDominical;
}

    public Calcular(String cadena) {
        if (cadena.isEmpty()) {
            throw new RuntimeException("No se puede cargar el dato");
        }
         
    }
    
 public double Deducciones() {
     
    
     salario= salario- (salario*0.08);
        
      return salario;
 }


public int calcularHorasExtraDiurna (){
 
 
 horaExtraDiurna= horaExtraDiurna *4731;

 return horaExtraDiurna;
}
public int calcularHorasExtraNocturna (){
 

 horaExtraNocturna= horaExtraNocturna *6623;
 
 return horaExtraNocturna;
}
    
public int calcularHorasExtraDiurnaDomincal (){


 horaExtraDiurnaDominical= horaExtraDiurnaDominical *7570;
 
 return horaExtraDiurnaDominical;
}

public int calcularHorasExtraNocturnaDominical (){
 
 
 horaExtraNocturnaDominical= horaExtraNocturnaDominical *9462;
 
 return horaExtraNocturnaDominical;
}
    
public int calcularRecargoNocturno (){
 
 
 recargoNocturnoDominical= recargoNocturnoDominical *7948;
 
 return recargoNocturnoDominical;
 
}

public Double calcularSueldo(Calcular salario, Calcular horaExtraDiurna, Calcular horaExtraNocturna){
   
    sueldo= Deducciones()+calcularHorasExtraDiurna()+calcularHorasExtraNocturna();
  
    
    return sueldo;
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
    
    
    @Override
    public String toString() {
        return "Calcular{" + "salario=" + salario + ", horaExtraDiurna=" + horaExtraDiurna + ", horaExtraNocturna=" + horaExtraNocturna + ", sueldo=" + sueldo + '}';
    }

    




}
