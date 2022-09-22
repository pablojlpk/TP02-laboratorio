/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *   and open the template in the editor.
 */
package tp2laboratorio;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sistema
 */
public class Tp2laboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje;
        mensaje = "A MODO DE EJEMPLO SE HAN PARAMETRIZADO 2 VIAJES:\n"
                + " el primero se realiza en dos ciudades ubicadas en la misma ruta.\n-El Segundo viaje se realiza a una ciudad ubicada en otra ruta."
                + "\n-Dichos viajes se realizan con VEHÍCULOS DIFERENTES."
                + "\n los vehículos utilizados a su vez llevan COMBUSTIBLES DIFERENTES.";

        JOptionPane.showMessageDialog(null, mensaje);

        //se da de alta tres tipos de combustibles              
        Combustible gnc = new Combustible("gas");
        Combustible ni = new Combustible("nafta");
        Combustible ns = new Combustible("GasOil");
        //faltaría agregar en el constructor de combustible que guarde el tipo de nafta - ver constructor vacio
        //tostring vehiculo

        Vehiculo auto1 = new Auto();
        Vehiculo camion1 = new Camion();

        auto1.setMarca("TOYOTA COROLLA");
        auto1.setPatente("AA-045 KB");
        auto1.combustible = ni;

        //CAMION
        camion1.setMarca("SCANIA");
        camion1.setPatente("AB-055 B6");
        camion1.combustible = ns;
        //se crean los viajes y las ciudades
        Viaje v1 = new Viaje();
        Viaje v2 = new Viaje();
        Ciudad c1 = new Ciudad();
        Ciudad c2 = new Ciudad();
        Ciudad c3 = new Ciudad();

        c1.setNombre("San Luis");
        c1.setSobreRuta("7");
        c1.setUbicadoEnKm(650);

        c2.setNombre("Mendoza");
        c2.setSobreRuta("7");
        c2.setUbicadoEnKm(850);

        c3.setNombre("CORDOBA");
        c3.setSobreRuta("8");
        c3.setUbicadoEnKm(400);

        ///se crea viaje rutas iguales
        v1.setVehiculo(auto1);
        v1.setOrigen(c1);
        v1.setDestino(c2);
        v1.setCantpeajes(3);

        //se crea viaje en rutas distintas
        v2.setVehiculo(camion1);
        v2.setOrigen(c1);
        v2.setDestino(c3);
        v2.setCantpeajes(5);

        System.out.println("----iniciando viaje----");
        iniciarViaje(v1);
        iniciarViaje(v2);

    }

    public static void iniciarViaje(Viaje v) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        if (v.getOrigen().getSobreRuta() == v.getDestino().getSobreRuta()) {
            v.setEstansobremismaruta(true);
            v.setDistancia(v.calcularDistancia());
        } else {
            System.out.println("el viaje solicitado no está en la misma ruta ingrese !!");
            System.out.print("Ingrese los Kilometros del Viaje: ");
            v.setDistancia(leer.nextDouble());
        }
        System.out.println(v);
        System.out.println("costos de peaje" + v.calcularCostoPeaje());
        System.out.println("Costo Combustible: " + df.format(v.calcularCostoCombustble(v.getVehiculo())));
        System.out.println("costo total de viaje: " + df.format(v.calcularCostoTotal()));
        System.out.println("______________________________________fin_________");
    }

}
