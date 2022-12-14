package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {
        
        int[] a = {2, 4, 6, 8, 10};
        int[] b = new int[4];
        b[0] = 12;
        b[1] = 16;
        b[2] = 30;
        b[3] = 55;
        
        int c [][] = {
            {2,3,5},
            {9,11,22},
            {3, 9, 1},
            {7, 8, 2}
        };
        
        System.out.println(c[1][1]);
        
        String[][] quitanda = {
            {"banana", "maça", "uva", "morango"},
            {"alface", "couve", "pepino", "salsinha"},
            {"abacate", "tomate", "jiló", "abobrinha"}
        };
        
        System.out.println("quitanda ------" + quitanda[0][3]);
        
        int [][][] teste = {
            {{1,2,3},
                {4,5,6}
                    
            }, {{7,8,9},
                
               {10,11,12}
                    
            }, {{13,14,15},
                
               {16,17,18}}};
        
        System.out.println("**********************************");

        Especialidade e1 = new Especialidade();
        e1.setNome("Cardiologia");
        e1.setDescricao("coraçãozinho");

        Especialidade e2 = new Especialidade();
        e2.setNome("Otorrino");
        e2.setDescricao("nariz e essas coisas");

        Especialidade e3 = new Especialidade();
        e3.setNome("Gastroentrologia");
        e3.setDescricao("não deixa com dor de barriga");

        Especialidade e4 = new Especialidade();
        e4.setNome("Oftalmo");
        e4.setDescricao("não deixa o olho ruim");
        
        Especialidade e5 = new Especialidade();
        e5.setNome("nomenome");
        e5.setDescricao("netherlands");
        
   
        EspecialidadeDAO.gravar(e5);
        EspecialidadeDAO.gravar(e2);
        
        System.out.println("tamanho- " + EspecialidadeDAO.getEspecialidades().size()); 
        
        EspecialidadeDAO.gravar(e3);
        EspecialidadeDAO.gravar(e4);
        
        System.out.println("tamanho- " + EspecialidadeDAO.getEspecialidades().size());
        System.out.println("tamanho- " + EspecialidadeDAO.getEspecialidades().size());
        
        System.out.println("A especialidade é: " + EspecialidadeDAO.getEspecialidade(103).getNome());
        
        EspecialidadeDAO.excluir(104);
        System.out.println("tamanho- " + EspecialidadeDAO.getEspecialidades().size());
        
        Especialidade correta = new Especialidade("Urologia", "netherlands");
        correta.setCodigo(e4.getCodigo());
        EspecialidadeDAO.atualizar(correta);
        
        System.out.println(EspecialidadeDAO.getEspecialidade(103).getNome());

        //Exibir a quantidade de especialidades
        System.out.println("ESPECIALIDADES ------>" + e1.getContador());
        System.out.println(e1.getCodigo()+ " - " + e1.getNome());
        System.out.println(e2.getCodigo()+ " - " + e2.getNome());
        System.out.println(e3.getCodigo()+ " - " + e3.getNome());
        System.out.println(e4.getCodigo()+ " - " + e4.getNome());
        System.out.println(e5.getCodigo()+ " - " + e5.getNome());
        
        
        
        
        
        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        System.out.println(especialidades.size());

        //Imprimir o nome das especialidades armazenadas no ArrayList
        int i = 0;
        while (i < especialidades.size()) {
            System.out.println(especialidades.get(i).getNome());
            i++;
        }

        // utilizando o "for" para iteração
        System.out.println("----FOR----");
        for (int x = 0; x < especialidades.size(); x++) {
            System.out.println(especialidades.get(x).getNome());
        }

        // utilizando for each para iteração
        System.out.println("----- FOR EACH -----");
        for (Especialidade e : especialidades) {
            System.out.println(e.getNome());
        }

        //Criar 3 planos de saúde, armazenar em um arrayList
        // e exibir o nome da operadora de cada
       

        ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
        
        System.out.println("--- Planos ---");
        for (PlanoDeSaude p : planosDeSaude) {
            System.out.println(p.getOperadora());
            System.out.println(p.getQuantidade());
        }
        PlanoDeSaude xpto = new PlanoDeSaude();
        PlanoDeSaude xpto1 = new PlanoDeSaude();
        PlanoDeSaude xpto2 = new PlanoDeSaude();

        System.out.println("Quantidade de planos:" + PlanoDeSaude.getQuantidade());

        AgendaApp.main(args);

        System.out.println("Quantidade de planos:" + PlanoDeSaude.getQuantidade());
    }

}
