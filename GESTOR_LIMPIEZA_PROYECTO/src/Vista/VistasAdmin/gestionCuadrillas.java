/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.VistasAdmin;

/**
 *
 * @author maria
 */
public class gestionCuadrillas extends javax.swing.JFrame {

    /**
     * Creates new form gestionCuadrillas
     */
    public gestionCuadrillas() {
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

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel6 = new javax.swing.JPanel();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        button10 = new java.awt.Button();
        button11 = new java.awt.Button();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblGestionCuadrillas = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNombreCuadrilla = new javax.swing.JTextField();
        cbJefeCuadrilla = new javax.swing.JComboBox<>();
        lblSeleccionarCuadrilla = new javax.swing.JLabel();
        txtMiembrosDisponibles = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLCuadrilla = new javax.swing.JList<>();
        btnEliminarEmpleado = new java.awt.Button();
        btnAgregarEmpleado = new java.awt.Button();
        btnAgregarJefe = new java.awt.Button();
        btnCambiarJefe = new java.awt.Button();
        jPanel4 = new javax.swing.JPanel();
        lblIdCuadrilla = new javax.swing.JLabel();
        lblNombreCuadrilla = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblJefeCuadrilla = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblMiembrosDisponibles = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblCuadrillaConformada = new javax.swing.JLabel();
        txtIdCuadrilla = new javax.swing.JTextField();
        btnVerCuadrillas = new java.awt.Button();
        jPanel7 = new javax.swing.JPanel();
        btnEliminar = new java.awt.Button();
        btnConsultar = new java.awt.Button();
        btnGuardar = new java.awt.Button();
        btnActualizar = new java.awt.Button();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnMenu = new java.awt.Button();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        button8.setActionCommand("ACTUALIZAR");
        button8.setBackground(new java.awt.Color(255, 51, 51));
        button8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button8.setLabel("ELIMINAR");
        button8.setName("btnEliminar"); // NOI18N

        button9.setActionCommand("ACTUALIZAR");
        button9.setBackground(new java.awt.Color(102, 255, 255));
        button9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button9.setLabel("CONSULTAR");
        button9.setName("btnConsultar"); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button10.setBackground(new java.awt.Color(102, 255, 102));
        button10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button10.setLabel("GUARDAR");
        button10.setName("btnGuardar"); // NOI18N

        button11.setActionCommand("ACTUALIZAR");
        button11.setBackground(new java.awt.Color(255, 255, 51));
        button11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button11.setLabel("ACTUALIZAR");
        button11.setName("btnActualizar"); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/actualizar.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpieza.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton-eliminar.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda-de-datos.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/disco-flexible.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(9, 9, 9))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/punto.png"))); // NOI18N
        jLabel4.setText("Clean Colony Manager");
        jLabel4.setMaximumSize(new java.awt.Dimension(723, 512));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGestionCuadrillas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblGestionCuadrillas.setText("GESTIÓN DE CUADRILLAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lblGestionCuadrillas)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblGestionCuadrillas)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 290, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreCuadrilla.setName("txtNombreCuadrilla"); // NOI18N
        jPanel3.add(txtNombreCuadrilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 220, -1));

        cbJefeCuadrilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbJefeCuadrilla.setName("cbJefeCuadrilla"); // NOI18N
        jPanel3.add(cbJefeCuadrilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 210, 30));

        lblSeleccionarCuadrilla.setBackground(new java.awt.Color(204, 204, 204));
        lblSeleccionarCuadrilla.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblSeleccionarCuadrilla.setText("SELECCIONE UN JEFE DE CUADRILLA");
        jPanel3.add(lblSeleccionarCuadrilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        txtMiembrosDisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtMiembrosDisponibles.setName("cbEmpleado"); // NOI18N
        jPanel3.add(txtMiembrosDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 210, 30));

        JLCuadrilla.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(JLCuadrilla);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 230, 140));

        btnEliminarEmpleado.setActionCommand("ACTUALIZAR");
        btnEliminarEmpleado.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarEmpleado.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnEliminarEmpleado.setLabel("Eliminar Empleado");
        btnEliminarEmpleado.setName("btnEliminarEmpleado"); // NOI18N
        jPanel3.add(btnEliminarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 120, 20));

        btnAgregarEmpleado.setActionCommand("ACTUALIZAR");
        btnAgregarEmpleado.setBackground(new java.awt.Color(51, 102, 255));
        btnAgregarEmpleado.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnAgregarEmpleado.setLabel("Agregar Empleado");
        btnAgregarEmpleado.setName("btnAgregarEmpleado"); // NOI18N
        jPanel3.add(btnAgregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, 20));

        btnAgregarJefe.setActionCommand("ACTUALIZAR");
        btnAgregarJefe.setBackground(new java.awt.Color(51, 102, 255));
        btnAgregarJefe.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnAgregarJefe.setLabel("Agregar Jefe");
        btnAgregarJefe.setName("btnAgregarJefe"); // NOI18N
        jPanel3.add(btnAgregarJefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, 20));

        btnCambiarJefe.setActionCommand("ACTUALIZAR");
        btnCambiarJefe.setBackground(new java.awt.Color(255, 255, 0));
        btnCambiarJefe.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnCambiarJefe.setLabel("Cambiar Jefe");
        btnCambiarJefe.setName("btnCambiarJefe"); // NOI18N
        jPanel3.add(btnCambiarJefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 120, 20));

        lblIdCuadrilla.setBackground(new java.awt.Color(204, 204, 204));
        lblIdCuadrilla.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblIdCuadrilla.setText("ID DE CUADRILLA:");

        lblNombreCuadrilla.setBackground(new java.awt.Color(204, 204, 204));
        lblNombreCuadrilla.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblNombreCuadrilla.setText("NOMBRE DE CUADRILLA:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombreCuadrilla)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIdCuadrilla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblIdCuadrilla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblNombreCuadrilla))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 50));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel6.setText("ID DE CUADRILLA:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout lblJefeCuadrillaLayout = new javax.swing.GroupLayout(lblJefeCuadrilla);
        lblJefeCuadrilla.setLayout(lblJefeCuadrillaLayout);
        lblJefeCuadrillaLayout.setHorizontalGroup(
            lblJefeCuadrillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        lblJefeCuadrillaLayout.setVerticalGroup(
            lblJefeCuadrillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(lblJefeCuadrilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 370, -1));

        lblMiembrosDisponibles.setBackground(new java.awt.Color(204, 204, 204));
        lblMiembrosDisponibles.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblMiembrosDisponibles.setText("MIEMBROS DISPONIBLES PARA SU CUADRILLA");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lblMiembrosDisponibles)
                .addGap(22, 22, 22))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblMiembrosDisponibles)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lblCuadrillaConformada.setBackground(new java.awt.Color(204, 204, 204));
        lblCuadrillaConformada.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblCuadrillaConformada.setText("SU CUADRILLA SE CONFORMA POR:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(lblCuadrillaConformada)
                .addGap(61, 61, 61))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(lblCuadrillaConformada)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txtIdCuadrilla.setName("txtIdCuadrilla"); // NOI18N
        jPanel3.add(txtIdCuadrilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 220, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 420, 440));

        btnVerCuadrillas.setBackground(new java.awt.Color(255, 153, 51));
        btnVerCuadrillas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVerCuadrillas.setLabel("VER CUADRILLAS");
        btnVerCuadrillas.setName("btnVerCuadrillas"); // NOI18N
        btnVerCuadrillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCuadrillasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerCuadrillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, 190, 40));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        btnEliminar.setActionCommand("ACTUALIZAR");
        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminar.setLabel("ELIMINAR");
        btnEliminar.setName("btnEliminar"); // NOI18N

        btnConsultar.setActionCommand("ACTUALIZAR");
        btnConsultar.setBackground(new java.awt.Color(102, 255, 255));
        btnConsultar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnConsultar.setLabel("CONSULTAR");
        btnConsultar.setName("btnConsultar"); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(102, 255, 102));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGuardar.setLabel("GUARDAR");
        btnGuardar.setName("btnGuardar"); // NOI18N

        btnActualizar.setActionCommand("ACTUALIZAR");
        btnActualizar.setBackground(new java.awt.Color(255, 255, 51));
        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnActualizar.setLabel("ACTUALIZAR");
        btnActualizar.setName("btnActualizar"); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/actualizar.png"))); // NOI18N
        jLabel19.setName("lblActualizar"); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton-eliminar.png"))); // NOI18N
        jLabel21.setName("lblBasura"); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda-de-datos.png"))); // NOI18N
        jLabel22.setName("lblLupa"); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/disco-flexible.png"))); // NOI18N
        jLabel23.setName("lblDisco"); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel23)
                .addGap(70, 70, 70)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel19)
                .addGap(115, 115, 115)
                .addComponent(jLabel21)
                .addGap(9, 9, 9))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 140, 740));

        btnMenu.setBackground(new java.awt.Color(255, 153, 153));
        btnMenu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenu.setLabel("MENU");
        btnMenu.setName("btnMenu"); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 90, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ver.png"))); // NOI18N
        jLabel24.setName("lblOjo"); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 670, 78, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        jLabel25.setName("lblMenu"); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 78, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button9ActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnVerCuadrillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCuadrillasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerCuadrillasActionPerformed

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
            java.util.logging.Logger.getLogger(gestionCuadrillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionCuadrillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionCuadrillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionCuadrillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionCuadrillas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JLCuadrilla;
    private java.awt.Button btnActualizar;
    private java.awt.Button btnAgregarEmpleado;
    private java.awt.Button btnAgregarJefe;
    private java.awt.Button btnCambiarJefe;
    private java.awt.Button btnConsultar;
    private java.awt.Button btnEliminar;
    private java.awt.Button btnEliminarEmpleado;
    private java.awt.Button btnGuardar;
    private java.awt.Button btnMenu;
    private java.awt.Button btnVerCuadrillas;
    private java.awt.Button button10;
    private java.awt.Button button11;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private javax.swing.JComboBox<String> cbJefeCuadrilla;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCuadrillaConformada;
    private javax.swing.JLabel lblGestionCuadrillas;
    private javax.swing.JLabel lblIdCuadrilla;
    private javax.swing.JPanel lblJefeCuadrilla;
    private javax.swing.JLabel lblMiembrosDisponibles;
    private javax.swing.JLabel lblNombreCuadrilla;
    private javax.swing.JLabel lblSeleccionarCuadrilla;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextField txtIdCuadrilla;
    private javax.swing.JComboBox<String> txtMiembrosDisponibles;
    private javax.swing.JTextField txtNombreCuadrilla;
    // End of variables declaration//GEN-END:variables
}
