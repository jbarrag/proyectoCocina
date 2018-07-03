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
public class Pedido {
    private int id;
    private Plato[] plato;
    private int nroPlatos;
    private int valorTotal;

    public Pedido(Plato[] plato, int nroPlatos, int valorTotal) {
        this.plato = plato;
        this.nroPlatos = nroPlatos;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Plato[] getPlato() {
        return plato;
    }

    public void setPlato(Plato[] plato) {
        this.plato = plato;
    }

    public int getnroPlatos() {
        return nroPlatos;
    }

    public void setnroPlatos(int nroPlatos) {
        this.nroPlatos = nroPlatos;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
