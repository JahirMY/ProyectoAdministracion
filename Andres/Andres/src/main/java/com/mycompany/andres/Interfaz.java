/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.andres;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class Interfaz extends javax.swing.JFrame {
    
    Computadoras c=new Computadoras();
    Andres a=new Andres();
   
    Vector array=new Vector();
    DefaultTableModel baseDatos;
    
    
    public Interfaz() {
        initComponents();
        array.addElement("Modelo");
        array.addElement("Marca");
        array.addElement("Color");
        array.addElement("Procesador");
        array.addElement("Fabricante");
        array.addElement("RAM");
        array.addElement("Almacenamiento");
        
        baseDatos=new DefaultTableModel(array,0);
        jTable1.setModel(baseDatos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Mo = new javax.swing.JTextField();
        Co = new javax.swing.JTextField();
        Ma = new javax.swing.JComboBox<>();
        Pro = new javax.swing.JComboBox<>();
        Fa = new javax.swing.JComboBox<>();
        Ra = new javax.swing.JComboBox<>();
        al = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        verTabla = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel1.setText("HighPro.com");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel2.setText("\"Expertos en Informática\"");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("-Compudoras");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("-Memorias");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("-Procesadores");

        jLabel6.setText("Contactanos: HighProVentas@gmail.com");

        jLabel7.setText("Facebook: HigProOfficial");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("-EquipoInformatico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel4)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 320, 560));

        jLabel9.setFont(new java.awt.Font("SimSun-ExtB", 0, 24)); // NOI18N
        jLabel9.setText("!!Registra tu nuevo producto!!");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 430, 50));

        jLabel10.setBackground(new java.awt.Color(0, 255, 102));
        jLabel10.setText("Modelo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 50, 30));

        jLabel11.setText("Marca");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

        jLabel12.setText("Color");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel13.setText("Fabricante");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel14.setText("Procesador");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, -1));

        jLabel15.setText("RAM");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

        jLabel16.setText("Almacenamiento");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        Mo.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(Mo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 160, -1));

        Co.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(Co, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 160, 20));

        Ma.setBackground(new java.awt.Color(204, 255, 255));
        Ma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acer", "Dell", "HP", "Lenovo", "Asus", "Mac" }));
        getContentPane().add(Ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 130, 20));

        Pro.setBackground(new java.awt.Color(204, 255, 255));
        Pro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amd-ATHLON", "Amd-RYZEN3", "Amd-RYZEN5", "Amd-RYZEN7", "INTELCELERON", "INTELPENTIUM", "INTELI3", "INTELI5", "INTELI7", "INTELI9" }));
        getContentPane().add(Pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 120, 20));

        Fa.setBackground(new java.awt.Color(204, 255, 255));
        Fa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lenovo", "HP", "Acer", "Apple", "Alienware", "Toshiba", "Dell", "Asus", "Samsung", "Gateway", "Sony", "MSI", "LG" }));
        getContentPane().add(Fa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 130, 20));

        Ra.setBackground(new java.awt.Color(204, 255, 255));
        Ra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2GB", "4GB", "6GB", "8GB", "12GB", "16GB", "32GB", "64GB", "128GB" }));
        getContentPane().add(Ra, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 140, -1));

        al.setBackground(new java.awt.Color(204, 255, 255));
        al.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ssd-128Gb", "Ssd-250Gb", "Ssd-500Gb", "Ssd-1TB", "Hdd-1Tb", "Hdd-2Tb" }));
        getContentPane().add(al, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 110, -1));

        save.setBackground(new java.awt.Color(255, 255, 0));
        save.setText("Guardar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 90, 50));

        verTabla.setBackground(new java.awt.Color(255, 102, 51));
        verTabla.setText("Ver");
        verTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTablaActionPerformed(evt);
            }
        });
        getContentPane().add(verTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 90, 50));

        salir.setBackground(new java.awt.Color(255, 0, 0));
        salir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("X");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 60, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 960, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        baseDatos=new DefaultTableModel();
        String mod=Mo.getText();
        String marc=Ma.getSelectedItem().toString();
        String col=Co.getText();
        String pros=Pro.getSelectedItem().toString();
        String fab=Fa.getSelectedItem().toString();
        String ra=Ra.getSelectedItem().toString();
        String slm=al.getSelectedItem().toString();
        
        c.setModelo(mod);
        c.setMarca(marc);
        c.setColor(col);
        c.setProcesador(pros);
        c.setFabricante(fab);
        c.setRAM(ra);
        c.setAlmacenamiento(slm);
        
        a.escribirArchivo(c);
        a.guardarArchivo(c);
    }//GEN-LAST:event_saveActionPerformed

    private void verTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTablaActionPerformed
        jTable1.setModel(a.ListaGenerada());
    }//GEN-LAST:event_verTablaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Co;
    private javax.swing.JComboBox<String> Fa;
    private javax.swing.JComboBox<String> Ma;
    private javax.swing.JTextField Mo;
    private javax.swing.JComboBox<String> Pro;
    private javax.swing.JComboBox<String> Ra;
    private javax.swing.JComboBox<String> al;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton salir;
    private javax.swing.JButton save;
    private javax.swing.JButton verTabla;
    // End of variables declaration//GEN-END:variables
}
