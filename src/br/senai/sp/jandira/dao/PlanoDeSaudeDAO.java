package br.senai.sp.jandira.dao;

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
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
    
    private final static String URL = "C:\\Users\\22282175\\JAVA\\PlanoDeSaude.txt";
    private final static String URL_TEMP = "C:\\Users\\22282175\\JAVA\\PlanoDeSaude-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    public static ArrayList<PlanoDeSaude> getPlanosDeSaude() {
        return planosDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (codigo.equals(p.getCodigo())) {
                return p;
            }
        }
        return null;
    }

    public static void gravar(PlanoDeSaude p) {
        planosDeSaude.add(p);
        
        // Gravar em arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException error) {
            JOptionPane.showConfirmDialog(null, "Erro inesperado!");
        }
    }

    public static void excluir(Integer codigo) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (codigo.equals(codigo)) {
                planosDeSaude.remove(p);
                break;
            }
        }
        atualizarArquivos();
    }
    private static void atualizarArquivos(){
        
        // Passo 1 - Criar uma representação dos arquivos manipulados
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
            
            for(PlanoDeSaude p : planosDeSaude){
                bwTemp.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
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

    public static void atualizar(PlanoDeSaude novo) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (novo.getCodigo().equals(p.getCodigo())) {
                planosDeSaude.set(planosDeSaude.indexOf(p), novo);
                break;
                
            }
        }
        atualizarArquivos();
    }
    
    // Lista inicial de planos de saúde
    public static void criarListaDePlanosDeSaude(){
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            
            while(linha != null){
                
                String[] vetor = linha.split(";");
                String[] data = vetor[4].split("/");
                
                PlanoDeSaude p = new PlanoDeSaude(vetor[2],
                        vetor[3],LocalDate.of(Integer.parseInt(data[2]),Integer.parseInt(data[1]), Integer.parseInt(data[0])), 
                        vetor[1],
                        Integer.valueOf(vetor[0]));
                
                planosDeSaude.add(p);
                
                linha = leitor.readLine();
            }
            
            //Fechar arquivo
            leitor.close();
            
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "ERro!");
        }
    }
    
    public static DefaultTableModel getPlanosDeSaudeModel(){
        
        String [] titulos = {"Código", "Número", "Operadora", "Categoria", "Validade"};
        
        String[][] dados = new String[planosDeSaude.size()][5];
        int i = 0;
        for (PlanoDeSaude p : planosDeSaude){
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getNumero();
            dados[i][2] = p.getOperadora();
            dados[i][3] = p.getCategoria();
            dados[i][4] = p.getDataFormatada();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
   }
       
        
       
}
