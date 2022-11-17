package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
    
    private final static String URL = "C:\\Users\\22282175\\JAVA\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282175\\JAVA\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    
    private static ArrayList<Medico> medicos = new ArrayList<>();
    
    public static ArrayList<Medico> getMedicos(){
        return medicos;
    }
    
    public static Medico getMedico(Integer codigo){
        for(Medico m : medicos){
            if(codigo.equals(m.getCodigo())){
                return m;
            }
        }
        return null;
    }
    
    public static void atualizar(Medico novo){
        for(Medico m : medicos){
            if(novo.getCodigo().equals(m.getCodigo())){
                medicos.set(medicos.indexOf(m), novo);
                break;
            }
        }
    }
    
    //Lista inicial
    public static void criarListaDeMedicos(){
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while(linha != null){
                
                String[] vetor = linha.split(";");
                
                Medico m = new Medico
                
                
            }
            
            
        } catch (Exception e) {
        }
    }
    
    public static DefaultTableModel getMedicosModel(){
        
        String[] titulos = {"Código", "CRM", "Nome", "Telefone"};
        
        String[][] dados = new String[medicos.size()][4];
        int i = 0;
        for(Medico m : medicos){
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    }
}
