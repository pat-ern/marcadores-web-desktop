/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Registro;
import controlador.Sesion;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Marcador;
import modelo.Usuario;

/**
 *
 * @author 56930
 */
public class TablaDeMarcadores extends javax.swing.JFrame {

    String nombreDelMarcador;
    String url;
    String descripcion;
    String carpeta;
    String color;
    Registro rg = new Registro();

    /**
     * Creates new form TablaDeMarcadores
     */
    public TablaDeMarcadores() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblUsuarioVista = new javax.swing.JLabel();
        lblImaUsua = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        lblCar1 = new javax.swing.JLabel();
        lblCrearCarpeta2 = new javax.swing.JLabel();
        lblCrearCarpeta3 = new javax.swing.JLabel();
        lblCrearCarpeta4 = new javax.swing.JLabel();
        lblCrearCarpeta5 = new javax.swing.JLabel();
        lblCrearCarpeta6 = new javax.swing.JLabel();
        lblNoticias = new javax.swing.JLabel();
        jtLista = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cboOrdenar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabla de marcadores");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblUsuarioVista.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblUsuarioVista.setForeground(new java.awt.Color(51, 0, 153));
        lblUsuarioVista.setText("USUARIO");

        lblImaUsua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImaUsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-user-folder-64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblImaUsua)
                .addGap(18, 18, 18)
                .addComponent(lblUsuarioVista, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblImaUsua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblUsuarioVista, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(51, 0, 153));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-return-32.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblCar1.setBackground(new java.awt.Color(184, 151, 249));
        lblCar1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblCar1.setForeground(new java.awt.Color(51, 0, 153));
        lblCar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCar1.setText("CARPETAS");
        lblCar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCar1.setPreferredSize(new java.awt.Dimension(142, 20));

        lblCrearCarpeta2.setBackground(new java.awt.Color(184, 151, 249));
        lblCrearCarpeta2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCrearCarpeta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrearCarpeta2.setText("Compras");
        lblCrearCarpeta2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 151, 249)));
        lblCrearCarpeta2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCrearCarpeta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCrearCarpeta2MouseClicked(evt);
            }
        });

        lblCrearCarpeta3.setBackground(new java.awt.Color(184, 151, 249));
        lblCrearCarpeta3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCrearCarpeta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrearCarpeta3.setText("Cultura");
        lblCrearCarpeta3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 151, 249)));
        lblCrearCarpeta3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCrearCarpeta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCrearCarpeta3MouseClicked(evt);
            }
        });

        lblCrearCarpeta4.setBackground(new java.awt.Color(184, 151, 249));
        lblCrearCarpeta4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCrearCarpeta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrearCarpeta4.setText(" Ocio");
        lblCrearCarpeta4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 151, 249)));
        lblCrearCarpeta4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCrearCarpeta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCrearCarpeta4MouseClicked(evt);
            }
        });

        lblCrearCarpeta5.setBackground(new java.awt.Color(184, 151, 249));
        lblCrearCarpeta5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCrearCarpeta5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrearCarpeta5.setText("Social");
        lblCrearCarpeta5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 151, 249)));
        lblCrearCarpeta5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCrearCarpeta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCrearCarpeta5MouseClicked(evt);
            }
        });

        lblCrearCarpeta6.setBackground(new java.awt.Color(184, 151, 249));
        lblCrearCarpeta6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCrearCarpeta6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrearCarpeta6.setText("Estudio");
        lblCrearCarpeta6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 151, 249)));
        lblCrearCarpeta6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCrearCarpeta6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCrearCarpeta6MouseClicked(evt);
            }
        });

        lblNoticias.setBackground(new java.awt.Color(184, 151, 249));
        lblNoticias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNoticias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoticias.setText("Noticia");
        lblNoticias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 151, 249)));
        lblNoticias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNoticias.setPreferredSize(new java.awt.Dimension(142, 20));
        lblNoticias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNoticiasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCrearCarpeta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCrearCarpeta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCrearCarpeta4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCrearCarpeta6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCrearCarpeta5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNoticias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblCar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNoticias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCrearCarpeta6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCrearCarpeta2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCrearCarpeta3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCrearCarpeta5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCrearCarpeta4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre del marcador", "Url", "Descripción", "Carpeta", "Color"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtLista.setViewportView(jtTabla);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(51, 0, 153));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-search-more-32.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("Mostrar:");

        cboOrdenar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Orden Alfabetico", "Color" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(cboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jtLista))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtLista, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jtTabla.getModel();

        modelo.setRowCount(0);

        Usuario usr1 = new Usuario();
        usr1 = Sesion.usuarioActivo;
        //Todos, Orden Alfabetico, Item 3, Item 4
        switch (cboOrdenar.getSelectedItem().toString()) {
            case "Todos":
                List<Marcador> lista = rg.listarTodosLosMarcPorUsuario(usr1);

                for (Marcador tmp : lista) {
                    nombreDelMarcador = tmp.getNombreMarcador();
                    url = tmp.getUrl();
                    descripcion = tmp.getDescMarcador();
                    carpeta = tmp.getCarpeta().getNombreCarpeta();
                    color = tmp.getColorMarcador();

                    if (carpeta.equals("Default")) {
                        carpeta = "Sin carpeta";
                    }

                    if (descripcion.isEmpty()) {
                        descripcion = "Sin descripción";
                    }
                    modelo.addRow(new Object[]{nombreDelMarcador, url, descripcion, carpeta, color});

                }
                break;
            case "Orden Alfabetico":
                List<Marcador> listaOrdA = rg.listarLosMarcPorOrdenAlfabetico(usr1);

                for (Marcador tmp : listaOrdA) {
                    nombreDelMarcador = tmp.getNombreMarcador();
                    url = tmp.getUrl();
                    descripcion = tmp.getDescMarcador();
                    carpeta = tmp.getCarpeta().getNombreCarpeta();
                    color = tmp.getColorMarcador();

                    if (carpeta.equals("Default")) {
                        carpeta = "Sin carpeta";
                    }

                    if (descripcion.isEmpty()) {
                        descripcion = "Sin descripción";
                    }
                    modelo.addRow(new Object[]{nombreDelMarcador, url, descripcion, carpeta, color});
                }
                break;
            case "Color":
                List<Marcador> listaColor = rg.listarLosMarcPorColor(usr1);

                for (Marcador tmp : listaColor) {
                    nombreDelMarcador = tmp.getNombreMarcador();
                    url = tmp.getUrl();
                    descripcion = tmp.getDescMarcador();
                    carpeta = tmp.getCarpeta().getNombreCarpeta();
                    color = tmp.getColorMarcador();

                    if (carpeta.equals("Default")) {
                        carpeta = "Sin carpeta";
                    }

                    if (descripcion.isEmpty()) {
                        descripcion = "Sin descripción";
                    }
                    modelo.addRow(new Object[]{nombreDelMarcador, url, descripcion, carpeta, color});
                }
                break;
            default:
                break;
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void lblNoticiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoticiasMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jtTabla.getModel();
        modelo.setRowCount(0);

        List<Marcador> listaNoticia = rg.listarMarcadoresDeCarpeta(1);

        for (Marcador tmp : listaNoticia) {
            nombreDelMarcador = tmp.getNombreMarcador();
            url = tmp.getUrl();
            descripcion = tmp.getDescMarcador();
            carpeta = tmp.getCarpeta().getNombreCarpeta();
            color = tmp.getColorMarcador();

            if (carpeta.equals("Default")) {
                carpeta = "Sin carpeta";
            }

            if (descripcion.isEmpty()) {
                descripcion = "Sin descripción";
            }
            modelo.addRow(new Object[]{nombreDelMarcador, url, descripcion, carpeta, color});
        }
    }//GEN-LAST:event_lblNoticiasMouseClicked

    private void lblCrearCarpeta6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearCarpeta6MouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jtTabla.getModel();
        modelo.setRowCount(0);

        List<Marcador> listaNoticia = rg.listarMarcadoresDeCarpeta(2);

        for (Marcador tmp : listaNoticia) {
            nombreDelMarcador = tmp.getNombreMarcador();
            url = tmp.getUrl();
            descripcion = tmp.getDescMarcador();
            carpeta = tmp.getCarpeta().getNombreCarpeta();
            color = tmp.getColorMarcador();

            if (carpeta.equals("Default")) {
                carpeta = "Sin carpeta";
            }

            if (descripcion.isEmpty()) {
                descripcion = "Sin descripción";
            }
            modelo.addRow(new Object[]{nombreDelMarcador, url, descripcion, carpeta, color});
        }
    }//GEN-LAST:event_lblCrearCarpeta6MouseClicked

    private void lblCrearCarpeta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearCarpeta2MouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jtTabla.getModel();
        modelo.setRowCount(0);

        List<Marcador> listaNoticia = rg.listarMarcadoresDeCarpeta(3);

        for (Marcador tmp : listaNoticia) {
            nombreDelMarcador = tmp.getNombreMarcador();
            url = tmp.getUrl();
            descripcion = tmp.getDescMarcador();
            carpeta = tmp.getCarpeta().getNombreCarpeta();
            color = tmp.getColorMarcador();

            if (carpeta.equals("Default")) {
                carpeta = "Sin carpeta";
            }

            if (descripcion.isEmpty()) {
                descripcion = "Sin descripción";
            }
            modelo.addRow(new Object[]{nombreDelMarcador, url, descripcion, carpeta, color});
        }
    }//GEN-LAST:event_lblCrearCarpeta2MouseClicked

    private void lblCrearCarpeta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearCarpeta3MouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jtTabla.getModel();
        modelo.setRowCount(0);

        List<Marcador> listaNoticia = rg.listarMarcadoresDeCarpeta(4);

        for (Marcador tmp : listaNoticia) {
            nombreDelMarcador = tmp.getNombreMarcador();
            url = tmp.getUrl();
            descripcion = tmp.getDescMarcador();
            carpeta = tmp.getCarpeta().getNombreCarpeta();
            color = tmp.getColorMarcador();

            if (carpeta.equals("Default")) {
                carpeta = "Sin carpeta";
            }

            if (descripcion.isEmpty()) {
                descripcion = "Sin descripción";
            }
            modelo.addRow(new Object[]{nombreDelMarcador, url, descripcion, carpeta, color});
        }
    }//GEN-LAST:event_lblCrearCarpeta3MouseClicked

    private void lblCrearCarpeta5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearCarpeta5MouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jtTabla.getModel();
        modelo.setRowCount(0);

        List<Marcador> listaNoticia = rg.listarMarcadoresDeCarpeta(5);

        for (Marcador tmp : listaNoticia) {
            nombreDelMarcador = tmp.getNombreMarcador();
            url = tmp.getUrl();
            descripcion = tmp.getDescMarcador();
            carpeta = tmp.getCarpeta().getNombreCarpeta();
            color = tmp.getColorMarcador();

            if (carpeta.equals("Default")) {
                carpeta = "Sin carpeta";
            }

            if (descripcion.isEmpty()) {
                descripcion = "Sin descripción";
            }
            modelo.addRow(new Object[]{nombreDelMarcador, url, descripcion, carpeta, color});
        }
    }//GEN-LAST:event_lblCrearCarpeta5MouseClicked

    private void lblCrearCarpeta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrearCarpeta4MouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jtTabla.getModel();
        modelo.setRowCount(0);

        List<Marcador> listaNoticia = rg.listarMarcadoresDeCarpeta(6);

        for (Marcador tmp : listaNoticia) {
            nombreDelMarcador = tmp.getNombreMarcador();
            url = tmp.getUrl();
            descripcion = tmp.getDescMarcador();
            carpeta = tmp.getCarpeta().getNombreCarpeta();
            color = tmp.getColorMarcador();

            if (carpeta.equals("Default")) {
                carpeta = "Sin carpeta";
            }

            if (descripcion.isEmpty()) {
                descripcion = "Sin descripción";
            }
            modelo.addRow(new Object[]{nombreDelMarcador, url, descripcion, carpeta, color});
        }
    }//GEN-LAST:event_lblCrearCarpeta4MouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TablaDeMarcadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TablaDeMarcadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TablaDeMarcadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TablaDeMarcadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TablaDeMarcadores().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jtLista;
    private javax.swing.JTable jtTabla;
    public static javax.swing.JLabel lblCar1;
    public static javax.swing.JLabel lblCrearCarpeta2;
    public static javax.swing.JLabel lblCrearCarpeta3;
    public static javax.swing.JLabel lblCrearCarpeta4;
    public static javax.swing.JLabel lblCrearCarpeta5;
    public static javax.swing.JLabel lblCrearCarpeta6;
    private javax.swing.JLabel lblImaUsua;
    public static javax.swing.JLabel lblNoticias;
    public static javax.swing.JLabel lblUsuarioVista;
    // End of variables declaration//GEN-END:variables
}
