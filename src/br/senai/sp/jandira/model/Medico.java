package br.senai.sp.jandira.model;

public class Medico {

	private String nome;
	private String telefone;
	private String email;
	private String crm;
	private Especilidade[] especialidade;

	
	//Método de acesso
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public Especilidade[] getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especilidade[] especialidade) {
		this.especialidade = especialidade;
	}

}
