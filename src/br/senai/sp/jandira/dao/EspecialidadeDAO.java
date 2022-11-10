package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {
    
    private final static String URL = "C:\\Users\\22282175\\JAVA\\Especialidade.txt";
    private final static Path PATH = Paths.get(URL);
    
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
        
        // Gravar em arquivo
         try {
             BufferedWriter escritor = Files.newBufferedWriter(PATH,
                     StandardOpenOption.APPEND,
                     StandardOpenOption.WRITE);
             
             escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
             escritor.newLine();
             escritor.close();
             
        } catch (IOException error) {
             JOptionPane.showMessageDialog(null,
                     "Ocorreu um erro inesperado :/");
        }
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
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            while(linha  != null){
                // Transoformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(vetor[1], vetor[2],
                        Integer.valueOf(vetor[0]));
                
                
                // Guardar a especialidade na lista
                especialidades.add(e);
                
                // Ler a próxima linha
                linha = leitor.readLine();
            }
            leitor.close();
        } catch (IOException e) {
            JOptionPane.showConfirmDialog
        (null, "ocorreu uma piabice!!!!");
        }
      
    }
    
    public static DefaultTableModel getEspecialidadesModel(){
        
        String [] titulos = {"CÓDIGO", "NOME DA ESPECIALIDADE", "DESCRIÇÃO"};
        
        String[][] dados = new String[especialidades.size()][3];
        int i = 0;
        for (Especialidade e : especialidades){
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
        
   }
    
    
    
}
