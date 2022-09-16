/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2laboratorio;

/**
 *
 * @author sistema
 */
public class Viaje {

    private Ciudad origen;
    private Ciudad destino;
    private int distancia;
    private Vehiculo vehiculo;
    private int cantpeajes;
    private boolean estansobremismaruta;

    public Viaje() {
    }

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int cantpeajes) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.cantpeajes = cantpeajes;
    }

    double calcularDistancia() {
<<<<<<< HEAD
        
        return 0;
=======
        double dist = 0;
        if (this.estansobremismaruta == true) {
            dist = this.destino.getUbicadoEnKm() - this.origen.getUbicadoEnKm();
        } else {
            dist = distancia;
        }
        return dist;
>>>>>>> eaa8500d14733c78d9bf646cdf557a3552ea09b3
    }

    double calcularCostoPeaje() {

        return (this.cantpeajes * 25);
    }

    Combustible calcularCostoCombustible(Combustible combustible) {
        /* el consumo de combustible 
      
        autos=7 litros cada 100
        camionetas 10 litros cada 100
        camiones 12 litros cada 100;
         */
        Combustible retorna;
        return retorna;
    }

    double calcularCostoTotal() {

       return costotal;
    }
}
