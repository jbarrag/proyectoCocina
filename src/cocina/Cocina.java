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
public class Cocina {

    /**
     * @param args the command line arguments
     */
    private int id;
    private String especialidad;
    private String direccion;
    private String telefono;
    private JefeCocina jefecocina;

    public Cocina(String especialidad, String direccion, String telefono, JefeCocina jefecocina) {
        this.especialidad = especialidad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.jefecocina = jefecocina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public JefeCocina getJefecocina() {
        return jefecocina;
    }

    public void setJefecocina(JefeCocina jefecocina) {
        this.jefecocina = jefecocina;
    }

    @Override
    public String toString() {
        return "Cocina Creada: " + "Especialidad: " + this.especialidad + ", Direccion: " + this.direccion + ", Telefono: " + this.telefono  + this.jefecocina ;

    }
    
    
    
}
