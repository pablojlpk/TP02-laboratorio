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
    Ciudad destino;
    double distancia;
    Vehiculo vehiculo;
    int cantpeajes;
    boolean estansobremismaruta;

    public Viaje() {
        this.estansobremismaruta = false;
    }

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int cantpeajes) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.cantpeajes = cantpeajes;
        this.estansobremismaruta = false;
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
        double val = 0;
        if (this.vehiculo instanceof Auto || this.vehiculo instanceof Camioneta) {
            val = 150;
        } else {
            val = 100;
        }
        return this.cantpeajes * val;
    }

    double calcularCostoCombustble(Vehiculo vi) {
        return this.distancia * vi.calcularCostoDeCombustible(vi.combustible);
    }

  double calcularCostoTotal() {
        double ct =  calcularCostoPeaje() +( this.distancia * this.vehiculo.calcularCostoDeCombustible(this.vehiculo.combustible));
        return ct;
  }

    @Override
    public String toString() {
        //return "Viaje{" + "ciudad de origen: " + origen + ", destino=" + destino + ", distancia=" + distancia + ", vehiculo=" + vehiculo + ", cantpeajes=" + cantpeajes + ", estansobremismaruta=" + estansobremismaruta + '}';
        return "Viaje:{\n" + "ciudad de origen: " + origen + "\n, Ciudad de  destino=" + destino + "\n, distancia=" + distancia
                + "\n" + ", vehiculo=" + vehiculo + "\n, cantpeajes=" + cantpeajes + ", estansobremismaruta=" + estansobremismaruta + '}';
    }
}
