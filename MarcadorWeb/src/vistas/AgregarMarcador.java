/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ConectorVista;
import controlador.Registro;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Carpeta;
import modelo.Marcador;
import modelo.Usuario;

/**
 *
 * @author 56930
 */
public class AgregarMarcador extends javax.swing.JFrame {

    String nombreMarcador, url, descripcion, color;
    int valor;

    /**
     * Creates new form AgregarMarcador
     */
    public AgregarMarcador() {
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboColor, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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

        nombreMarcador = txtNombreMarcador.getText();
        url = txtUrl.getText();
        descripcion = txtDescripcion.getText();
        color = cboColor.getSelectedItem().toString();

        //Correo del usuario
        String correoDelUsuario = InicioSesion.txtCorreo.getText();

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        formatoFecha.format(fecha);

        //validar vacio
        if (nombreMarcador.length() == 0 || url.length() == 0) {
            lblAlerta.setText("Debe agregar al menos el campo nombre y URL");
            if (nombreMarcador.length() == 0) {
                txtNombreMarcador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));//rojo
            } else {
                txtNombreMarcador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));//gris               
            }
            if (url.length() == 0) {
                txtUrl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));//rojo
            } else {
                txtUrl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));//gris               
            }
        }else if(url.contains("www.")==false){
            lblAlerta.setText("La URL tiene que iniciar con www.");
        }else {

            Registro rg = new Registro();
            
            //Lo busco por el correo en la BD
            Usuario usr1 = rg.activarSesionUsuario(correoDelUsuario);

            Carpeta car1 = new Carpeta(); //anadir
            
            Marcador marc1 = new Marcador(nombreMarcador, url, new Date(), new Date(), descripcion, color, usr1);
            
            if (rg.validarMarcadorExiste(marc1)) {
                rg.agregarMarcador(marc1,0);

                if (VistaUsuario.lblPl1.getText().length() == 0) {
                    valor = 1;
                    colorearPanel(valor);
                    VistaUsuario.lblPl1.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl2.getText().length() == 0) {
                    valor = 2;
                    colorearPanel(valor);
                    VistaUsuario.lblPl2.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl3.getText().length() == 0) {
                    valor = 3;
                    colorearPanel(valor);
                    VistaUsuario.lblPl3.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl4.getText().length() == 0) {
                    valor = 4;
                    colorearPanel(valor);
                    VistaUsuario.lblPl4.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl6.getText().length() == 0) {
                    valor = 5;
                    colorearPanel(valor);
                    VistaUsuario.lblPl6.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl7.getText().length() == 0) {
                    valor = 6;
                    colorearPanel(valor);
                    VistaUsuario.lblPl7.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl8.getText().length() == 0) {
                    valor = 7;
                    colorearPanel(valor);
                    VistaUsuario.lblPl8.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl9.getText().length() == 0) {
                    valor = 8;
                    colorearPanel(valor);
                    VistaUsuario.lblPl9.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl10.getText().length() == 0) {
                    valor = 9;
                    colorearPanel(valor);
                    VistaUsuario.lblPl10.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl11.getText().length() == 0) {
                    valor = 10;
                    colorearPanel(valor);
                    VistaUsuario.lblPl11.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl12.getText().length() == 0) {
                    valor = 11;
                    colorearPanel(valor);
                    VistaUsuario.lblPl12.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl13.getText().length() == 0) {
                    valor = 12;
                    colorearPanel(valor);
                    VistaUsuario.lblPl13.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl14.getText().length() == 0) {
                    valor = 13;
                    colorearPanel(valor);
                    VistaUsuario.lblPl14.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl15.getText().length() == 0) {
                    valor = 14;
                    colorearPanel(valor);
                    VistaUsuario.lblPl15.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl16.getText().length() == 0) {
                    valor = 15;
                    colorearPanel(valor);
                    VistaUsuario.lblPl16.setText(nombreMarcador);
                    ConectorVista.handCursor();
                } else if (VistaUsuario.lblPl17.getText().length() == 0) {
                    valor = 16;
                    colorearPanel(valor);
                    VistaUsuario.lblPl17.setText(nombreMarcador);
                    ConectorVista.handCursor();
                }else{
                    ConectorVista.activarVisualMas(Integer.parseInt(VistaUsuario.lblPagina.getText()), 2);//activarVisualMas(int pagActual, int pagMas)
                }
            } else {
                JOptionPane.showMessageDialog(this, "El marcador ya se encuentra creado", "Marcador ya registrado", JOptionPane.ERROR_MESSAGE);
            }

            dispose();
        }

    }//GEN-LAST:event_btnGuardarActionPerformed
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
//            java.util.logging.Logger.getLogger(AgregarMarcador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AgregarMarcador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AgregarMarcador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AgregarMarcador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AgregarMarcador().setVisible(true);
//            }
//        });
//    }

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

    void colorearPanel(int valor) {
        switch (valor) {
            case 1:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl1.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl1.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl1.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl1.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk1.setEnabled(true);
                break;
            case 2:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl2.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl2.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl2.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl2.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk2.setEnabled(true);
                break;
            case 3:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl3.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl3.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl3.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl3.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk3.setEnabled(true);
                break;
            case 4:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl4.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl4.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl4.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl4.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk4.setEnabled(true);
                break;
            case 5:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl5.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl5.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl5.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl5.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk5.setEnabled(true);
                break;
            case 6:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl6.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl6.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl6.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl6.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk6.setEnabled(true);
                break;
            case 7:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl7.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl7.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl7.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl7.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk7.setEnabled(true);
                break;
            case 8:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl8.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl8.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl8.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl8.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo
                        break;
                }
                VistaUsuario.chk8.setEnabled(true);
                break;
            case 9:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl9.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl9.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl9.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl9.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk9.setEnabled(true);
                break;
            case 10:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl10.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl10.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl10.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl10.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk10.setEnabled(true);
                break;
            case 11:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl11.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl11.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl11.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl11.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk11.setEnabled(true);
                break;
            case 12:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl12.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl12.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl12.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl12.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk12.setEnabled(true);
                break;
            case 13:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl13.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl13.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl13.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl13.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk13.setEnabled(true);
                break;
            case 14:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl14.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl14.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl14.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl14.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk14.setEnabled(true);
                break;
            case 15:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl15.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl15.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl15.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl15.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk15.setEnabled(true);
                break;
            case 16:
                switch (color) {
                    case "Lila":
                        VistaUsuario.pl16.setBackground(new Color(204, 204, 255));
                        break;
                    case "Rosa":
                        VistaUsuario.pl16.setBackground(new Color(255, 153, 204));
                        break;
                    case "Verde":
                        VistaUsuario.pl16.setBackground(new Color(204, 255, 204));
                        break;
                    default:
                        VistaUsuario.pl16.setBackground(new Color(255, 255, 204)); //por defecto es Amarillo 
                        break;
                }
                VistaUsuario.chk16.setEnabled(true);
                break;
            default:
                System.out.println("Se terminó");
        }
    }

}
