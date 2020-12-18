package examen2_jesúsmeraz;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Barra extends Thread {

    private JProgressBar barra;
    private JTable tabla;
    private Ordenes ordenes;

    public Barra(JProgressBar barra, JTable tabla, Ordenes ordenes) {
        this.barra = barra;
        this.tabla = tabla;
        this.ordenes = ordenes;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public Ordenes getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(Ordenes ordenes) {
        this.ordenes = ordenes;
    }

    @Override
    public void run() {
        try {
            boolean vive = true;
            if (vive) {
                Pieza_pollo pieza;
                Pure pure;
                refresco fresco;
                Papas papas;
                Pie pie;
                biscuit Biscuit;
                pieza = ordenes.getPiezaPollo();
                pure = (Pure) ordenes.getCompletemto().get(0);
                fresco = (refresco) ordenes.getCompletemto().get(1);
                papas = (Papas) ordenes.getCompletemto().get(2);
                pie = (Pie) ordenes.getCompletemto().get(3);
                Biscuit = (biscuit) ordenes.getCompletemto().get(4);

                int cant1, cant2, cant3, cant4, cant5, cant6;
                cant1 = pieza.getCantidad();
                cant2 = pure.getCantidad();
                cant3 = fresco.getCantidad();
                cant4 = papas.getCantidad();
                cant5 = pie.getCantidad();
                cant6 = Biscuit.getCantidad();
                barra.setMaximum(4);
                for (int i = 0; i < cant1; i++) {
                    for (int j = 0; j < 4; j++) {
                        barra.setValue(j);
                        Thread.sleep(1000);
                    }
                    barra.setValue(4);
                    Thread.sleep(1000);
                    Object[] newrow = {
                        ordenes.getNumOrden(), "Pieza de Pollo", 4
                    };
                    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                    modelo.addRow(newrow);
                    tabla.setModel(modelo);
                }
                barra.setValue(4);
                
                barra.setMaximum(2);
                for (int i = 0; i < cant2; i++) {
                    for (int j = 0; j < 2; j++) {
                        barra.setValue(j);
                        Thread.sleep(1000);
                    }
                    barra.setValue(2);
                    Thread.sleep(1000);
                    Object[] newrow2 = {
                        ordenes.getNumOrden(), "Pure", 2
                    };
                    DefaultTableModel modelo2 = (DefaultTableModel) tabla.getModel();
                    modelo2.addRow(newrow2);
                    tabla.setModel(modelo2);
                }
                barra.setValue(2);

                barra.setMaximum(1);
                for (int i = 0; i < cant3; i++) {
                    for (int j = 0; j < 1; j++) {
                        barra.setValue(j);
                        Thread.sleep(1000);
                    }
                    barra.setValue(1);
                    Thread.sleep(1000);
                    Object[] newrow3 = {
                        ordenes.getNumOrden(), "Refresco", 1
                    };
                    DefaultTableModel modelo3 = (DefaultTableModel) tabla.getModel();
                    modelo3.addRow(newrow3);
                    tabla.setModel(modelo3);
                }
                barra.setValue(1);

                barra.setMaximum(3);
                for (int i = 0; i < cant4; i++) {
                    for (int j = 0; j < 3; j++) {
                        barra.setValue(j);
                        Thread.sleep(1000);
                    }
                    barra.setValue(3);
                    Thread.sleep(1000);
                    Object[] newrow4 = {
                        ordenes.getNumOrden(), "Papas", 3
                    };
                    DefaultTableModel modelo4 = (DefaultTableModel) tabla.getModel();
                    modelo4.addRow(newrow4);
                    tabla.setModel(modelo4);
                }
                barra.setValue(3);

                barra.setMaximum(5);
                for (int i = 0; i < cant5; i++) {
                    for (int j = 0; j < 5; j++) {
                        barra.setValue(j);
                        Thread.sleep(1000);
                    }
                    barra.setValue(5);
                    Thread.sleep(1000);
                    Object[] newrow5 = {
                        ordenes.getNumOrden(), "Pie", 5
                    };
                    DefaultTableModel modelo5 = (DefaultTableModel) tabla.getModel();
                    modelo5.addRow(newrow5);
                }
                barra.setValue(5);
                barra.setMaximum(1);
                for (int i = 0; i < cant6; i++) {
                    for (int j = 0; j < 1; j++) {
                        barra.setValue(j);
                        Thread.sleep(1000);
                    }
                    barra.setValue(1);
                    Thread.sleep(1000);
                    Object[] newrow6 = {
                        ordenes.getNumOrden(), "Biscuit", 1
                    };
                    DefaultTableModel modelo6 = (DefaultTableModel) tabla.getModel();
                    modelo6.addRow(newrow6);
                    tabla.setModel(modelo6);
                }
                barra.setValue(1);

                vive = false;
            }
            JOptionPane.showMessageDialog(null, "La simulación ha finalizado");
            barra.setValue(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
