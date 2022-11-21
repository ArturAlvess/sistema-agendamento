package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {

    private int linha;

    public MedicoPanel() {

        initComponents();
        MedicoDAO.criarListaDeMedicos();
        preencherTabela();

    }

    private int getLinha() {
        linha = tableMédicos.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMédicos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMédicos = new javax.swing.JTable();
        buttonDelete = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(920, 320));

        panelMédicos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de planos de saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 0))); // NOI18N
        panelMédicos.setPreferredSize(new java.awt.Dimension(920, 320));
        panelMédicos.setLayout(null);

        tableMédicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "CRM", "Nome", "Telefone"
            }
        ));
        tableMédicos.setToolTipText("Lista");
        tableMédicos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableMédicos);

        panelMédicos.add(jScrollPane2);
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
        panelMédicos.add(buttonDelete);
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
        panelMédicos.add(buttonEdit);
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
        panelMédicos.add(buttonSave);
        buttonSave.setBounds(790, 240, 90, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelMédicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelMédicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        if (getLinha() != -1) {
            excluirMedico();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o médico que você deseja excluir.",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        if (getLinha() != -1) {
            editarMedico();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o médico que deseja editar.",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        MedicoDialog addTela = new MedicoDialog(null, true, OperacaoEnum.ADICIONAR);
        addTela.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonSave;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelMédicos;
    private javax.swing.JTable tableMédicos;
    // End of variables declaration//GEN-END:variables

    private void editarMedico() {
        Medico medico = MedicoDAO.getMedico(getCodigo());
        MedicoDialog medicoDialog = new MedicoDialog(null, true, medico, OperacaoEnum.EDITAR);
        medicoDialog.setVisible(true);
        preencherTabela();
    }

    private void excluirMedico() {
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Atenção!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if(resposta == 0){
            MedicoDAO.excluir(getCodigo());
            preencherTabela();
        }

    }

    private Integer getCodigo() {
        String codigoStr = tableMédicos.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    private void preencherTabela() {
        tableMédicos.setModel(MedicoDAO.getMedicosModel());
        ajustarTabela();
    }

    private void ajustarTabela() {
        //Impedir mudança de colunas
        tableMédicos.getTableHeader().setReorderingAllowed(false);

        //Bloquear células
        tableMédicos.setDefaultEditor(Object.class, null);

        //Definir colunas
        tableMédicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMédicos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMédicos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tableMédicos.getColumnModel().getColumn(2).setPreferredWidth(300);
        tableMédicos.getColumnModel().getColumn(3).setPreferredWidth(327);
    }

}
