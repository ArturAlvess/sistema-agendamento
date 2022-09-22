package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

	public static void main(String[] args) {
		
		int a = 5;
		Integer b = 5;
		
		Double x = 2.7;
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		Especialidade e1 = new Especialidade("Cardiologia");
//		e1.setNome("Cardiologia");
		e1.setDescricao("infarto");
		
		Especialidade e2 = new Especialidade("Gastroentrologia");
//		e2.setNome("Gastroentrologia");
		e2.setDescricao("diarréia");
		
		especialidades.add(e1);
		especialidades.add(e2);
		
		Especialidade e3 = new Especialidade("Fisioterapia");
//		e3.setNome("Fisioterapia");
		e3.setDescricao("para mancos");
		
		especialidades.add(e3);
		
		Especialidade e4 = new Especialidade("Clínico Geral");
//		e4.setNome("Clínico geral");
		e4.setDescricao("Charlatão");
		
//		Especilidade[] especialidades = {e1, e2, e3, e4};
		
		
		Especialidade e5 = new Especialidade();
//		e5.setNome("Oftalmologista");
		e5.setDescricao("cuida do olho");
		
//		especialidades[4] =e5;
		
		especialidades.add(e4);
		especialidades.add(e5);
		
		System.out.println(especialidades.size());
		
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(50);
		notas.add(32);
		notas.add(214);
		notas.add(45);
		System.out.println(notas.size());
		
		notas.add(10);
		System.out.println(especialidades.get(3).getNome());
		
		especialidades.get(1).setNome("teste");
		System.out.println(especialidades.get(1).getNome());
		
		
		
	}

}
