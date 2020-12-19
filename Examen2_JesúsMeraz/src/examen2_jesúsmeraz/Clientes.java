package examen2_jesúsmeraz;

import java.util.ArrayList;

public class Clientes {

    private String Nombre;
    private ArrayList<Ordenes> historial = new ArrayList();

    public Clientes(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Clientes() {
    }

    public ArrayList<Ordenes> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Ordenes> historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Clientes{" + "historial=" + historial + '}';
    }
}
