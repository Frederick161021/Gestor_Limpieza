/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.VistasAdmin;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author maria
 */
public class gestionColonias extends javax.swing.JFrame {

    private Component jLabel5;
    private Component button11;

    /**
     * Creates new form gestionColonias
     */
    public gestionColonias() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblGestionColonias = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIdAgregar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblNombreColonia = new javax.swing.JLabel();
        scrollPane2 = new java.awt.ScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtGestionColonias = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        lblPuntoRojo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtConsultarColonia = new javax.swing.JTextField();
        btnVerColonias = new java.awt.Button();
        jLabel24 = new javax.swing.JLabel();
        btnMenu = new java.awt.Button();
        btnConsultarColonia = new java.awt.Button();
        btnAgregar = new java.awt.Button();
        lblicono1 = new javax.swing.JLabel();
        lblicono4 = new javax.swing.JLabel();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGestionColonias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblGestionColonias.setText("GESTIÓN DE COLONIAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(lblGestionColonias)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGestionColonias)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 290, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, -1, -1));

        txtIdAgregar.setName("txtAgregarId"); // NOI18N
        jPanel1.add(txtIdAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 220, -1));

        lblNombreColonia.setBackground(new java.awt.Color(204, 204, 204));
        lblNombreColonia.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblNombreColonia.setText("ESCRIBA EL NOMBRE DE LA COLONIA PARA CONSULTAR SU ID: ");
        lblNombreColonia.setName("lblId"); // NOI18N
        jPanel4.add(lblNombreColonia);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 440, 30));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtGestionColonias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID COLONIA", "NOMBRE", "CIUDAD", "LATITUD", "LONGITUD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jtGestionColonias);

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 280));

        scrollPane2.add(jPanel5);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable5);

        scrollPane2.add(jScrollPane5);

        jPanel1.add(scrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 1210, 280));

        lblPuntoRojo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblPuntoRojo.setForeground(new java.awt.Color(0, 153, 153));
        lblPuntoRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto.png"))); // NOI18N
        lblPuntoRojo.setText("Clean Colony Manager");
        lblPuntoRojo.setMaximumSize(new java.awt.Dimension(723, 512));
        lblPuntoRojo.setName("lblPuntoRojo"); // NOI18N
        jPanel1.add(lblPuntoRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calles.png"))); // NOI18N
        jLabel13.setName("lblCalles"); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        lblID.setBackground(new java.awt.Color(204, 204, 204));
        lblID.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblID.setText("ID:");
        lblID.setName("lblId"); // NOI18N
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

        txtConsultarColonia.setName("txtConsultarId"); // NOI18N
        jPanel1.add(txtConsultarColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 220, -1));

        btnVerColonias.setBackground(new java.awt.Color(255, 255, 51));
        btnVerColonias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVerColonias.setLabel("VER COLONIAS");
        btnVerColonias.setName("btnVerColonias"); // NOI18N
        btnVerColonias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerColoniasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerColonias, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 610, 150, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ver.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 620, 78, -1));

        btnMenu.setActionCommand("MENU");
        btnMenu.setBackground(new java.awt.Color(255, 102, 102));
        btnMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMenu.setLabel("MENU");
        btnMenu.setName("btnMenu"); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 120, 40));

        btnConsultarColonia.setActionCommand("MENU");
        btnConsultarColonia.setBackground(new java.awt.Color(255, 153, 51));
        btnConsultarColonia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConsultarColonia.setLabel("CONSULTAR COLONIA");
        btnConsultarColonia.setName("btnCONSULTARCOLONIA"); // NOI18N
        btnConsultarColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarColoniaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 170, 20));

        btnAgregar.setActionCommand("MENU");
        btnAgregar.setBackground(new java.awt.Color(255, 153, 51));
        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setLabel("AGREGAR");
        btnAgregar.setName("btnAgregarCol"); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 170, 20));

        lblicono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N
        lblicono1.setName("lblCarrito"); // NOI18N
        jPanel1.add(lblicono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 40, 40));

        lblicono4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        lblicono4.setName("lblCarrito"); // NOI18N
        jPanel1.add(lblicono4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 610, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 1310, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerColoniasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerColoniasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerColoniasActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnConsultarColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarColoniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarColoniaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gestionColonias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionColonias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionColonias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionColonias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionColonias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAgregar;
    private java.awt.Button btnConsultarColonia;
    private java.awt.Button btnMenu;
    private java.awt.Button btnVerColonias;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jtGestionColonias;
    private javax.swing.JLabel lblGestionColonias;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombreColonia;
    private javax.swing.JLabel lblPuntoRojo;
    private javax.swing.JLabel lblicono1;
    private javax.swing.JLabel lblicono4;
    private java.awt.ScrollPane scrollPane2;
    private javax.swing.JTextField txtConsultarColonia;
    private javax.swing.JTextField txtIdAgregar;
    // End of variables declaration//GEN-END:variables

    private static class button11 {

        private static void setActionCommand(String menu) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setBackground(Color color) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setFont(Font font) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setLabel(String menu) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setName(String btnMenu) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void addActionListener(ActionListener actionListener) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public button11() {
        }
    }
}
