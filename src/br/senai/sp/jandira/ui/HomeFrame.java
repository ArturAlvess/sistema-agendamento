
package br.senai.sp.jandira.ui;

import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;


public class HomeFrame extends javax.swing.JFrame {

    
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/agenda.png")));
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelIconTitulo = new javax.swing.JLabel();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonMedico = new javax.swing.JButton();
        buttonAgenda1 = new javax.swing.JButton();
        panelEspecialidades = new javax.swing.JPanel();
        buttonDelete = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablelista = new javax.swing.JTable();
        buttonEspecialidade1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamentos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 216, 255), 2));
        jPanel1.setLayout(null);

        panelHeader.setBackground(new java.awt.Color(143, 216, 255));

        labelTitulo.setFont(new java.awt.Font("Swis721 Cn BT", 1, 24)); // NOI18N
        labelTitulo.setText("Sistema de Agendamento");

        labelIconTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda.png"))); // NOI18N

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelIconTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(555, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIconTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelHeader);
        panelHeader.setBounds(0, 0, 970, 83);

        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/planoDeSaude.png"))); // NOI18N
        buttonPlanoDeSaude.setText("Planos de saúde");
        buttonPlanoDeSaude.setToolTipText("Planos de Saúde");
        buttonPlanoDeSaude.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 216, 255), 2));
        jPanel1.add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(470, 110, 160, 50);

        buttonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/Logout.png"))); // NOI18N
        buttonLogout.setText("Sair");
        buttonLogout.setToolTipText("Sair do sistema");
        buttonLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(buttonLogout);
        buttonLogout.setBounds(830, 110, 100, 50);

        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/paciente.png"))); // NOI18N
        buttonPaciente.setText("Paciente");
        buttonPaciente.setToolTipText("Lista de Pacientes");
        buttonPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 216, 255), 2));
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(buttonPaciente);
        buttonPaciente.setBounds(130, 110, 100, 50);

        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/médico.png"))); // NOI18N
        buttonMedico.setText("Médico");
        buttonMedico.setToolTipText("Lista de Médicos");
        buttonMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 216, 255), 2));
        jPanel1.add(buttonMedico);
        buttonMedico.setBounds(240, 110, 100, 50);

        buttonAgenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda_button.png"))); // NOI18N
        buttonAgenda1.setText("Agenda");
        buttonAgenda1.setToolTipText("Novo Agendamento");
        buttonAgenda1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 216, 255), 2));
        buttonAgenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgenda1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAgenda1);
        buttonAgenda1.setBounds(20, 110, 100, 50);

        panelEspecialidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidades Médicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 153, 0))); // NOI18N
        panelEspecialidades.setForeground(new java.awt.Color(51, 204, 0));
        panelEspecialidades.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        panelEspecialidades.setLayout(null);

        buttonDelete.setBackground(new java.awt.Color(255, 153, 153));
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/Delete.png"))); // NOI18N
        buttonDelete.setToolTipText("Excluir ");
        buttonDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        panelEspecialidades.add(buttonDelete);
        buttonDelete.setBounds(590, 240, 90, 60);

        buttonEdit.setBackground(new java.awt.Color(255, 255, 153));
        buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/Edit.png"))); // NOI18N
        buttonEdit.setToolTipText("Editar");
        buttonEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 212, 0), 2));
        panelEspecialidades.add(buttonEdit);
        buttonEdit.setBounds(690, 240, 90, 60);

        buttonSave.setBackground(new java.awt.Color(0, 204, 153));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/new.png"))); // NOI18N
        buttonSave.setToolTipText("Criar ");
        buttonSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        panelEspecialidades.add(buttonSave);
        buttonSave.setBounds(790, 240, 90, 60);

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
        jScrollPane2.setViewportView(tablelista);

        panelEspecialidades.add(jScrollPane2);
        jScrollPane2.setBounds(10, 40, 880, 180);

        jPanel1.add(panelEspecialidades);
        panelEspecialidades.setBounds(20, 180, 920, 320);
        panelEspecialidades.getAccessibleContext().setAccessibleName("Especialidades Médicas");

        buttonEspecialidade1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/Especialidade.png"))); // NOI18N
        buttonEspecialidade1.setText("Especialidade");
        buttonEspecialidade1.setToolTipText("Lista de Especialidades");
        buttonEspecialidade1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 216, 255), 2));
        jPanel1.add(buttonEspecialidade1);
        buttonEspecialidade1.setBounds(350, 110, 110, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(985, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonAgenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgenda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgenda1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda1;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonEspecialidade1;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSave;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelIconTitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelEspecialidades;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tablelista;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        
        String[][] dados = {
            {"100", "Jandira", "SP"},
            {"200", "Itapevi", "SP"},
            {"300", "Cotia", "SP"},
            {"400", "Barueri", "SP"},
            {"400", "Barueri", "SP"},
            {"400", "Barueri", "SP"},
            {"400", "Barueri", "SP"},
            {"400", "Barueri", "SP"},
            {"400", "Barueri", "SP"},
            {"400", "Barueri", "SP"},
            {"400", "Barueri", "SP"},
            {"400", "Barueri", "SP"},
            {"400", "Barueri", "SP"},
            {"400", "Barueri", "SP"},
            {"500", "Curitiba", "PR"},
            {"600", "Fortaleza", "CE"},
            {"600", "Fortaleza", "CE"},
            {"600", "Fortaleza", "CE"},
            {"600", "Fortaleza", "CE"},
            {"600", "Fortaleza", "CE"},
            {"600", "Fortaleza", "CE"},
            {"600", "Fortaleza", "CE"},
            {"600", "Fortaleza", "CE"},
            {"600", "Fortaleza", "CE"},
    };
        String[] titulos = {"CÓDIGO", "NOME DA CIDADE", "ESTADO"};
        
        DefaultTableModel modelo = new DefaultTableModel(dados, titulos);
        
        tablelista.setModel(modelo);
        
    }

}
