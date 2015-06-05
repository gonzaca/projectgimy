package Vista;

import Controlador.Controlador;
import Modelo.Cliente;
import Modelo.Seguimiento;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class RegistroFisicoCliente extends javax.swing.JFrame {
private Controlador control;
     private Cliente cliente;

    public RegistroFisicoCliente(Controlador co, Cliente c) {
        this.cliente = c;
        this.control = co;
        initComponents();
        this.setLocationRelativeTo(null);
        nombre_reg_fisico.setText(c.getNombre()+ " " + c.getApellidos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        nombre_reg_fisico = new javax.swing.JLabel();
        panel_datos_seg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        imc = new javax.swing.JTextField();
        grasa = new javax.swing.JTextField();
        pecho = new javax.swing.JTextField();
        espalda = new javax.swing.JTextField();
        cadera = new javax.swing.JTextField();
        gluteos = new javax.swing.JTextField();
        cintura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pantorrilla_derecha = new javax.swing.JTextField();
        pierna_derecha = new javax.swing.JTextField();
        pantorrilla_izquierda = new javax.swing.JTextField();
        pierna_izquierda = new javax.swing.JTextField();
        brazo_derecho = new javax.swing.JTextField();
        brazo_izquierdo = new javax.swing.JTextField();
        antebrazo_derecho = new javax.swing.JTextField();
        antebrazo_izquierdo = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Registro Fisico del Cliente");

        nombre_reg_fisico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre_reg_fisico.setText("-");

        panel_datos_seg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(5, 100, 152), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153)));

        jLabel1.setText("Brazo derecho");

        jLabel2.setText("Brazo Izquierdo");

        jLabel3.setText("Antebrazo Derecho");

        jLabel4.setText("Antebrazo Izquierdo");

        jLabel5.setText("Pecho");

        jLabel6.setText("Espalda");

        jLabel7.setText("Cadera");

        jLabel8.setText("Cintura");

        jLabel9.setText("Glúteos");

        peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesoKeyTyped(evt);
            }
        });

        jLabel10.setText("Pierna Derecha");

        imc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                imcKeyTyped(evt);
            }
        });

        grasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                grasaKeyTyped(evt);
            }
        });

        pecho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pechoKeyTyped(evt);
            }
        });

        espalda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                espaldaKeyTyped(evt);
            }
        });

        cadera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caderaKeyTyped(evt);
            }
        });

        gluteos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gluteosKeyTyped(evt);
            }
        });

        cintura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cinturaKeyTyped(evt);
            }
        });

        jLabel11.setText("Pierna Izquierda");

        jLabel12.setText("Pantorrilla Izquierda");

        jLabel13.setText("Pantorrilla derecha");

        jLabel14.setText("Peso");

        jLabel15.setText("Grasa");

        jLabel16.setText("IMC");

        pantorrilla_derecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pantorrilla_derechaKeyTyped(evt);
            }
        });

        pierna_derecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pierna_derechaKeyTyped(evt);
            }
        });

        pantorrilla_izquierda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pantorrilla_izquierdaKeyTyped(evt);
            }
        });

        pierna_izquierda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pierna_izquierdaKeyTyped(evt);
            }
        });

        brazo_derecho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                brazo_derechoKeyTyped(evt);
            }
        });

        brazo_izquierdo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                brazo_izquierdoKeyTyped(evt);
            }
        });

        antebrazo_derecho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                antebrazo_derechoKeyTyped(evt);
            }
        });

        antebrazo_izquierdo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                antebrazo_izquierdoKeyTyped(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel54.setText("Kgs");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setText("cms");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel56.setText("cms");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel57.setText("cms");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel58.setText("cms");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel59.setText("cms");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel60.setText("cms");

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel64.setText("cms");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel65.setText("cms");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel66.setText("cms");

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel67.setText("cms");

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel68.setText("cms");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel69.setText("cms");

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel70.setText("cms");

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel92.setText("%");

        javax.swing.GroupLayout panel_datos_segLayout = new javax.swing.GroupLayout(panel_datos_seg);
        panel_datos_seg.setLayout(panel_datos_segLayout);
        panel_datos_segLayout.setHorizontalGroup(
            panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_segLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brazo_derecho, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antebrazo_derecho, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pecho, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cintura, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gluteos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pierna_derecha, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pantorrilla_derecha, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grasa, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67)
                    .addComponent(jLabel92)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel59)
                    .addComponent(jLabel55)
                    .addComponent(jLabel58)
                    .addComponent(jLabel70))
                .addGap(62, 62, Short.MAX_VALUE)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addGap(1, 1, 1)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brazo_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antebrazo_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espalda, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadera, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pierna_izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pantorrilla_izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imc, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addComponent(jLabel64)
                    .addComponent(jLabel68)
                    .addComponent(jLabel60)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66)
                    .addComponent(jLabel69))
                .addContainerGap())
        );

        panel_datos_segLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cadera, cintura, espalda, gluteos, grasa, imc, pecho, peso});

        panel_datos_segLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {antebrazo_derecho, antebrazo_izquierdo, brazo_derecho, brazo_izquierdo, pantorrilla_derecha, pantorrilla_izquierda, pierna_derecha, pierna_izquierda});

        panel_datos_segLayout.setVerticalGroup(
            panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_segLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel60)
                        .addComponent(brazo_derecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(brazo_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(antebrazo_derecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel56))
                                .addGap(15, 15, 15))
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)))
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(pecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel57)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(cintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel58)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_datos_segLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(gluteos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cadera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66))
                                .addGap(21, 21, 21)
                                .addComponent(jLabel68))
                            .addGroup(panel_datos_segLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(4, 4, 4))))
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(antebrazo_izquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64))
                        .addGap(15, 15, 15)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(espalda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pierna_izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pierna_derecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(pantorrilla_izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel70)
                        .addComponent(jLabel69)))
                .addGap(20, 20, 20)
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pantorrilla_derecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel67)
                        .addComponent(jLabel54)))
                .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panel_datos_segLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(grasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92)))
                    .addGroup(panel_datos_segLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(nombre_reg_fisico, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 162, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(panel_datos_seg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(nombre_reg_fisico))
                .addGap(18, 18, 18)
                .addComponent(panel_datos_seg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        createSeguimiento();
        JOptionPane.showMessageDialog(null, "Primeras Medidas o Seguimiento Agregado Correctamente.");
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_pesoKeyTyped

    private void imcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imcKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_imcKeyTyped

    private void grasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grasaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_grasaKeyTyped

    private void pechoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pechoKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_pechoKeyTyped

    private void espaldaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_espaldaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_espaldaKeyTyped

    private void caderaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caderaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_caderaKeyTyped

    private void gluteosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gluteosKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_gluteosKeyTyped

    private void cinturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cinturaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_cinturaKeyTyped

    private void pierna_izquierdaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pierna_izquierdaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_pierna_izquierdaKeyTyped

    private void pierna_derechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pierna_derechaKeyTyped
       validaNumeros(evt);
    }//GEN-LAST:event_pierna_derechaKeyTyped

    private void pantorrilla_izquierdaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pantorrilla_izquierdaKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_pantorrilla_izquierdaKeyTyped

    private void pantorrilla_derechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pantorrilla_derechaKeyTyped
       validaNumeros(evt);
    }//GEN-LAST:event_pantorrilla_derechaKeyTyped

    private void brazo_derechoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brazo_derechoKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_brazo_derechoKeyTyped

    private void brazo_izquierdoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brazo_izquierdoKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_brazo_izquierdoKeyTyped

    private void antebrazo_derechoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_antebrazo_derechoKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_antebrazo_derechoKeyTyped

    private void antebrazo_izquierdoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_antebrazo_izquierdoKeyTyped
        validaNumeros(evt);
    }//GEN-LAST:event_antebrazo_izquierdoKeyTyped

  public void createSeguimiento() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        Date date = new Date();
        String time = sdf.format(date);
        System.out.println(time);
        Seguimiento seg = new Seguimiento(Double.parseDouble(peso.getText()), Double.parseDouble(imc.getText()),
                time, Double.parseDouble(grasa.getText()),
                Double.parseDouble(pecho.getText()), Double.parseDouble(espalda.getText()),
                Double.parseDouble(cadera.getText()), Double.parseDouble(gluteos.getText()),
                Double.parseDouble(cintura.getText()), Double.parseDouble(pierna_izquierda.getText()),
                Double.parseDouble(pierna_derecha.getText()), Double.parseDouble(pantorrilla_izquierda.getText()),
                Double.parseDouble(pantorrilla_derecha.getText()), Double.parseDouble(brazo_izquierdo.getText()),
                Double.parseDouble(brazo_derecho.getText()), Double.parseDouble(antebrazo_derecho.getText()),
                Double.parseDouble(antebrazo_izquierdo.getText()), cliente);
        control.getDao().setSeguimiento(seg);//añade el seguimiento en la base de datos
        JOptionPane.showMessageDialog(null, "Seguimiento añadido correctamente.");
        clearCamposSeguimiento();
    }
  
    private void clearCamposSeguimiento() {
        peso.setText("");
        imc.setText("");
        grasa.setText("");
        pecho.setText("");
        espalda.setText("");
        cadera.setText("");
        gluteos.setText("");
        cintura.setText("");
        pierna_izquierda.setText("");
        pierna_derecha.setText("");
        pantorrilla_izquierda.setText("");
        pantorrilla_derecha.setText("");
        brazo_izquierdo.setText("");
        brazo_derecho.setText("");
        antebrazo_derecho.setText("");
        antebrazo_izquierdo.setText("");
    }
    
    private void validaNumeros(java.awt.event.KeyEvent evt){
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car!=(char)java.awt.event.KeyEvent.VK_COMMA) && (car!=(char)java.awt.event.KeyEvent.VK_PERIOD))
            evt.consume();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField antebrazo_derecho;
    private javax.swing.JTextField antebrazo_izquierdo;
    private javax.swing.JTextField brazo_derecho;
    private javax.swing.JTextField brazo_izquierdo;
    private javax.swing.JTextField cadera;
    private javax.swing.JTextField cintura;
    private javax.swing.JTextField espalda;
    private javax.swing.JTextField gluteos;
    private javax.swing.JTextField grasa;
    private javax.swing.JTextField imc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel nombre_reg_fisico;
    private javax.swing.JPanel panel_datos_seg;
    private javax.swing.JTextField pantorrilla_derecha;
    private javax.swing.JTextField pantorrilla_izquierda;
    private javax.swing.JTextField pecho;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField pierna_derecha;
    private javax.swing.JTextField pierna_izquierda;
    // End of variables declaration//GEN-END:variables
}
