package Classes;

import java.io.Serializable;

public class Diretor implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String departamento;
    private int ID;

    public Diretor(String nome, String departamento, int ID) {
        this.nome = nome;
        this.departamento = departamento;
        this.ID = ID;
    }

    public Diretor() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
