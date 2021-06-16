package victorY;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IniciarCampeonato extends javax.swing.JFrame {
    private ArrayList listaTimes = new ArrayList();
    List<String> listaNomes = new ArrayList<String>();
   
    public IniciarCampeonato() {
        initComponents();
        this.listaTimes = desserializarTimes();
        setDefaultCloseOperation(TelaInicial.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp_separador1 = new javax.swing.JSeparator();
        bt_cadastro2 = new javax.swing.JButton();
        bt_cadastro3 = new javax.swing.JButton();
        bt_cadastrarTimes = new javax.swing.JButton();
        lb_cadastrarTimes1 = new javax.swing.JLabel();
        sp_separador2 = new javax.swing.JSeparator();
        bt_chaves = new javax.swing.JButton();
        bt_grupos = new javax.swing.JButton();
        lb_cadastrarTimes2 = new javax.swing.JLabel();

        bt_cadastro2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bt_cadastro2.setText("Criar Chaves");
        bt_cadastro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastro2ActionPerformed(evt);
            }
        });

        bt_cadastro3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bt_cadastro3.setText("Visualizar Chaves");
        bt_cadastro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastro3ActionPerformed(evt);
            }
        });

        bt_cadastrarTimes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bt_cadastrarTimes.setText("Cadastrar Times");
        bt_cadastrarTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarTimesActionPerformed(evt);
            }
        });

        lb_cadastrarTimes1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lb_cadastrarTimes1.setText("Worlds 2020");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_chaves.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bt_chaves.setText("Chaves");
        bt_chaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_chavesActionPerformed(evt);
            }
        });

        bt_grupos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bt_grupos.setText("Grupos");
        bt_grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_gruposActionPerformed(evt);
            }
        });

        lb_cadastrarTimes2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lb_cadastrarTimes2.setText("Modelo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sp_separador2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt_chaves, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lb_cadastrarTimes2)))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_cadastrarTimes2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp_separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_grupos)
                .addGap(18, 18, 18)
                .addComponent(bt_chaves)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_cadastro2ActionPerformed

    private void bt_cadastro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastro3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_cadastro3ActionPerformed

    private void bt_cadastrarTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarTimesActionPerformed
        CadastroTimes cad = new CadastroTimes();
        cad.setVisible(true);
    }//GEN-LAST:event_bt_cadastrarTimesActionPerformed

    private void bt_chavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_chavesActionPerformed
        Chaves cha = new Chaves();
        cha.setVisible(true);
        cha.setResizable(false);

    }//GEN-LAST:event_bt_chavesActionPerformed

    private void bt_gruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_gruposActionPerformed
        Grupos gru = new Grupos();
        gru.setVisible(true);
        gru.setResizable(false);

    }//GEN-LAST:event_bt_gruposActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IniciarCampeonato().setVisible(true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrarTimes;
    private javax.swing.JButton bt_cadastro2;
    private javax.swing.JButton bt_cadastro3;
    private javax.swing.JButton bt_chaves;
    private javax.swing.JButton bt_grupos;
    private javax.swing.JLabel lb_cadastrarTimes1;
    private javax.swing.JLabel lb_cadastrarTimes2;
    private javax.swing.JSeparator sp_separador1;
    private javax.swing.JSeparator sp_separador2;
    // End of variables declaration//GEN-END:variables
}
