package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private String descricao;
    

    // Constructor method
    public Especialidade(String nome) {
        this.nome = nome;
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.nome = descricao;
        this.contador++;
        this.codigo = contador;

    }

    public Especialidade() {
        this.contador++;
        this.codigo = contador;

    }
    // Métodos de acesso aos atributos

    public void setNome(String nome) {
        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " não é um nome válido!\nDeve conter ao menos 3 letras.");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(null, descricao + " não é uma descrição válida! \nDeve conter ao menos 10 caracteres.");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }
    
    
}
