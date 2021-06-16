package victorY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {
    private ArrayList listaTimes = new ArrayList();

    public TelaInicial() {
        initComponents();
        this.listaTimes = desserializarTimes();
        setDefaultCloseOperation(TelaInicial.DISPOSE_ON_CLOSE); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_cadastro = new javax.swing.JButton();
        lb_cadastrarTimes = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        tf_pais = new javax.swing.JTextField();
        lb_pais = new javax.swing.JLabel();
        sp_separador = new javax.swing.JSeparator();
        bt_cadastrarTimes = new javax.swing.JButton();
        lb_cadastrarTimes1 = new javax.swing.JLabel();
        sp_separador1 = new javax.swing.JSeparator();
        bt_criarChaves = new javax.swing.JButton();
        bt_reset = new javax.swing.JButton();

        bt_cadastro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bt_cadastro.setText("Cadastrar");
        bt_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastroActionPerformed(evt);
            }
        });

        lb_cadastrarTimes.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lb_cadastrarTimes.setText("Cadastrar Times");

        lb_nome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lb_nome.setText("Nome:");

        tf_nome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        tf_pais.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lb_pais.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lb_pais.setText("País:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_cadastrarTimes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bt_cadastrarTimes.setText("Cadastrar Times");
        bt_cadastrarTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarTimesActionPerformed(evt);
            }
        });

        lb_cadastrarTimes1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lb_cadastrarTimes1.setText("VictorY");

        bt_criarChaves.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bt_criarChaves.setText("Iniciar Campeonato");
        bt_criarChaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_criarChavesActionPerformed(evt);
            }
        });

        bt_reset.setText("Reset");
        bt_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp_separador1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(lb_cadastrarTimes1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_cadastrarTimes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_criarChaves, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(bt_reset)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_cadastrarTimes1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp_separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_cadastrarTimes)
                        .addGap(22, 22, 22)
                        .addComponent(bt_criarChaves))
                    .addComponent(bt_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastroActionPerformed
        
    }//GEN-LAST:event_bt_cadastroActionPerformed

    private void bt_cadastrarTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarTimesActionPerformed
        CadastroTimes cad = new CadastroTimes();
        cad.setVisible(true);
    }//GEN-LAST:event_bt_cadastrarTimesActionPerformed

    private void bt_criarChavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_criarChavesActionPerformed
    if (listaTimes.size() == 16) {
        IniciarCampeonato cha = new IniciarCampeonato();
        cha.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(
                    null,
                    "Por favor, insira 16 times. Times cadastrados: " + listaTimes.size() + ". Caso já tenha cadastrado 16 times, reinicie a aplicação",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_criarChavesActionPerformed

    private void bt_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_resetActionPerformed
        try {
            new FileOutputStream("times.ser").close();
            new FileOutputStream("nomes.ser").close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_resetActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaInicial().setVisible(true);
            
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
    private javax.swing.JButton bt_cadastro;
    private javax.swing.JButton bt_criarChaves;
    private javax.swing.JButton bt_reset;
    private javax.swing.JLabel lb_cadastrarTimes;
    private javax.swing.JLabel lb_cadastrarTimes1;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_pais;
    private javax.swing.JSeparator sp_separador;
    private javax.swing.JSeparator sp_separador1;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_pais;
    // End of variables declaration//GEN-END:variables
}
