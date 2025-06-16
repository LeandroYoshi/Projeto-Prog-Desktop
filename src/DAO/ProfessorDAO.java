package DAO;

import Classes.Professor;
import DAO.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

    public void insert(Professor professor) {
        String sql = "INSERT INTO professor (telefone, nome, curso) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, professor.getTelefone());
            stmt.setString(2, professor.getNome());
            stmt.setString(3, professor.getCurso());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Professor> list() {
        List<Professor> professores = new ArrayList<>();
        String sql = "SELECT * FROM professor";
        try (Connection conn = Conexao.conect(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Professor p = new Professor();
                p.setTelefone(rs.getLong("telefone"));
                p.setNome(rs.getString("nome"));
                p.setCurso(rs.getString("curso"));
                professores.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return professores;
    }

    public boolean update(long TELfind, String newNome, String newCurso, long newTelefone) {
        String sql = "UPDATE professor SET telefone = ?, nome = ?, curso = ? WHERE telefone = ?";
        try (Connection conn = Conexao.conect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, newTelefone);
            stmt.setString(2, newNome);
            stmt.setString(3, newCurso);
            stmt.setLong(4, TELfind);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean delete(long TEL) {
        String sql = "DELETE FROM professor WHERE telefone = ?";
        try (Connection conn = Conexao.conect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, TEL);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
