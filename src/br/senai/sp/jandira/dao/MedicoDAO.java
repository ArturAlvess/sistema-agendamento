package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
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
    
    public static void gravar(Medico m){
        medicos.add(m);
        
        //Gravar arquivos
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
        }
    }
    
    public static void excluir(Integer codigo){
        for (Medico m : medicos){
            if(m.getCodigo().equals(codigo)){
                medicos.remove(m);
                break;
            }
        }
        atualizarArquivos();
    }
    public static void atualizarArquivos(){
        // Criar representação de arquivos manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);
        
        try {
            // Criar o arquivo temporário
            arquivoTemp.createNewFile();
            
             // Abrir o arquivo temporário para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            // Iterar na lista para adicionar as especialidades
            // no arquivo temporário, exceto o registro que
            // não queremos mais
            
            for(Medico m : medicos){
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            
            // Excluir arquivo atual
            arquivoAtual.delete();
            
            // Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);
            
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }
    
    public static void atualizar(Medico novo){
        for(Medico m : medicos){
            if(m.getCodigo().equals(novo.getCodigo())){
                medicos.set(medicos.indexOf(m), novo);
                break;
            }
        }
        atualizarArquivos();
    }
    
    public static ArrayList<Especialidade> separarCodigo(String linha){
        String[] vetor = linha.split(";");
        
        int codigoEspecialidade = 6;
        
        ArrayList<Especialidade> codigos = new ArrayList<>();
        while (codigoEspecialidade < vetor.length){
            codigos.add(EspecialidadeDAO.getEspecialidade(Integer.valueOf(vetor[codigoEspecialidade])));
            codigoEspecialidade++;
        }
        return codigos;
    }
    //Lista inicial
    public static void criarListaDeMedicos(){
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while(linha != null){
                
                String[] vetor = linha.split(";");
                
              
                Medico m = new Medico(vetor[2], vetor[3], vetor[4], vetor[1], vetor[5], Integer.valueOf(vetor[0]), separarCodigo(linha));
          
                
                medicos.add(m);
                linha = leitor.readLine();
                
      
            }
            
            //Fechar
            leitor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "erro!");
        }
    }
    
    public static DefaultListModel<Especialidade> getModelEsp(){
        
        DefaultListModel<Especialidade> listaEspecialidade = new DefaultListModel<>();
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            for(Especialidade percorrer : separarCodigo(linha)){
                listaEspecialidade.addElement(percorrer);
            }
            leitor.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu uma piabice");
        }
        return listaEspecialidade;
    }
    
    public static DefaultTableModel getMedicosModel(){
        
        String[] titulos = {"Código", "CRM", "Nome", "Telefone"};
        
        String[][] dados = new String[medicos.size()][6];
        int i = 0;
        for(Medico m : medicos){
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
            dados[i][4] = m.getEmail();
            dados[i][5] = m.getDataFormatada();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    }
}
