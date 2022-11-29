package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class MedicoDialog extends javax.swing.JDialog {

    
    private Medico medicos;
    private OperacaoEnum operacao;
    
    public MedicoDialog(){
        
    }
    
    public MedicoDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(getClass()
                        .getResource("/br/senai/sp/jandira/img/agenda.png")));
    }
    
    public MedicoDialog(java.awt.Frame parent, boolean modal, Medico m ,OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        
        medicos = m;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(getClass()
                        .getResource("/br/senai/sp/jandira/img/agenda.png")));
    }

   private void preencherFormulario(){
       
       formattedTextFieldCRM.setText(medicos.getCrm());
       textFieldNomeMedico.setText(medicos.getNome());
       formattedTextFieldTelefone.setText(medicos.getTelefone());
       textFieldEmail.setText(medicos.getEmail());
       formattedTextFieldDataNascimento.setText(medicos.getDataFormatada());
   }
   
   private void preencherTitulo(){
       labelTitulo.setText("Médico - " + operacao);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelDetalhes = new javax.swing.JPanel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        labelTelefone = new javax.swing.JLabel();
        labelCRM = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        formattedTextFieldCRM = new javax.swing.JFormattedTextField();
        formattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        textFieldNomeMedico = new javax.swing.JTextField();
        labelNomeMedico = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        formattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        labelDataNascimento = new javax.swing.JLabel();
        labelListaDeEspecialidades = new javax.swing.JLabel();
        scrollListaEspecialidades = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonRemoverEspecialidade = new javax.swing.JButton();
        buttonAddEspecialidade = new javax.swing.JButton();
        labelEspecialidadesMedico = new javax.swing.JLabel();
        scrollListaMedicoEspecialidades = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar médicos");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/new.png"))); // NOI18N
        labelTitulo.setText("Médico - Adicionar");
        labelTitulo.setPreferredSize(new java.awt.Dimension(296, 48));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 100);

        panelDetalhes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        buttonSalvar.setBackground(new java.awt.Color(204, 255, 204));
        buttonSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonSalvar.setForeground(new java.awt.Color(0, 153, 0));
        buttonSalvar.setText("SALVAR");
        buttonSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        buttonSalvar.setPreferredSize(new java.awt.Dimension(80, 20));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonCancelar.setBackground(new java.awt.Color(255, 204, 204));
        buttonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(204, 0, 0));
        buttonCancelar.setText("CANCELAR");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        buttonCancelar.setPreferredSize(new java.awt.Dimension(80, 20));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        labelTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTelefone.setText("Telefone:");

        labelCRM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCRM.setText("CRM:");

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo.setText("Código:");

        formattedTextFieldCRM.setColumns(8);
        try {
            formattedTextFieldCRM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedTextFieldCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextFieldCRMActionPerformed(evt);
            }
        });

        formattedTextFieldTelefone.setColumns(12);
        try {
            formattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextFieldTelefoneActionPerformed(evt);
            }
        });

        textFieldNomeMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeMedicoActionPerformed(evt);
            }
        });

        labelNomeMedico.setText("Nome do(a) Médico(a):");

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        labelEmail.setText("Email:");

        try {
            formattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelDataNascimento.setText("Data de Nascimento:");
        labelDataNascimento.setToolTipText("");

        labelListaDeEspecialidades.setText("Lista de especialidades:");

        scrollListaEspecialidades.setViewportView(jList1);

        buttonRemoverEspecialidade.setBackground(new java.awt.Color(255, 0, 0));
        buttonRemoverEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonRemoverEspecialidade.setForeground(new java.awt.Color(255, 255, 255));
        buttonRemoverEspecialidade.setText("<");

        buttonAddEspecialidade.setBackground(new java.awt.Color(0, 204, 0));
        buttonAddEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonAddEspecialidade.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddEspecialidade.setText(">");
        buttonAddEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddEspecialidadeActionPerformed(evt);
            }
        });

        labelEspecialidadesMedico.setText("Especialidades do médico(a):");

        scrollListaMedicoEspecialidades.setViewportView(jList2);

        javax.swing.GroupLayout panelDetalhesLayout = new javax.swing.GroupLayout(panelDetalhes);
        panelDetalhes.setLayout(panelDetalhesLayout);
        panelDetalhesLayout.setHorizontalGroup(
            panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalhesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetalhesLayout.createSequentialGroup()
                        .addComponent(scrollListaEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonRemoverEspecialidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAddEspecialidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(scrollListaMedicoEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(panelDetalhesLayout.createSequentialGroup()
                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formattedTextFieldCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(panelDetalhesLayout.createSequentialGroup()
                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDetalhesLayout.createSequentialGroup()
                                .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(formattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEmail)
                                    .addGroup(panelDetalhesLayout.createSequentialGroup()
                                        .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(formattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(panelDetalhesLayout.createSequentialGroup()
                                .addComponent(labelListaDeEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(labelEspecialidadesMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalhesLayout.createSequentialGroup()
                    .addContainerGap(428, Short.MAX_VALUE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(135, 135, 135)))
        );
        panelDetalhesLayout.setVerticalGroup(
            panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalhesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDetalhesLayout.createSequentialGroup()
                        .addComponent(labelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDetalhesLayout.createSequentialGroup()
                        .addComponent(labelCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(formattedTextFieldCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDetalhesLayout.createSequentialGroup()
                        .addComponent(labelNomeMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetalhesLayout.createSequentialGroup()
                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEmail)
                            .addComponent(labelDataNascimento)
                            .addComponent(labelTelefone))
                        .addGap(9, 9, 9)
                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelListaDeEspecialidades)
                            .addComponent(labelEspecialidadesMedico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollListaEspecialidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalhesLayout.createSequentialGroup()
                                .addComponent(buttonAddEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonRemoverEspecialidade)
                                .addGap(19, 19, 19))))
                    .addGroup(panelDetalhesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(scrollListaMedicoEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
            .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalhesLayout.createSequentialGroup()
                    .addContainerGap(241, Short.MAX_VALUE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );

        getContentPane().add(panelDetalhes);
        panelDetalhes.setBounds(20, 110, 670, 340);

        setSize(new java.awt.Dimension(751, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }

    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void formattedTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextFieldTelefoneActionPerformed

    private void formattedTextFieldCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextFieldCRMActionPerformed

    private void textFieldNomeMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeMedicoActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void buttonAddEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddEspecialidadeActionPerformed

    private void editar(){
        medicos.setCrm(formattedTextFieldCRM.getText());
        medicos.setNome(textFieldNomeMedico.getText());
        medicos.setTelefone(formattedTextFieldTelefone.getText());
        medicos.setEmail(textFieldEmail.getText());
        medicos.setDataFormatada(formattedTextFieldDataNascimento.getText());
        
        MedicoDAO.atualizar(medicos);
        JOptionPane.showMessageDialog(null,
                "Detalhes do médico editados com sucesso!",
                "Editar", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void adicionar(){
        CharSequence branco = " ";
        
        // Espaços em branco
        if(formattedTextFieldCRM.getText().contains(branco) == true||
                textFieldNomeMedico.getText().isEmpty() || 
                formattedTextFieldTelefone.getText().contains(branco) == true|| 
                textFieldEmail.getText().isEmpty() || 
                        formattedTextFieldDataNascimento.getText().contains(branco) == true){
            
            JOptionPane.showMessageDialog(this,
                    "Todos os campos são obrigatórios!!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            formattedTextFieldCRM.requestFocus();
        }else{
            Medico medico = new Medico();
            medico.setCrm(formattedTextFieldCRM.getText());
            medico.setNome(textFieldNomeMedico.getText());
            medico.setTelefone(formattedTextFieldTelefone.getText());
            medico.setEmail(textFieldEmail.getText());
            medico.setDataFormatada(formattedTextFieldDataNascimento.getText());
            
            MedicoDAO.gravar(medico);
            JOptionPane.showMessageDialog(this, 
                    "Médico gravado com sucesso!",
                    "Médico", 
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddEspecialidade;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonRemoverEspecialidade;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JFormattedTextField formattedTextFieldCRM;
    private javax.swing.JFormattedTextField formattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField formattedTextFieldTelefone;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelCRM;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidadesMedico;
    private javax.swing.JLabel labelListaDeEspecialidades;
    private javax.swing.JLabel labelNomeMedico;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JScrollPane scrollListaEspecialidades;
    private javax.swing.JScrollPane scrollListaMedicoEspecialidades;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNomeMedico;
    // End of variables declaration//GEN-END:variables
}
