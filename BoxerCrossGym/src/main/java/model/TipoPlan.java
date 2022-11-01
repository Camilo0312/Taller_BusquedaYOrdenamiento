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
public class TipoPlan {
    private int id;
    private String tipoPlan;

    public TipoPlan(int id) {
        this.id = id;
    }

    public TipoPlan(int id, String tipoPlan) {
        this.id = id;
        this.tipoPlan = tipoPlan;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
