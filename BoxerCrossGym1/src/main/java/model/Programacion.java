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
public class Programacion {
    private int idPartes;
    private Date fecha;
    private int id;
    private int idTipo;

    public Programacion(int id) {
        this.id = id;
    }

    public Programacion(int id, Date fecha, int idPartes, int idTipo ) {
        this.idPartes = idPartes;
        this.fecha = fecha;
        this.id = id;
        this.idTipo = idTipo;
    }

    public int getIdPartes() {
        return idPartes;
    }

    public void setIdPartes(int idPartes) {
        this.idPartes = idPartes;
    }

    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
    
    
    
}
