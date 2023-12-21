package backend;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Sumario implements Serializable{

    private String titulo;
    private String tipo; //tp,pl,t
    private String sumario;
    private LocalDateTime dataHora;
    private RepositorioAlunos presencas;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSumario() {
        return this.sumario;
    }

    public void setSumario(String sumario) {
        this.sumario = sumario;
    }

    public LocalDateTime getDataHora() {
        return this.dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public RepositorioAlunos getPresencas() {
        return this.presencas;
    }

    public void setPresencas(RepositorioAlunos presencas) {
        this.presencas = presencas;
    }

}