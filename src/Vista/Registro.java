package Vista;

import Controlador.Controlador;
import Modelo.Administrador;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    private Controlador c;

    public Registro(Controlador c) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.c = c;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_verificar = new javax.swing.JPanel();
        pass_admin = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        text_admin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nick = new javax.swing.JTextField();
        jPFContraseña = new javax.swing.JPasswordField();
        jPFContraseña1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        jLabel3.setText("Digite  la contraseña  para crear un nuevo administrador");

        jLabel5.setText("Solo permitido por otro administrador de la base.");

        text_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_adminActionPerformed(evt);
            }
        });

        jLabel6.setText("Administrador");

        jLabel7.setText("Contraseña");

        javax.swing.GroupLayout panel_verificarLayout = new javax.swing.GroupLayout(panel_verificar);
        panel_verificar.setLayout(panel_verificarLayout);
        panel_verificarLayout.setHorizontalGroup(
            panel_verificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_verificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_verificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(panel_verificarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panel_verificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_verificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_verificarLayout.setVerticalGroup(
            panel_verificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_verificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_verificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_verificarLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_verificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrarse");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Reingrese la Contraseña:");

        jButton1.setText("Registrarse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Contraseña:");

        nick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nickActionPerformed(evt);
            }
        });

        jPFContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFContraseñaActionPerformed(evt);
            }
        });
        jPFContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPFContraseñaKeyTyped(evt);
            }
        });

        jPFContraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFContraseña1ActionPerformed(evt);
            }
        });
        jPFContraseña1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPFContraseña1KeyTyped(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel2))
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nick, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jPFContraseña)
                            .addComponent(jPFContraseña1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(87, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPFContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPFContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Administrador u = c.getDao().getAdmin(nick.getText());
        if (u == null && jPFContraseña.getText().equals(jPFContraseña1.getText())) {
            int codigoAdmin = JOptionPane.showConfirmDialog(this, panel_verificar, "Verificar Permisos", JOptionPane.OK_CANCEL_OPTION);
            if (codigoAdmin == JOptionPane.OK_OPTION && !pass_admin.getText().equals("") || !text_admin.getText().equals("")) {
                Administrador w = c.getDao().getAdmin(text_admin.getText(), pass_admin.getText());
                if (w != null) {
                    u = new Administrador(nick.getText(), jPFContraseña1.getText());
                    c.getDao().setAdmin(u);
                    JOptionPane.showMessageDialog(null, "Administrador Registrado con Exito");
                    jButton2.doClick();
                }else{
                    JOptionPane.showMessageDialog(this, "Error \nNo es un administrador de este sistema.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if (pass_admin.getText().equals("") || text_admin.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Error \nNo se han completado los datos", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else if (!jPFContraseña.getText().equals(jPFContraseña1.getText())) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ya existe");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nickActionPerformed

    private void jPFContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFContraseñaKeyTyped

    }//GEN-LAST:event_jPFContraseñaKeyTyped

    private void jPFContraseña1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFContraseña1KeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jButton1.doClick();
        }
    }//GEN-LAST:event_jPFContraseña1KeyTyped

    private void jPFContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPFContraseñaActionPerformed

    private void jPFContraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFContraseña1ActionPerformed

    }//GEN-LAST:event_jPFContraseña1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LogAdmin l = new LogAdmin(c);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void text_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_adminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPFContraseña;
    private javax.swing.JPasswordField jPFContraseña1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nick;
    private javax.swing.JPanel panel_verificar;
    private javax.swing.JPasswordField pass_admin;
    private javax.swing.JTextField text_admin;
    // End of variables declaration//GEN-END:variables
}
