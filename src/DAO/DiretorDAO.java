package DAO;

import Classes.Diretor;
import DAO.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DiretorDAO {

    public void insert(Diretor diretor) {
        String sql = "INSERT INTO diretor (id, nome, departamento) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, diretor.getID());
            stmt.setString(2, diretor.getNome());
            stmt.setString(3, diretor.getDepartamento());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Diretor> list() {
        List<Diretor> diretores = new ArrayList<>();
        String sql = "SELECT * FROM diretor";
        try (Connection conn = Conexao.conect(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Diretor d = new Diretor();
                d.setID(rs.getInt("id"));
                d.setNome(rs.getString("nome"));
                d.setDepartamento(rs.getString("departamento"));
                diretores.add(d);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return diretores;
    }

    public boolean update(int IDfind, String newNome, int newID, String newDepartamento) {
        String sql = "UPDATE diretor SET id = ?, nome = ?, departamento = ? WHERE id = ?";
        try (Connection conn = Conexao.conect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, newID);
            stmt.setString(2, newNome);
            stmt.setString(3, newDepartamento);
            stmt.setInt(4, IDfind);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean delete(int ID) {
        String sql = "DELETE FROM diretor WHERE id = ?";
        try (Connection conn = Conexao.conect(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, ID);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
