package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

public class EspecialidadeDAO {
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
    
    public static Especialidade getEspecialidade(Integer codigo){
        for(Especialidade e : especialidades){
            if (codigo == e.getCodigo()){
                return e;
            }
        }
        
        return null;
        
    }
    
    public static void gravar(Especialidade e){
        especialidades.add(e);
    }
    
    public static void excluir(Integer codigo){
        
        for(Especialidade e : especialidades){
            if(codigo == e.getCodigo()){
                especialidades.remove(e);
                break;
            }
        }
        
    }
    
    public static void atualizar(Especialidade correta){
        
        for(Especialidade e : especialidades){
            if(correta.getCodigo() == e.getCodigo()){
            int posicao = especialidades.indexOf(e);
            especialidades.set(posicao, correta);
        }  
    }
    }
    
    // Lista inicial de especialidades
    
    public static void criarListaDeEspecialidades(){
        Especialidade e1 = new Especialidade("Cardiologia", "Cuida do coração");
        Especialidade e2 = new Especialidade("Fisioterapia", "Cuida dos movimentos do corpo");
        Especialidade e3 = new Especialidade("Urologia", "Cuida das partes genitais masculinas");
        Especialidade e4 = new Especialidade("Dermatologia", "Cuida da pele");
        
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
    }
    
}
