/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author kevin
 */
public class Pagos {

    private Date fecha;
    private Float valorPago;
    private int id;
    private String formaPago;
    private String nombrePlan;
    private int idTipoPlan;

    public Pagos(int id) {
        this.id = id;
    }

    public Pagos(int id,Date fecha, Float valorPago,  String formaPago, String nombrePlan, int idTipoPlan) {
        this.fecha = fecha;
        this.valorPago = valorPago;
        this.id = id;
        this.formaPago = formaPago;
        this.nombrePlan = nombrePlan;
        this.idTipoPlan = idTipoPlan;
    }

    public int getIdTipoPlan() {
        return idTipoPlan;
    }

    public void setIdTipoPlan(int idTipoPlan) {
        this.idTipoPlan = idTipoPlan;
    }

   

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getValorPago() {
        return valorPago;
    }

    public void setValorPago(Float valorPago) {
        this.valorPago = valorPago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }
    
    
}
