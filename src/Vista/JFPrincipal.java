/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import Controlador.ConexionBasesdeDatos;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.MouseInfo;
import java.awt.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class JFPrincipal extends javax.swing.JFrame {

    ConexionBasesdeDatos conexion;
     private int x = 0;   //Variable para tomar el valor de la coordenada X de la ventana Servidor
    private int y = 0;   //Variable para tomar el valor de la coordenada Y de la ventana Servidor

    /**
     * Creates new form JFPrincipall
     */
    public JFPrincipal() {
        initComponents();
        conexion = new ConexionBasesdeDatos();
        File archivo=new File("C:\\Documentos Empresa");
        archivo.mkdir();
        archivo=new File("C:\\Documentos Empresa\\FACTURAS");
        archivo.mkdir();
        archivo=new File("C:\\Documentos Empresa\\REPORTES PDF INVENTARIOS");
        archivo.mkdir();
        archivo=new File("C:\\Documentos Empresa\\REPORTES PDF VENTAS");
        archivo.mkdir();
        try{
          
        }catch(Exception e){
            
        }
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPBarra = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JPEscritorio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        txtclave = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Aparajita", 0, 24)); // NOI18N
        setUndecorated(true);

        JPBarra.setBackground(java.awt.SystemColor.activeCaption);
        JPBarra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));
        JPBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JPBarraMouseDragged(evt);
            }
        });
        JPBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPBarraMousePressed(evt);
            }
        });

        jButton6.setBackground(java.awt.SystemColor.activeCaption);
        jButton6.setForeground(java.awt.SystemColor.activeCaption);
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close-icon.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(java.awt.SystemColor.activeCaption);
        jButton7.setForeground(java.awt.SystemColor.activeCaption);
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimize-icon.png"))); // NOI18N
        jButton7.setAlignmentY(0.0F);
        jButton7.setAutoscrolls(true);
        jButton7.setBorder(null);
        jButton7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimize-icon.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/navi.gif"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Aparajita", 3, 18)); // NOI18N
        jLabel7.setText("NVSH APP");

        javax.swing.GroupLayout JPBarraLayout = new javax.swing.GroupLayout(JPBarra);
        JPBarra.setLayout(JPBarraLayout);
        JPBarraLayout.setHorizontalGroup(
            JPBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBarraLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(461, 461, 461)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPBarraLayout.setVerticalGroup(
            JPBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBarraLayout.createSequentialGroup()
                .addGroup(JPBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(jButton6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPEscritorio.setBackground(java.awt.SystemColor.activeCaption);
        JPEscritorio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 1, true));
        JPEscritorio.setToolTipText("");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(java.awt.SystemColor.inactiveCaption);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Aparajita", 2, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("                                     MISION\n     Ofrecer a nuestros exigentes clientes una gama\n     de regalos para cada ocasión, encontrando el \n     producto de calidad que usted desea para su \n     personal o proveedor, con los mejores precios \n    del mercado y en el tiempo que usted lo requiera...\n\n                                    VISION\n    Ser una empresa lider en ofrecer, obsequios y regalos \n    para esas fechas especiales, ofreciendo el mejor servicio \n    y cubriendo las necesidades y requerimientos del cliente,\n    siendo reconocida en el ámbito Nacional e Internacional, \n    por la calidad de sus servicios y Productos.");
        jTextArea1.setAlignmentX(2.0F);
        jTextArea1.setBorder(null);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Aparajita", 2, 18)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtusuario.setText("300");

        txtclave.setText("mic");

        jLabel3.setFont(new java.awt.Font("Aparajita", 2, 18)); // NOI18N
        jLabel3.setText("BIENVENIDO");

        jLabel4.setFont(new java.awt.Font("Aparajita", 2, 18)); // NOI18N
        jLabel4.setText("Cedula");

        jLabel5.setFont(new java.awt.Font("Aparajita", 2, 18)); // NOI18N
        jLabel5.setText("Clave");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Aparajita", 2, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin título-12.png"))); // NOI18N

        javax.swing.GroupLayout JPEscritorioLayout = new javax.swing.GroupLayout(JPEscritorio);
        JPEscritorio.setLayout(JPEscritorioLayout);
        JPEscritorioLayout.setHorizontalGroup(
            JPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPEscritorioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(JPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(JPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtusuario)
                            .addComponent(txtclave, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addGroup(JPEscritorioLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(JPEscritorioLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(JPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPEscritorioLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPEscritorioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(JPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPEscritorioLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPEscritorioLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77))))))))
        );
        JPEscritorioLayout.setVerticalGroup(
            JPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPEscritorioLayout.createSequentialGroup()
                .addGroup(JPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPEscritorioLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPEscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .addGap(56, 56, 56))
                            .addGroup(JPEscritorioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(JPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))))
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String usuario = txtusuario.getText();
        String clave = txtclave.getText();

        try {
            if (conexion.consultarexistencia("PERSONA", "pers_id", "pers_cedula", usuario + " AND pers_clave='" + clave + "' AND tipo_id=1")) {

            } else {
                if (conexion.consultarexistencia("PERSONA", "pers_id", "pers_cedula", usuario + " AND pers_clave='" + clave + "' AND tipo_id=2")) {
                    ResultSet info=conexion.consultarconcondicion("PERSONA", "pers_id", " pers_cedula = "+usuario+ " AND pers_clave='" + clave + "' AND tipo_id=2");
                        info.next();
                    JFPrincipalAdministrador ventana = new JFPrincipalAdministrador(conexion,info.getInt(1));
                    ventana.show();
                    this.dispose();
                } else {
                    if (conexion.consultarexistencia("PERSONA", "pers_id", "pers_cedula", usuario + " AND pers_clave='" + clave + "' AND tipo_id=3")) {
                        ResultSet info=conexion.consultarconcondicion("PERSONA", "pers_id", " pers_cedula = "+usuario+ " AND pers_clave='" + clave + "' AND tipo_id=3");
                        info.next();
                        
                        JFPrincipalEmpleado ventana = new JFPrincipalEmpleado(conexion,info.getInt(1));
                        ventana.show();
                        this.dispose();
                    } else {
                           JOptionPane.showMessageDialog(this, "Cedula o clave no son validos");
                    }
                }

            }

        } catch (Exception e) {

        }

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       setExtendedState(this.ICONIFIED); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
//Minizar la ventana
        // TODO add your handling code here:
 dispose(); //Cerrar la ventana
    }//GEN-LAST:event_jButton6ActionPerformed

    private void JPBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBarraMousePressed
 x = evt.getX();
    y = evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_JPBarraMousePressed

    private void JPBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPBarraMouseDragged
Point ubicacion = MouseInfo.getPointerInfo().getLocation(); //Captura la ubucacion del puntero

    setLocation(ubicacion.x - x, ubicacion.y - y);//Se ubica el JFrame n la nuevo posicion
        
// TODO add your handling code here:
    }//GEN-LAST:event_JPBarraMouseDragged

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPBarra;
    private javax.swing.JPanel JPEscritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
