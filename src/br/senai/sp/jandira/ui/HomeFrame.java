package br.senai.sp.jandira.ui;

import java.awt.Toolkit;

public class HomeFrame extends javax.swing.JFrame {

    private EspecialidadesPanel especialidadesPanel;

    private final int POS_X = 20;
    private final int POS_Y = 100;
    private final int WIDTH = 920;
    private final int HEIGHT = 320;

    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/agenda.png")));
        initPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel panelMain = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonEspecialidade1 = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        buttonAgenda2 = new javax.swing.JButton();
        buttonMedico = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        panelHeader = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelIconTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamentos");
        setResizable(false);
        getContentPane().setLayout(null);

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 216, 255), 2));
        panelMain.setLayout(null);

        panelPrincipal.setLayout(null);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setForeground(new java.awt.Color(51, 204, 0));
        panelHome.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        panelHome.setRequestFocusEnabled(false);
        panelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 39, 97));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/logo.png"))); // NOI18N
        jLabel1.setText("SISACON");
        panelHome.add(jLabel1);
        jLabel1.setBounds(0, 20, 400, 170);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(124, 119, 255));
        jLabel2.setText("Sistema de Agendamentos de Consultas");
        panelHome.add(jLabel2);
        jLabel2.setBounds(130, 140, 270, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Suporte Técnico:");
        panelHome.add(jLabel3);
        jLabel3.setBounds(730, 170, 160, 50);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("www.sisacon.com.br");
        panelHome.add(jLabel4);
        jLabel4.setBounds(730, 260, 170, 16);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Email - suporte@sisacon.com");
        panelHome.add(jLabel5);
        jLabel5.setBounds(730, 220, 170, 16);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefone - 0500 863 333");
        panelHome.add(jLabel6);
        jLabel6.setBounds(730, 240, 170, 16);

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelHome.add(jPanel2);
        jPanel2.setBounds(30, 170, 870, 5);

        panelPrincipal.add(panelHome);
        panelHome.setBounds(20, 100, 920, 320);

        buttonEspecialidade1.setBackground(new java.awt.Color(204, 244, 255));
        buttonEspecialidade1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/Especialidade.png"))); // NOI18N
        buttonEspecialidade1.setText("Especialidade");
        buttonEspecialidade1.setToolTipText("Lista de Especialidades");
        buttonEspecialidade1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 216, 255), 2));
        buttonEspecialidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidade1ActionPerformed(evt);
            }
        });
        panelPrincipal.add(buttonEspecialidade1);
        buttonEspecialidade1.setBounds(500, 30, 110, 50);

        buttonHome.setBackground(new java.awt.Color(204, 255, 204));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/home.png"))); // NOI18N
        buttonHome.setText("Home");
        buttonHome.setToolTipText("Novo Agendamento");
        buttonHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        panelPrincipal.add(buttonHome);
        buttonHome.setBounds(20, 30, 100, 50);

        buttonAgenda2.setBackground(new java.awt.Color(204, 244, 255));
        buttonAgenda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda_button.png"))); // NOI18N
        buttonAgenda2.setText("Agenda");
        buttonAgenda2.setToolTipText("Novo Agendamento");
        buttonAgenda2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 216, 255), 2));
        buttonAgenda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgenda2ActionPerformed(evt);
            }
        });
        panelPrincipal.add(buttonAgenda2);
        buttonAgenda2.setBounds(170, 30, 100, 50);

        buttonMedico.setBackground(new java.awt.Color(204, 244, 255));
        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/médico.png"))); // NOI18N
        buttonMedico.setText("Médico");
        buttonMedico.setToolTipText("Lista de Médicos");
        buttonMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 216, 255), 2));
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        panelPrincipal.add(buttonMedico);
        buttonMedico.setBounds(390, 30, 100, 50);

        buttonPaciente.setBackground(new java.awt.Color(204, 244, 255));
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/paciente.png"))); // NOI18N
        buttonPaciente.setText("Paciente");
        buttonPaciente.setToolTipText("Lista de Pacientes");
        buttonPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 216, 255), 2));
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        panelPrincipal.add(buttonPaciente);
        buttonPaciente.setBounds(280, 30, 100, 50);

        buttonLogout.setBackground(new java.awt.Color(204, 244, 255));
        buttonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/Logout.png"))); // NOI18N
        buttonLogout.setText("Sair");
        buttonLogout.setToolTipText("Sair do sistema");
        buttonLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });
        panelPrincipal.add(buttonLogout);
        buttonLogout.setBounds(840, 30, 100, 50);

        buttonPlanoDeSaude.setBackground(new java.awt.Color(204, 244, 255));
        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/planoDeSaude.png"))); // NOI18N
        buttonPlanoDeSaude.setText("Planos de saúde");
        buttonPlanoDeSaude.setToolTipText("Planos de Saúde");
        buttonPlanoDeSaude.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 216, 255), 2));
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        panelPrincipal.add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(620, 30, 160, 50);

        panelMain.add(panelPrincipal);
        panelPrincipal.setBounds(0, 80, 970, 460);

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

        panelMain.add(panelHeader);
        panelHeader.setBounds(0, 0, 970, 83);

        getContentPane().add(panelMain);
        panelMain.setBounds(0, 0, 970, 540);

        setSize(new java.awt.Dimension(986, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        buttonEspecialidade1.setBackground(new java.awt.Color(204, 244, 255));
        buttonAgenda2.setBackground(new java.awt.Color(204, 244, 255));
        buttonPaciente.setBackground(new java.awt.Color(204, 255, 204));
        buttonMedico.setBackground(new java.awt.Color(204, 244, 255));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(204, 244, 255));
        buttonHome.setBackground(new java.awt.Color(204, 244, 255));
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(false);
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        buttonEspecialidade1.setBackground(new java.awt.Color(204, 244, 255));
        buttonAgenda2.setBackground(new java.awt.Color(204, 244, 255));
        buttonPaciente.setBackground(new java.awt.Color(204, 244, 255));
        buttonMedico.setBackground(new java.awt.Color(204, 244, 255));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(204, 244, 255));
        buttonHome.setBackground(new java.awt.Color(204, 255, 204));

        panelHome.setVisible(true);
        especialidadesPanel.setVisible(false);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonAgenda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgenda2ActionPerformed

        buttonEspecialidade1.setBackground(new java.awt.Color(204, 244, 255));
        buttonAgenda2.setBackground(new java.awt.Color(204, 255, 204));
        buttonPaciente.setBackground(new java.awt.Color(204, 244, 255));
        buttonMedico.setBackground(new java.awt.Color(204, 244, 255));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(204, 244, 255));
        buttonHome.setBackground(new java.awt.Color(204, 244, 255));
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(false);
    }//GEN-LAST:event_buttonAgenda2ActionPerformed

    private void buttonEspecialidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidade1ActionPerformed
        
        buttonEspecialidade1.setBackground(new java.awt.Color(204, 255, 204));
        buttonAgenda2.setBackground(new java.awt.Color(204, 244, 255));
        buttonPaciente.setBackground(new java.awt.Color(204, 244, 255));
        buttonMedico.setBackground(new java.awt.Color(204, 244, 255));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(204, 244, 255));
        buttonHome.setBackground(new java.awt.Color(204, 244, 255));
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(true);
    }//GEN-LAST:event_buttonEspecialidade1ActionPerformed

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed
        buttonEspecialidade1.setBackground(new java.awt.Color(204, 244, 255));
        buttonAgenda2.setBackground(new java.awt.Color(204, 244, 255));
        buttonPaciente.setBackground(new java.awt.Color(204, 244, 255));
        buttonMedico.setBackground(new java.awt.Color(204, 255, 204));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(204, 244, 255));
        buttonHome.setBackground(new java.awt.Color(204, 244, 255));
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(false);
    }//GEN-LAST:event_buttonMedicoActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        buttonEspecialidade1.setBackground(new java.awt.Color(204, 244, 255));
        buttonAgenda2.setBackground(new java.awt.Color(204, 244, 255));
        buttonPaciente.setBackground(new java.awt.Color(204, 244, 255));
        buttonMedico.setBackground(new java.awt.Color(204, 244, 255));
        buttonPlanoDeSaude.setBackground(new java.awt.Color(204, 255, 204));
        buttonHome.setBackground(new java.awt.Color(204, 244, 255));
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(false);
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

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
    private javax.swing.JButton buttonAgenda2;
    private javax.swing.JButton buttonEspecialidade1;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelIconTitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {

        especialidadesPanel = new EspecialidadesPanel();
        especialidadesPanel.setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        especialidadesPanel.setVisible(false);
        panelPrincipal.add(especialidadesPanel);
    }

}
