package Controller;

import Classes.Professor;
import DAO.ProfessorDAO;
import java.util.ArrayList;
import java.util.List;

public class ControllerProfessor {

    private ProfessorDAO professorDAO = new ProfessorDAO();

    public boolean save(Professor P) {
        if (P != null) {
            try {
                professorDAO.insert(P);
                return true;
            } catch (Exception e) {
                System.out.println("Erro ao salvar professor no banco: " + e.getMessage());
                return false;
            }
        } else {
            return false;
        }
    }

    public ArrayList<Professor> returnProfessor() {
        try {
            List<Professor> lista = professorDAO.list();
            return new ArrayList<>(lista);
        } catch (Exception e) {
            System.out.println("Erro ao listar professores: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public boolean update(long TELfind, String newNome, String newCurso, long newTelefone) {

        try {
            return professorDAO.update(TELfind, newNome, newCurso, newTelefone);
        } catch (Exception e) {
            System.out.println("Erro ao atualizar professor: " + e.getMessage());
            return false;
        }
    }

    public boolean delete(long TELfind) {
        try {
            return professorDAO.delete(TELfind);
        } catch (Exception e) {
            System.out.println("Erro ao excluir professor: " + e.getMessage());
            return false;
        }
    }
}
