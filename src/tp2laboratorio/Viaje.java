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
        double dist=0;
        if (this.estansobremismaruta==true) {
            dist=this.destino.getUbicadoEnKm()-this.origen.getUbicadoEnKm();
        }else{
                    dist=distancia;
                    }
        return dist;
        }
        
    

    double calcularCostoPeaje() {
        return this.cantpeajes*150;

    }

  
    double calcularCostoTotal() {
        return 0;
    }
}
