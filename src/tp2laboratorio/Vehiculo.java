/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2laboratorio;

/**
 *
 * @author jimes
 */
public class Vehiculo {
    protected String marca;
    protected String patente;
    protected Combustible combustible;

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    
    public double calcularCostoDeCombustible( Combustible combustible){
        double precio=0;
        System.out.println("--");   
    return precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca = " + marca + ", patente = " + patente + ", combustible = " + combustible + '}';
    }
    
     

}
