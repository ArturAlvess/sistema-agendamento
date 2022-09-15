package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especilidade;

public class AgendaApp {

	public static void main(String[] args) {
		
		Especilidade especialidade = new Especilidade();
		especialidade.setNome("Cardiologia");
		especialidade.setDescricao("Consultas relacionadas ao coração");
		
		Especilidade especialidade2 = new Especilidade();
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2.setDescricao("Consultas de vias aéreas e nasais.");
		
		JOptionPane.showMessageDialog(null, especialidade2.getNome());
		System.out.println(especialidade.getNome());
		
		JOptionPane.showMessageDialog(null, especialidade2.getDescricao());
		System.out.println(especialidade.getDescricao());
	}
	
}
