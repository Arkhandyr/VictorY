/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorY;

import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Chaves extends javax.swing.JFrame {
    private ArrayList listaTimes = new ArrayList();
    private ArrayList listaNomes = new ArrayList();
    
    public Chaves() {
        initComponents();
        this.listaTimes = desserializarTimes();
        this.listaNomes = desserializarNomes();
        setDefaultCloseOperation(TelaInicial.DISPOSE_ON_CLOSE);
        Collections.shuffle(listaNomes);
        bt_2.setText(listaNomes.get(0).toString());
        bt_1.setText(listaNomes.get(1).toString());
        bt_4.setText(listaNomes.get(2).toString());
        bt_3.setText(listaNomes.get(3).toString());
        bt_6.setText(listaNomes.get(4).toString());
        bt_5.setText(listaNomes.get(5).toString());
        bt_8.setText(listaNomes.get(6).toString());
        bt_7.setText(listaNomes.get(7).toString());
        bt_9.setText(listaNomes.get(8).toString());
        bt_10.setText(listaNomes.get(9).toString());
        bt_11.setText(listaNomes.get(10).toString());
        bt_12.setText(listaNomes.get(11).toString());
        bt_13.setText(listaNomes.get(12).toString());
        bt_14.setText(listaNomes.get(13).toString());
        bt_15.setText(listaNomes.get(14).toString());
        bt_16.setText(listaNomes.get(15).toString());
        bt_1.setPreferredSize(new Dimension(100, 28));
        bt_2.setPreferredSize(new Dimension(100, 28));
        bt_3.setPreferredSize(new Dimension(100, 28));
        bt_4.setPreferredSize(new Dimension(100, 28));
        bt_5.setPreferredSize(new Dimension(100, 28));
        bt_6.setPreferredSize(new Dimension(100, 28));
        bt_7.setPreferredSize(new Dimension(100, 28));
        bt_8.setPreferredSize(new Dimension(100, 28));
        bt_9.setPreferredSize(new Dimension(100, 28));
        bt_10.setPreferredSize(new Dimension(100, 28));
        bt_11.setPreferredSize(new Dimension(100, 28));
        bt_12.setPreferredSize(new Dimension(100, 28));
        bt_13.setPreferredSize(new Dimension(100, 28));
        bt_14.setPreferredSize(new Dimension(100, 28));
        bt_15.setPreferredSize(new Dimension(100, 28));
        bt_16.setPreferredSize(new Dimension(100, 28));
        bt_a1.setPreferredSize(new Dimension(100, 28));
        bt_a2.setPreferredSize(new Dimension(100, 28));
        bt_b1.setPreferredSize(new Dimension(100, 28));
        bt_b2.setPreferredSize(new Dimension(100, 28));
        bt_c1.setPreferredSize(new Dimension(100, 28));
        bt_c2.setPreferredSize(new Dimension(100, 28));
        bt_d1.setPreferredSize(new Dimension(100, 28));
        bt_d2.setPreferredSize(new Dimension(100, 28));
        bt_semi1.setPreferredSize(new Dimension(100, 28));
        bt_semi2.setPreferredSize(new Dimension(100, 28));
        bt_semi3.setPreferredSize(new Dimension(100, 28));
        bt_semi4.setPreferredSize(new Dimension(100, 28));
        bt_final2.setPreferredSize(new Dimension(100, 28));
        bt_final3.setPreferredSize(new Dimension(100, 28));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_20 = new javax.swing.JButton();
        bt_22 = new javax.swing.JButton();
        bt_23 = new javax.swing.JButton();
        bt_24 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bt_semi2 = new javax.swing.JButton();
        bt_semi1 = new javax.swing.JButton();
        bt_10 = new javax.swing.JButton();
        camp1 = new javax.swing.JLabel();
        bt_11 = new javax.swing.JButton();
        tf_campeao = new javax.swing.JTextField();
        bt_12 = new javax.swing.JButton();
        bt_semi4 = new javax.swing.JButton();
        bt_13 = new javax.swing.JButton();
        bt_semi3 = new javax.swing.JButton();
        bt_14 = new javax.swing.JButton();
        bt_final2 = new javax.swing.JButton();
        bt_16 = new javax.swing.JButton();
        bt_final1 = new javax.swing.JButton();
        bt_15 = new javax.swing.JButton();
        lb_X1 = new javax.swing.JLabel();
        bt_a1 = new javax.swing.JButton();
        bt_c1 = new javax.swing.JButton();
        bt_d1 = new javax.swing.JButton();
        bt_b1 = new javax.swing.JButton();
        bt_2 = new javax.swing.JButton();
        bt_1 = new javax.swing.JButton();
        bt_4 = new javax.swing.JButton();
        bt_a2 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        bt_c2 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_d2 = new javax.swing.JButton();
        bt_5 = new javax.swing.JButton();
        bt_b2 = new javax.swing.JButton();
        bt_8 = new javax.swing.JButton();
        bt_7 = new javax.swing.JButton();
        bt_9 = new javax.swing.JButton();
        bt_final3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_semi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_semi2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_semi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 100, 28));

        bt_semi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_semi1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_semi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 100, 28));

        bt_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_10ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 100, 28));

        camp1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        camp1.setText("Campeão:");
        jPanel1.add(camp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        bt_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_11ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 100, 28));

        tf_campeao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_campeaoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_campeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 126, 32));

        bt_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_12ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 100, 28));

        bt_semi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_semi4ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_semi4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 100, 28));

        bt_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_13ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 100, 28));

        bt_semi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_semi3ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_semi3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 100, 28));

        bt_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_14ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 100, 28));

        bt_final2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_final2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_final2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 110, 28));

        bt_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_16ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 100, 28));
        jPanel1.add(bt_final1, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 161, 0, 28));

        bt_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_15ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 100, 28));

        lb_X1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_X1.setText("X");
        jPanel1.add(lb_X1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, 20));

        bt_a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_a1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 100, 28));

        bt_c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_c1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, 28));

        bt_d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_d1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 100, 28));

        bt_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_b1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, 28));

        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 28));

        bt_1.setMaximumSize(new java.awt.Dimension(100, 6));
        bt_1.setMinimumSize(new java.awt.Dimension(100, 6));
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 28));

        bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_4ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 28));

        bt_a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_a2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 100, 28));

        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 28));

        bt_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_c2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 100, 28));

        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 28));

        bt_d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_d2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 100, 28));

        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, 28));

        bt_b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_b2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 100, 28));

        bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_8ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, 28));

        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 100, 28));

        bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_9ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 100, 28));

        bt_final3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_final3ActionPerformed(evt);
            }
        });
        jPanel1.add(bt_final3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_campeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_campeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_campeaoActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed
        bt_a1.setText(bt_2.getText());
    }//GEN-LAST:event_bt_2ActionPerformed

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1ActionPerformed
        bt_a1.setText(bt_1.getText());
    }//GEN-LAST:event_bt_1ActionPerformed

    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_4ActionPerformed
        bt_b1.setText(bt_4.getText());
    }//GEN-LAST:event_bt_4ActionPerformed

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_3ActionPerformed
        bt_b1.setText(bt_3.getText());
    }//GEN-LAST:event_bt_3ActionPerformed

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_5ActionPerformed
        bt_c1.setText(bt_5.getText());
    }//GEN-LAST:event_bt_5ActionPerformed

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_6ActionPerformed
        bt_c1.setText(bt_6.getText());
    }//GEN-LAST:event_bt_6ActionPerformed

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_7ActionPerformed
        bt_d1.setText(bt_7.getText());
    }//GEN-LAST:event_bt_7ActionPerformed

    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_8ActionPerformed
        bt_d1.setText(bt_8.getText());
    }//GEN-LAST:event_bt_8ActionPerformed

    private void bt_a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_a1ActionPerformed
        bt_semi1.setText(bt_a1.getText());
    }//GEN-LAST:event_bt_a1ActionPerformed

    private void bt_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_b1ActionPerformed
        bt_semi1.setText(bt_b1.getText());
    }//GEN-LAST:event_bt_b1ActionPerformed

    private void bt_c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_c1ActionPerformed
        bt_semi2.setText(bt_c1.getText());
    }//GEN-LAST:event_bt_c1ActionPerformed

    private void bt_d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_d1ActionPerformed
        bt_semi2.setText(bt_d1.getText());
    }//GEN-LAST:event_bt_d1ActionPerformed

    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_9ActionPerformed
        bt_a2.setText(bt_9.getText());
    }//GEN-LAST:event_bt_9ActionPerformed

    private void bt_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_10ActionPerformed
        bt_a2.setText(bt_10.getText());
    }//GEN-LAST:event_bt_10ActionPerformed

    private void bt_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_11ActionPerformed
        bt_b2.setText(bt_11.getText());
    }//GEN-LAST:event_bt_11ActionPerformed

    private void bt_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_13ActionPerformed
        bt_c2.setText(bt_13.getText());
    }//GEN-LAST:event_bt_13ActionPerformed

    private void bt_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_14ActionPerformed
        bt_c2.setText(bt_14.getText());
    }//GEN-LAST:event_bt_14ActionPerformed

    private void bt_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_15ActionPerformed
        bt_d2.setText(bt_15.getText());
    }//GEN-LAST:event_bt_15ActionPerformed

    private void bt_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_16ActionPerformed
        bt_d2.setText(bt_16.getText());
    }//GEN-LAST:event_bt_16ActionPerformed

    private void bt_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_12ActionPerformed
        bt_b2.setText(bt_12.getText());
    }//GEN-LAST:event_bt_12ActionPerformed

    private void bt_a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_a2ActionPerformed
        bt_semi3.setText(bt_a2.getText());
    }//GEN-LAST:event_bt_a2ActionPerformed

    private void bt_b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_b2ActionPerformed
        bt_semi3.setText(bt_b2.getText());
    }//GEN-LAST:event_bt_b2ActionPerformed

    private void bt_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_c2ActionPerformed
        bt_semi4.setText(bt_c2.getText());
    }//GEN-LAST:event_bt_c2ActionPerformed

    private void bt_d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_d2ActionPerformed
        bt_semi4.setText(bt_d2.getText());
    }//GEN-LAST:event_bt_d2ActionPerformed

    private void bt_semi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_semi1ActionPerformed
        bt_final3.setText(bt_semi1.getText());
    }//GEN-LAST:event_bt_semi1ActionPerformed

    private void bt_semi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_semi2ActionPerformed
        bt_final2.setText(bt_semi2.getText());
    }//GEN-LAST:event_bt_semi2ActionPerformed

    private void bt_semi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_semi4ActionPerformed
        bt_final2.setText(bt_semi4.getText());
    }//GEN-LAST:event_bt_semi4ActionPerformed

    private void bt_semi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_semi3ActionPerformed
        bt_final3.setText(bt_semi3.getText());
    }//GEN-LAST:event_bt_semi3ActionPerformed

    private void bt_final3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_final3ActionPerformed
        tf_campeao.setText(bt_final3.getText());
    }//GEN-LAST:event_bt_final3ActionPerformed

    private void bt_final2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_final2ActionPerformed
        tf_campeao.setText(bt_final2.getText());
    }//GEN-LAST:event_bt_final2ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Chaves().setVisible(true);
        });
    }
    
    private ArrayList<Time> desserializarTimes() {
        try {
         FileInputStream fileIn = new FileInputStream("times.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         listaTimes = (ArrayList<Time>) in.readObject();
         in.close();
         fileIn.close();
        } catch (IOException i) {
            return listaTimes;
        } catch (ClassNotFoundException c) {
            System.out.println("Classe não encontrada");
         return listaTimes;
        }
        return listaTimes;
    }
    private ArrayList<Time> desserializarNomes() {
        try {
         FileInputStream fileIn2 = new FileInputStream("nomes.ser");
         ObjectInputStream in2 = new ObjectInputStream(fileIn2);
         listaNomes = (ArrayList<Time>) in2.readObject();
         in2.close();
         fileIn2.close();
        } catch (IOException i) {
            return listaNomes;
        } catch (ClassNotFoundException c) {
            System.out.println("Classe não encontrada");
         return listaNomes;
        }
        return listaNomes;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_10;
    private javax.swing.JButton bt_11;
    private javax.swing.JButton bt_12;
    private javax.swing.JButton bt_13;
    private javax.swing.JButton bt_14;
    private javax.swing.JButton bt_15;
    private javax.swing.JButton bt_16;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_20;
    private javax.swing.JButton bt_22;
    private javax.swing.JButton bt_23;
    private javax.swing.JButton bt_24;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JButton bt_8;
    private javax.swing.JButton bt_9;
    private javax.swing.JButton bt_a1;
    private javax.swing.JButton bt_a2;
    private javax.swing.JButton bt_b1;
    private javax.swing.JButton bt_b2;
    private javax.swing.JButton bt_c1;
    private javax.swing.JButton bt_c2;
    private javax.swing.JButton bt_d1;
    private javax.swing.JButton bt_d2;
    private javax.swing.JButton bt_final1;
    private javax.swing.JButton bt_final2;
    private javax.swing.JButton bt_final3;
    private javax.swing.JButton bt_semi1;
    private javax.swing.JButton bt_semi2;
    private javax.swing.JButton bt_semi3;
    private javax.swing.JButton bt_semi4;
    private javax.swing.JLabel camp1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_X1;
    private javax.swing.JTextField tf_campeao;
    // End of variables declaration//GEN-END:variables
}
