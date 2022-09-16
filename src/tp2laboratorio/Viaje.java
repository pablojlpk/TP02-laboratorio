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

        return 0;
    }

    double calcularCostoPeaje() {
        return 0;
    }

    Combustible calcularCostoCombustible(Combustible combustible) {
        /* el consumo de combustible 
      
        autos=7 litros cada 100
        camionetas 10 litros cada 100
        camiones 12 litros cada 100;
         */
        if (Vehiculo instanceof Vehiculo) {
            Object object = (Object) combustible;

        }
        {

        }

        Combustible retorna;
        return retorna;
    }

    double calcularCostoTotal() {
        return 0;
        
        
        
        
    }
}
