package Controller;

import Classes.Aluno;
import DAO.AlunoDAO;
import java.util.ArrayList;
import java.util.List;

public class ControllerAluno {

    private AlunoDAO alunoDAO = new AlunoDAO();

    public boolean save(Aluno A) {
        if (A != null) {
            try {
                alunoDAO.insert(A);
                return true;
            } catch (Exception e) {
                System.out.println("Erro ao salvar aluno no banco: " + e.getMessage());
                return false;
            }
        } else {
            return false;
        }
    }

    public ArrayList<Aluno> returnAluno() {
        try {
            List<Aluno> lista = alunoDAO.list();
            return new ArrayList<>(lista);
        } catch (Exception e) {
            System.out.println("Erro ao listar alunos: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public boolean update(int RAfind, String newNome, int newRA, String newSexo) {
        try {
            return alunoDAO.update(RAfind, newNome, newRA, newSexo);
        } catch (Exception e) {
            System.out.println("Erro ao atualizar aluno: " + e.getMessage());
            return false;
        }
    }

    public boolean delete(int RAfind) {
        try {
            return alunoDAO.delete(RAfind);
        } catch (Exception e) {
            System.out.println("Erro ao excluir aluno: " + e.getMessage());
            return false;
        }

    }
}
