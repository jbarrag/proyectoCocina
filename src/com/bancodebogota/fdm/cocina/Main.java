/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.cocina;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Familia
 */
public class Main {
    Cocina cocina;
    Cliente cliente;
    Carne carne;
    Ingredientes[] inventario;
    Ingredientes[] CantidadIngredienteReceta;
    JefeCocina jefeCocina;
    Liquidos liquidos;
    Pedido pedido;
    Persona persona;
    Plato plato;
    Receta[] receta;
    Solido solido;
    Plato[] platos;
    
    public void crearJefeCocina(){
        this.jefeCocina = new JefeCocina("Jose barragan");
    }
    
    public Cocina crearCocina(String especialidad, String direccion, String telefono){
       return this.cocina = new Cocina(especialidad,direccion,telefono,this.jefeCocina);
        
    }
    public Ingredientes crearIngrediente(String nombre,int cantidadUnidad,String tipoIngrediente,boolean contable){
        Ingredientes ingred = new Ingredientes();
        ingred.setNombre(nombre);
        ingred.setCantidad(cantidadUnidad);
        ingred.setTipoIngrediente(tipoIngrediente);        
        ingred.setContable(contable);
        return ingred;
    }
    
    public Ingredientes[] listaInventario(){
        Ingredientes[] ingredientes = new Ingredientes[5];
        ingredientes[0] = crearIngrediente("pan",2,"solido",true);
        ingredientes[1] = crearIngrediente("queso",2,"solido",true);
        ingredientes[2] = crearIngrediente("lechuga",2,"solido",true);
        ingredientes[3] = crearIngrediente("jamon",2,"solido",true);
        ingredientes[4] = crearIngrediente("mantequilla",1,"solido",true);        
        return ingredientes;
        
    }
    
    public Ingredientes[] cantidadIngredienteReceta()
    {
        this.receta = new Receta[2];
     this.CantidadIngredienteReceta = new Ingredientes[5];
     CantidadIngredienteReceta[0] = crearIngrediente("pan",2,"solido",true);
     CantidadIngredienteReceta[1] = crearIngrediente("queso",1,"solido",true);
     CantidadIngredienteReceta[2] = crearIngrediente("lechuga",1,"solido",true);
     CantidadIngredienteReceta[3] = crearIngrediente("jamon",1,"solido",true);
     CantidadIngredienteReceta[4] = crearIngrediente("mantequilla",1,"solido",true);     
     this.receta[0] = new Receta("sandwich",CantidadIngredienteReceta);
     return CantidadIngredienteReceta;
     
    }
    public Receta crearReceta(String nombre,Ingredientes[] cantidadIngredienteReceta){
        Receta receta = new Receta(nombre,cantidadIngredienteReceta);
        System.out.println("Receta disponible: " + nombre);
        for (int i = 0; i < cantidadIngredienteReceta.length; i++) {
           System.out.println("Ingredientes de la receta: " +cantidadIngredienteReceta[i].getNombre()+"Cantidad: "+ cantidadIngredienteReceta[i].getCantidad()); 
        }
        return receta;
        
       } 
    
    public Plato crearPlato(String nombrePlato, String tipoPlato,int valorplato, String recetaPLato){
        this.plato = new Plato(nombrePlato,tipoPlato,valorplato,recetaPLato);
        System.out.println("Plato creado");
        System.out.println(this.plato.getNombre() + ", Receta:" + this.plato.getReceta() + ", tipo de plato: " + this.plato.getTipo()
        + ", valor del Plato: " + this.plato.getValor());
        System.out.println("");
        return plato;
    }
    
    public Pedido crearPedido(){
        this.platos = new Plato[2];
        this.platos[0] = crearPlato("Comida Rapida","Completo",10000,"Sandwich");
        this.platos[1] = crearPlato("Comida Rapida","Medio",8000,"Sandwich");
        
        this.pedido = new Pedido(this.platos,2,200000);
        System.out.println("pedido");
        System.out.println(this.platos.length +" " + this.plato.getReceta());
        int numPlatos = 0;
        for (int i = 0; i < this.platos.length; i++) {
            numPlatos = numPlatos + this.platos[i].getValor();
        }
        System.out.println("Valor Total: " + numPlatos );
        return pedido;
    }
    
    public static void main(String[] args) {
        
        Main m = new  Main();
        m.crearJefeCocina();
        m.crearCocina("Comida Rapidas","Cra 73 # 30c - 33", "3013335551");
        System.out.println(m.cocina);
        System.out.println("");
        m.crearIngrediente("pan",1,"Solido",true);
        m.listaInventario();
        m.cantidadIngredienteReceta();
        Ingredientes[] ingrediente = m.cantidadIngredienteReceta();
        
        System.out.println("Los Ingradientes disponibles son: ");
        for (int i = 0; i < ingrediente.length; i++) {
            System.out.println(ingrediente[i]);
        }
        System.out.println("");
        m.crearReceta("sandwich",ingrediente);
        System.out.println("");
        m.crearPedido();
   
    }
}
