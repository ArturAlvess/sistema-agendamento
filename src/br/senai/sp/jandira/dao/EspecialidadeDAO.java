package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private final static String URL = "C:\\Users\\22282175\\JAVA\\Especialidade.txt";
    private final static String URL_TEMP = "C:\\Users\\22282175\\JAVA\\Especialidade-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    private static ArrayList<String> especialidadesNomes = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }

        return null;

    }

    public static void gravar(Especialidade e) {
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

    public static void excluir(Integer codigo) {

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }
        
        atualizarArquivo();
    }

    private static void atualizarArquivo() {
        
        // Passo 1 - Criar uma representa????o dos arquivos manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            // Criar o arquivo tempor??rio
            arquivoTemp.createNewFile();

            // Abrir o arquivo tempor??rio para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            // Iterar na lista para adicionar as especialidades
            // no arquivo tempor??rio, exceto o registro que
            // n??o queremos mais
            
            for(Especialidade e : especialidades){
                bwTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            
            bwTemp.close();
            
            // Excluir arquivo atual
            arquivoAtual.delete();
            
            // Renomear o arquivo tempor??rio
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    public static void atualizar(Especialidade correta) {

        for (Especialidade e : especialidades) {
            if (correta.getCodigo().equals(e.getCodigo())) {
                int posicao = especialidades.indexOf(e);
                especialidades.set(posicao, correta);
            }
        }
        atualizarArquivo();
    }

    // Lista inicial de especialidades
    public static void criarListaDeEspecialidades() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();
            while (linha != null) {
                // Transoformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(vetor[1], vetor[2],
                        Integer.valueOf(vetor[0]));

                // Guardar a especialidade na lista
                especialidades.add(e);

                // Ler a pr??xima linha
                linha = leitor.readLine();
            }
            leitor.close();
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, "ocorreu uma piabice!!!!");
        }

    }
    
    public static DefaultListModel<Especialidade> getModelEsp(){
        DefaultListModel<Especialidade> listaEspecialidades = new DefaultListModel<Especialidade>();
        for(Especialidade percorrer : getEspecialidades()){
            listaEspecialidades.addElement(percorrer);
        }
        return listaEspecialidades;
    }

    public static DefaultTableModel getEspecialidadesModel() {

        String[] titulos = {"C??DIGO", "NOME DA ESPECIALIDADE", "DESCRI????O"};

        String[][] dados = new String[especialidades.size()][3];
        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }

        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;

    }

}
