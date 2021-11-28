/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ConectorVista;
import controlador.Registro;
import controlador.Sesion;
import java.awt.Color;
import java.awt.Cursor;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Marcador;
import modelo.Usuario;
import static vistas.VistaUsuario.lblPl1;

/**
 *
 * @author 56930
 */
public class InicioSesion extends javax.swing.JFrame {

    String correoIngresado;
    String PassIngresada;
    String color;
    String nombreMarcador;

    /**
     * Creates new form menuGeneral
     */
    public InicioSesion() {
        initComponents();

        //CENTRAR LA VENTANA
        this.setLocationRelativeTo(null);

        //PONER ICONO EN LA APLICACION ¿lo dejamos?
        this.setIconImage(new ImageIcon(getClass().getResource("/imagen/postit.png")).getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        blbCredenciales = new javax.swing.JLabel();
        lblInicioSesion1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        jpPass = new javax.swing.JPasswordField();
        lblAlerta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAcceder = new javax.swing.JButton();
        lblRegistrate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mAcercaDe = new javax.swing.JMenu();
        miAcercaDe = new javax.swing.JMenuItem();
        mOpcion = new javax.swing.JMenu();
        miCrearUsuario = new javax.swing.JMenuItem();
        miSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jPanel4.setBackground(new java.awt.Color(223, 246, 235));
        jPanel4.setAlignmentX(0.0F);
        jPanel4.setAlignmentY(0.0F);
        jPanel4.setPreferredSize(new java.awt.Dimension(414, 475));

        blbCredenciales.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        blbCredenciales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blbCredenciales.setText("Ingresa tus credenciales");

        lblInicioSesion1.setFont(new java.awt.Font("Arial", 1, 29)); // NOI18N
        lblInicioSesion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicioSesion1.setText("Inicio de Sesion");
        lblInicioSesion1.setAlignmentX(0.5F);

        jPanel2.setBackground(new java.awt.Color(223, 246, 235));
        jPanel2.setPreferredSize(new java.awt.Dimension(414, 475));

        lblCorreo.setText("CORREO:");

        txtCorreo.setForeground(new java.awt.Color(153, 153, 153));
        txtCorreo.setText("correo@gmail.com");
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
        });

        lblPass.setText("CONTRASEÑA: ");

        jpPass.setForeground(new java.awt.Color(153, 153, 153));
        jpPass.setText("JPasswordField");
        jpPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpPassFocusGained(evt);
            }
        });

        lblAlerta.setForeground(new java.awt.Color(235, 76, 76));
        lblAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(223, 246, 235));

        btnAcceder.setBackground(new java.awt.Color(0, 0, 0));
        btnAcceder.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceder.setText("ACCEDER");
        btnAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        lblRegistrate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRegistrate.setText("Registrate");
        lblRegistrate.setToolTipText("Crear un nuevo usuario");
        lblRegistrate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrateMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("¿No tienes cuenta?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRegistrate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAcceder)
                .addGap(163, 163, 163))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAcceder)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistrate)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpPass, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(jpPass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(blbCredenciales, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInicioSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblInicioSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(blbCredenciales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );

        mAcercaDe.setText("Acerca de...");

        miAcercaDe.setText("Acerca de la aplicacion");
        miAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercaDeActionPerformed(evt);
            }
        });
        mAcercaDe.add(miAcercaDe);

        jMenuBar1.add(mAcercaDe);

        mOpcion.setText("Opciones");
        mOpcion.setToolTipText("");

        miCrearUsuario.setText("Crear Nuevo Usuario");
        miCrearUsuario.setToolTipText("");
        miCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearUsuarioActionPerformed(evt);
            }
        });
        mOpcion.add(miCrearUsuario);

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mOpcion.add(miSalir);

        jMenuBar1.add(mOpcion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 405, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed

        correoIngresado = txtCorreo.getText().toLowerCase();
        var passIngresada = new String(jpPass.getPassword());

        if (correoIngresado.length() == 0) {
            txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));//rojo
        } else {
            txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));//gris               
        }

        if (passIngresada.length() == 0 || passIngresada.equals("JPasswordField")) {
            jpPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        } else {
            jpPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        }

        if (correoIngresado.length() == 0 || passIngresada.length() == 0 || passIngresada.equals("JPasswordField")) {
            lblAlerta.setText("Debe completar todos los campos!");

        } else {
            lblAlerta.setText("");

            //Buscar al usuario en la BD
            Registro rg = new Registro();

            //consultar usuario
            Usuario usr1 = new Usuario();

            //
            if (rg.validarUsuarioExiste(correoIngresado)) {
                JOptionPane.showMessageDialog(this, "Usuario no existe", "Error al encontrar usuario", JOptionPane.ERROR_MESSAGE);
            } else {
                //inicia sesion
                usr1 = rg.activarSesionUsuario(correoIngresado);//obtengo los datos de la BD

                //compara que sean los datos de la BD
                if (usr1.getCorreo().equals(correoIngresado) && usr1.getClave().equals(passIngresada)) {

                    new VistaUsuario().setVisible(true);
                    VistaUsuario.lblUsuario.setText(usr1.getNombreUsuario());
                    Sesion.usuarioActivo = usr1;
                    
                    int pagina = Integer.parseInt(VistaUsuario.lblPagina.getText());

                    List<Marcador> lista = rg.listarTodosLosMarcPorUsuario(usr1);
                    
                    ConectorVista.pagina(usr1, pagina);

                    //PONER LO DEL CURSOR AQUI TAMBIEN
                    
                    if (lista.size() > 16) {
                        VistaUsuario.lblMas.setForeground(Color.black);
                        VistaUsuario.lblMas.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }
                    dispose();

                } else {
                    lblAlerta.setText("Contraseña invalida");
                }
            }
        }
    }//GEN-LAST:event_btnAccederActionPerformed

    private void miCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearUsuarioActionPerformed
        dispose();
        //IR A CREAR UN USUARIO
        new CreacionUsuario().setVisible(true);
    }//GEN-LAST:event_miCrearUsuarioActionPerformed

    private void miAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercaDeActionPerformed
        JOptionPane.showMessageDialog(this, "Aquí podrás guardar y organizar los enlaces de las paginas que necesites. ", "Acerca de...", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_miAcercaDeActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    //Al ganar el foco
    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        txtCorreo.setText("");
        txtCorreo.setForeground(Color.black);
    }//GEN-LAST:event_txtCorreoFocusGained

    private void jpPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPassFocusGained
        jpPass.setText("");
        jpPass.setForeground(Color.black);
    }//GEN-LAST:event_jpPassFocusGained

    private void lblRegistrateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrateMouseClicked
        new CreacionUsuario().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblRegistrateMouseClicked

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
            java.util.logging.Logger.getLogger(InicioSesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blbCredenciales;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jpPass;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblInicioSesion1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRegistrate;
    private javax.swing.JMenu mAcercaDe;
    private javax.swing.JMenu mOpcion;
    private javax.swing.JMenuItem miAcercaDe;
    private javax.swing.JMenuItem miCrearUsuario;
    private javax.swing.JMenuItem miSalir;
    public static javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables

}
