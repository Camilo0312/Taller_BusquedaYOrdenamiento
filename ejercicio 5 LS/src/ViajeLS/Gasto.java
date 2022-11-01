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
public class Gasto {
    private int tipo;
    private double valor;

    public Gasto(int tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public Gasto() {
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
