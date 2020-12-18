package examen2_jesúsmeraz;

import java.util.ArrayList;

public class Clientes {

    private String Nombre;
    private int Codigo;
    private ArrayList<Ordenes> historial = new ArrayList();

    public Clientes(String Nombre, int Codigo) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
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
