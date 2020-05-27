import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author TagoKG
 */
public class Puestos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Puestos
     */
    public Puestos() {
        initComponents();
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
        txtCodigoPuesto = new javax.swing.JTextField();
        txtNombrePuesto = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEstatusPuesto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        añadir = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        Txt_Buscar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Puesto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Codigo Puesto:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre Puesto:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre Empleado:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Estatus Puesto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigoPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtNombrePuesto)
                    .addComponent(txtNombreEmpleado)
                    .addComponent(txtEstatusPuesto))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombrePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEstatusPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );

        añadir.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        añadir.setForeground(new java.awt.Color(0, 0, 153));
        añadir.setText("AÑADIR");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        modificar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        modificar.setForeground(new java.awt.Color(0, 0, 153));
        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        buscar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(0, 0, 153));
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addComponent(Txt_Buscar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buscar)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(añadir)))
                        .addGap(37, 37, 37))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(añadir)
                .addGap(19, 19, 19)
                .addComponent(modificar)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        //Codigo que permite Ingresar registros en la base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/puestos1", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into puesto values(?,?,?,?,?)");

            pst.setString(1, "0");      //* Creado por Nayre
            pst.setString(2, txtCodigoPuesto.getText().trim()); ///* se ingresa a la base de datos el codigo de puesto
            pst.setString(3, txtNombrePuesto.getText().trim()); ///* se ingresa a la base de datos el Nombre del Puesto   
            pst.setString(4, txtNombreEmpleado.getText().trim()); ///*
            pst.setString(5, txtEstatusPuesto.getText().trim()); ///*
            pst.executeUpdate();

            txtCodigoPuesto.setText(""); ///**
            txtNombrePuesto.setText("");
            txtNombreEmpleado.setText("");
            txtEstatusPuesto.setText("");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Registro Puesto Exitoso.");
        }
    }//GEN-LAST:event_añadirActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        //Codigo que permite Modificar registros en la base de datos
        try {
            String ID = Txt_Buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/puestos1", "root", "");
            PreparedStatement pst = cn.prepareStatement("update puesto set codigo_puesto = ?, nombre_puesto = ?, nombre_empleado = ?, estatus_puestos = ? where ID = " + ID);
            //* Creado por Nayre
            pst.setString(1, txtCodigoPuesto.getText().trim()); ///* se modifica a la base de datos el codigo de puesto
            pst.setString(2, txtNombrePuesto.getText().trim()); ///* se modifica a la base de datos el nombre del puesto
            pst.setString(3, txtNombreEmpleado.getText().trim()); ///*
            pst.setString(4, txtEstatusPuesto.getText().trim()); ///*
            pst.executeUpdate();

        } catch (Exception e)
        {
            {
                JOptionPane.showMessageDialog(null, "Modificacion al Registro Puestos Exitosamente.");
            }
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        //Codigo que permite consultar registros en la base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/puestos1", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from puesto where ID = ?");
            pst.setString(1, Txt_Buscar.getText().trim());
            //* Creado por Nayre
            ResultSet rs = pst.executeQuery();

            if(rs.next()){

                txtCodigoPuesto.setText(rs.getString("codigo_concepto")); //** se modifica a la base de datos el codigo de puesto
                txtNombrePuesto.setText(rs.getString("nombre_concepto")); //** se modifica a la base de datos el nombre del puesto
                txtNombreEmpleado.setText(rs.getString("efecto_concepto"));
                txtEstatusPuesto.setText(rs.getString("efecto_concepto"));
            } else {
                JOptionPane.showMessageDialog(null, "Concepto No Registrado.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_buscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Codigo que permite borrar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/puestos1", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from puesto where ID = ?");
            //* Creado por Nayre
            pst.setString(1, Txt_Buscar.getText().trim());
            pst.executeUpdate();

            txtCodigoPuesto.setText("");  ///* se elimina el registro en la base de datos del codigo puesto
            txtNombrePuesto.setText("");  ///* se elimina el registro en la base de datos el nombre de puesto
            txtNombreEmpleado.setText("");
            txtEstatusPuesto.setText("");
           

            JOptionPane.showMessageDialog(null, "Registro Eliminado.");
        } catch (Exception e) {
        }        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_Buscar;
    private javax.swing.JButton añadir;
    private javax.swing.JButton buscar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField txtCodigoPuesto;
    private javax.swing.JTextField txtEstatusPuesto;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombrePuesto;
    // End of variables declaration//GEN-END:variables
}
