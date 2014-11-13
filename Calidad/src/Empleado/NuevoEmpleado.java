/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ventana2.java
 *
 * Created on 26-oct-2013, 9:26:17
 */

package Empleado;

import Abstracta.BD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos
 */
public class NuevoEmpleado extends javax.swing.JInternalFrame {
  private Empleado empleado;
    private ListaEmpleados lista;

    DefaultTableModel model;

        private int cont = 1;
    /** Creates new form Ventana2 */
    public NuevoEmpleado() {
        initComponents();
        jtEmpleado.setVisible(true);
        actualizarBusqueda();
        try {

            Connection con = BD.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select descripcion from categoria");
            while (rs.next()) {
                cboC.addItem(rs.getObject(1));
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException error) {
            System.out.println(error);
        }
            txtL.enable(false);
             txtD.enable(false);
             txtN.enable(false);
             txtA.enable(false);
             txtDom.enable(false);
             txtcat.enable(false);
             txttel.enable(false);

 
      }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDom = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtL = new javax.swing.JTextField();
        txtN = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cboC = new javax.swing.JComboBox();
        txtcat = new javax.swing.JTextField();
        txtD = new javax.swing.JTextField();
        txtP = new javax.swing.JTextField();
        txtU = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpleado = new javax.swing.JTable();
        txtBuscarEmp = new javax.swing.JTextField();
        cboParametroPro = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jTabbedPane1.setFont(new java.awt.Font("Levenim MT", 1, 14)); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel8.setText("Categoria");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 20));

        jLabel11.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel11.setText("Telefono");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel12.setText("Apellido");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        txtDom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomActionPerformed(evt);
            }
        });
        jPanel4.add(txtDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 155, -1));
        jPanel4.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 104, -1));

        jLabel13.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel13.setText("Nombre");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLActionPerformed(evt);
            }
        });
        txtL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLKeyTyped(evt);
            }
        });
        jPanel4.add(txtL, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 68, -1));

        txtN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNActionPerformed(evt);
            }
        });
        jPanel4.add(txtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 125, -1));

        jLabel14.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel14.setText("Legajo");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel19.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel19.setText("Dni");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        cboC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        jPanel4.add(cboC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 140, 30));

        txtcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcatActionPerformed(evt);
            }
        });
        txtcat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcatKeyTyped(evt);
            }
        });
        jPanel4.add(txtcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 10, 10));

        txtD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDActionPerformed(evt);
            }
        });
        txtD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDKeyTyped(evt);
            }
        });
        jPanel4.add(txtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 128, -1));
        jPanel4.add(txtP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 20, 10));
        jPanel4.add(txtU, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 20, 10));

        txttel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelActionPerformed(evt);
            }
        });
        txttel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelKeyTyped(evt);
            }
        });
        jPanel4.add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 110, 30));

        jLabel9.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel9.setText("Domicilio");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jLabel15.setFont(new java.awt.Font("Levenim MT", 1, 14)); // NOI18N
        jLabel15.setText("Opciones");

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Habilitar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Modificar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addGap(53, 53, 53)
                .addComponent(jButton5)
                .addGap(41, 41, 41)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nuevo Empleado", jPanel2);

        jLabel16.setFont(new java.awt.Font("Levenim MT", 1, 14)); // NOI18N
        jLabel16.setText("Empleados Registrados");

        jtEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "PRECIO UNID.", "STOCK"
            }
        ));
        jtEmpleado.setUpdateSelectionOnSort(false);
        jtEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtEmpleado);

        txtBuscarEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarEmpKeyReleased(evt);
            }
        });

        cboParametroPro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Nombre" }));
        cboParametroPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboParametroProActionPerformed(evt);
            }
        });

        jLabel2.setText("BUSCAR :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboParametroPro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel16))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboParametroPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleados", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtDomActionPerformed

    private void txtcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcatActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtcatActionPerformed

    private void txtLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtLActionPerformed

    private void txtNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtNActionPerformed

    private void txtDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtDActionPerformed

    private void txtcatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcatKeyTyped
    char c = evt.getKeyChar();
    if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtcatKeyTyped

    private void txtDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDKeyTyped
         char c = evt.getKeyChar();
    if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtDKeyTyped

    private void txtLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLKeyTyped
  
    }//GEN-LAST:event_txtLKeyTyped

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed

}//GEN-LAST:event_btnGrabarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      
}//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       
}//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnhabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhabilitarActionPerformed
  
}//GEN-LAST:event_btnhabilitarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     
}//GEN-LAST:event_btnBuscarActionPerformed

    private void txttelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelActionPerformed

    private void txttelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelKeyTyped

    private void jtEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEmpleadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmpleadoMouseClicked

    private void txtBuscarEmpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEmpKeyReleased
        // TODO add your handling code here:
        actualizarBusqueda();
}//GEN-LAST:event_txtBuscarEmpKeyReleased

    private void cboParametroProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboParametroProActionPerformed
        // TODO add your handling code here:
        actualizarBusqueda();
}//GEN-LAST:event_cboParametroProActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
try {
            if(txtL.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Ingrese un Codigo para Grabar");
            }else if(txtD.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Ingrese un Dni para Grabar");
            }else if(txtN.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Ingrese un Nombre para Grabar");
            }else if(txtA.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Ingrese un Apellido para Grabar");
            }else {
            int legajo=Integer.parseInt(txtL.getText());
            int dni=Integer.parseInt(txtD.getText());
            String nombre=txtN.getText();
            String apellido= txtA.getText();
            int n = cboC.getSelectedIndex();
            if (n == 1){
                txtcat.setText("1");
            }else
            if(n==2){
            txtcat.setText("2");
            }
            int categoria = Integer.parseInt(txtcat.getText());
              
            Empleado e= new Empleado();
             e.setLegajo(legajo);
             e.setDni(dni);
             e.setNombre(nombre);
             e.setApellido(apellido);
             e.setIdcategoria(categoria);
         
             e.altas();
             JOptionPane.showMessageDialog(null,"Un nuevo Empleado ha sido Registrado");
             txtL.enable(false);
             txtD.enable(false);
             txtN.enable(false);
             txtA.enable(false);
             txtDom.enable(false);
             txtcat.enable(false);
             txttel.enable(false);
          
            txtN.setText("");
            txtA.setText("");
            txtDom.setText("");
            txtD.setText("");
            txtcat.setText("");
            txtP.setText("");
            txtU.setText("");
            txttel.setText("");

         }
        }catch( Exception ex){

            JOptionPane.showMessageDialog(null, "no se pudo cargar nuevo cliente"+ex);

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   if(txtL.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese un Codigo para Buscar");
        }else{

        Empleado e= new Empleado();
        e.setLegajo(Integer.parseInt(txtL.getText()));
        if(e.buscar()){
            txtN.setText(e.getNombre());
            txtA.setText(e.getApellido());
            txtD.setText(""+e.getDni());
            txtcat.setText(""+e.getIdcategoria());

            txtL.enable(false);
            txtN.enable(false);
            txtA.enable(false);
            txtD.enable(false);
            txtDom.enable(false);
            txtcat.enable(false);
            txtU.enable(false);
            txtP.enable(false);
            txttel.enable(false);
        } else{
            JOptionPane.showMessageDialog(this, "No se encontraron coincidencias. Intentelo nuevamente");
            }
        }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     txtL.enable(true);
        txtN.enable(true);
        txtA.enable(true);
        txtDom.enable(true);
        txtD.enable(true);
        txtcat.enable(true);
        txttel.enable(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  if(evt.getActionCommand().equals("boton"))
            cont++;
        txtL.setText(""+cont++);
        repaint();
         txtL.enable(false);
             txtD.enable(true);
             txtN.enable(true);
             txtA.enable(true);
             txtDom.enable(true);
             txtcat.enable(true);
             txttel.enable(true);

            txtN.setText("");
            txtA.setText("");
            txtDom.setText("");
            txtD.setText("");
            txtcat.setText("");
            txtP.setText("");
            txtU.setText("");
            txttel.setText("");
       // limpiar();
         try {
            Connection cn = BD.getConnection();
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery("select max(Legajo) from empleado");
            while (rs.next()) {
                txtL.setText(String.valueOf(rs.getInt(1)+1));
            }
            rs.close();
            stmt.close();
            cn.close();
        } catch (Exception error) {
            System.out.println(error);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   if(txtL.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese un Codigo para Modificar");
        }else{

        Empleado e= new Empleado();
        e.setLegajo(Integer.parseInt(txtL.getText()));
        e.setNombre(txtN.getText());
        e.setApellido(txtA.getText());
        e.setDni(Integer.parseInt(txtD.getText()));
        e.setIdcategoria(Integer.parseInt(txtcat.getText()));
        e.modificar();
             txtL.enable(false);
             txtD.enable(false);
             txtN.enable(false);
             txtA.enable(false);
             txtDom.enable(false);
             txtcat.enable(false);
             txttel.enable(false);
          txtL.setText("");
            txtN.setText("");
            txtA.setText("");
            txtDom.setText("");
            txtD.setText("");
            txtcat.setText("");
            txtP.setText("");
            txtU.setText("");
            txttel.setText("");

        JOptionPane.showMessageDialog(this, "La modificacion se realizo exitosamente");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  if(txtL.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ingrese un Legajo para Eliminar");
        }else{

        Empleado e = new Empleado  ();
        e.setLegajo(Integer.parseInt(txtL.getText()));
        e.bajas();
         txtL.enable(false);
             txtD.enable(false);
             txtN.enable(false);
             txtA.enable(false);
             txtDom.enable(false);
             txtcat.enable(false);
             txttel.enable(false);
            txtL.setText("");
            txtN.setText("");
            txtA.setText("");
            txtDom.setText("");
            txtD.setText("");
            txtcat.setText("");
            txtP.setText("");
            txtU.setText("");
            txttel.setText("");
        JOptionPane.showMessageDialog(this, "La eliminacion se realizo exitosamente");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cboC;
    private javax.swing.JComboBox cboParametroPro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtEmpleado;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtBuscarEmp;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtDom;
    private javax.swing.JTextField txtL;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtU;
    private javax.swing.JTextField txtcat;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables

      private void mostrar() {
  try{

        Empleado e = new Empleado();
        ListaEmpleados lista = new ListaEmpleados(empleado.leer());
        DefaultTableModel info=new DefaultTableModel();
        info.addColumn("Legajo");
        info.addColumn("Nombre");
        info.addColumn("Apellido");
        info.addColumn("Dni");
    
        for(int i=0; i<lista.getListaEmpleado().size();i++){

            Object[]fila=new Object[]{

                lista.getListaEmpleado().get(i).getLegajo(),
                lista.getListaEmpleado().get(i).getNombre(),
                lista.getListaEmpleado().get(i).getApellido(),
                lista.getListaEmpleado().get(i).getDni(),
    
        };
        info.addRow(fila);
      }
     jtEmpleado.setModel(info);
  }catch(SQLException a){
      a.printStackTrace();
  }

    }

     private void filtrar() {
  try{

        Empleado e = new Empleado();
        ListaEmpleados lista = new ListaEmpleados(empleado.filtrar());
        DefaultTableModel info=new DefaultTableModel();
        info.addColumn("Legajo");
        info.addColumn("Nombre");
        info.addColumn("Apellido");
        info.addColumn("Dni");
    
     
        empleado.setLegajo(Integer.parseInt(txtL.getText()));

         if(empleado.buscar())
        for(int i=0; i<lista.getListaEmpleado().size();i++){

            Object[]fila=new Object[]{

                lista.getListaEmpleado().get(i).getLegajo(),
                lista.getListaEmpleado().get(i).getNombre(),
                lista.getListaEmpleado().get(i).getApellido(),
                lista.getListaEmpleado().get(i).getDni(),
        };
        info.addRow(fila);
      }
     jtEmpleado.setModel(info);
  }catch(SQLException a){
      a.printStackTrace();
  }
    }

    private void limpiar(){

        txtL.setText("");
        txtN.setText("");
        txtA.setText("");
        txtDom.setText("");
        txtD.setText("");
        txtcat.setText("");
        txtP.setText("");
        txtU.setText("");
    }
    public void  generarcontraUser(){
         GeneradorPassUser k = new GeneradorPassUser();
        String nom = txtN.getText();
        String ape = txtA.getText();

        if (nom.equals("") || ape.equals("") ) {
            JOptionPane.showMessageDialog(null, "Complete los campos nombre,apellido para generar el usuario", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            txtU.setText(k.generarUser(nom, ape));
        }

        GeneradorPassUser q = new GeneradorPassUser();
        String dni = txtD.getText();
        String nom1 = txtN.getText();
        String ape1 = txtA.getText();
        if (dni.equals("") || ape1.equals("") || nom1.equals("")) {
            JOptionPane.showMessageDialog(null, "Complete los campos dni,apellido,nombre para generar el password", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            txtP.setText(k.generarPass(nom1, dni, ape1));
        }
    }
      private void actualizarBusqueda() {
        ArrayList<Empleado> result = null;
          if (String.valueOf(cboParametroPro.getSelectedItem()).equalsIgnoreCase("Codigo")) {
            result = Empleado.listarEmpleadoPorCodigo(txtBuscarEmp.getText());

        }else
     if (String.valueOf(cboParametroPro.getSelectedItem()).equalsIgnoreCase("Nombre")) {
            result = Empleado.listarEmpleadoPorNombre(txtBuscarEmp.getText());
        }
        recargarTable(result);
    }



    public void recargarTable(ArrayList<Empleado> list) {
        Object[][] datos = new Object[list.size()][7];
        int i = 0;
        for (Empleado p : list) {
            datos[i][0] = p.getLegajo();
            datos[i][1] = p.getNombre();
            datos[i][2] = p.getApellido();
            datos[i][3] = p.getDni();
            datos[i][4] = p.getIdcategoria();


           i++;
        }
        jtEmpleado.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                    "LEGAJO",
                    "NOMBRE",
                    "APELLIDO",
                    "DNI",
                    "CATEGORIA"

                }) {

            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }
}