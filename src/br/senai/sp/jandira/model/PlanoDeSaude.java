package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PlanoDeSaude {

    private static int contador = 99;
    private String operadora;
    private Integer codigo;
    private String categoria;
    private LocalDate validade;
    private DateTimeFormatter formatador;
    private String dataFormatada;

    public String getDataFormatada() {
        return dataFormatada;
    }

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }
    private String numero;
    private static int quantidade;

    public PlanoDeSaude(String operadora, String categoria, LocalDate validade, String numero) {
        
        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = validade.format(formatador);
        
        this.operadora = operadora;
        this.categoria = categoria;
        this.validade = validade;
        this.numero = numero;
        gerarCodigo();
    }
    public PlanoDeSaude(String operadora, String categoria, LocalDate validade, String numero, Integer codigo) {
        
        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = validade.format(formatador);
        
        this.operadora = operadora;
        this.categoria = categoria;
        this.validade = validade;
        this.numero = numero;
        this.codigo = codigo;
        this.contador = codigo;
    }

    public PlanoDeSaude() {
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
    
    public String getPlanoDeSaudeSeparadoPorPontoEVirgula(){
        return this.codigo + ";" + this.numero + ";" + this.operadora + ";" + this.categoria + ";" + this.dataFormatada;
    }
}
