
package tp2laboratorio;

public class Ciudad {
    
    private int UbicadoEnKm;
    private String sobreRuta;
    private String Nombre;

    
    public Ciudad() {
    }

    public int getUbicadoEnKm() {
        return UbicadoEnKm;
    }

    public void setUbicadoEnKm(int UbicadoEnKm) {
        this.UbicadoEnKm = UbicadoEnKm;
    }

    public String getSobreRuta() {
        return sobreRuta;
    }

    public void setSobreRuta(String sobreRuta) {
        this.sobreRuta = sobreRuta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "UbicadoEnKm = " + UbicadoEnKm + ", sobreRuta = " + sobreRuta + ", Nombre = " + Nombre + '}';
    }
    
    
    
}
