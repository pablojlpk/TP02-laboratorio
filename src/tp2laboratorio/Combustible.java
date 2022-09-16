
package tp2laboratorio;

public class Combustible {
    
    private String tipo;
    private double precio;

    public Combustible(String tipo) {
        if(tipo.equalsIgnoreCase("gas")){
            this.precio = 78;
        } else if (tipo.equalsIgnoreCase("nafta")){
            this.precio = 208; } else{
            this.precio = 180; }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Combustible{" + "tipo = " + tipo + ", precio = " + precio + '}';
    }
    
    
    
}
