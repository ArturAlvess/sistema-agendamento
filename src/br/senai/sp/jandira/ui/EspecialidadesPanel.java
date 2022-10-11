package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;

public class EspecialidadesPanel extends javax.swing.JPanel {

    
    public EspecialidadesPanel() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidades();
        preencherTabela();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablelista = new javax.swing.JTable();
        buttonDelete = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidades Médicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(920, 320));
        setLayout(null);

        tablelista.setModel(new javax.swing.table.DefaultTableModel(
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
        tablelista.setToolTipText("Lista");
        tablelista.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablelista);

        add(jScrollPane2);
        jScrollPane2.setBounds(10, 40, 880, 180);

        buttonDelete.setBackground(new java.awt.Color(255, 153, 153));
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/Delete.png"))); // NOI18N
        buttonDelete.setToolTipText("Excluir ");
        buttonDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        add(buttonDelete);
        buttonDelete.setBounds(590, 240, 90, 60);

        buttonEdit.setBackground(new java.awt.Color(255, 255, 153));
        buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/Edit.png"))); // NOI18N
        buttonEdit.setToolTipText("Editar");
        buttonEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 212, 0), 2));
        add(buttonEdit);
        buttonEdit.setBounds(690, 240, 90, 60);

        buttonSave.setBackground(new java.awt.Color(0, 204, 153));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/new.png"))); // NOI18N
        buttonSave.setToolTipText("Criar ");
        buttonSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        add(buttonSave);
        buttonSave.setBounds(790, 240, 90, 60);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonSave;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablelista;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

       

        tablelista.setModel(EspecialidadeDAO.getEspecialidadesModel());

    }

}
