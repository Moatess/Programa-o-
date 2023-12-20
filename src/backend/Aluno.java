package backend;

public class Aluno {

    private String nome;
    private String numeroMecanografico;
    private Curso curso;

    // Constructor
    public Aluno(String nome, String numeroMecanografico, Curso curso) {
        this.nome = nome;
        this.numeroMecanografico = numeroMecanografico;
        this.curso = curso;
    }

    // Getter and Setter methods
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

    // toString method
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", numeroMecanografico='" + numeroMecanografico + '\'' +
                ", curso=" + curso +
                '}';
    }
}
