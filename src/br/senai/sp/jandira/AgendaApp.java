package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

    public static void main(String[] args) {

        Especialidade especialidade1 = new Especialidade();
        especialidade1.setNome("Cardiologia");
        especialidade1.setDescricao("Assuntos sobre o coração.");

        Especialidade especialidade2 = new Especialidade();
        especialidade2.setNome("Otorrinolaringologia");
        especialidade2.setDescricao("Assuntos sobre vias aéreas.");

        Especialidade especialidade3 = new Especialidade();
        especialidade3.setNome("Gastroenterologia");
        especialidade3.setDescricao("Assuntos sobre órgãos do aparelho digestivo");

        Especialidade especialidade4 = new Especialidade();
        especialidade4.setNome("Fisioterapia");
        especialidade4.setDescricao("Assuntos sobre casos físicos.");

        Especialidade especialidade5 = new Especialidade();
        especialidade5.setNome("Clínica Geral");
        especialidade5.setDescricao("Assuntos do dia a dia");

        System.out.println("- LISTA DE MÉDICOS -");
        Medico medico1 = new Medico();
        medico1.setNome("Celso Furtado");
        Especialidade[] especialidadesMed1 = {especialidade1, especialidade5};
        medico1.setTelefone("11 99876-8762");
        medico1.setEmail("celsofurtado86@gmail.com");
        medico1.setCrm("645387 CRM/SP");
        medico1.setEspecialidade(especialidadesMed1);

        System.out.println("Nome do médico: " + medico1.getNome());
        System.out.println("CRM do médico: " + medico1.getCrm());
        System.out.println("Especialidades: ");
        int i = 0;
        while (i < medico1.getEspecialidade().length) {
            System.out.print(medico1.getEspecialidade()[i].getNome() + " - ");
            System.out.println(medico1.getEspecialidade()[i].getDescricao());
            i++;
        }

        System.out.println("------------------------------");

        Medico medico2 = new Medico();
        medico2.setNome("Oswaldo Barbosa");
        Especialidade[] especialidadesMed2 = {especialidade1, especialidade4, especialidade5};
        medico2.setTelefone("11 99456-2764");
        medico2.setEmail("oswaldao@gmail.com");
        medico2.setCrm("947283 CRM/SP");
        medico2.setEspecialidade(especialidadesMed2);

        System.out.println("Nome do médico: " + medico2.getNome());
        System.out.println("CRM do médico: " + medico2.getCrm());
        i = 0;
        while (i < especialidadesMed2.length) {
            System.out.print(medico2.getEspecialidade()[i].getNome() + " - ");
            System.out.println(medico2.getEspecialidade()[i].getDescricao());
            i++;
        }

        System.out.println("------------------------------------------");
        // endereços

        Endereco endereco1 = new Endereco();
        endereco1.setLogradouro("Rua Martíns Silva");
        endereco1.setBairro("Alameda");
        endereco1.setNumero("234");
        endereco1.setCidade("Osasco");
        endereco1.setComplemento("Bloco 4, apartamento 33");
        endereco1.setEstado("São Paulo");
        endereco1.setCep("06365-122");

        Endereco endereco2 = new Endereco();
        endereco2.setLogradouro("Av. Paiva Leão");
        endereco2.setBairro("Antonieta");
        endereco2.setNumero("882");
        endereco2.setCidade("Ituano");
        endereco2.setComplemento("Ao lado da prefeitura");
        endereco2.setEstado("São Paulo");
        endereco2.setCep("06573-119");

        // planos de saúde
        PlanoDeSaude plano1 = new PlanoDeSaude();
        plano1.setOperadora("Notredame");
        plano1.setCategoria("Infinity");
        plano1.setValidade(LocalDate.of(2024, 07, 31));
        plano1.setNumero("4345 0220 2353 6553 120");

        PlanoDeSaude plano2 = new PlanoDeSaude();
        plano2.setOperadora("Amil");
        plano2.setCategoria("Amil 400");
        plano2.setValidade(LocalDate.of(2023, 03, 30));
        plano2.setNumero("2579 1331 5353 6000 222");

        // pacientes
        Paciente paciente1 = new Paciente();
        paciente1.setNome("Lohannes da Silva Costa");
        paciente1.setDataDeNascimento(LocalDate.of(2005, 01, 21));
        paciente1.setTelefone("11 98734-8374");
        paciente1.setEndereco(endereco1);
        paciente1.setRg("8374632-8");
        paciente1.setCpf("473775321-45");
        paciente1.setPlanoDeSaude(plano1);

        Paciente paciente2 = new Paciente();
        paciente2.setNome("Artur Alves");
        paciente2.setDataDeNascimento(LocalDate.of(2004, 04, 10));
        paciente2.setTelefone("11 99324-8531");
        paciente2.setEndereco(endereco2);
        paciente2.setRg("8305703-8");
        paciente2.setCpf("484885677-45");
        paciente2.setPlanoDeSaude(plano2);

        // relatório pacientes
        System.out.println("- LISTA DE PACIENTES -");
        System.out.println("Nome do paciente: " + paciente1.getNome());
        System.out.println("Data de nascimento: " + paciente1.getDataDeNascimento());
        System.out.println("Telefone: " + paciente1.getTelefone());
        System.out.println("Cidade: " + paciente1.getEndereco().getCidade());
        System.out.println("Estado: " + paciente1.getEndereco().getEstado());
        System.out.println("Plano de saúde: " + paciente1.getPlanoDeSaude().getOperadora());
        System.out.println("Categoria do plano: " + paciente1.getPlanoDeSaude().getCategoria());

        System.out.println("------------------------------------------");

        System.out.println("Nome do paciente: " + paciente2.getNome());
        System.out.println("Data de nascimento: " + paciente2.getDataDeNascimento());
        System.out.println("Telefone: " + paciente2.getTelefone());
        System.out.println("Cidade: " + paciente2.getEndereco().getCidade());
        System.out.println("Estado: " + paciente2.getEndereco().getEstado());
        System.out.println("Plano de saúde: " + paciente2.getPlanoDeSaude().getOperadora());
        System.out.println("Categoria do plano: " + paciente2.getPlanoDeSaude().getCategoria());

        // Agendar consulta com fisioterapeuta para o paciente1, ida 27/09 ás 15:45
        Agenda consulta1 = new Agenda();
        consulta1.setDataDaConsulta(LocalDate.of(2022, 9, 27));
        consulta1.setHoraDaConsulta(LocalTime.of(15, 45));
        consulta1.setPaciente(paciente1);
        consulta1.setMedico(medico2);
        consulta1.setEspecialidade(especialidade4);

        System.out.println("----------------------------------------");
        System.out.println(" - AGENDAMENTOS -");
        System.out.println("Nome do paciente: " + consulta1.getPaciente().getNome());
        System.out.println("Data: " + consulta1.getDataDaConsulta());
        System.out.println("Horário: " + consulta1.getHoraDaConsulta());
        System.out.println("Médico: " + consulta1.getMedico().getNome());
        System.out.println("Especialidade: " + consulta1.getEspecialidade().getNome());
        System.out.println("Plano de saúde do paciente: " + consulta1.getPaciente().getPlanoDeSaude().getOperadora());
        System.out.println("Telefone: " + consulta1.getPaciente().getTelefone());

    }

}
