/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ConectorVista;
import controlador.Registro;
import controlador.Sesion;
import modelo.Marcador;
import java.util.Date;
import javax.swing.JOptionPane;

public class AgregarMarcador extends javax.swing.JFrame {

    String nombre, url, descripcion, color;
    int valor;
    Registro rg = new Registro();

    public AgregarMarcador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombreMarcador = new javax.swing.JLabel();
        txtNombreMarcador = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        lblUrl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lblAlerta = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        cboColor = new javax.swing.JComboBox<>();
        btnLimpiar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo marcador");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNombreMarcador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreMarcador.setText("NOMBRE DEL MARCADOR");

        lblDescripcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDescripcion.setText("DESCRIPCION");

        lblUrl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUrl.setText("URL");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        lblColor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblColor.setText("COLOR");

        cboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarillo", "Lila", "Rosa", "Verde" }));

        btnLimpiar1.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpiar1.setForeground(new java.awt.Color(51, 0, 153));
        btnLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-broom-32.png"))); // NOI18N
        btnLimpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombreMarcador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreMarcador)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUrl)
                            .addComponent(lblUrl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(lblAlerta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboColor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblNombreMarcador, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreMarcador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboColor, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(51, 0, 153));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-save-32.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(51, 0, 153));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-return-32.png"))); // NOI18N
        btnSalir.setText("Volver");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-bookmark-64.png"))); // NOI18N
        jLabel1.setText("NUEVO MARCADOR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        txtNombreMarcador.setText("");
        txtUrl.setText("");
        txtDescripcion.setText("");
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        nombre = txtNombreMarcador.getText();
        url = txtUrl.getText();
        descripcion = txtDescripcion.getText();
        color = cboColor.getSelectedItem().toString();

        //validaciones
        if (nombre.length() == 0 || url.length() == 0) {
            lblAlerta.setText("Debe agregar al menos el campo nombre y URL");
            if (nombre.length() == 0) {
                txtNombreMarcador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));//rojo
            } else {
                txtNombreMarcador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));//gris               
            }
            if (url.length() == 0) {
                txtUrl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));//rojo
            } else {
                txtUrl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));//gris               
            }
        } else if (url.contains("www.") || url.contains("https")) {
            
            if (rg.validarMarcadorNoExiste(Sesion.usuarioActivo, url)) {
                Marcador marc = new Marcador(nombre, url, new Date(), new Date(), descripcion, color, Sesion.usuarioActivo);
                rg.agregarMarcador(marc, 0);
                ConectorVista.actualizarMarcSesion();
                JOptionPane.showMessageDialog(this, "Marcador creado con exito", "Marcador creado", JOptionPane.INFORMATION_MESSAGE);
                this.sumarMarcadorAVista(valor, color, nombre);
                dispose();    
            } else {
                JOptionPane.showMessageDialog(this, "El marcador ya se encuentra creado", "Marcador ya registrado", JOptionPane.ERROR_MESSAGE);
            }
            
        } else {
            lblAlerta.setText("La URL debe contener www o https");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNombreMarcador;
    private javax.swing.JLabel lblUrl;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombreMarcador;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables

    // metodos de vista
    private void sumarMarcadorAVista(int val, String col, String nom) {
        if (VistaUsuario.lblPl1.getText().length() == 0) {
            val = 1;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl2.getText().length() == 0) {
            val = 2;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl3.getText().length() == 0) {
            val = 3;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl4.getText().length() == 0) {
            val = 4;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl6.getText().length() == 0) {
            val = 5;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl7.getText().length() == 0) {
            val = 6;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl8.getText().length() == 0) {
            val = 7;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl9.getText().length() == 0) {
            val = 8;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl10.getText().length() == 0) {
            val = 9;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl11.getText().length() == 0) {
            val = 10;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl12.getText().length() == 0) {
            val = 11;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl13.getText().length() == 0) {
            val = 12;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl14.getText().length() == 0) {
            val = 13;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl15.getText().length() == 0) {
            val = 14;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl16.getText().length() == 0) {
            val = 15;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else if (VistaUsuario.lblPl17.getText().length() == 0) {
            val = 16;
            ConectorVista.actualizarCuadros(val, col, nom);
            ConectorVista.handCursor();
        } else {
            ConectorVista.activarVisualMas(Integer.parseInt(VistaUsuario.lblPagina.getText()), 2);//activarVisualMas(int pagActual, int pagMas)
        }
    }

}
