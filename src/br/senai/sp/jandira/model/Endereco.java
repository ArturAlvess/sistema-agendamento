package br.senai.sp.jandira.model;

public class Endereco {
	
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String complemento;
	private String estado;
	private String cep;
	
	
	// Métodos de acesso
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	// Número
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}
	
	// bairro
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	// cidade
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	//complemento
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	// estado
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}
	
	//cep
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCep() {
		return cep;
	}
}
