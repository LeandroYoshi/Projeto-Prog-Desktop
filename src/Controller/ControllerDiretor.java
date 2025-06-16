package Controller;

import Classes.Diretor;
import DAO.DiretorDAO;
import java.util.ArrayList;
import java.util.List;

public class ControllerDiretor {

    private DiretorDAO diretorDAO = new DiretorDAO();

    public boolean save(Diretor A) {
        if (A != null) {
            try {
                diretorDAO.insert(A);
                return true;
            } catch (Exception e) {
                System.out.println("Erro ao salvar diretor no banco: " + e.getMessage());
                return false;
            }
        } else {
            return false;
        }
    }

    public ArrayList<Diretor> returnDiretor() {
         try {
            List<Diretor> lista = diretorDAO.list();
            return new ArrayList<>(lista);
        } catch (Exception e) {
            System.out.println("Erro ao listar diretores: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public boolean update(int IDfind, String newNome, String newDepartamento, int newID) {
        try {
            return diretorDAO.update(IDfind, newNome, newID, newDepartamento);
        } catch (Exception e) {
            System.out.println("Erro ao atualizar diretor: " + e.getMessage());
            return false;
        }
    }

    public boolean delete(int IDfind) {
        try {
            return diretorDAO.delete(IDfind);
        } catch (Exception e) {
            System.out.println("Erro ao excluir diretor: " + e.getMessage());
            return false;
        }
    }
}
