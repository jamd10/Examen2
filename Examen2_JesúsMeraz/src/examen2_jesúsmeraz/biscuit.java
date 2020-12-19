package examen2_jesúsmeraz;

public class biscuit extends Complementos {

    public biscuit(int tiempo, int cantidad) {
        super(tiempo, cantidad);
    }

    @Override
    public String toString() {
        return super.toString() + "      Biscuit";
    }

}
