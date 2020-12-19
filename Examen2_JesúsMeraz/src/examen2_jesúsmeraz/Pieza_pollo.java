package examen2_jesúsmeraz;

public class Pieza_pollo {

    private int tiempo;
    private int cantidad;

    public Pieza_pollo(int tiempo, int cantidad) {
        this.tiempo = tiempo;
        this.cantidad = cantidad;
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

    public String toString() {
        return super.toString() + cantidad + "      Piezas de Pollo";
    }

}
