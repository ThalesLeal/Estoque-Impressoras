/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastros;

import Tabela.ModeloTabelaSetor;
import dao.SetorDAO;
import entidades.Setor;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import utilitarios.ViewDialog;

/**
 *
 * @author thales
 */
public class Gerenciador_setor extends FormPadrao {

    private JDialog view;
    private ModeloTabelaSetor modeloTabelaSetor = new ModeloTabelaSetor();

    /**
     * Creates new form GERENCIADOR_SETOR
     */
    public Gerenciador_setor() {
        initComponents();

        tabelaSetores.setModel(modeloTabelaSetor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSetores = new javax.swing.JTable();
        listar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        fechar = new javax.swing.JButton();

        tabelaSetores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaSetores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaSetoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaSetores);

        listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/listar.png"))); // NOI18N
        listar.setText("Listar");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastrar.png"))); // NOI18N
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fechar_1.png"))); // NOI18N
        fechar.setText("Fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(listar)
                .addGap(69, 69, 69)
                .addComponent(cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(fechar)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(listar)
                    .addComponent(fechar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        fecharTela();
    }//GEN-LAST:event_fecharActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        Cadastro_setor form = new Cadastro_setor();
        ViewDialog view = new ViewDialog("Cadastro de Setor", form, new Dimension(400, 220), this);
        form.setView(view);
        view.showView();
    }//GEN-LAST:event_cadastrarActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        List<Setor> listaSetores = SetorDAO.getInstance().findAll();
        modeloTabelaSetor.limpar();

        for (Setor setor : listaSetores) {

            modeloTabelaSetor.addItem(setor);

        }


    }//GEN-LAST:event_listarActionPerformed

    private void tabelaSetoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSetoresMouseClicked
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null, "Linha selecionada " + tabelaSetores.getSelectedRow());

        Cadastro_setor form = new Cadastro_setor();

        ViewDialog view = new ViewDialog("Editar o Setor", form, new Dimension(400, 400), this);
        form.setView(view);
        view.showView();
    }//GEN-LAST:event_tabelaSetoresMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton fechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listar;
    private javax.swing.JTable tabelaSetores;
    // End of variables declaration//GEN-END:variables
}