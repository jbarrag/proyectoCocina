/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocina;

/**
 *
 * @author Familia
 */
public class Ingredientes {
    private int id;
    private String nombre;
    private int cantidad;
    private String tipoIngrediente;
    private boolean contable;

    public boolean getContable() {
        return contable;
    }

    public void setContable(boolean contable) {
        this.contable = contable;
    }

    public String getTipoIngrediente() {
        return tipoIngrediente;
    }

    public void setTipoIngrediente(String tipoIngrediente) {
        this.tipoIngrediente = tipoIngrediente;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return this.nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
