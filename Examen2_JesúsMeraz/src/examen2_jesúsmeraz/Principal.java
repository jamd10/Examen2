/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_jesúsmeraz;

import java.util.ArrayList;

/**
 *
 * @author Jesús Meraz
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        this.setVisible(false);
        initComponents();
        this.setVisible(false);
        Inicio.pack();
        Inicio.setVisible(true);
        Inicio.setLocationRelativeTo(null);
        this.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio = new javax.swing.JFrame();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jFrame2 = new javax.swing.JFrame();
        si = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        no = new javax.swing.JDialog();
        clientenombre = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        Clienteviejo = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        historial = new javax.swing.JButton();
        NuevaOrden = new javax.swing.JButton();
        Historial = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        pollo = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        papas = new javax.swing.JSpinner();
        biscuits = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        refrescos = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        pie = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        pure = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        Barrita = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel11.setText("Bienvenidos a Popeyes");

        jLabel12.setText("¿Es usted un nuevo cliente?");

        jButton2.setText("Si");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("No");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio.getContentPane());
        Inicio.getContentPane().setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(InicioLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel11)
                .addGap(51, 51, 51)
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jLabel13.setText("Ingrese su nombre:");

        registrar.setText("Registrar");
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout siLayout = new javax.swing.GroupLayout(si.getContentPane());
        si.getContentPane().setLayout(siLayout);
        siLayout.setHorizontalGroup(
            siLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel13)
                .addGap(33, 33, 33)
                .addGroup(siLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrar)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        siLayout.setVerticalGroup(
            siLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(siLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(registrar)
                .addGap(20, 20, 20))
        );

        jLabel14.setText("Escoja su nombre:");

        ingresar.setText("Ingresar");
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout noLayout = new javax.swing.GroupLayout(no.getContentPane());
        no.getContentPane().setLayout(noLayout);
        noLayout.setHorizontalGroup(
            noLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noLayout.createSequentialGroup()
                .addGroup(noLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(noLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(clientenombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(noLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(ingresar)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        noLayout.setVerticalGroup(
            noLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(noLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(clientenombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(ingresar)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jLabel15.setText("¿Que desea hacer?");

        historial.setText("Ver historial de ordenes");
        historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historialMouseClicked(evt);
            }
        });

        NuevaOrden.setText("Crear nueva orden");
        NuevaOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevaOrdenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ClienteviejoLayout = new javax.swing.GroupLayout(Clienteviejo.getContentPane());
        Clienteviejo.getContentPane().setLayout(ClienteviejoLayout);
        ClienteviejoLayout.setHorizontalGroup(
            ClienteviejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteviejoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addGap(43, 43, 43)
                .addComponent(historial)
                .addGap(18, 18, 18)
                .addComponent(NuevaOrden)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        ClienteviejoLayout.setVerticalGroup(
            ClienteviejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteviejoLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(ClienteviejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(historial)
                    .addComponent(NuevaOrden))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HistorialLayout = new javax.swing.GroupLayout(Historial.getContentPane());
        Historial.getContentPane().setLayout(HistorialLayout);
        HistorialLayout.setHorizontalGroup(
            HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );
        HistorialLayout.setVerticalGroup(
            HistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenidos a Popeyes");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText("Ingrese cantidad de piezas de pollo:");

        pollo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel3.setText("Ingrese cantidad de papas :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Complementos");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Piezas de pollo");

        papas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        biscuits.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel6.setText("Ingrese cantidad de biscuits :");

        refrescos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel7.setText("Ingrese cantidad de refrescos :");

        pie.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel8.setText("Ingrese cantidad de pie :");

        pure.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel9.setText("Ingrese cantidad de pure :");

        jButton1.setText("Registrar orden");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de orden", "Elemento", "Tiempo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("Simulación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(52, 52, 52)
                                                .addComponent(biscuits, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(62, 62, 62)
                                                .addComponent(papas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel9))
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(pure)
                                                    .addComponent(pie)
                                                    .addComponent(refrescos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(139, 139, 139)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(pollo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Barrita, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(169, 169, 169)
                    .addComponent(jLabel5)
                    .addContainerGap(785, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(pure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(refrescos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(papas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(pie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(biscuits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel10)
                        .addGap(39, 39, 39)
                        .addComponent(Barrita, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(jLabel5)
                    .addContainerGap(600, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int Pollos = (Integer) pollo.getValue();
        int Biscuit = (Integer) biscuits.getValue();
        int Papa = (Integer) papas.getValue();
        int Pure3 = (Integer) pure.getValue();
        int Refrescos = (Integer) refrescos.getValue();
        int Pie = (Integer) pie.getValue();

        biscuit b = new biscuit(1, Biscuit);
        Pieza_pollo pieza = new Pieza_pollo(4, Pollos);
        Pure Pure1 = new Pure(2, Pure3);
        Papas papas1 = new Papas(3, Papa);
        refresco fresco = new refresco(1, Refrescos);
        Pie p = new Pie(5, Pie);
        ArrayList<Complementos> c = new ArrayList();
        c.add(Pure1);
        c.add(fresco);
        c.add(papas1);
        c.add(p);
        c.add(b);
        Ordenes orden = new Ordenes(pieza, numOrden);
        orden.setCompletemto(c);
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Numero de orden", "Elemento", "Tiempo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });

        Barra hilo = new Barra(Barrita, tabla, orden);
        hilo.start();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Inicio.setVisible(false);
        si.setModal(true);
        si.pack();
        si.setLocationRelativeTo(this);
        si.setVisible(true);

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Inicio.setVisible(false);
        no.setModal(true);
        no.pack();
        no.setLocationRelativeTo(this);
        no.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseClicked
        no.setVisible(false);
        Clienteviejo.setModal(true);
        Clienteviejo.pack();
        Clienteviejo.setLocationRelativeTo(this);
        Clienteviejo.setVisible(true);
    }//GEN-LAST:event_ingresarMouseClicked

    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked
        si.setVisible(false);
        String n = Nombre.getText();
        clienteActual.setNombre(n);
        this.setVisible(true);
    }//GEN-LAST:event_registrarMouseClicked

    private void historialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialMouseClicked
        Clienteviejo.setVisible(false);
        Historial.setModal(true);
        Historial.pack();
        Historial.setLocationRelativeTo(this);
        Historial.setVisible(true);

    }//GEN-LAST:event_historialMouseClicked

    private void NuevaOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaOrdenMouseClicked
        Clienteviejo.setVisible(false);
        this.setVisible(true);

    }//GEN-LAST:event_NuevaOrdenMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barrita;
    private javax.swing.JDialog Clienteviejo;
    private javax.swing.JDialog Historial;
    private javax.swing.JFrame Inicio;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton NuevaOrden;
    private javax.swing.JSpinner biscuits;
    private javax.swing.JComboBox<String> clientenombre;
    private javax.swing.JButton historial;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JDialog no;
    private javax.swing.JSpinner papas;
    private javax.swing.JSpinner pie;
    private javax.swing.JSpinner pollo;
    private javax.swing.JSpinner pure;
    private javax.swing.JSpinner refrescos;
    private javax.swing.JButton registrar;
    private javax.swing.JDialog si;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
private int numOrden = 1;
    private Clientes clienteActual;
}
