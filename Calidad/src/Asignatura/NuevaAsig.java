/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Asignatura;
import Abstracta.BD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class NuevaAsig extends javax.swing.JFrame {

    /**
     * Creates new form NuevaAsig
     */
    public NuevaAsig() {
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

        jPanel7 = new javax.swing.JPanel();
        txtc = new javax.swing.JTextField();
        btnCancelar1 = new javax.swing.JButton();
        btnGrabar1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        txtNom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtc1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jComboNivel = new javax.swing.JComboBox();
        jComboCarga = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcKeyTyped(evt);
            }
        });

        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnGrabar1.setText("Registrar");
        btnGrabar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnCancelar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btnGrabar1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar1)
                    .addComponent(btnCancelar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 16, 130, -1));

        jLabel11.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel11.setText("Nombre");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 19, -1, -1));

        jLabel13.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel13.setText("Codigo");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 52, 55, -1));

        txtc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtc1KeyTyped(evt);
            }
        });
        jPanel9.add(txtc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 50, 10, 0));

        jLabel14.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel14.setText("Nivel");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel9.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 54, -1));

        jComboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "1", "2", "3", "4", "5" }));
        jPanel9.add(jComboNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jComboCarga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "2", "3", "4", "5", "6" }));
        jPanel9.add(jComboCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 87, -1, -1));

        jLabel15.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        jLabel15.setText("Carga Semanal");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnGrabar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabar1ActionPerformed
        try {
            Connection cn = BD.getConnection();
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery("select max(AsignaturaId) from Asignatura");
            while (rs.next()) {
                txtc.setText(String.valueOf(rs.getInt(1)+1));
            }
            rs.close();
            stmt.close();
            cn.close();
            if(txtCod.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Ingrese un Codigo para Grabar");
            }
            else{
                int asignaturaId =Integer.parseInt( txtc.getText());
                int codigo =Integer.parseInt( txtCod.getText());
                String nombre = txtNom.getText();
                String carga = (String) jComboCarga.getSelectedItem();
                int cargaSemanal =Integer.parseInt(carga);
                String ni = (String) jComboNivel.getSelectedItem();
                int nivel =Integer.parseInt(ni);

                //Integer.parseInt(txtn.getText());
                //int cargaSemanal =Integer.parseInt(txtCar.getText());
                Asignatura c= new Asignatura();
                c.setAsignaturaId(asignaturaId);
                c.setCodigo(codigo);
                c.setNombre(nombre);
                c.setNivel(nivel);
                c.setCargaSemanal(cargaSemanal);
                c.altas();
                JOptionPane.showMessageDialog(null,"Una nueva Categoria ha sido Registrada");
                              
                txtNom.setText("");
                txtc.setText("");
                

            }
        } catch (Exception error) {
            System.out.println(error);
        }  
       
    }//GEN-LAST:event_btnGrabar1ActionPerformed

    private void txtc1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtc1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtc1KeyTyped

    private void txtcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtcKeyTyped

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
            java.util.logging.Logger.getLogger(NuevaAsig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaAsig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaAsig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaAsig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaAsig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnGrabar1;
    private javax.swing.JComboBox jComboCarga;
    private javax.swing.JComboBox jComboNivel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtc1;
    // End of variables declaration//GEN-END:variables
}