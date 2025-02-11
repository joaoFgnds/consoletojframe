/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

/**
 *
 * @author faria
 */
public class JFramePesquisa extends javax.swing.JFrame {

    /**
     * Creates new form JFramePesquisa
     */
    public JFramePesquisa() {
        initComponents();
    }

    private void verChk() {
        String msg = "Linguagens: \n";
        int countChk = 0;
        if (chkCobol.isSelected()) {
            msg = msg + chkCobol.getText() + "\n";
            countChk++;
        }
        if (chkJava.isSelected()) {
            msg = msg + chkJava.getText() + "\n";
            countChk++;
        }
        if (chkPHP.isSelected()) {
            msg = msg + chkPHP.getText() + "\n";
            countChk++;
        }
        if (chkPy.isSelected()) {
            msg = msg + chkPy.getText() + "\n";
            countChk++;
        }
        if (countChk > 0) {
            JOptionPane.showMessageDialog(null, msg);
        } else {
            JOptionPane.showMessageDialog(null,
                    " Nenhuma Linguagem Selecionada! ",
                    " .:Linguagens:. ", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparChk() {
        chkCobol.setSelected(false);
        chkJava.setSelected(false);
        chkPHP.setSelected(false);
        chkPy.setSelected(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEstadoCivil = new javax.swing.ButtonGroup();
        bgFormaPgto = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chkJava = new javax.swing.JCheckBox();
        chkPHP = new javax.swing.JCheckBox();
        chkPy = new javax.swing.JCheckBox();
        chkCobol = new javax.swing.JCheckBox();
        btnChk = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jcbLinguagens = new javax.swing.JComboBox<>();
        btnCB = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jrbSolteiro = new javax.swing.JRadioButton();
        jrbCasado = new javax.swing.JRadioButton();
        jrbSeparado = new javax.swing.JRadioButton();
        jrbDivorciado = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jrbUniaoEstavel = new javax.swing.JRadioButton();
        btnRB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jrbPix = new javax.swing.JRadioButton();
        jrbDebito = new javax.swing.JRadioButton();
        jrbCredito = new javax.swing.JRadioButton();
        jrbDinheiro = new javax.swing.JRadioButton();
        btnFPgto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Quais linguagem Já programou?");

        chkJava.setText("Java");
        chkJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkJavaActionPerformed(evt);
            }
        });

        chkPHP.setText("PHP");

        chkPy.setText("Phyton");

        chkCobol.setText("Cobol");

        btnChk.setText("Enviar");
        btnChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChkActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Qual linguagem não conhece?");

        jcbLinguagens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Cobol", "Fontran", "Assembler", "C#", "C++", "R", "" }));
        jcbLinguagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbLinguagensActionPerformed(evt);
            }
        });

        btnCB.setText("Enviar");
        btnCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCBActionPerformed(evt);
            }
        });

        bgEstadoCivil.add(jrbSolteiro);
        jrbSolteiro.setText("Solteiro(a)");

        bgEstadoCivil.add(jrbCasado);
        jrbCasado.setText("Casado(a)");

        bgEstadoCivil.add(jrbSeparado);
        jrbSeparado.setText("Separado(a)");

        bgEstadoCivil.add(jrbDivorciado);
        jrbDivorciado.setText("Divorciado(a)");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Forma de Pagamento ?");

        bgEstadoCivil.add(jrbUniaoEstavel);
        jrbUniaoEstavel.setText("União Estavel");

        btnRB.setText("Enviar");
        btnRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Estado Civil ?");

        bgFormaPgto.add(jrbPix);
        jrbPix.setText("Pix");

        bgFormaPgto.add(jrbDebito);
        jrbDebito.setText("Débito");

        bgFormaPgto.add(jrbCredito);
        jrbCredito.setText("Crédito");

        bgFormaPgto.add(jrbDinheiro);
        jrbDinheiro.setText("Dinheiro");

        btnFPgto.setText("Enviar");
        btnFPgto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFPgtoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(chkJava)
                            .addComponent(chkPHP)
                            .addComponent(chkPy)
                            .addComponent(chkCobol)
                            .addComponent(btnChk, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jrbSolteiro)
                                    .addComponent(jrbCasado)
                                    .addComponent(jrbSeparado)
                                    .addComponent(jrbDivorciado)
                                    .addComponent(jrbUniaoEstavel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbLinguagens, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbPix)
                                    .addComponent(jrbDebito)
                                    .addComponent(jrbCredito))
                                .addGap(7, 7, 7))
                            .addComponent(jrbDinheiro, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFPgto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkJava)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkPHP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkPy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkCobol))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbLinguagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChk)
                            .addComponent(btnCB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRB)
                                        .addGap(3, 3, 3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrbSolteiro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrbCasado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrbSeparado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrbDivorciado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrbUniaoEstavel)
                                        .addGap(0, 10, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFPgto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrbPix)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbDebito)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbCredito)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbDinheiro)
                                        .addGap(9, 9, 9)))))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRBActionPerformed
        // TODO add your handling code here:
        for (Enumeration<AbstractButton> btn = bgEstadoCivil.getElements(); btn.hasMoreElements();) {
            AbstractButton rb = btn.nextElement();
            if (rb.isSelected()) {
                JOptionPane.showMessageDialog(this, "Seu estado Civil é : "
                    + rb.getText());
                break;
            }
        }
        
        bgEstadoCivil.clearSelection();
        
        
        
        //OUTRA MANEIRA DE FAZER COM O IF 
//        if(jrbSolteiro.isSelected()){
//            JOptionPane.showMessageDialog(this, "Seu estado Civil é : "
//                    + jrbSolteiro.getText());
//        }
             
        
    }//GEN-LAST:event_btnRBActionPerformed

    private void btnCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCBActionPerformed
        // TODO add your handling code here:
        if (!jcbLinguagens.getSelectedItem().equals(" Selecione... ")) {
            JOptionPane.showMessageDialog(null, " Linguagem de Programação "
                + "selecionada foi : " + jcbLinguagens.getSelectedItem());
        } else {
            JOptionPane.showMessageDialog(null, "Selecionar linguagem !");
        }
        jcbLinguagens.setSelectedIndex(0); // PARA VOLTAR AO PRIMEIRO ITEM DO COMBOBOX
    }//GEN-LAST:event_btnCBActionPerformed

    private void jcbLinguagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbLinguagensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbLinguagensActionPerformed

    private void btnChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChkActionPerformed
        // TODO add your handling code here:
        verChk();
        limparChk();
    }//GEN-LAST:event_btnChkActionPerformed

    private void chkJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkJavaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkJavaActionPerformed

    private void btnFPgtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFPgtoActionPerformed
        // TODO add your handling code here:
        
       if(jrbPix.isSelected()){
          JOptionPane.showMessageDialog(this, "A forma de pagamento escolhida foi  : "
                 + jrbPix.getText());
        } 
       
          if(jrbDebito.isSelected()){
          JOptionPane.showMessageDialog(this, "A forma de pagamento escolhida foi : "
                 + jrbDebito.getText());
        } 
          
            if(jrbCredito.isSelected()){
          JOptionPane.showMessageDialog(this, "A forma de pagamento escolhida foi : "
                 + jrbCredito.getText());
        } 
            
              if(jrbDinheiro.isSelected()){
          JOptionPane.showMessageDialog(this, "A forma de pagamento escolhida foi : "
                 + jrbDinheiro.getText());
        } 
              bgFormaPgto.clearSelection();
             
    }//GEN-LAST:event_btnFPgtoActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEstadoCivil;
    private javax.swing.ButtonGroup bgFormaPgto;
    private javax.swing.JButton btnCB;
    private javax.swing.JButton btnChk;
    private javax.swing.JButton btnFPgto;
    private javax.swing.JButton btnRB;
    private javax.swing.JCheckBox chkCobol;
    private javax.swing.JCheckBox chkJava;
    private javax.swing.JCheckBox chkPHP;
    private javax.swing.JCheckBox chkPy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jcbLinguagens;
    private javax.swing.JRadioButton jrbCasado;
    private javax.swing.JRadioButton jrbCredito;
    private javax.swing.JRadioButton jrbDebito;
    private javax.swing.JRadioButton jrbDinheiro;
    private javax.swing.JRadioButton jrbDivorciado;
    private javax.swing.JRadioButton jrbPix;
    private javax.swing.JRadioButton jrbSeparado;
    private javax.swing.JRadioButton jrbSolteiro;
    private javax.swing.JRadioButton jrbUniaoEstavel;
    // End of variables declaration//GEN-END:variables
}
