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
    private double distancia;
    private Vehiculo vehiculo;
    private int cantpeajes;
    private boolean estansobremismaruta;

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

    public boolean isEstansobremismaruta() {
        return estansobremismaruta;
    }

    public void setEstansobremismaruta(boolean estansobremismaruta) {
        this.estansobremismaruta = estansobremismaruta;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantpeajes() {
        return cantpeajes;
    }

    public void setCantpeajes(int cantpeajes) {
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
        return calcularCostoPeaje() + (this.distancia * this.vehiculo.calcularCostoDeCombustible(this.vehiculo.combustible));

    }

    @Override
    public String toString() {
        return "Viaje:{\n" + "* ciudad de origen: " + origen + "\n* Ciudad de  destino=" + destino + "\n   -Distancia=" + distancia
                + "\n" + "   -Vehiculo=" + vehiculo + "\n   -Cantidad de peajes: " + cantpeajes + " -Sobre misma Ruta: " + estansobremismaruta + '}';
    }
}
