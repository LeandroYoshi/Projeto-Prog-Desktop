package Classes;

import java.io.Serializable;

public class Professor implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String curso;
    private long telefone;

    public Professor(String nome, String curso, long telefone) {
        this.nome = nome;
        this.curso = curso;
        this.telefone = telefone;
    }

    public Professor() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

}
