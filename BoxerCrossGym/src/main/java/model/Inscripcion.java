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
public class Inscripcion {

    public Inscripcion(int id) {
        this.id = id;
    }

    private int id;
    private int idUsuario;
    private Date fecha;

    public Inscripcion(int id, Date fecha,int idUsuario) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

}
