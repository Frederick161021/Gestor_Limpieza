/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.VistasAdmin;

/**
 *
 * @author maria
 */
public class menuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form menuAdmin
     */
    public menuAdmin() {
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

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnColonias = new java.awt.Button();
        btnGestionActividadesK = new java.awt.Button();
        btnGestionCuadrillas = new java.awt.Button();
        btnGestionUsuarios = new java.awt.Button();
        btnReporteFinal = new java.awt.Button();
        lblGestionUsuarios = new javax.swing.JLabel();
        lblGestionCuadrillas = new javax.swing.JLabel();
        btnGestionColonias = new javax.swing.JLabel();
        lblGestionActividades2 = new javax.swing.JLabel();
        lblReporteFinal = new javax.swing.JLabel();
        btnSalir = new java.awt.Button();
        jLabel8 = new javax.swing.JLabel();
        lblCCM = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/punto.png"))); // NOI18N
        jLabel7.setText("Clean Colony Manager");
        jLabel7.setMaximumSize(new java.awt.Dimension(723, 512));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBienvenido.setBackground(new java.awt.Color(204, 204, 204));
        lblBienvenido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ajustes.png"))); // NOI18N
        lblBienvenido.setText("BIENVENIDO ADMINISTRADOR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblBienvenido)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblBienvenido)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 430, 50));

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));

        btnColonias.setActionCommand("GESTIÓN DE ACTIVIDADES");
        btnColonias.setBackground(java.awt.SystemColor.activeCaption);
        btnColonias.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnColonias.setLabel("GESTIÓN DE COLONIAS");
        btnColonias.setName("btnGestionColonias"); // NOI18N
        btnColonias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColoniasActionPerformed(evt);
            }
        });

        btnGestionActividadesK.setActionCommand("GESTIÓN DE ACTIVIDADES");
        btnGestionActividadesK.setBackground(java.awt.SystemColor.activeCaption);
        btnGestionActividadesK.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGestionActividadesK.setLabel("GESTIÓN DE ACTIVIDADES");
        btnGestionActividadesK.setName("btnGestionActividadesK"); // NOI18N
        btnGestionActividadesK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionActividadesKActionPerformed(evt);
            }
        });

        btnGestionCuadrillas.setActionCommand("GESTIÓN DE ACTIVIDADES");
        btnGestionCuadrillas.setBackground(java.awt.SystemColor.activeCaption);
        btnGestionCuadrillas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGestionCuadrillas.setLabel("GESTIÓN DE CUADRILLAS");
        btnGestionCuadrillas.setName("btnGestionCuadrilla"); // NOI18N
        btnGestionCuadrillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionCuadrillasActionPerformed(evt);
            }
        });

        btnGestionUsuarios.setActionCommand("GESTIÓN DE USUARIOS");
        btnGestionUsuarios.setBackground(java.awt.SystemColor.activeCaption);
        btnGestionUsuarios.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGestionUsuarios.setLabel("GESTION DE USUARIOS");
        btnGestionUsuarios.setName("btnGestionUsuarios"); // NOI18N
        btnGestionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionUsuariosActionPerformed(evt);
            }
        });

        btnReporteFinal.setActionCommand("GESTIÓN DE ACTIVIDADES");
        btnReporteFinal.setBackground(java.awt.SystemColor.activeCaption);
        btnReporteFinal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnReporteFinal.setLabel("REPORTE DE ACTIVIDADES");
        btnReporteFinal.setName("btnReporteActividades"); // NOI18N
        btnReporteFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteFinalActionPerformed(evt);
            }
        });

        lblGestionUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-usuario (1).png"))); // NOI18N
        lblGestionUsuarios.setText("jLabel2");

        lblGestionCuadrillas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cola.png"))); // NOI18N
        lblGestionCuadrillas.setText("jLabel3");

        btnGestionColonias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ssss.png"))); // NOI18N
        btnGestionColonias.setText("jLabel4");

        lblGestionActividades2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crucigrama.png"))); // NOI18N
        lblGestionActividades2.setText("jLabel5");

        lblReporteFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte.png"))); // NOI18N
        lblReporteFinal.setText("jLabel6");

        btnSalir.setBackground(new java.awt.Color(255, 153, 153));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir.setLabel("SALIR");
        btnSalir.setName("btnSalir"); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGestionCuadrillas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGestionUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGestionUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGestionCuadrillas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnGestionColonias, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnColonias, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(lblGestionActividades2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnGestionActividadesK, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(lblReporteFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnReporteFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGestionUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGestionUsuarios))
                        .addGap(33, 33, 33)
                        .addComponent(btnGestionCuadrillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblGestionCuadrillas))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnColonias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestionColonias))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGestionActividadesK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGestionActividades2))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporteFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReporteFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 330, 420));

        lblCCM.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblCCM.setForeground(new java.awt.Color(0, 153, 153));
        lblCCM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto.png"))); // NOI18N
        lblCCM.setText("Clean Colony Manager");
        lblCCM.setMaximumSize(new java.awt.Dimension(723, 512));
        jPanel1.add(lblCCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnColoniasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColoniasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnColoniasActionPerformed

    private void btnGestionActividadesKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionActividadesKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionActividadesKActionPerformed

    private void btnGestionCuadrillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionCuadrillasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionCuadrillasActionPerformed

    private void btnGestionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionUsuariosActionPerformed

    private void btnReporteFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteFinalActionPerformed

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
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnColonias;
    private java.awt.Button btnGestionActividadesK;
    private javax.swing.JLabel btnGestionColonias;
    private java.awt.Button btnGestionCuadrillas;
    private java.awt.Button btnGestionUsuarios;
    private java.awt.Button btnReporteFinal;
    private java.awt.Button btnSalir;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblCCM;
    private javax.swing.JLabel lblGestionActividades2;
    private javax.swing.JLabel lblGestionCuadrillas;
    private javax.swing.JLabel lblGestionUsuarios;
    private javax.swing.JLabel lblReporteFinal;
    // End of variables declaration//GEN-END:variables
}
