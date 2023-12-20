package backend;

import java.time.LocalDate;
import java.util.List;

public class Professor extends Utilizador {

    private String nome;
    private String numeroMecanografico;
    private LocalDate inicioFuncoes;
    private List<UnidadeCurricular> unidadesCurricularesLecionadas;

    public Professor(String username, String password, String nome, String numeroMecanografico, LocalDate inicioFuncoes, List<UnidadeCurricular> unidadesCurricularesLecionadas) {
        super(username, password); // Call the constructor of the superclass
        this.nome = nome;
        this.numeroMecanografico = numeroMecanografico;
        this.inicioFuncoes = inicioFuncoes;
        this.unidadesCurricularesLecionadas = unidadesCurricularesLecionadas;
    }
    // Getter methods
    public String getNome() {
        return nome;
    }
    public String getNumeroMecanografico() {
        return numeroMecanografico;
    }
    public LocalDate getInicioFuncoes() {
        return inicioFuncoes;
    }
    public List<UnidadeCurricular> getUnidadesCurricularesLecionadas() {
        return unidadesCurricularesLecionadas;
    }
    // Additional methods for the Professor class
    // Add a method to calculate the years of service
    public int calcularAnosServico() {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.isBefore(inicioFuncoes)) {
            throw new IllegalStateException("A data de início de funções não pode ser no futuro.");
        }
        return currentDate.getYear() - inicioFuncoes.getYear();
    }
    // Override the toString method to provide a meaningful string representation
    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", numeroMecanografico='" + numeroMecanografico + '\'' +
                ", inicioFuncoes=" + inicioFuncoes +
                ", unidadesCurricularesLecionadas=" + unidadesCurricularesLecionadas +
                '}';
    }
}