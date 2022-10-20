package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

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
    }

    public static void excluir(Integer codigo) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (codigo == p.getCodigo()) {
                planosDeSaude.remove(p);
                break;
            }
        }
    }

    public static void atualizar(PlanoDeSaude correta) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (correta.getCodigo()== p.getCodigo()) {
                int posicao = planosDeSaude.indexOf(p);
                planosDeSaude.set(posicao, correta);
            }
        }
    }
    
    // Lista inicial de planos de saúde
    public static void criarListaDePlanosDeSaude(){
        PlanoDeSaude p1 = new PlanoDeSaude(
                "Notredame",
                "Essential",
                LocalDate.of(2023, Month.MARCH, 8), 
                "000123");
        PlanoDeSaude p2 = new PlanoDeSaude(
                "Amil", "Amil400", 
                LocalDate.of(2024, Month.AUGUST, 28),
                "002222");
        PlanoDeSaude p3 = new PlanoDeSaude(
                "Bradesco",
                "Gold",
                LocalDate.of(2022, Month.DECEMBER, 30),
                "000333");
        
        planosDeSaude.add(p1);
        planosDeSaude.add(p2);
        planosDeSaude.add(p3);
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
            dados[i][4] = p.getValidade().toString();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
   }
       
        
       
}
