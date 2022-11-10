package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
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
    private final static Path PATH = Paths.get(URL);

    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    public static ArrayList<PlanoDeSaude> getPlanosDeSaude() {
        return planosDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (codigo == p.getCodigo()) {
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
            if (codigo == p.getCodigo()) {
                planosDeSaude.remove(p);
                break;
            }
        }
    }

    public static void atualizar(PlanoDeSaude novo) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (novo.getCodigo() == p.getCodigo()) {
                planosDeSaude.set(planosDeSaude.indexOf(p), novo);
                break;
                
            }
        }
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
