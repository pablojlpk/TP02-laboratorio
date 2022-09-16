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
public class Auto extends Vehiculo {

    public Auto() {
        super.marca = marca;
        super.patente = patente;
        super.combustible = combustible;
    }

    @Override
    public double calcularCostoDeCombustible(Combustible combustible) {
       double precio = combustible.getPrecio()*(0.07);
       return precio;
    }
    
}
