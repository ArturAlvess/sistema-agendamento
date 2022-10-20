package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {

    private static int contador = 99;
    private String operadora;
    private Integer codigo;
    private String categoria;
    private LocalDate validade;
    private String numero;
    private static int quantidade;

    public PlanoDeSaude(String operadora, String categoria, LocalDate validade, String numero) {
        this.operadora = operadora;
        this.categoria = categoria;
        this.validade = validade;
        this.numero = numero;
        this.quantidade++;
        gerarCodigo();
    }

    public PlanoDeSaude() {
        this.quantidade++;
        gerarCodigo();
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }
    //operadora

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getOperadora() {
        return operadora;
    }

    //categoria
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    //validade
    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public LocalDate getValidade() {
        return validade;
    }

    //numero
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public static int getContador() {
        return contador;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

}
