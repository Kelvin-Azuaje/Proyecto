
package Interfaces;


import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author AZUAJE
 * 
 */
public class Mantenimiento extends javax.swing.JFrame {
    static Connection conexion;
    static Statement estatuto;
    
    Conexion_BD cn;
    String Codigo, Equipo, Fecha1, Observa, Ubicacion, Fecha2;
    Conexion cc= new  Conexion();
    Connection ct= cc.enlazar();
    Conex conex = new Conex();
    
    public Mantenimiento() {
        initComponents();
        setLocationRelativeTo(null);
        Deshabilitar_Entrada();
        Deshabilitar_Salida();
        cn = new Conexion_BD();
        cn.conectar();
    }

   

    public void Limpiar_Entrada(){
        CodigoE.setText("");
        EquipoE.setText("");
        Fecha1_E.setText("");
        UbicacionE.setSelectedIndex(0);
        FallaE.setText("");
        Fecha2_E.setText("");
        Deshabilitar_Entrada();
    }
    
    public void Limpiar_Salida(){
        CodigoS.setText("");
        EquipoS.setText("");
        UbicacionS.setText("");
        Fecha2_S.setText("");
        Observaciones.setText("");
        Fecha1_S.setText("");
        Deshabilitar_Salida();
    }
    
    public void Habilitar_Entrada(){
        CodigoE.setEnabled(true);
        Buscar1.setEnabled(true);
        EquipoE.setEnabled(true);
        Fecha1_E.setEnabled(true);
        FallaE.setEnabled(true);
        UbicacionE.setEnabled(true);
        Fecha2_E.setEnabled(true);
        btn_Habilitar1.setEnabled(false);
        btn_Guardar1.setEnabled(true);
        btn_Limpiar1.setEnabled(true);
        Deshabilitar_Salida();
    }
    
    public void Habilitar_Salida(){
        CodigoS.setEnabled(true);
        Buscar2.setEnabled(true);
        EquipoS.setEnabled(true);
        Fecha2_S.setEnabled(true);
        Observaciones.setEnabled(true);
        UbicacionS.setEnabled(true);
        Fecha1_S.setEnabled(true);
        btn_Habilitar2.setEnabled(false);
        btn_Guardar2.setEnabled(true);
        btn_Limpiar2.setEnabled(true);
        Deshabilitar_Entrada();
    }
    
    public void Deshabilitar_Entrada(){
        CodigoE.setEnabled(false);
        Buscar1.setEnabled(false);
        EquipoE.setEnabled(false);
        Fecha1_E.setEnabled(false);
        FallaE.setEnabled(false);
        UbicacionE.setEnabled(false);
        Fecha2_E.setEnabled(false);
        btn_Habilitar1.setEnabled(true);
        btn_Guardar1.setEnabled(false);
        btn_Limpiar1.setEnabled(false);
    }
    
    public void Deshabilitar_Salida(){
        CodigoS.setEnabled(false);
        Buscar2.setEnabled(false);
        EquipoS.setEnabled(false);
        Fecha2_S.setEnabled(false);
        Observaciones.setEnabled(false);
        UbicacionS.setEnabled(false);
        Fecha1_S.setEnabled(false);
        btn_Habilitar2.setEnabled(true);
        btn_Guardar2.setEnabled(false);
        btn_Limpiar2.setEnabled(false);
    }
    
    public void Guardar_Entrada(){
        Codigo = CodigoE.getText();
        Equipo = EquipoE.getText();
        Fecha1 = Fecha1_E.getText();
        Observa = FallaE.getText();
        Ubicacion = UbicacionE.getSelectedItem().toString();
        Fecha2 = Fecha2_E.getText();
        if (EquipoE.equals("") || Fecha1.equals("") || Observa.equals("") || Ubicacion.equals("") || Fecha2.equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE LLENAR TODOS LOS CAMPOS..!", "ADVERTENCIA..!", JOptionPane.ERROR_MESSAGE);
        } else {
            String valores = "'"+Codigo+"','"+Equipo+"','"+Fecha1+"','"+Observa+"','"+Ubicacion+"','"+Fecha2+"'";
            cn.guardar("averiados", valores);
        }
    }
    
    public void Guardar_Salida(){
        Codigo = CodigoS.getText();
        Equipo = EquipoS.getText();
        Fecha1 = Fecha1_S.getText();
        Observa = Observaciones.getText();
        Ubicacion = UbicacionS.getText();
        Fecha2 = Fecha2_S.getText();
        if (Codigo.equals("") || Equipo.equals("") || Fecha1.equals("") || Observa.equals("") || Ubicacion.equals("") || Fecha2.equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE LLENAR TODOS LOS CAMPOS..!", "ADVERTENCIA..!", JOptionPane.ERROR_MESSAGE);
        } else {
            String valores = "'"+Codigo+"','"+Equipo+"','"+Fecha1+"','"+Observa+"','"+Ubicacion+"','"+Fecha2+"'";
            cn.guardar("averiados", valores);
        }
    }
    
    public void Equipo_Entrada(){
        String TraerCodigoEntrada = CodigoE.getText();
        conex.setQuery("select * from equipos where CODIGO = '"+TraerCodigoEntrada+"'");
        Equipos equi = conex.getEquipos1();
        EquipoE.setText(equi.getTipo());
        Fecha1_E.setText(equi.getFecha());
    }
    
    public void Equipo_Salida(){
        String TraerCodigoSalida = CodigoS.getText();
        conex.setQuery("select * from averiados where CODIGO = '"+TraerCodigoSalida+"'");
        Equipos2 equi2 = conex.getEquipos2();
        EquipoS.setText(equi2.getEquipo());
        Fecha2_S.setText(equi2.getFecha2());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        panel2 = new org.edisoncor.gui.panel.Panel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Fecha1_E = new javax.swing.JFormattedTextField();
        Fecha2_E = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        UbicacionE = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        CodigoE = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        EquipoE = new javax.swing.JTextField();
        Buscar1 = new javax.swing.JLabel();
        btn_Guardar1 = new javax.swing.JLabel();
        btn_Habilitar1 = new javax.swing.JLabel();
        btn_Limpiar1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FallaE = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        CodigoS = new javax.swing.JFormattedTextField();
        Buscar2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        EquipoS = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Fecha2_S = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Observaciones = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Fecha1_S = new javax.swing.JFormattedTextField();
        btn_Habilitar2 = new javax.swing.JLabel();
        btn_Guardar2 = new javax.swing.JLabel();
        btn_Limpiar2 = new javax.swing.JLabel();
        UbicacionS = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANTENIMIENTO");
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
                .addGap(357, 357, 357)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/unnamed.jpg"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 3, 41)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(47, 131, 47));
        jLabel7.setText("MANTENIMIENTO ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(47, 131, 47), 3), "ENTRADA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(47, 131, 47))); // NOI18N

        Fecha1_E.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            Fecha1_E.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ## /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Fecha1_E.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Fecha1_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha1_EActionPerformed(evt);
            }
        });

        Fecha2_E.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            Fecha2_E.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ## /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Fecha2_E.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("      OBSERVACIONES:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("ULTIMO MANTENIMIENTO:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("    FECHA DE ENTRADA:");

        UbicacionE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UbicacionE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "LINEA DE CAJA", "LIQUIDACION ", "CAJA PRINCIPAL", "HABLADORES", "SUPERVISORES", "SUBGERENTES", "GERENTE", "ATENCION AL CLIENTE", "PERECEDEROS", "NO PERECEDEROS", "ENFERMERIA", "CHASS", "DIGITALIZACION", "MANTENIMIENTO", "PREVENCION Y CONTROL", "CCTV", "CARNICERIA", "CHARCUTERIA", "PESCADERIA" }));
        UbicacionE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("          UBICACIÓN:         ");

        CodigoE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            CodigoE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   759-150-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CodigoE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("            EQUIPO:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("   CODIGO DEL EQUIPO:");

        EquipoE.setEditable(false);
        EquipoE.setBackground(new java.awt.Color(255, 255, 255));
        EquipoE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EquipoE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Buscar1.setBackground(new java.awt.Color(255, 255, 255));
        Buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Search.png"))); // NOI18N
        Buscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Buscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buscar1MouseClicked(evt);
            }
        });

        btn_Guardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Floppy.png"))); // NOI18N
        btn_Guardar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Guardar1MouseClicked(evt);
            }
        });

        btn_Habilitar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Add.png"))); // NOI18N
        btn_Habilitar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Habilitar1MouseClicked(evt);
            }
        });

        btn_Limpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Refresh.png"))); // NOI18N
        btn_Limpiar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Limpiar1MouseClicked(evt);
            }
        });

        FallaE.setColumns(20);
        FallaE.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        FallaE.setRows(5);
        FallaE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(FallaE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha2_E)
                            .addComponent(UbicacionE, 0, 1, Short.MAX_VALUE)))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Fecha1_E)
                            .addComponent(EquipoE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CodigoE, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Buscar1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Habilitar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Guardar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Limpiar1)
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buscar1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CodigoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EquipoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Fecha1_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UbicacionE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha2_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Habilitar1)
                    .addComponent(btn_Guardar1)
                    .addComponent(btn_Limpiar1))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(47, 131, 47), 3), "SALIDA", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(47, 131, 47))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("   CODIGO DEL EQUIPO:");

        CodigoS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            CodigoS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   759-150-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CodigoS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Buscar2.setBackground(new java.awt.Color(255, 255, 255));
        Buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Search.png"))); // NOI18N
        Buscar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Buscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buscar2MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("            EQUIPO:");

        EquipoS.setEditable(false);
        EquipoS.setBackground(new java.awt.Color(255, 255, 255));
        EquipoS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EquipoS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("    FECHA DE ENTRADA:");

        Fecha2_S.setEditable(false);
        Fecha2_S.setBackground(new java.awt.Color(255, 255, 255));
        Fecha2_S.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            Fecha2_S.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ## /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Fecha2_S.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Fecha2_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha2_SActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("       OBSERVACIONES:     ");

        Observaciones.setColumns(20);
        Observaciones.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Observaciones.setRows(5);
        Observaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(Observaciones);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("          UBICACIÓN:         ");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("      FECHA DE SALIDA:");

        Fecha1_S.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            Fecha1_S.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ## /  ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Fecha1_S.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btn_Habilitar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Add.png"))); // NOI18N
        btn_Habilitar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Habilitar2MouseClicked(evt);
            }
        });

        btn_Guardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Floppy.png"))); // NOI18N
        btn_Guardar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Guardar2MouseClicked(evt);
            }
        });

        btn_Limpiar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes.20x20/Refresh.png"))); // NOI18N
        btn_Limpiar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Limpiar2MouseClicked(evt);
            }
        });

        UbicacionS.setEditable(false);
        UbicacionS.setBackground(new java.awt.Color(255, 255, 255));
        UbicacionS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UbicacionS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Fecha1_S)
                                    .addComponent(UbicacionS)
                                    .addComponent(Fecha2_S)
                                    .addComponent(EquipoS)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(CodigoS, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Buscar2))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btn_Habilitar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Guardar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Limpiar2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buscar2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CodigoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EquipoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Fecha2_S, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UbicacionS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha1_S, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Habilitar2)
                    .addComponent(btn_Guardar2)
                    .addComponent(btn_Limpiar2))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Fecha1_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha1_EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha1_EActionPerformed

    private void Buscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscar1MouseClicked
        Equipo_Entrada();
    }//GEN-LAST:event_Buscar1MouseClicked

    private void btn_Habilitar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Habilitar1MouseClicked
        Habilitar_Entrada();
    }//GEN-LAST:event_btn_Habilitar1MouseClicked

    private void btn_Limpiar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Limpiar1MouseClicked
        Limpiar_Entrada();
    }//GEN-LAST:event_btn_Limpiar1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Principal obj = new Principal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void Buscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscar2MouseClicked
        Equipo_Salida();
    }//GEN-LAST:event_Buscar2MouseClicked

    private void Fecha2_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha2_SActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha2_SActionPerformed

    private void btn_Habilitar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Habilitar2MouseClicked
        Habilitar_Salida();
    }//GEN-LAST:event_btn_Habilitar2MouseClicked

    private void btn_Limpiar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Limpiar2MouseClicked
        Limpiar_Salida();
    }//GEN-LAST:event_btn_Limpiar2MouseClicked

    private void btn_Guardar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Guardar1MouseClicked
        Guardar_Entrada();
    }//GEN-LAST:event_btn_Guardar1MouseClicked

    private void btn_Guardar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Guardar2MouseClicked
        Guardar_Salida();
    }//GEN-LAST:event_btn_Guardar2MouseClicked

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
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar1;
    private javax.swing.JLabel Buscar2;
    private javax.swing.JFormattedTextField CodigoE;
    private javax.swing.JFormattedTextField CodigoS;
    private javax.swing.JTextField EquipoE;
    private javax.swing.JTextField EquipoS;
    private javax.swing.JTextArea FallaE;
    private javax.swing.JFormattedTextField Fecha1_E;
    private javax.swing.JFormattedTextField Fecha1_S;
    private javax.swing.JFormattedTextField Fecha2_E;
    private javax.swing.JFormattedTextField Fecha2_S;
    private javax.swing.JTextArea Observaciones;
    private javax.swing.JComboBox UbicacionE;
    private javax.swing.JTextField UbicacionS;
    private javax.swing.JLabel btn_Guardar1;
    private javax.swing.JLabel btn_Guardar2;
    private javax.swing.JLabel btn_Habilitar1;
    private javax.swing.JLabel btn_Habilitar2;
    private javax.swing.JLabel btn_Limpiar1;
    private javax.swing.JLabel btn_Limpiar2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    // End of variables declaration//GEN-END:variables

    void setTipo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
