package backend;

public class Curso {

    private String designacao;
    private Professor diretorCurso;

    // Constructor
    public Curso(String designacao, Professor diretorCurso) {
        this.designacao = designacao;
        this.diretorCurso = diretorCurso;
    }

    // Getter and Setter methods
    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public Professor getDiretorCurso() {
        return diretorCurso;
    }

    public void setDiretorCurso(Professor diretorCurso) {
        this.diretorCurso = diretorCurso;
    }

    // toString method
    @Override
    public String toString() {
        return "Curso{" +
                "designacao='" + designacao + '\'' +
                ", diretorCurso=" + diretorCurso +
                '}';
    }
}
