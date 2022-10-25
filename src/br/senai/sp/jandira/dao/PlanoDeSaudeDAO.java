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
        PlanoDeSaude p1 = new PlanoDeSaude(
                "Notredame",
                "Essential",
                LocalDate.of(2023, Month.MARCH, 8), 
                "3243-3234-2343");
        PlanoDeSaude p2 = new PlanoDeSaude(
                "Amil", "Amil400", 
                LocalDate.of(2024, Month.AUGUST, 28),
                "5654-7845-2634");
        PlanoDeSaude p3 = new PlanoDeSaude(
                "Bradesco",
                "Gold",
                LocalDate.of(2022, Month.DECEMBER, 30),
                "2374-8473-8374");
        
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
            dados[i][4] = p.getDataFormatada();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
   }
       
        
       
}
