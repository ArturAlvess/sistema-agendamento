package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class EspecialidadesDialog extends javax.swing.JDialog {

    private Especialidade especialidade;
    private OperacaoEnum operacao;

    public EspecialidadesDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        
        super(parent,
                modal);
        this.operacao = operacao;
        initComponents();
        preencherTitulo();
        
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(getClass()
                        .getResource
        ("/br/senai/sp/jandira/img/agenda.png")));
    }

    public EspecialidadesDialog(java.awt.Frame parent,
            boolean modal,
            Especialidade e,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        especialidade = e;
        this.operacao = operacao;
        preencherFormulario();
        preencherTitulo();
        
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(getClass()
                        .getResource
        ("/br/senai/sp/jandira/img/agenda.png")));
    }

    private void preencherFormulario() {
     
        textFieldNomeEspecialidade.setText(especialidade.getNome());
        textFieldDescEspecialidade.setText(especialidade.getDescricao());
    }
    
    private void preencherTitulo(){
        labelTitulo.setText("Especialidades - " + operacao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelDetalhes = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldNomeEspecialidade = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        textFieldDescEspecialidade = new javax.swing.JTextField();
        labelDesc = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ESPECIALIDADE");
        getContentPane().setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(106, 218, 165));
        panelTitulo.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/new.png"))); // NOI18N
        labelTitulo.setText("  Especialidades - Adicionar");
        panelTitulo.add(labelTitulo);
        labelTitulo.setBounds(30, 20, 300, 50);

        getContentPane().add(panelTitulo);
        panelTitulo.setBounds(0, 0, 747, 90);

        panelDetalhes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(204, 0, 0))); // NOI18N
        panelDetalhes.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo.setText("Código:");
        panelDetalhes.add(labelCodigo);
        labelCodigo.setBounds(20, 40, 60, 20);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldCodigo);
        textFieldCodigo.setBounds(20, 70, 64, 20);

        textFieldNomeEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeEspecialidadeActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldNomeEspecialidade);
        textFieldNomeEspecialidade.setBounds(20, 130, 390, 22);

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNome.setText("Nome da especialidade:");
        panelDetalhes.add(labelNome);
        labelNome.setBounds(20, 100, 160, 20);
        panelDetalhes.add(textFieldDescEspecialidade);
        textFieldDescEspecialidade.setBounds(20, 190, 460, 22);

        labelDesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDesc.setText("Descrição:");
        panelDetalhes.add(labelDesc);
        labelDesc.setBounds(20, 160, 70, 20);

        buttonSalvar.setBackground(new java.awt.Color(204, 255, 204));
        buttonSalvar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        buttonSalvar.setForeground(new java.awt.Color(0, 153, 51));
        buttonSalvar.setText("SALVAR");
        buttonSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonSalvar);
        buttonSalvar.setBounds(610, 220, 90, 60);

        buttonCancelar.setBackground(new java.awt.Color(255, 204, 204));
        buttonCancelar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(204, 0, 0));
        buttonCancelar.setText("CANCELAR");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        panelDetalhes.add(buttonCancelar);
        buttonCancelar.setBounds(500, 220, 100, 60);

        getContentPane().add(panelDetalhes);
        panelDetalhes.setBounds(20, 110, 710, 290);

        setSize(new java.awt.Dimension(763, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }else{
            editar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldNomeEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeEspecialidadeActionPerformed
    
    private void editar(){
        especialidade.setNome(textFieldNomeEspecialidade.getText());
        especialidade.setDescricao(textFieldDescEspecialidade.getText());
        
        EspecialidadeDAO.atualizar(especialidade);
        
        JOptionPane.showMessageDialog(null, "Especialidade editada com sucesso!", "EDITAR", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    private void adicionar(){
        // Criar objeto especialidade
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(textFieldNomeEspecialidade.getText());
        especialidade.setDescricao(textFieldDescEspecialidade.getText());

        // Gravar o objeto
        EspecialidadeDAO.gravar(especialidade);

        JOptionPane.showMessageDialog(this,
                "Especialidade gravada com sucesso!",
                "Especialidades",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDesc;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescEspecialidade;
    private javax.swing.JTextField textFieldNomeEspecialidade;
    // End of variables declaration//GEN-END:variables
}
