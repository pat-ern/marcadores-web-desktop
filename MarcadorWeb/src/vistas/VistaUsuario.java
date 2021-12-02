package vistas;

import controlador.ConectorVista;
import controlador.Registro;
import controlador.Sesion;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Marcador;
import modelo.Usuario;

public class VistaUsuario extends javax.swing.JFrame {

    int pagMas;
    Registro rg = new Registro();
    List<String> listaUrl;

    public VistaUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnAgregarCarpe = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pl1 = new javax.swing.JPanel();
        lblPl1 = new javax.swing.JLabel();
        chk1 = new javax.swing.JCheckBox();
        pl2 = new javax.swing.JPanel();
        lblPl2 = new javax.swing.JLabel();
        chk2 = new javax.swing.JCheckBox();
        pl4 = new javax.swing.JPanel();
        lblPl4 = new javax.swing.JLabel();
        chk4 = new javax.swing.JCheckBox();
        pl8 = new javax.swing.JPanel();
        lblPl9 = new javax.swing.JLabel();
        chk8 = new javax.swing.JCheckBox();
        pl3 = new javax.swing.JPanel();
        lblPl3 = new javax.swing.JLabel();
        chk3 = new javax.swing.JCheckBox();
        pl6 = new javax.swing.JPanel();
        lblPl7 = new javax.swing.JLabel();
        chk6 = new javax.swing.JCheckBox();
        pl5 = new javax.swing.JPanel();
        lblPl6 = new javax.swing.JLabel();
        chk5 = new javax.swing.JCheckBox();
        pl12 = new javax.swing.JPanel();
        lblPl13 = new javax.swing.JLabel();
        chk12 = new javax.swing.JCheckBox();
        pl11 = new javax.swing.JPanel();
        lblPl12 = new javax.swing.JLabel();
        chk11 = new javax.swing.JCheckBox();
        pl10 = new javax.swing.JPanel();
        lblPl11 = new javax.swing.JLabel();
        chk10 = new javax.swing.JCheckBox();
        pl9 = new javax.swing.JPanel();
        lblPl10 = new javax.swing.JLabel();
        chk9 = new javax.swing.JCheckBox();
        pl16 = new javax.swing.JPanel();
        lblPl17 = new javax.swing.JLabel();
        chk16 = new javax.swing.JCheckBox();
        pl15 = new javax.swing.JPanel();
        lblPl16 = new javax.swing.JLabel();
        chk15 = new javax.swing.JCheckBox();
        pl14 = new javax.swing.JPanel();
        lblPl15 = new javax.swing.JLabel();
        chk14 = new javax.swing.JCheckBox();
        pl13 = new javax.swing.JPanel();
        lblPl14 = new javax.swing.JLabel();
        chk13 = new javax.swing.JCheckBox();
        pl7 = new javax.swing.JPanel();
        lblPl8 = new javax.swing.JLabel();
        chk7 = new javax.swing.JCheckBox();
        lblMas = new javax.swing.JLabel();
        lblMenos = new javax.swing.JLabel();
        lblPagina = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblUsuarioIcon = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marcadores de usuario");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(51, 0, 153));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-waste-32.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(51, 0, 153));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-bookmark-32.png"))); // NOI18N
        btnAgregar.setText("Nuevo");
        btnAgregar.setToolTipText("Nuevo marcador");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(51, 0, 153));
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-search-more-32.png"))); // NOI18N
        btnMostrar.setText("Buscar");
        btnMostrar.setToolTipText("Buscar marcadores");
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnAgregarCarpe.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCarpe.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregarCarpe.setForeground(new java.awt.Color(51, 0, 153));
        btnAgregarCarpe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-add-folder-32.png"))); // NOI18N
        btnAgregarCarpe.setText("Mover");
        btnAgregarCarpe.setToolTipText("Mover a una carpeta");
        btnAgregarCarpe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCarpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarpeActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(51, 0, 153));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-edit-property-32.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAgregar)
                .addGap(12, 12, 12)
                .addComponent(btnEliminar)
                .addGap(12, 12, 12)
                .addComponent(btnEditar)
                .addGap(12, 12, 12)
                .addComponent(btnAgregarCarpe)
                .addGap(12, 12, 12)
                .addComponent(btnMostrar)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarCarpe, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        pl1.setBackground(new java.awt.Color(255, 255, 255));
        pl1.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl1MouseClicked(evt);
            }
        });

        chk1.setToolTipText("");
        chk1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk1.setEnabled(false);

        javax.swing.GroupLayout pl1Layout = new javax.swing.GroupLayout(pl1);
        pl1.setLayout(pl1Layout);
        pl1Layout.setHorizontalGroup(
            pl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chk1)
                    .addComponent(lblPl1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pl1Layout.setVerticalGroup(
            pl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pl1Layout.createSequentialGroup()
                .addComponent(chk1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl2.setBackground(new java.awt.Color(255, 255, 255));
        pl2.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl2MouseClicked(evt);
            }
        });

        chk2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk2.setEnabled(false);

        javax.swing.GroupLayout pl2Layout = new javax.swing.GroupLayout(pl2);
        pl2.setLayout(pl2Layout);
        pl2Layout.setHorizontalGroup(
            pl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chk2)
                    .addComponent(lblPl2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pl2Layout.setVerticalGroup(
            pl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl2Layout.createSequentialGroup()
                .addComponent(chk2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl4.setBackground(new java.awt.Color(255, 255, 255));
        pl4.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl4MouseClicked(evt);
            }
        });

        chk4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk4.setEnabled(false);

        javax.swing.GroupLayout pl4Layout = new javax.swing.GroupLayout(pl4);
        pl4.setLayout(pl4Layout);
        pl4Layout.setHorizontalGroup(
            pl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pl4Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(chk4))))
        );
        pl4Layout.setVerticalGroup(
            pl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl4Layout.createSequentialGroup()
                .addComponent(chk4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl8.setBackground(new java.awt.Color(255, 255, 255));
        pl8.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl9MouseClicked(evt);
            }
        });

        chk8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk8.setEnabled(false);

        javax.swing.GroupLayout pl8Layout = new javax.swing.GroupLayout(pl8);
        pl8.setLayout(pl8Layout);
        pl8Layout.setHorizontalGroup(
            pl8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pl8Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(chk8))))
        );
        pl8Layout.setVerticalGroup(
            pl8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl8Layout.createSequentialGroup()
                .addComponent(chk8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pl3.setBackground(new java.awt.Color(255, 255, 255));
        pl3.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl3MouseClicked(evt);
            }
        });

        chk3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk3.setEnabled(false);

        javax.swing.GroupLayout pl3Layout = new javax.swing.GroupLayout(pl3);
        pl3.setLayout(pl3Layout);
        pl3Layout.setHorizontalGroup(
            pl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pl3Layout.createSequentialGroup()
                        .addGap(0, 65, Short.MAX_VALUE)
                        .addComponent(chk3))))
        );
        pl3Layout.setVerticalGroup(
            pl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl3Layout.createSequentialGroup()
                .addComponent(chk3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl6.setBackground(new java.awt.Color(255, 255, 255));
        pl6.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl7MouseClicked(evt);
            }
        });

        chk6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk6.setEnabled(false);

        javax.swing.GroupLayout pl6Layout = new javax.swing.GroupLayout(pl6);
        pl6.setLayout(pl6Layout);
        pl6Layout.setHorizontalGroup(
            pl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addGroup(pl6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(chk6))))
        );
        pl6Layout.setVerticalGroup(
            pl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl6Layout.createSequentialGroup()
                .addComponent(chk6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl7, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl5.setBackground(new java.awt.Color(255, 255, 255));
        pl5.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl6MouseClicked(evt);
            }
        });

        chk5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk5.setEnabled(false);

        javax.swing.GroupLayout pl5Layout = new javax.swing.GroupLayout(pl5);
        pl5.setLayout(pl5Layout);
        pl5Layout.setHorizontalGroup(
            pl5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addGroup(pl5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(chk5))))
        );
        pl5Layout.setVerticalGroup(
            pl5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl5Layout.createSequentialGroup()
                .addComponent(chk5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl12.setBackground(new java.awt.Color(255, 255, 255));
        pl12.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl13MouseClicked(evt);
            }
        });

        chk12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk12.setEnabled(false);

        javax.swing.GroupLayout pl12Layout = new javax.swing.GroupLayout(pl12);
        pl12.setLayout(pl12Layout);
        pl12Layout.setHorizontalGroup(
            pl12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pl12Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(chk12))))
        );
        pl12Layout.setVerticalGroup(
            pl12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl12Layout.createSequentialGroup()
                .addComponent(chk12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl13, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl11.setBackground(new java.awt.Color(255, 255, 255));
        pl11.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl12MouseClicked(evt);
            }
        });

        chk11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk11.setEnabled(false);

        javax.swing.GroupLayout pl11Layout = new javax.swing.GroupLayout(pl11);
        pl11.setLayout(pl11Layout);
        pl11Layout.setHorizontalGroup(
            pl11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pl11Layout.createSequentialGroup()
                        .addGap(0, 65, Short.MAX_VALUE)
                        .addComponent(chk11))))
        );
        pl11Layout.setVerticalGroup(
            pl11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl11Layout.createSequentialGroup()
                .addComponent(chk11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl12, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl10.setBackground(new java.awt.Color(255, 255, 255));
        pl10.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl11MouseClicked(evt);
            }
        });

        chk10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk10.setEnabled(false);

        javax.swing.GroupLayout pl10Layout = new javax.swing.GroupLayout(pl10);
        pl10.setLayout(pl10Layout);
        pl10Layout.setHorizontalGroup(
            pl10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl11, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addGroup(pl10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(chk10))))
        );
        pl10Layout.setVerticalGroup(
            pl10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl10Layout.createSequentialGroup()
                .addComponent(chk10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl11, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl9.setBackground(new java.awt.Color(255, 255, 255));
        pl9.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl10MouseClicked(evt);
            }
        });

        chk9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk9.setEnabled(false);

        javax.swing.GroupLayout pl9Layout = new javax.swing.GroupLayout(pl9);
        pl9.setLayout(pl9Layout);
        pl9Layout.setHorizontalGroup(
            pl9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl10, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addGroup(pl9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(chk9))))
        );
        pl9Layout.setVerticalGroup(
            pl9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl9Layout.createSequentialGroup()
                .addComponent(chk9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl10, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl16.setBackground(new java.awt.Color(255, 255, 255));
        pl16.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl17MouseClicked(evt);
            }
        });

        chk16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk16.setEnabled(false);

        javax.swing.GroupLayout pl16Layout = new javax.swing.GroupLayout(pl16);
        pl16.setLayout(pl16Layout);
        pl16Layout.setHorizontalGroup(
            pl16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pl16Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(chk16))))
        );
        pl16Layout.setVerticalGroup(
            pl16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl16Layout.createSequentialGroup()
                .addComponent(chk16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl17, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl15.setBackground(new java.awt.Color(255, 255, 255));
        pl15.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl16MouseClicked(evt);
            }
        });

        chk15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk15.setEnabled(false);

        javax.swing.GroupLayout pl15Layout = new javax.swing.GroupLayout(pl15);
        pl15.setLayout(pl15Layout);
        pl15Layout.setHorizontalGroup(
            pl15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pl15Layout.createSequentialGroup()
                        .addGap(0, 65, Short.MAX_VALUE)
                        .addComponent(chk15))))
        );
        pl15Layout.setVerticalGroup(
            pl15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl15Layout.createSequentialGroup()
                .addComponent(chk15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl16, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl14.setBackground(new java.awt.Color(255, 255, 255));
        pl14.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl15MouseClicked(evt);
            }
        });

        chk14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk14.setEnabled(false);

        javax.swing.GroupLayout pl14Layout = new javax.swing.GroupLayout(pl14);
        pl14.setLayout(pl14Layout);
        pl14Layout.setHorizontalGroup(
            pl14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl15, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addGroup(pl14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(chk14))))
        );
        pl14Layout.setVerticalGroup(
            pl14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl14Layout.createSequentialGroup()
                .addComponent(chk14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl15, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl13.setBackground(new java.awt.Color(255, 255, 255));
        pl13.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl14MouseClicked(evt);
            }
        });

        chk13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk13.setEnabled(false);

        javax.swing.GroupLayout pl13Layout = new javax.swing.GroupLayout(pl13);
        pl13.setLayout(pl13Layout);
        pl13Layout.setHorizontalGroup(
            pl13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl14, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addGroup(pl13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(chk13))))
        );
        pl13Layout.setVerticalGroup(
            pl13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl13Layout.createSequentialGroup()
                .addComponent(chk13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl14, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pl7.setBackground(new java.awt.Color(255, 255, 255));
        pl7.setPreferredSize(new java.awt.Dimension(90, 90));

        lblPl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPl8MouseClicked(evt);
            }
        });

        chk7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chk7.setEnabled(false);

        javax.swing.GroupLayout pl7Layout = new javax.swing.GroupLayout(pl7);
        pl7.setLayout(pl7Layout);
        pl7Layout.setHorizontalGroup(
            pl7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pl7Layout.createSequentialGroup()
                        .addGap(0, 65, Short.MAX_VALUE)
                        .addComponent(chk7))))
        );
        pl7Layout.setVerticalGroup(
            pl7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl7Layout.createSequentialGroup()
                .addComponent(chk7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblMas.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblMas.setForeground(new java.awt.Color(255, 255, 255));
        lblMas.setText(">");
        lblMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMasMouseClicked(evt);
            }
        });

        lblMenos.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblMenos.setForeground(new java.awt.Color(255, 255, 255));
        lblMenos.setText("<");
        lblMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenosMouseClicked(evt);
            }
        });

        lblPagina.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPagina.setText("1");
        lblPagina.setAlignmentY(0.0F);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Pagina:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblMenos)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pl14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pl15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblMas))
                            .addComponent(pl16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(pl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(pl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPagina)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMenos)
                            .addComponent(lblMas))
                        .addGap(124, 124, 124)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pl14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pl15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pl16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        lblUsuarioIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-user-folder-64.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(51, 0, 153));
        lblUsuario.setText("USUARIO");

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(51, 0, 153));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-logout-32.png"))); // NOI18N
        btnCerrar.setText("Cerrar Sesion");
        btnCerrar.setToolTipText("Cerrar la sesion actual");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblUsuarioIcon)
                .addGap(18, 18, 18)
                .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addGap(18, 18, 18))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addGap(9, 9, 9))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarioIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // BOTON CERRAR    

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
        new InicioSesion().setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

    // BOTONES INFERIORES (NUEVO, ELIMINAR, CARPETA, BUSCAR)    

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        new AgregarMarcador().setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        new TablaDeMarcadores().setVisible(true);
        TablaDeMarcadores.lblUsuarioVista.setText(lblUsuario.getText());
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (this.confirmarSeleccion()) {
            listaUrl = ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores);
            for (String tmp : listaUrl) {
                this.eliminarSeleccion(listaUrl);
                this.limpiarCuadros();
            }
            ConectorVista.actualizarMarcSesion();
            ConectorVista.actualizarVistaUsuario();
        } else {
            JOptionPane.showMessageDialog(this, "No se seleccionó ningun elemento", "No hay elementos marcados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarCarpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarpeActionPerformed
        if (this.confirmarSeleccion()) {
            listaUrl = ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores);
            List<Marcador> marcAnadidos = new ArrayList();
            for (String tmp : listaUrl) {
                this.anadirSeleccion(listaUrl, marcAnadidos);
                ConectorVista.actualizarVistaUsuario(); // sera necesario?
            }
            Sesion.marcadoresSeleccionados = marcAnadidos;
            new VistaCarpetas().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No se seleccionó ningun elemento", "No hay elementos marcados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarCarpeActionPerformed

    // BOTONES PARA CAMBIAR PAGINAS    

    private void lblMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMasMouseClicked
        int pagActual = Integer.parseInt(lblPagina.getText());

        this.limpiarCuadros();

        Usuario usr1 = Sesion.usuarioActivo;
        List<Marcador> lista = Sesion.todosLosMarcadores;

        pagMas = (lista.size() / 16) + 1; //  Calculo cuantas páginas tiene el usuario
        if (pagActual < pagMas) {
            pagActual += 1;
            lblPagina.setText("" + pagActual);
        }

        ConectorVista.activarVisualMas(pagActual, pagMas);
        ConectorVista.activarVisualMenos(pagActual);

        ConectorVista.pagina(usr1, pagActual, Sesion.todosLosMarcadores);
    }//GEN-LAST:event_lblMasMouseClicked

    private void lblMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenosMouseClicked
        int pagActual = Integer.parseInt(lblPagina.getText());

        this.limpiarCuadros();

        Usuario usr1 = Sesion.usuarioActivo;

        if (pagActual > 1) {
            pagActual -= 1;
            lblPagina.setText("" + pagActual);
        }

        ConectorVista.activarVisualMenos(pagActual);
        ConectorVista.activarVisualMas(pagActual, pagMas);

        ConectorVista.pagina(usr1, pagActual, Sesion.todosLosMarcadores);
    }//GEN-LAST:event_lblMenosMouseClicked

    // SELECCION DE MARCADORES    

    private void lblPl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl1MouseClicked
        if (lblPl1.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(0)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(0), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl1MouseClicked

    private void lblPl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl2MouseClicked
        if (lblPl2.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(1)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(1), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl2MouseClicked

    private void lblPl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl3MouseClicked
        if (lblPl3.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(2)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(2), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl3MouseClicked

    private void lblPl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl4MouseClicked
        if (lblPl4.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(3)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(3), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl4MouseClicked

    private void lblPl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl6MouseClicked
        if (lblPl6.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(4)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(4), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl6MouseClicked

    private void lblPl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl7MouseClicked
        if (lblPl7.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(5)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(5), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl7MouseClicked

    private void lblPl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl8MouseClicked
        if (lblPl8.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(6)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(6), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl8MouseClicked

    private void lblPl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl9MouseClicked
        if (lblPl9.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(7)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(7), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl9MouseClicked

    private void lblPl10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl10MouseClicked
        if (lblPl10.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(8)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(8), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl10MouseClicked

    private void lblPl11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl11MouseClicked
        if (lblPl11.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(9)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(9), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl11MouseClicked

    private void lblPl12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl12MouseClicked
        if (lblPl12.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(10)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(10), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl12MouseClicked

    private void lblPl13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl13MouseClicked
        if (lblPl13.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(11)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(11), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl13MouseClicked

    private void lblPl14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl14MouseClicked
        if (lblPl14.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(12)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(12), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl14MouseClicked

    private void lblPl15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl15MouseClicked
        if (lblPl15.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(13)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(13), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl15MouseClicked

    private void lblPl16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl16MouseClicked
        if (lblPl16.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(14)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(14), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl16MouseClicked

    private void lblPl17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPl17MouseClicked
        if (lblPl17.getText().isEmpty() == false) {
            try {
                Desktop.getDesktop().browse(new URI(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(15)));
                rg.actualizarFechaUso(ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores).get(15), Sesion.usuarioActivo);
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(this, "Error en la sintaxis ingresada", "Sintaxis invalida", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "En enlace ingresado no redirecciona", "Enlace invalido", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(VistaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblPl17MouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (this.contarSeleccionados() == 1) {
            listaUrl = ConectorVista.getUrlsPagina(Sesion.usuarioActivo, lblPagina.getText(), Sesion.todosLosMarcadores);
            Sesion.marcadorSeleccionado = this.obtenerMarcSeleccionado(listaUrl);
            new EditarMarcador().setVisible(true);
        } else if (this.contarSeleccionados() != 1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar 1 marcador para editar", "Seleccion invalida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCarpe;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    public static javax.swing.JCheckBox chk1;
    public static javax.swing.JCheckBox chk10;
    public static javax.swing.JCheckBox chk11;
    public static javax.swing.JCheckBox chk12;
    public static javax.swing.JCheckBox chk13;
    public static javax.swing.JCheckBox chk14;
    public static javax.swing.JCheckBox chk15;
    public static javax.swing.JCheckBox chk16;
    public static javax.swing.JCheckBox chk2;
    public static javax.swing.JCheckBox chk3;
    public static javax.swing.JCheckBox chk4;
    public static javax.swing.JCheckBox chk5;
    public static javax.swing.JCheckBox chk6;
    public static javax.swing.JCheckBox chk7;
    public static javax.swing.JCheckBox chk8;
    public static javax.swing.JCheckBox chk9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    public static javax.swing.JLabel lblMas;
    public static javax.swing.JLabel lblMenos;
    public static javax.swing.JLabel lblPagina;
    public static javax.swing.JLabel lblPl1;
    public static javax.swing.JLabel lblPl10;
    public static javax.swing.JLabel lblPl11;
    public static javax.swing.JLabel lblPl12;
    public static javax.swing.JLabel lblPl13;
    public static javax.swing.JLabel lblPl14;
    public static javax.swing.JLabel lblPl15;
    public static javax.swing.JLabel lblPl16;
    public static javax.swing.JLabel lblPl17;
    public static javax.swing.JLabel lblPl2;
    public static javax.swing.JLabel lblPl3;
    public static javax.swing.JLabel lblPl4;
    public static javax.swing.JLabel lblPl6;
    public static javax.swing.JLabel lblPl7;
    public static javax.swing.JLabel lblPl8;
    public static javax.swing.JLabel lblPl9;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioIcon;
    public static javax.swing.JPanel pl1;
    public static javax.swing.JPanel pl10;
    public static javax.swing.JPanel pl11;
    public static javax.swing.JPanel pl12;
    public static javax.swing.JPanel pl13;
    public static javax.swing.JPanel pl14;
    public static javax.swing.JPanel pl15;
    public static javax.swing.JPanel pl16;
    public static javax.swing.JPanel pl2;
    public static javax.swing.JPanel pl3;
    public static javax.swing.JPanel pl4;
    public static javax.swing.JPanel pl5;
    public static javax.swing.JPanel pl6;
    public static javax.swing.JPanel pl7;
    public static javax.swing.JPanel pl8;
    public static javax.swing.JPanel pl9;
    // End of variables declaration//GEN-END:variables

    // metodos de vista
    private void limpiarCuadros() {
        chk1.setEnabled(false);
        chk2.setEnabled(false);
        chk3.setEnabled(false);
        chk4.setEnabled(false);
        chk5.setEnabled(false);
        chk6.setEnabled(false);
        chk7.setEnabled(false);
        chk8.setEnabled(false);
        chk9.setEnabled(false);
        chk10.setEnabled(false);
        chk11.setEnabled(false);
        chk12.setEnabled(false);
        chk13.setEnabled(false);
        chk14.setEnabled(false);
        chk15.setEnabled(false);
        chk16.setEnabled(false);
        chk1.setSelected(false);
        chk2.setSelected(false);
        chk3.setSelected(false);
        chk4.setSelected(false);
        chk5.setSelected(false);
        chk6.setSelected(false);
        chk7.setSelected(false);
        chk8.setSelected(false);
        chk9.setSelected(false);
        chk10.setSelected(false);
        chk11.setSelected(false);
        chk12.setSelected(false);
        chk13.setSelected(false);
        chk14.setSelected(false);
        chk15.setSelected(false);
        chk16.setSelected(false);

        pl1.setBackground(new Color(255, 255, 255));
        pl2.setBackground(new Color(255, 255, 255));
        pl3.setBackground(new Color(255, 255, 255));
        pl4.setBackground(new Color(255, 255, 255));
        pl5.setBackground(new Color(255, 255, 255));
        pl6.setBackground(new Color(255, 255, 255));
        pl7.setBackground(new Color(255, 255, 255));
        pl8.setBackground(new Color(255, 255, 255));
        pl9.setBackground(new Color(255, 255, 255));
        pl10.setBackground(new Color(255, 255, 255));
        pl11.setBackground(new Color(255, 255, 255));
        pl12.setBackground(new Color(255, 255, 255));
        pl13.setBackground(new Color(255, 255, 255));
        pl14.setBackground(new Color(255, 255, 255));
        pl15.setBackground(new Color(255, 255, 255));
        pl16.setBackground(new Color(255, 255, 255));

        lblPl1.setText("");
        lblPl2.setText("");
        lblPl3.setText("");
        lblPl4.setText("");
        lblPl6.setText("");
        lblPl7.setText("");
        lblPl8.setText("");
        lblPl9.setText("");
        lblPl10.setText("");
        lblPl11.setText("");
        lblPl12.setText("");
        lblPl13.setText("");
        lblPl14.setText("");
        lblPl15.setText("");
        lblPl16.setText("");
        lblPl17.setText("");
    }

    private int contarSeleccionados() {
        int cont = 0;
        if (chk1.isSelected()) {
            cont++;
        }
        if (chk2.isSelected()) {
            cont++;
        }
        if (chk3.isSelected()) {
            cont++;
        }
        if (chk3.isSelected()) {
            cont++;
        }
        if (chk4.isSelected()) {
            cont++;
        }
        if (chk5.isSelected()) {
            cont++;
        }
        if (chk6.isSelected()) {
            cont++;
        }
        if (chk7.isSelected()) {
            cont++;
        }
        if (chk8.isSelected()) {
            cont++;
        }
        if (chk9.isSelected()) {
            cont++;
        }
        if (chk10.isSelected()) {
            cont++;
        }
        if (chk11.isSelected()) {
            cont++;
        }
        if (chk12.isSelected()) {
            cont++;
        }
        if (chk13.isSelected()) {
            cont++;
        }
        if (chk14.isSelected()) {
            cont++;
        }
        if (chk15.isSelected()) {
            cont++;
        }
        if (chk16.isSelected()) {
            cont++;
        }
        return cont;

    }

    private boolean confirmarSeleccion() {
        if (chk1.isSelected() || chk2.isSelected() || chk3.isSelected() || chk4.isSelected() || chk5.isSelected() || chk6.isSelected()
                || chk7.isSelected() || chk8.isSelected() || chk9.isSelected() || chk10.isSelected() || chk11.isSelected() || chk12.isSelected()
                || chk13.isSelected() || chk14.isSelected() || chk15.isSelected() || chk16.isSelected()) {
            return true;
        } else {
            return false;
        }

    }

    private void anadirSeleccion(List<String> urls, List<Marcador> marcadores) {

        if (chk1.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(0)));
        }
        if (chk2.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(1)));
        }
        if (chk3.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(2)));
        }
        if (chk4.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(3)));
        }
        if (chk5.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(4)));
        }
        if (chk6.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(5)));
        }
        if (chk7.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(6)));
        }
        if (chk8.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(7)));
        }
        if (chk9.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(8)));
        }
        if (chk10.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(9)));
        }
        if (chk11.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(10)));
        }
        if (chk12.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(11)));
        }
        if (chk13.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(12)));
        }
        if (chk14.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(13)));
        }
        if (chk15.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(14)));
        }
        if (chk16.isSelected()) {
            marcadores.add(rg.consultarMarcador(urls.get(15)));
        }
    }

    private void eliminarSeleccion(List<String> urls) {
        if (chk1.isSelected()) {
            rg.borrarMarcador(urls.get(0), Sesion.usuarioActivo);
        }
        if (chk2.isSelected()) {
            rg.borrarMarcador(urls.get(1), Sesion.usuarioActivo);
        }
        if (chk3.isSelected()) {
            rg.borrarMarcador(urls.get(2), Sesion.usuarioActivo);
        }
        if (chk4.isSelected()) {
            rg.borrarMarcador(urls.get(3), Sesion.usuarioActivo);
        }
        if (chk5.isSelected()) {
            rg.borrarMarcador(urls.get(4), Sesion.usuarioActivo);
        }
        if (chk6.isSelected()) {
            rg.borrarMarcador(urls.get(5), Sesion.usuarioActivo);
        }
        if (chk7.isSelected()) {
            rg.borrarMarcador(urls.get(6), Sesion.usuarioActivo);
        }
        if (chk8.isSelected()) {
            rg.borrarMarcador(urls.get(7), Sesion.usuarioActivo);
        }
        if (chk9.isSelected()) {
            rg.borrarMarcador(urls.get(8), Sesion.usuarioActivo);
        }
        if (chk10.isSelected()) {
            rg.borrarMarcador(urls.get(9), Sesion.usuarioActivo);
        }
        if (chk11.isSelected()) {
            rg.borrarMarcador(urls.get(10), Sesion.usuarioActivo);
        }
        if (chk12.isSelected()) {
            rg.borrarMarcador(urls.get(11), Sesion.usuarioActivo);
        }
        if (chk13.isSelected()) {
            rg.borrarMarcador(urls.get(12), Sesion.usuarioActivo);
        }
        if (chk14.isSelected()) {
            rg.borrarMarcador(urls.get(13), Sesion.usuarioActivo);
        }
        if (chk15.isSelected()) {
            rg.borrarMarcador(urls.get(14), Sesion.usuarioActivo);
        }
        if (chk16.isSelected()) {
            rg.borrarMarcador(urls.get(15), Sesion.usuarioActivo);
        }
    }

    private Marcador obtenerMarcSeleccionado(List<String> urls) {

        Marcador marcSeleccionado = new Marcador();

        if (chk1.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(0));
        }
        if (chk2.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(1));
        }
        if (chk3.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(2));
        }
        if (chk4.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(3));
        }
        if (chk5.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(4));
        }
        if (chk6.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(5));
        }
        if (chk7.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(6));
        }
        if (chk8.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(7));
        }
        if (chk9.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(8));
        }
        if (chk10.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(9));
        }
        if (chk11.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(10));
        }
        if (chk12.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(11));
        }
        if (chk13.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(12));
        }
        if (chk14.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(13));
        }
        if (chk15.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(14));
        }
        if (chk16.isSelected()) {
            marcSeleccionado = rg.consultarMarcador(urls.get(15));
        }
        return marcSeleccionado;
    }

}
