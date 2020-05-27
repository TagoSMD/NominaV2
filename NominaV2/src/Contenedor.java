//Se importaron las oonexiones y clases 
import java.awt.Dimension;
import java.awt.Toolkit;
import Clases.Usuarios;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.UIManager;
import Clases.Conexion;
import Clases.ConexionNomina;
import Clases.ConexionEmpleados;
import app.Reporte;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TagoKG
 */

public class Contenedor extends javax.swing.JFrame {
      Usuarios mod;
private Nomina_Empleados nuevaVentana2;
private Empleados nuevaVentana1;
private Departamentos nuevaVentana3;
private Puestos nuevaVentana4;


    /**Usuarios mod;
     * Creates new form Contenedor
     */


    public Contenedor() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
         
    }



  
    Contenedor(Usuarios mod) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;
       // JFrame.setDefaultLookAndFeelDecorated(true);
      //  SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MagmaSkin");
                Contenedor ve= new Contenedor ();
                ve.setVisible(true);

        if (mod.getIdTipo() == 1) {
            Menucatalogo.setVisible(true);
           //   Menueditar.setVisible(true);
             // MenuSalir.setVisible(true);
       
        //}
         } else {
            Menucatalogo.setVisible(true);
           Menucatalogo.setVisible(true);
            
        }
        if (mod.getIdTipo() == 2) {
            Menucatalogo.setVisible(true);
            Menucatalogo.setVisible(true);
        //} else {
          //  menuProveedores.setVisible(false);
           //menuProductos.setVisible(false);
        }
            if (mod.getIdTipo() == 3) {
            Menucatalogo.setVisible(true);
            Menucatalogo.setVisible(false);
        //} else {
          //  menuProveedores.setVisible(false);
           //menuProductos.setVisible(false);
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

        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MenuSalir = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Menueditar = new javax.swing.JMenu();
        Menucatalogo = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        jMenuItem7.setText("jMenuItem7");

        jMenu1.setText("jMenu1");

        MenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Opciones.png"))); // NOI18N
        MenuSalir.setText("Opciones");
        MenuSalir.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MenuSalir.add(jMenuItem3);

        Menueditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        Menueditar.setText("Editar");
        Menueditar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N

        Menucatalogo.setBackground(new java.awt.Color(255, 102, 102));
        Menucatalogo.setForeground(new java.awt.Color(204, 255, 204));
        Menucatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/catalogo.png"))); // NOI18N
        Menucatalogo.setText("Catalogo");
        Menucatalogo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 255, 204));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/fondo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 570));

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));
        jMenuBar1.setForeground(new java.awt.Color(204, 255, 204));

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/catalogo-ConvertImage (1).png"))); // NOI18N
        jMenu2.setText("Catalogo");
        jMenu2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/employee__icon-icons.com_76984.png"))); // NOI18N
        jMenuItem2.setText("Empleados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/business-color_money-time_icon-icons.com_53444.png"))); // NOI18N
        jMenuItem1.setText("Nomina");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/rotation_102346 (1).png"))); // NOI18N
        jMenuItem4.setText("Departamentos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Puestos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Concepto");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/documentediting_editdocuments_text_documentedi_2820.png"))); // NOI18N
        jMenu3.setText("Editar");
        jMenu3.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N

        jMenuItem9.setText("Nomina");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Usuarios");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Empleados");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/1486504328-bullet-list-menu-lines-points-items-options_81334.png"))); // NOI18N
        jMenu4.setText("Opciones");
        jMenu4.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Delete-80_icon-icons.com_57340.png"))); // NOI18N
        jMenuItem8.setText("Salir");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        nuevaVentana4=new Puestos();
        jDesktopPane1.add (nuevaVentana4);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        nuevaVentana3=new Departamentos();
        jDesktopPane1.add (nuevaVentana3);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        nuevaVentana2=new Nomina_Empleados();
        jDesktopPane1.add (nuevaVentana2);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        nuevaVentana1=new Empleados();
        jDesktopPane1.add (nuevaVentana1);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // Conexion a  la claseNomina para que genere el reporte
        
         try {
            ConexionNomina con = new ConexionNomina();
        Connection conn = con.getConexion();
         JasperReport reporte = null;
         String path="src//Reportes//Nomina.jasper";
            reporte = (JasperReport)  JRLoader.loadObjectFromFile(path);
             JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
               
         
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        //  Conexion a  la claseLogin1 para que genere el reporte:
       
             try {
            Conexion con = new Conexion();
        Connection conn = con.getConexion();
         JasperReport reporte = null;
         String path="src//Reportes//Login1.jasper";
            reporte = (JasperReport)  JRLoader.loadObjectFromFile(path);
             JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // Conexion a  la claseEmpleados para que genere el reporte:
              try {
            ConexionEmpleados con = new ConexionEmpleados();
        Connection conn = con.getConexion();
         JasperReport reporte = null;
         String path="src//Reportes//Empleados.jasper";
            reporte = (JasperReport)  JRLoader.loadObjectFromFile(path);
             JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
                JasperViewer view = new JasperViewer(jprint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
          UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contenedor().setVisible(true);
            }
        });
    }
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JMenu Menucatalogo;
    private javax.swing.JMenu Menueditar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}


  
