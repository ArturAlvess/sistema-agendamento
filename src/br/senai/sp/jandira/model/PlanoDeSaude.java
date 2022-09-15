package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {
	
	private String operadora;
	private String categoria;
	private LocalDate validade;
	private String numero;
	
	//operadora
	
	public void setOperadora (String operadora) {
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
	
	public void setValidade (LocalDate validade) {
		this.validade = validade;
	}
	
	public LocalDate getValidade( ) {
		return validade;
	}
	
	//numero
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}
		
}

	
