package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:postgresql://localhost:5432/ProgDesktop";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "19601960le";

    public static Connection conect() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
