package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class EspecialidadesPanel extends javax.swing.JPanel {

    private int linha;
    
    
    public EspecialidadesPanel() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidades();
        preencherTabela();
        
    }

    private int getLinha() {
        linha = tableEspecialidades.getSelectedRow();
        return linha;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonDelete = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidades Médicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(920, 320));
        setLayout(null);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Descrição"
            }
        ));
        tableEspecialidades.setToolTipText("Lista");
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableEspecialidades);

        add(jScrollPane2);
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
        add(buttonDelete);
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
        add(buttonEdit);
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
        add(buttonSave);
        buttonSave.setBounds(790, 240, 90, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        EspecialidadesDialog telaAdd = new EspecialidadesDialog(
                null,
                true);
        telaAdd.setVisible(true);
        preencherTabela();
       
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
       
        if(getLinha() != -1){
            excluirEspecialidade();
        } else{
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione a especialidade que você deseja excluir.",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
            
        
        
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        
        
       if(getLinha() != -1){
           editarEspecialidade();
       }else {
           JOptionPane.showConfirmDialog(
                   this, 
                   "Por favor, selecione a especialidade que deseja editar!",
                   "Especialidades",
                   JOptionPane.WARNING_MESSAGE);
       }
        
        
    }//GEN-LAST:event_buttonEditActionPerformed

    private void editarEspecialidade(){
        
        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
        
        EspecialidadesDialog especialidadeDialog = new EspecialidadesDialog(null, true);
        especialidadeDialog.setVisible(true);
        preencherTabela();
    }
    
    private void excluirEspecialidade(){
        
        int resposta = JOptionPane.showConfirmDialog(this, "Você confirma a exclusão?",
                "Atenção!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
           EspecialidadeDAO.excluir(getCodigo());
           preencherTabela(); 
        }
        
    }
    
    private Integer getCodigo(){
        String codigoStr = tableEspecialidades.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonSave;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

       

        tableEspecialidades.setModel(EspecialidadeDAO.getEspecialidadesModel());
        ajustarTabela();

    }
    
    private void ajustarTabela(){
        // Impedir que o usuário movimente as colunas
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);
        
        // Bloquear as células da tabela
        tableEspecialidades.setDefaultEditor(Object.class, null);
        
        // Definir as colunas
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(477);
    }

}
