package backend;

import java.time.LocalDateTime;
import java.util.List; // Add import statement for List

public class Sumario {

    private String titulo;
    private TipoSumario tipo;
    private String sumario;
    private LocalDateTime dataHora;
    private List<Aluno> presencas; // Declare the attribute

    // Getter and Setter methods
    // (Your existing methods)

    public List<Aluno> getPresencas() {
        return this.presencas;
    }

    public void setPresencas(List<Aluno> presencas) {
        this.presencas = presencas;
    }
}
