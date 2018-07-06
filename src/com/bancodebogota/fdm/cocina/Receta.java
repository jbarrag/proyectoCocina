/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.cocina;

/**
 *
 * @author Familia
 */
public class Receta {
    private int id;
    private String nombre;
    private Ingredientes[] listIngradedientes;

    public Receta(String nombre, Ingredientes[] listIngradedientes) {
        this.nombre = nombre;
        this.listIngradedientes = listIngradedientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ingredientes[] getListIngradedientes() {
        return listIngradedientes;
    }

    public void setListIngradedientes(Ingredientes[] listIngradedientes) {
        this.listIngradedientes = listIngradedientes;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
            
}
