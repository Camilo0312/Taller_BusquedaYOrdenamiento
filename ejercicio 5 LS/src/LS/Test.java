/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LS;

/**
 *
 * @author estudainte
 */
public class Test {
    public static void main(String[] args){
    ListaSimple<String> lista = new ListaSimple<>();
        lista.insertarInicio("Maria");
        lista.insertarInicio("Jose");
        lista.insertarInicio("Jaider");
        
        lista.removerFinal();
        lista.imprimir();
        ListaSimple<Integer> listaNumerica = new ListaSimple<>();
    
    }
}
