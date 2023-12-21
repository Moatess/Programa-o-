package backend;

import java.io.Serializable;
import java.util.List;

public class Aluno extends Utilizador implements Serializable{

    private String nome;
    private String numeroMecanografico;
    private Curso curso;
    private List<Sumario>presencas;

    public Aluno(String username, String password, String nome, String numeroMecanografico, Curso curso) {
        super(username, password);
        this.nome = nome;
        this.numeroMecanografico = numeroMecanografico;
        this.curso = curso;
    }

    // Métodos getter e setter para nome, numeroMecanografico e curso...

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroMecanografico() {
        return numeroMecanografico;
    }

    public void setNumeroMecanografico(String numeroMecanografico) {
        this.numeroMecanografico = numeroMecanografico;
    }
    

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Sumario> getPresencas() {
        return presencas;
    }

    public void setPresencas(List<Sumario> presencas) {
        this.presencas = presencas;
    }
    
}
    
    

