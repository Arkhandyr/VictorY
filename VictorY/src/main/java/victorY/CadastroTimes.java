package victorY;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroTimes extends javax.swing.JFrame {
    private ArrayList listaTimes = new ArrayList();
    private ArrayList listaNomes = new ArrayList<String>();
    
    public CadastroTimes() {
        initComponents();
        this.listaTimes = desserializarTimes();
        this.listaNomes = desserializarNomes();
        setDefaultCloseOperation(TelaInicial.DISPOSE_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_cadastro = new javax.swing.JButton();
        lb_cadastrarTimes = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        tf_pais = new javax.swing.JTextField();
        lb_pais = new javax.swing.JLabel();
        sp_separador = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        tf_nome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        tf_pais.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lb_pais.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lb_pais.setText("País:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lb_cadastrarTimes)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lb_nome)
                                .addComponent(lb_pais))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_pais)
                                .addComponent(tf_nome)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bt_cadastro)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp_separador)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_cadastrarTimes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp_separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_pais))
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(bt_cadastro)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastroActionPerformed
        if (!"".equals(tf_nome.getText()) && !"".equals(tf_pais.getText())) {
            String nome = tf_nome.getText();
            String pais = tf_pais.getText();
            Time t = new Time(nome, pais);
            listaTimes.add(t);
            listaNomes.add(t.getNome());
            serializarTimes(listaTimes);
            serializarNomes(listaNomes);
            System.out.println(listaTimes);
            JOptionPane.showMessageDialog(
                    null,
                    "Cadastro efetuado.",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (listaTimes.size()<16) {
            JOptionPane.showMessageDialog(
                    null,
                    "Limite de times atingido.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Por favor, preencha os campos.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        tf_nome.setText("");
        tf_pais.setText("");
    }//GEN-LAST:event_bt_cadastroActionPerformed

     public void serializarTimes(ArrayList<Time> listaTimes) {
        try {
         FileOutputStream fileOut = new FileOutputStream("times.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(listaTimes);
         out.close();
         fileOut.close();
         System.out.printf("Dados salvos em times.ser\n");
        } catch (IOException i) {
        }
    }
     public void serializarNomes(ArrayList<Time> listaNomes) {
        try {
         FileOutputStream fileOut2 = new FileOutputStream("nomes.ser");
         ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);
         out2.writeObject(listaNomes);
         out2.close();
         fileOut2.close();
         System.out.printf("Dados salvos em nomes.ser\n");
        } catch (IOException i) {
        }
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
            java.util.logging.Logger.getLogger(CadastroTimes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroTimes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastro;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lb_cadastrarTimes;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_pais;
    private javax.swing.JSeparator sp_separador;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_pais;
    // End of variables declaration//GEN-END:variables
}
