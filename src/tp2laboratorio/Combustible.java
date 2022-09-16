
package tp2laboratorio;

public class Combustible {
    
    private String tipo;
    private double precio;

    public Combustible() {
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
