package backend;
import java.time.LocalDateTime;
import java.util.List;
public class Sumario {
    private String titulo;
    private TipoSumario tipo;
    private String sumario;
    private LocalDateTime dataHora;
    private List<Aluno> presencas; // Declare the attribute
    // Constructor
    public Sumario(String titulo, TipoSumario tipo, String sumario, LocalDateTime dataHora, List<Aluno> presencas) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.sumario = sumario;
        this.dataHora = dataHora;
        this.presencas = presencas; // Initialize the attribute
    }
    // Getter and Setter methods
    // (Your existing methods)
    public List<Aluno> getPresencas() {
        return this.presencas;
    }
    public void setPresencas(List<Aluno> presencas) {
        this.presencas = presencas;
    }
}