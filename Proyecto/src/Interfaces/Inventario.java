
package Interfaces;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AZUAJE
 * 
 */
public class Inventario extends javax.swing.JFrame {

    // Estas dos variables son para el formato de las tablas a mostrar en patalla
    Statement sent;
    DefaultTableModel model;
    //***************************************************************************
    
    //Estas variables son para crear el PDF con los codigos de barras
    PreparedStatement state;
    ResultSet rst;
    Connection cone;
    Image img;
    //**************************************************************************
    
    Conexion cc= new  Conexion();
    Connection ct= cc.enlazar();
    
    public Inventario() {
        initComponents();
        setLocationRelativeTo(null);
        Externos.setEnabled(false);
        Internos.setEnabled(false);
        txt_PDF.setEnabled(false);
    }
    
    public void Mostrar_Funcionales(){
        DefaultTableModel modelo1=  new DefaultTableModel(); //se crea un nuevo modelo para la tabla, cambiando el predeterminado
        modelo1.addColumn("CODIGO");
        modelo1.addColumn("TIPO");
        modelo1.addColumn("DESCRIPCIÓN");
        modelo1.addColumn("DESTINO");// agrega una columna en la tabla con el no,bre que esta dentro de las comillas
        tabla_Equipos.setModel(modelo1);
        String []datos= new String[4]; //se indican cuantas columnas se mostraran
        try {
            Statement st= ct.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM equipos"); // se indica de que tabla se tomaran los datos para mostrar
            while(rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(4);
                //indica la posicion de la creacion de la columna y de cual fila de la tabla de la base de datos se tomara la informacion
                modelo1.addRow(datos); // agrega en la tabla las columnas solicitadas
            }
            tabla_Equipos.setModel(modelo1);
        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            //condicion de excepcion en caso de que exista un error de conexion con la BD
        }
    }
    
    public void Mostrar_Averiados(){
        DefaultTableModel modelo2=  new DefaultTableModel(); //se crea un nuevo modelo para la tabla, cambiando el predeterminado
        modelo2.addColumn("CODIGO");
        modelo2.addColumn("EQUIPO");
        modelo2.addColumn("ULTIMA AVERÍA");
        modelo2.addColumn("OBSERVACIONES");
        modelo2.addColumn("UBICACIÓN");
        modelo2.addColumn("FECHA ENTRADA");// agrega una columna en la tabla con el no,bre que esta dentro de las comillas
        tabla_Averiados.setModel(modelo2);
        String []datos= new String[6]; //se indican cuantas columnas se mostraran
        try {
            Statement st= ct.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM averiados"); // se indica de que tabla se tomaran los datos para mostrar
            while(rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(4);
                datos[4]= rs.getString(5);
                datos[5]= rs.getString(6);
                //indica la posicion de la creacion de la columna y de cual fila de la tabla de la base de datos se tomara la informacion
                modelo2.addRow(datos); // agrega en la tabla las columnas solicitadas
            }
            tabla_Equipos.setModel(modelo2);
        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            //condicion de excepcion en caso de que exista un error de conexion con la BD
        }
    }
    
    public void Mostrar_Traslados_Exter(){
        DefaultTableModel modelo3=  new DefaultTableModel(); //se crea un nuevo modelo para la tabla, cambiando el predeterminado
        modelo3.addColumn("CODIGO");
        modelo3.addColumn("EQUIPO");
        modelo3.addColumn("ULTIMO TRASLADO");
        modelo3.addColumn("UBICACIÓN");
        modelo3.addColumn("SUCURSAL");
        modelo3.addColumn("DESTINO");
        modelo3.addColumn("FECHA");// agrega una columna en la tabla con el no,bre que esta dentro de las comillas
        tabla_Averiados.setModel(modelo3);
        String []datos= new String[7]; //se indican cuantas columnas se mostraran
        try {
            Statement st= ct.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM tras_externos"); // se indica de que tabla se tomaran los datos para mostrar
            while(rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(4);
                datos[4]= rs.getString(5);
                datos[5]= rs.getString(6);
                datos[6]= rs.getString(7);
                //indica la posicion de la creacion de la columna y de cual fila de la tabla de la base de datos se tomara la informacion
                modelo3.addRow(datos); // agrega en la tabla las columnas solicitadas
            }
            tabla_Equipos.setModel(modelo3);
        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            //condicion de excepcion en caso de que exista un error de conexion con la BD
        }
    }
    
    public void Mostrar_Traslados_Inter(){
        DefaultTableModel modelo4=  new DefaultTableModel(); //se crea un nuevo modelo para la tabla, cambiando el predeterminado
        modelo4.addColumn("CODIGO");
        modelo4.addColumn("EQUIPO");
        modelo4.addColumn("ULTIMO TRASLADO");
        modelo4.addColumn("UBICACIÓN");
        modelo4.addColumn("DESTINO");
        modelo4.addColumn("FECHA");// agrega una columna en la tabla con el no,bre que esta dentro de las comillas
        tabla_Averiados.setModel(modelo4);
        String []datos= new String[6]; //se indican cuantas columnas se mostraran
        try {
            Statement st= ct.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM tras_internos"); // se indica de que tabla se tomaran los datos para mostrar
            while(rs.next()){
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                datos[2]= rs.getString(3);
                datos[3]= rs.getString(4);
                datos[4]= rs.getString(5);
                datos[5]= rs.getString(6);
                //indica la posicion de la creacion de la columna y de cual fila de la tabla de la base de datos se tomara la informacion
                modelo4.addRow(datos); // agrega en la tabla las columnas solicitadas
            }
            tabla_Equipos.setModel(modelo4);
        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            //condicion de excepcion en caso de que exista un error de conexion con la BD
        }
    }
    
    public void Generar_Archivo(){
        try {
          
          state = ct.prepareStatement("SELECT * FROM equipos");
          rst = state.executeQuery();
          
          Document doc = new Document();
          PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("Codigos de Barras de los Equipos.pdf"));
          
          doc.open();
          Barcode128 code = new Barcode128();
          
          while(rst.next()){
              code.setCode(rst.getString("CODIGO"));
              img = code.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
              doc.add(img);
              doc.add(new Paragraph("\t"));
          }
          
          doc.close();
          
      } catch (FileNotFoundException ex) {
          Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
      } catch (DocumentException ex) {
          Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Mensaje(){
        JOptionPane.showMessageDialog(this, "CODIGOS CREADOS CORRECTAMENTE", "EXITO..!", JOptionPane.WARNING_MESSAGE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Externos = new javax.swing.JButton();
        Internos = new javax.swing.JButton();
        txt_PDF = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Equipos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Averiados = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_Traslados_Exter = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_Traslados_Exter1 = new javax.swing.JTable();
        panel2 = new org.edisoncor.gui.panel.Panel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("INVENTARIO GENERAL DE LOS EQUIPOS");
        setResizable(false);

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(38, 116, 38));

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 3, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(47, 131, 47));
        jLabel7.setText("INVENTARIO DE EQUIPOS ");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/unnamed.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 3));

        jButton3.setBackground(new java.awt.Color(0, 102, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("FUNCIONALES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("AVERIADOS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("TRASLADOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Externos.setBackground(new java.awt.Color(0, 0, 204));
        Externos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Externos.setForeground(new java.awt.Color(255, 255, 255));
        Externos.setText("EXTERNOS");
        Externos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExternosActionPerformed(evt);
            }
        });

        Internos.setBackground(new java.awt.Color(0, 0, 204));
        Internos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Internos.setForeground(new java.awt.Color(255, 255, 255));
        Internos.setText("INTERNOS");
        Internos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InternosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Externos)
                        .addGap(33, 33, 33)
                        .addComponent(Internos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Externos)
                    .addComponent(Internos)))
        );

        txt_PDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32x32/PDF_24287.png"))); // NOI18N
        txt_PDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_PDFMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton3)
                        .addGap(65, 65, 65)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(txt_PDF)))
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(txt_PDF))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        tabla_Equipos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabla_Equipos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla_Equipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_Equipos.setGridColor(new java.awt.Color(0, 102, 0));
        tabla_Equipos.setSelectionBackground(new java.awt.Color(51, 153, 0));
        jScrollPane1.setViewportView(tabla_Equipos);

        tabla_Averiados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabla_Averiados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla_Averiados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_Averiados.setGridColor(new java.awt.Color(0, 102, 0));
        tabla_Averiados.setSelectionBackground(new java.awt.Color(51, 153, 0));
        jScrollPane2.setViewportView(tabla_Averiados);

        tabla_Traslados_Exter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabla_Traslados_Exter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla_Traslados_Exter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_Traslados_Exter.setGridColor(new java.awt.Color(0, 102, 0));
        tabla_Traslados_Exter.setSelectionBackground(new java.awt.Color(51, 153, 0));
        jScrollPane3.setViewportView(tabla_Traslados_Exter);

        tabla_Traslados_Exter1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabla_Traslados_Exter1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla_Traslados_Exter1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_Traslados_Exter1.setGridColor(new java.awt.Color(0, 102, 0));
        tabla_Traslados_Exter1.setSelectionBackground(new java.awt.Color(51, 153, 0));
        jScrollPane4.setViewportView(tabla_Traslados_Exter1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );

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
                .addGap(360, 360, 360)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Principal obj= new Principal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Externos.setEnabled(true);
        Internos.setEnabled(true);
        txt_PDF.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Mostrar_Funcionales();
        txt_PDF.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Mostrar_Averiados();
        txt_PDF.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ExternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExternosActionPerformed
        Mostrar_Traslados_Exter();
    }//GEN-LAST:event_ExternosActionPerformed

    private void InternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InternosActionPerformed
        Mostrar_Traslados_Inter();
    }//GEN-LAST:event_InternosActionPerformed

    private void txt_PDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_PDFMouseClicked
        Generar_Archivo();
        Mensaje();
    }//GEN-LAST:event_txt_PDFMouseClicked

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Externos;
    private javax.swing.JButton Internos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private javax.swing.JTable tabla_Averiados;
    private javax.swing.JTable tabla_Equipos;
    private javax.swing.JTable tabla_Traslados_Exter;
    private javax.swing.JTable tabla_Traslados_Exter1;
    private javax.swing.JLabel txt_PDF;
    // End of variables declaration//GEN-END:variables
}
