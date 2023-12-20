package backend;

public class UnidadeCurricular {

    private String designacao;
    private Professor regente;

    // Constructor
    public UnidadeCurricular(String designacao, Professor regente) {
        this.designacao = designacao;
        this.regente = regente;
    }

    // Getter and Setter methods
    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public Professor getRegente() {
        return regente;
    }

    public void setRegente(Professor regente) {
        this.regente = regente;
    }

    // toString method
    @Override
    public String toString() {
        return "UnidadeCurricular{" +
                "designacao='" + designacao + '\'' +
                ", regente=" + regente +
                '}';
    }
}
