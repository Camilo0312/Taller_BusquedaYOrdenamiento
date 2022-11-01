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
public class Usuario {
    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    private int idPagos;

    public Usuario(int id) {
        this.id = id;
    }
    

    public Usuario(int id, String nombre, String telefono, String direccion, int idPagos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.idPagos = idPagos;
        this.id = id;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPagos() {
        return idPagos;
    }

    public void setIdPagos(int idPagos) {
        this.idPagos = idPagos;
    }
    
    
}
