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

    Ciudad origen;
    Ciudad destino;
    int distancia;
    Vehiculo vehiculo;
    int cantpeajes;
    boolean estansobremismaruta;

    public Viaje() {
    }

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int cantpeajes) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.cantpeajes = cantpeajes;
    }

    double calcularDistancia() {
        double dist = 0;
        if (this.estansobremismaruta == true) {
            dist = this.destino.getUbicadoEnKm() - this.origen.getUbicadoEnKm();
            dist = Math.abs(dist);
        } else {
            dist = distancia;
        }
        return dist;
    }

    double calcularCostoPeaje() {
        double val=0;
        if (this.vehiculo instanceof Auto ||this.vehiculo instanceof Camion ) {
            val=150;
        }else {
            val=100;
        }
        return this.cantpeajes * val;
    }

    double calcularCostoTotal() {
        double ct= calcularDistancia() + calcularCostoPeaje()+this.distancia*this.vehiculo.calcularCostoDeCombustible(this.vehiculo.combustible);
        
        return ct;

    }

    @Override
    public String toString() {
        return "Viaje{" + "origen=" + origen + ", destino=" + destino + ", distancia=" + distancia + ", vehiculo=" + vehiculo + ", cantpeajes=" + cantpeajes + ", estansobremismaruta=" + estansobremismaruta + '}';
    }
}
