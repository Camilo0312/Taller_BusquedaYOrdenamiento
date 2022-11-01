/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kevin
 */
public class Partes {
    private int id;
    private String parte;

    public Partes(int id, String parte) {
        this.id = id;
        this.parte = parte;
    }

    public Partes(int id) {
        this.id = id;
    }

    public String getParte() {
        return parte;
    }

    public void setParte(String parte) {
        this.parte = parte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
