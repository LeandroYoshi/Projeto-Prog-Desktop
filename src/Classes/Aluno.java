package Classes;

import java.io.Serializable;

public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String sexo;
    private int RA;

    public Aluno(String nome, String sexo, int RA) {
        this.nome = nome;
        this.sexo = sexo;
        this.RA = RA;
    }

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }
}
