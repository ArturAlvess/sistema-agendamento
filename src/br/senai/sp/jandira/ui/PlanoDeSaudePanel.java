package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JTable;

public class PlanoDeSaudePanel extends javax.swing.JPanel {

   private int linha;
   
    public PlanoDeSaudePanel() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanosDeSaude();
        preencherTabela();
    }
    
    private int getLinha(){
        linha = tablePlanosDeSaude.getSelectedRow();
        return linha;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlanosDeSaude = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonDelete = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();

        panelPlanosDeSaude.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de planos de saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 0))); // NOI18N
        panelPlanosDeSaude.setPreferredSize(new java.awt.Dimension(920, 320));
        panelPlanosDeSaude.setLayout(null);

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número", "Operadora", "Categoria", "Validade"
            }
        ));
        tablePlanosDeSaude.setToolTipText("Lista");
        tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablePlanosDeSaude);

        panelPlanosDeSaude.add(jScrollPane2);
        jScrollPane2.setBounds(10, 40, 880, 180);

        buttonDelete.setBackground(new java.awt.Color(255, 153, 153));
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/Delete.png"))); // NOI18N
        buttonDelete.setToolTipText("Excluir ");
        buttonDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        panelPlanosDeSaude.add(buttonDelete);
        buttonDelete.setBounds(590, 240, 90, 60);

        buttonEdit.setBackground(new java.awt.Color(255, 255, 153));
        buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/Edit.png"))); // NOI18N
        buttonEdit.setToolTipText("Editar");
        buttonEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 212, 0), 2));
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        panelPlanosDeSaude.add(buttonEdit);
        buttonEdit.setBounds(690, 240, 90, 60);

        buttonSave.setBackground(new java.awt.Color(0, 204, 153));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/new.png"))); // NOI18N
        buttonSave.setToolTipText("Criar ");
        buttonSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        panelPlanosDeSaude.add(buttonSave);
        buttonSave.setBounds(790, 240, 90, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelPlanosDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelPlanosDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed

      

    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed

       

    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        PlanoDeSaudeDialog addTela = new PlanoDeSaudeDialog(null, true);
        addTela.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_buttonSaveActionPerformed
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonSave;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelPlanosDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

//    private void editarPlanoDeSaude(){
//        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude()
//    }
    
    
    
    
    
    
    private void preencherTabela(){
        tablePlanosDeSaude.setModel(PlanoDeSaudeDAO.getPlanosDeSaudeModel());
        ajustarTabela();
    }
    
    private void ajustarTabela(){
        // Impedir a mudança de colunas
        tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);
        
        // Bloquear as células
        tablePlanosDeSaude.setDefaultEditor(Object.class, null);
        
        // Definir colunas
        tablePlanosDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanosDeSaude.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePlanosDeSaude.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablePlanosDeSaude.getColumnModel().getColumn(2).setPreferredWidth(350);
        tablePlanosDeSaude.getColumnModel().getColumn(3).setPreferredWidth(227);
    }

}
