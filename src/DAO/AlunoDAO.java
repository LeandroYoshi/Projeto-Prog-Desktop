package DAO;

import Classes.Aluno;
import DAO.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public void insert(Aluno aluno) {
        String sql = "INSERT INTO aluno (ra, nome, sexo) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, aluno.getRA());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getSexo());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Aluno> list() {
        List<Aluno> alunos = new ArrayList<>();
        String sql = "SELECT * FROM aluno";
        try (Connection conn = Conexao.conect(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Aluno a = new Aluno();
                a.setRA(rs.getInt("ra"));
                a.setNome(rs.getString("nome"));
                a.setSexo(rs.getString("sexo"));
                alunos.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    public boolean update(int RAfind, String newNome, int newRA, String newSexo) {
        String sql = "UPDATE aluno SET ra = ?, nome = ?, sexo = ? WHERE ra = ?";
        try (Connection conn = Conexao.conect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, newRA);
            stmt.setString(2, newNome);
            stmt.setString(3, newSexo);
            stmt.setInt(4, RAfind);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean delete(int RA) {
        String sql = "DELETE FROM aluno WHERE ra = ?";
        try (Connection conn = Conexao.conect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, RA);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
