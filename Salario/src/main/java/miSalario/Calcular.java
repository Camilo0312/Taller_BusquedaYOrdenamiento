package miSalario;


public class Calcular{

double salario;
int horaExtraDiurna;
int horaExtraNocturna;
double sueldo;



public Calcular(){
    
}

public Calcular(double salario, int horaExtraDiurna, int horaExtraNocturna, double sueldo) {
        this.salario = salario;
        this.horaExtraDiurna = horaExtraDiurna;
        this.horaExtraNocturna = horaExtraNocturna;
        this.sueldo = sueldo;
}

    public Calcular(double salario) {
         salario= salario-(salario*0.08);
    }


public void calcularHorasExtra (int horaExtraDiurna,int horaExtraNocturna){
 horaExtraDiurna= horaExtraDiurna *4731;
 horaExtraNocturna= horaExtraNocturna *6623;
}
    
public void calcular (double salario){

 salario= salario-(salario*0.08);
}

public void calcularSueldo(double salario, int horaExtraDiurna, int horaExtraNocturna, double sueldo){

    sueldo= salario + horaExtraDiurna + horaExtraNocturna;

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








}





