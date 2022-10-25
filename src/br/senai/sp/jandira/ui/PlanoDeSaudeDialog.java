package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude planosDeSaude;
    private OperacaoEnum operacao;
    
    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(getClass()
                        .getResource
        ("/br/senai/sp/jandira/img/agenda.png")));
    }
    
    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal, PlanoDeSaude p, OperacaoEnum operacao){
        super(parent, modal);
        initComponents();
        
        planosDeSaude = p;
        this.operacao = operacao;
        
        preencherFormulario();
        preencherTitulo();
        
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(getClass()
                        .getResource
        ("/br/senai/sp/jandira/img/agenda.png")));
    }
    
    private void preencherFormulario(){
        
        textFieldCategoria.setText(planosDeSaude.getCategoria());
        formattedTextNumero.setText(planosDeSaude.getNumero());
        textFieldOperadora.setText(planosDeSaude.getOperadora());
        formattedTextValidade.setText(planosDeSaude.getDataFormatada());
    }
    
    private void preencherTitulo(){
        labelTitulo.setText("Plano de Saúde - " + operacao);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelDetalhes = new javax.swing.JPanel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        labelNumero = new javax.swing.JLabel();
        labelOperadora = new javax.swing.JLabel();
        textFieldOperadora = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        textFieldCategoria = new javax.swing.JTextField();
        labelValidade = new javax.swing.JLabel();
        textFieldNumero1 = new javax.swing.JTextField();
        labelNumero1 = new javax.swing.JLabel();
        formattedTextValidade = new javax.swing.JFormattedTextField();
        formattedTextNumero = new javax.swing.JFormattedTextField();
        labelEx = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PLANO DE SAÚDE");
        getContentPane().setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(51, 153, 255));
        panelTitulo.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/new.png"))); // NOI18N
        labelTitulo.setText("Plano de Saúde - Adicionar");
        labelTitulo.setPreferredSize(new java.awt.Dimension(296, 48));
        panelTitulo.add(labelTitulo);
        labelTitulo.setBounds(20, 10, 330, 60);

        getContentPane().add(panelTitulo);
        panelTitulo.setBounds(0, 0, 740, 90);

        panelDetalhes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes dos planos de saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(204, 0, 0))); // NOI18N

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

        labelNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNumero.setText("Número:");

        labelOperadora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelOperadora.setText("Operadora:");

        labelCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCategoria.setText("Categoria:");

        labelValidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelValidade.setText("Validade:");

        textFieldNumero1.setEditable(false);
        textFieldNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumero1ActionPerformed(evt);
            }
        });

        labelNumero1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNumero1.setText("Código:");

        formattedTextValidade.setColumns(8);
        try {
            formattedTextValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        formattedTextNumero.setColumns(12);
        try {
            formattedTextNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelEx.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        labelEx.setText("Ex: 10/10/2010");

        javax.swing.GroupLayout panelDetalhesLayout = new javax.swing.GroupLayout(panelDetalhes);
        panelDetalhes.setLayout(panelDetalhesLayout);
        panelDetalhesLayout.setHorizontalGroup(
            panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalhesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetalhesLayout.createSequentialGroup()
                        .addComponent(formattedTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelDetalhesLayout.createSequentialGroup()
                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formattedTextValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(291, Short.MAX_VALUE))
                    .addGroup(panelDetalhesLayout.createSequentialGroup()
                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDetalhesLayout.createSequentialGroup()
                                .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCategoria)
                                    .addComponent(labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textFieldCategoria, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textFieldOperadora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDetalhesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(panelDetalhesLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(labelEx, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalhesLayout.createSequentialGroup()
                    .addContainerGap(428, Short.MAX_VALUE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(135, 135, 135)))
        );
        panelDetalhesLayout.setVerticalGroup(
            panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalhesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formattedTextValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalhesLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(labelNumero1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formattedTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelOperadora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(panelDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalhesLayout.createSequentialGroup()
                    .addContainerGap(211, Short.MAX_VALUE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );

        getContentPane().add(panelDetalhes);
        panelDetalhes.setBounds(20, 110, 670, 310);

        setSize(new java.awt.Dimension(751, 466));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }else{
            editar();
        }
            
            
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumero1ActionPerformed

    private void editar(){
        planosDeSaude.setCategoria(textFieldCategoria.getText());
        planosDeSaude.setNumero(formattedTextNumero.getText());
        planosDeSaude.setOperadora(textFieldOperadora.getText());
         planosDeSaude.setDataFormatada(formattedTextValidade.getText());

        PlanoDeSaudeDAO.atualizar(planosDeSaude);
        JOptionPane.showMessageDialog(null, "Plano de saúde editado com sucesso!", "EDITAR", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void adicionar(){
        //Criar objeto
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setCategoria(textFieldCategoria.getText());
        planoDeSaude.setNumero(formattedTextNumero.getText());
        planoDeSaude.setOperadora(textFieldOperadora.getText());
        planoDeSaude.setDataFormatada(formattedTextValidade.getText());
        
        //Grava objeto
        PlanoDeSaudeDAO.gravar(planoDeSaude);
        
        JOptionPane.showMessageDialog(this,
                "Plano de saúde gravado com sucesso!",
                "Plano de saúde",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JFormattedTextField formattedTextNumero;
    private javax.swing.JFormattedTextField formattedTextValidade;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelEx;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelNumero1;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField textFieldCategoria;
    private javax.swing.JTextField textFieldNumero1;
    private javax.swing.JTextField textFieldOperadora;
    // End of variables declaration//GEN-END:variables
}
