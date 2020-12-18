
package examen2_jesúsmeraz;


public class Complementos {

    private int tiempo;
    private int cantidad;

    public Complementos(int tiempo, int cantidad) {
        this.tiempo = tiempo;
        this.cantidad = cantidad;
    }

    public Complementos(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return tiempo + "";
    }
}
