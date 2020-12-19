package examen2_jesúsmeraz;

import java.util.ArrayList;

public class Ordenes {

    private Pieza_pollo piezaPollo;
    private ArrayList<Complementos> completemto = new ArrayList();
    private int numOrden;

    public Ordenes(Pieza_pollo piezaPollo, int numOrden) {
        this.piezaPollo = piezaPollo;
        this.numOrden = numOrden;
    }

    public Pieza_pollo getPiezaPollo() {
        return piezaPollo;
    }

    public void setPiezaPollo(Pieza_pollo piezaPollo) {
        this.piezaPollo = piezaPollo;
    }

    public ArrayList<Complementos> getCompletemto() {
        return completemto;
    }

    public void setCompletemto(ArrayList<Complementos> completemto) {
        this.completemto = completemto;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    @Override
    public String toString() {
        return "Ordenes\n" + 
                "piezaPollo: " + piezaPollo 
                + "\ncompletemto: " + completemto
                + "\nnumOrden: " + numOrden + '\n';
    }
}
