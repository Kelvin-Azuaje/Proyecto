
package Interfaces;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author AZUAJE
 * 
 */
public class Traslados extends javax.swing.JFrame {
    static Connection conexion;
    static Statement estatuto;
    
    Conexion_BD cn;
    String Codigo, Equipo, Fecha1, Ubicacion, Sucursales, Destino, Fecha2;
    Conexion cc= new  Conexion();
    Connection ct= cc.enlazar();
    
    public Traslados() {
        initComponents();
        setLocationRelativeTo(null);
        Deshabilitar();
        Deshabilitar2();
        cn = new Conexion_BD();
        cn.conectar();
    }

    public void Habilitar_Internos(){
        Codigo_Internos.setEnabled(true);
        Buscar2.setEnabled(true);
        Equipo_Internos.setEnabled(true);
        Fecha1_Internos.setEnabled(true);
        Fecha2_Internos.setEnabled(true);
        Ubicacion_Internos.setEnabled(true);
        Destino_Internos.setEnabled(true);
        Nuevo2.setEnabled(false);
        Guardar2.setEnabled(true);
        Limpiar2.setEnabled(true);
    }
    
    public void Habilitar_Externos(){
        Codigo_Externos.setEnabled(true);
        Buscar1.setEnabled(true);
        Equipo_Externos.setEnabled(true);
        Fecha1_Externos.setEnabled(true);
        Fecha2_Externos.setEnabled(true);
        Ubicacion_Externos.setEnabled(true);
        Sucursal.setEnabled(true);
        Destino_Externos.setEnabled(true);
        Nuevo1.setEnabled(false);
        Guardar1.setEnabled(true);
        Limpiar1.setEnabled(true);
    }
    
    public void Guardar_Externos(){
        Codigo = Codigo_Externos.getText();
        Equipo = Equipo_Externos.getText();
        Fecha1 = Fecha1_Externos.getText();
        Ubicacion = Ubicacion_Externos.getSelectedItem().toString();
        Sucursales = Sucursal.getSelectedItem().toString();
        Destino = Destino_Externos.getSelectedItem().toString();
        Fecha2 = Fecha2_Externos.getText();
        if (Codigo.equals("") || Equipo.equals("") || Fecha1.equals("") || Ubicacion.equals("") || Sucursales.equals("") || Destino.equals("") || Fecha2.equals("")){
            JOptionPane.showMessageDialog(this, "DEBE LLENAR TODOS LOS CAMPOS..!", "ADVERTENCIA..!", JOptionPane.ERROR_MESSAGE);
        } else {
            String valores = "'"+Codigo+"','"+Equipo+"','"+Fecha1+"','"+Ubicacion+"','"+Sucursales+"','"+Destino+"','"+Fecha2+"'";
            cn.guardar("tras_externos", valores);
        }
        
    }
    
    public void Guardar_Internos(){
        Codigo = Codigo_Internos.getText();
        Equipo = Equipo_Internos.getText();
        Fecha1 = Fecha1_Internos.getText();
        Ubicacion = Ubicacion_Internos.getSelectedItem().toString();
        Destino = Destino_Internos.getSelectedItem().toString();
        Fecha2 = Fecha2_Internos.getText();
        if (Codigo.equals("") || Equipo.equals("") || Fecha1.equals("") || Ubicacion.equals("") || Destino.equals("") || Fecha2.equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE LLENAR TODOS LOS CAMPOS..!", "ADVERTENCIA..!", JOptionPane.ERROR_MESSAGE);
        } else {
            String valores = "'"+Codigo+"','"+Equipo+"','"+Fecha1+"','"+Ubicacion+"','"+Destino+"','"+Fecha2+"'";
            cn.guardar("tras_internos", valores);
        }
        
    }
    
    public void Limpiar_Externos(){
        Codigo_Externos.setText("");
        Equipo_Externos.setText("");
        Fecha1_Externos.setText("");
        Fecha2_Externos.setText("");
        Ubicacion_Externos.setSelectedIndex(0);
        Sucursal.setSelectedIndex(0);
        Destino_Externos.setSelectedIndex(0);
        Deshabilitar();
    }
    
    public void Limpiar_Internos(){
        Codigo_Internos.setText("");
        Buscar2.setText("");
        Equipo_Internos.setText("");
        Fecha1_Internos.setText("");
        Fecha2_Internos.setText("");
        Ubicacion_Internos.setSelectedIndex(0);
        Destino_Internos.setSelectedIndex(0);
        Deshabilitar2();
    }
    
    public void Deshabilitar(){
        Codigo_Externos.setEnabled(false);
        Buscar1.setEnabled(false);
        Equipo_Externos.setEnabled(false);
        Fecha1_Externos.setEnabled(false);
        Fecha2_Externos.setEnabled(false);
        Ubicacion_Externos.setEnabled(false);
        Sucursal.setEnabled(false);
        Destino_Externos.setEnabled(false);
        Nuevo1.setEnabled(true);
        Guardar1.setEnabled(false);
        Limpiar1.setEnabled(false);
    }
    
    public void Deshabilitar2(){
        Codigo_Internos.setEnabled(false);
        Buscar2.setEnabled(false);
        Equipo_Internos.setEnabled(false);
        Fecha1_Internos.setEnabled(false);
        Fecha2_Internos.setEnabled(false);
        Ubicacion_Internos.setEnabled(false);
        Destino_Internos.setEnabled(false);
        Nuevo2.setEnabled(true);
        Guardar2.setEnabled(false);
        Limpiar2.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        panel2 = new org.edisoncor.gui.panel.Panel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Ubicacion_Externos = new javax.swing.JComboBox();
        Destino_Externos = new javax.swing.JComboBox();
        Fecha1_Externos = new javax.swing.JFormattedTextField();
        Fecha2_Externos = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Sucursal = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        Codigo_Externos = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Equipo_Externos = new javax.swing.JTextField();
        Buscar1 = new javax.swing.JLabel();
        Guardar1 = new javax.swing.JLabel();
        Nuevo1 = new javax.swing.JLabel();
        Limpiar1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Ubicacion_Internos = new javax.swing.JComboBox();
        Destino_Internos = new javax.swing.JComboBox();
        Fecha2_Internos = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Codigo_Internos = new javax.swing.JFormattedTextField();
        Buscar2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Equipo_Internos = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        Fecha1_Internos = new javax.swing.JFormattedTextField();
        Nuevo2 = new javax.swing.JLabel();
        Guardar2 = new javax.swing.JLabel();
        Limpiar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("TRASLADOS");
        setResizable(false);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(38, 116, 38));

        panel2.setColorPrimario(new java.awt.Color(38, 116, 38));
        panel2.setColorSecundario(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/48x48/Home.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/unnamed.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(47, 131, 47), 3), "EXTERNOS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 20), new java.awt.Color(47, 131, 47))); // NOI18N

        Ubicacion_Externos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ubicacion_Externos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "SISTEMAS & TI", "TALENTO HUMANO", "CHASS", "LINEA DE CAJA", "CAJA PRINCIPAL", "COMPRA DE PERECEDEROS", "COMPRA NO PERECEDEROS", "LIQUIDACIÓN", "DIGITALIZACIÓN", "SUPERVISORES", "SUB-GERENTES", "RECEPTOR DE PERECEDEROS", "RECEPTOR NO PERECEDEROS", "PREVENCION Y CONTROL", "CCTV", "HABLADORES", "ENFERMERIA", "CHARCUTERIA", "ATENCIÓN AL CLIENTE" }));
        Ubicacion_Externos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Destino_Externos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Destino_Externos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "ROTARIA ", "MADRE JUANA", "MERIDA ", "BARINAS", "SANTA BARBARA", "BARQUISIMETO", "ACARIGUA", "CABIMAS", "SAN JOSESITO" }));
        Destino_Externos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Destino_Externos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Destino_ExternosActionPerformed(evt);
            }
        });

        Fecha1_Externos.setEditable(false);
        Fecha1_Externos.setBackground(new java.awt.Color(255, 255, 255));
        Fecha1_Externos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            Fecha1_Externos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ## /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Fecha1_Externos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Fecha1_Externos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha1_ExternosActionPerformed(evt);
            }
        });

        Fecha2_Externos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            Fecha2_Externos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ## /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Fecha2_Externos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("      UBICACIÓN:    ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText(" SUCURSAL DESTINO:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("ULTIMO TRASLADO:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("         FECHA:        ");

        Sucursal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Sucursal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "ROTARIA ", "MADRE JUANA", "MERIDA ", "BARINAS", "SANTA BARBARA", "BARQUISIMETO", "ACARIGUA", "CABIMAS", "SAN JOSESITO", " ", " " }));
        Sucursal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("      SUCURSAL:    ");

        Codigo_Externos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            Codigo_Externos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   759-150-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Codigo_Externos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("         EQUIPO:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("CODIGO DEL EQUIPO:");

        Equipo_Externos.setEditable(false);
        Equipo_Externos.setBackground(new java.awt.Color(255, 255, 255));
        Equipo_Externos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Equipo_Externos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Buscar1.setBackground(new java.awt.Color(255, 255, 255));
        Buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Search.png"))); // NOI18N
        Buscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Buscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buscar1MouseClicked(evt);
            }
        });

        Guardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Floppy.png"))); // NOI18N
        Guardar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Guardar1MouseClicked(evt);
            }
        });

        Nuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Add.png"))); // NOI18N
        Nuevo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nuevo1MouseClicked(evt);
            }
        });

        Limpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Refresh.png"))); // NOI18N
        Limpiar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Limpiar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sucursal, 0, 155, Short.MAX_VALUE)
                            .addComponent(Fecha2_Externos)
                            .addComponent(Destino_Externos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(10, 10, 10))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(jLabel14)))
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ubicacion_Externos, 0, 1, Short.MAX_VALUE)
                            .addComponent(Fecha1_Externos)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Codigo_Externos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Buscar1))
                            .addComponent(Equipo_Externos, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(Nuevo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Guardar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Limpiar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nuevo1)
                    .addComponent(Guardar1)
                    .addComponent(Limpiar1))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Codigo_Externos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18))
                    .addComponent(Buscar1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(Equipo_Externos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha1_Externos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ubicacion_Externos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Destino_Externos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha2_Externos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 3, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(47, 131, 47));
        jLabel7.setText("TRASLADOS ");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(47, 131, 47), 3), "INTERNOS", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 20), new java.awt.Color(47, 131, 47))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Ubicacion_Internos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ubicacion_Internos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "SISTEMAS & TI", "TALENTO HUMANO", "CHASS", "LINEA DE CAJA", "CAJA PRINCIPAL", "COMPRA DE PERECEDEROS", "COMPRA NO PERECEDEROS", "LIQUIDACIÓN", "DIGITALIZACIÓN", "SUPERVISORES", "SUB-GERENTES", "RECEPTOR DE PERECEDEROS", "RECEPTOR NO PERECEDEROS", "PREVENCION Y CONTROL", "CCTV", "HABLADORES", "ENFERMERIA", "CHARCUTERIA", "ATENCIÓN AL CLIENTE" }));
        Ubicacion_Internos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ubicacion_Internos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ubicacion_InternosActionPerformed(evt);
            }
        });

        Destino_Internos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Destino_Internos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "SISTEMAS & TI", "TALENTO HUMANO", "CHASS", "LINEA DE CAJA", "CAJA PRINCIPAL", "COMPRA DE PERECEDEROS", "COMPRA NO PERECEDEROS", "LIQUIDACIÓN", "DIGITALIZACIÓN", "SUPERVISORES", "SUB-GERENTES", "RECEPTOR DE PERECEDEROS", "RECEPTOR NO PERECEDEROS", "PREVENCION Y CONTROL", "CCTV", "HABLADORES", "ENFERMERIA", "CHARCUTERIA", "ATENCIÓN AL CLIENTE" }));
        Destino_Internos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Destino_Internos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Destino_InternosActionPerformed(evt);
            }
        });

        Fecha2_Internos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            Fecha2_Internos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ## /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Fecha2_Internos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fecha2_Internos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha2_InternosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("      UBICACIÓN:    ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("       DESTINO:      ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("         FECHA:        ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("CODIGO DEL EQUIPO:");

        Codigo_Internos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            Codigo_Internos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   759-150-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Codigo_Internos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Buscar2.setBackground(new java.awt.Color(255, 255, 255));
        Buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Search.png"))); // NOI18N
        Buscar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Buscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buscar2MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("         EQUIPO:");

        Equipo_Internos.setEditable(false);
        Equipo_Internos.setBackground(new java.awt.Color(255, 255, 255));
        Equipo_Internos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Equipo_Internos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("ULTIMO TRASLADO:");

        Fecha1_Internos.setEditable(false);
        Fecha1_Internos.setBackground(new java.awt.Color(255, 255, 255));
        Fecha1_Internos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            Fecha1_Internos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ## /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Fecha1_Internos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Fecha1_Internos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha1_InternosActionPerformed(evt);
            }
        });

        Nuevo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Add.png"))); // NOI18N
        Nuevo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nuevo2MouseClicked(evt);
            }
        });

        Guardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Floppy.png"))); // NOI18N
        Guardar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Guardar2MouseClicked(evt);
            }
        });

        Limpiar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Refresh.png"))); // NOI18N
        Limpiar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Limpiar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fecha2_Internos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ubicacion_Internos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Destino_Internos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Equipo_Internos)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Codigo_Internos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Buscar2))
                            .addComponent(Fecha1_Internos))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(Nuevo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Guardar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Limpiar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nuevo2)
                    .addComponent(Guardar2)
                    .addComponent(Limpiar2))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Codigo_Internos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20))
                    .addComponent(Buscar2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(Equipo_Internos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha1_Internos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ubicacion_Internos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Destino_Internos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha2_Internos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(143, 143, 143)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Principal obj = new Principal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void Fecha1_ExternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha1_ExternosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha1_ExternosActionPerformed

    private void Buscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscar1MouseClicked

    private void Destino_InternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Destino_InternosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Destino_InternosActionPerformed

    private void Buscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscar2MouseClicked

    private void Fecha1_InternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha1_InternosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha1_InternosActionPerformed

    private void Fecha2_InternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha2_InternosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha2_InternosActionPerformed

    private void Ubicacion_InternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ubicacion_InternosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ubicacion_InternosActionPerformed

    private void Nuevo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nuevo2MouseClicked
        Habilitar_Internos();
    }//GEN-LAST:event_Nuevo2MouseClicked

    private void Nuevo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nuevo1MouseClicked
        Habilitar_Externos();
    }//GEN-LAST:event_Nuevo1MouseClicked

    private void Destino_ExternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Destino_ExternosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Destino_ExternosActionPerformed

    private void Limpiar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Limpiar1MouseClicked
        Limpiar_Externos();
    }//GEN-LAST:event_Limpiar1MouseClicked

    private void Limpiar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Limpiar2MouseClicked
        Limpiar_Internos();
    }//GEN-LAST:event_Limpiar2MouseClicked

    private void Guardar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Guardar1MouseClicked
        Guardar_Externos();
    }//GEN-LAST:event_Guardar1MouseClicked

    private void Guardar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Guardar2MouseClicked
        Guardar_Internos();
    }//GEN-LAST:event_Guardar2MouseClicked

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
            java.util.logging.Logger.getLogger(Traslados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Traslados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Traslados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Traslados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Traslados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar1;
    private javax.swing.JLabel Buscar2;
    private javax.swing.JFormattedTextField Codigo_Externos;
    private javax.swing.JFormattedTextField Codigo_Internos;
    private javax.swing.JComboBox Destino_Externos;
    private javax.swing.JComboBox Destino_Internos;
    private javax.swing.JTextField Equipo_Externos;
    private javax.swing.JTextField Equipo_Internos;
    private javax.swing.JFormattedTextField Fecha1_Externos;
    private javax.swing.JFormattedTextField Fecha1_Internos;
    private javax.swing.JFormattedTextField Fecha2_Externos;
    private javax.swing.JFormattedTextField Fecha2_Internos;
    private javax.swing.JLabel Guardar1;
    private javax.swing.JLabel Guardar2;
    private javax.swing.JLabel Limpiar1;
    private javax.swing.JLabel Limpiar2;
    private javax.swing.JLabel Nuevo1;
    private javax.swing.JLabel Nuevo2;
    private javax.swing.JComboBox Sucursal;
    private javax.swing.JComboBox Ubicacion_Externos;
    private javax.swing.JComboBox Ubicacion_Internos;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
