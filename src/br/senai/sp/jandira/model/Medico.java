package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Medico {

    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private String telefone;
    private String email;
    private String crm;
    private LocalDate dataDeNascimento;
    private DateTimeFormatter formatador;
    private String dataFormatada;
    private ArrayList<Especialidade> especialidades;

    //Método de acesso
    
    public String getDataFormatada() {
        return dataFormatada;
    }

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }
    public Medico(String crm, String nome, String telefone, Integer codigo){
        
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.codigo = codigo;
        
    }
    public Medico(String nome, String telefone, String email, String crm, ArrayList<Especialidade> especialidades, LocalDate dataDeNascimento) {

        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = dataDeNascimento.format(formatador);

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        this.especialidades = especialidades;
        gerarCodigo();
    }
    
    public Medico(String nome, String telefone, String email, String crm, String dataDeNascimento, Integer codigo, ArrayList<Especialidade> especialidades) {

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        this.dataFormatada = dataDeNascimento;
        this.especialidades = especialidades;
        this.codigo = codigo;
        this.contador = codigo;
        
    }
    
    public Medico(){
        gerarCodigo();
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }
    
    // código
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    // nome
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // telefone
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    // email
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    // crm
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    // especialidade

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }
    
    public String arrayToString(ArrayList<Especialidade> array){
        ArrayList<String> codigos = new ArrayList<>();
        for(Especialidade e : array){
            codigos.add(e.getCodigo().toString());
        }
        return String.join(";", codigos);
    }
    
    public String getMedicoSeparadoPorPontoEVirgula(){
        return this.codigo + ";" 
                + this.crm + ";" 
                + this.nome + ";" 
                + this.telefone + ";" 
                + this.email + ";" 
                + this.dataFormatada + ";" 
                + arrayToString(this.especialidades);
    }
}
