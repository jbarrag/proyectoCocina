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
public class JefeCocina {
    private int cod;
    private String nombre;

    public JefeCocina(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return ", Jefe Cocina: " + this.nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
}
