/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.projetolocadoradeswing;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class AlterarFilme extends javax.swing.JInternalFrame {

    /**
     * Creates new form AlterarFilme
     */
    public AlterarFilme() {
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

        PaneAlterar = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alterarTitulo = new javax.swing.JTextField();
        alterarGenero = new javax.swing.JTextField();
        alterarData = new javax.swing.JTextField();
        alteraBotao = new javax.swing.JButton();
        limparBotao = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        alterarTituloAntigo = new javax.swing.JTextField();

        setTitle("Alterar Filme");

        jLabel1.setText("ALTERAR CAMPOS");

        jLabel2.setText("Titulo");

        jLabel3.setText("Genero");

        jLabel4.setText("Data de lancamento");

        alterarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarTituloActionPerformed(evt);
            }
        });

        alterarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarDataActionPerformed(evt);
            }
        });

        alteraBotao.setText("Alterar");
        alteraBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alteraBotaoActionPerformed(evt);
            }
        });

        limparBotao.setText("Limpar");
        limparBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBotaoActionPerformed(evt);
            }
        });

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Titulo Antigo");

        PaneAlterar.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PaneAlterar.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PaneAlterar.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PaneAlterar.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PaneAlterar.setLayer(alterarTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PaneAlterar.setLayer(alterarGenero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PaneAlterar.setLayer(alterarData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PaneAlterar.setLayer(alteraBotao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PaneAlterar.setLayer(limparBotao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PaneAlterar.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PaneAlterar.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PaneAlterar.setLayer(alterarTituloAntigo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PaneAlterarLayout = new javax.swing.GroupLayout(PaneAlterar);
        PaneAlterar.setLayout(PaneAlterarLayout);
        PaneAlterarLayout.setHorizontalGroup(
            PaneAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaneAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaneAlterarLayout.createSequentialGroup()
                        .addGroup(PaneAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alteraBotao)
                            .addGroup(PaneAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))
                        .addGroup(PaneAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PaneAlterarLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(PaneAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(alterarData)
                                    .addComponent(jLabel1)
                                    .addComponent(alterarTitulo)
                                    .addComponent(alterarGenero)
                                    .addComponent(alterarTituloAntigo, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PaneAlterarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(limparBotao)
                                .addGap(40, 40, 40)
                                .addComponent(jButton3)
                                .addGap(37, 37, 37))))
                    .addGroup(PaneAlterarLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PaneAlterarLayout.setVerticalGroup(
            PaneAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneAlterarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(PaneAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(alterarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PaneAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alterarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(PaneAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(alterarData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(PaneAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(alterarTituloAntigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PaneAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alteraBotao)
                    .addComponent(limparBotao)
                    .addComponent(jButton3))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PaneAlterar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaneAlterar)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alterarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarDataActionPerformed
        
    }//GEN-LAST:event_alterarDataActionPerformed

    private void limparBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBotaoActionPerformed
        alterarTitulo.setText("");
        alterarGenero.setText("");
        alterarData.setText("");
        alterarTituloAntigo.setText("");
    }//GEN-LAST:event_limparBotaoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void alteraBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alteraBotaoActionPerformed
        Filmes filme = new Filmes();
        
        filme.setTitulo(alterarTitulo.getText());
        filme.setGenero(alterarGenero.getText());
        filme.setData_de_lancamento(alterarData.getText());
        filme.setId(Integer.parseInt(alterarTituloAntigo.getText()));
        
        if ((alterarTitulo.getText().isEmpty()) || (alterarGenero.getText().isEmpty()) || (alterarData.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
         }
         else {

             FilmesDAO dao = new FilmesDAO();
             dao.alterarFilme(filme);
             JOptionPane.showMessageDialog(null, "Filme "+alterarTitulo.getText()+" alterado com sucesso! ");
         }
        
        alterarTitulo.setText("");
        alterarGenero.setText("");
        alterarData.setText("");
        alterarTituloAntigo.setText("");

    }//GEN-LAST:event_alteraBotaoActionPerformed

    private void alterarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alterarTituloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane PaneAlterar;
    private javax.swing.JButton alteraBotao;
    private javax.swing.JTextField alterarData;
    private javax.swing.JTextField alterarGenero;
    private javax.swing.JTextField alterarTitulo;
    private javax.swing.JTextField alterarTituloAntigo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton limparBotao;
    // End of variables declaration//GEN-END:variables
}