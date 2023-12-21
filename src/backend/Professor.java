package backend;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Professor extends Utilizador implements Serializable {

    private String nome;
    private String numeroMecanografico;
    private LocalDate inicioFuncoes;
    private RepositorioUC servicoDocente;

    public Professor(String username, String password, String nome, String numeroMecanografico, LocalDate inicioFuncoes, RepositorioUC servicoDocente) {
        super(username, password);
        this.nome = nome;
        this.numeroMecanografico = numeroMecanografico;
        this.inicioFuncoes = inicioFuncoes;
        this.servicoDocente = servicoDocente;
    }

    // Métodos getter e setter para nome, numeroMecanografico, inicioFuncoes e servicoDocente...
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

    public LocalDate getInicioFuncoes() {
        return inicioFuncoes;
    }

    public void setInicioFuncoes(LocalDate inicioFuncoes) {
        this.inicioFuncoes = inicioFuncoes;
    }

    public RepositorioUC getServicoDocente() {
        return servicoDocente;
    }

    public void setServicoDocente(RepositorioUC servicoDocente) {
        this.servicoDocente = servicoDocente;
    }

    public void criarSumario(UnidadeCurricular uc, String titulo, String tipo, String sumario, RepositorioSumarios repositorioSumarios) {
        if (uc != null) {
            Sumario novoSumario = new Sumario();
            novoSumario.setTitulo(titulo);
            novoSumario.setTipo(tipo);
            novoSumario.setSumario(sumario);
            novoSumario.setDataHora(LocalDateTime.now());
            novoSumario.setPresencas(new RepositorioAlunos());

            repositorioSumarios.inserirSumario(uc.getDesignacao(), novoSumario);

            System.out.println("Sumário criado com sucesso.");
        } else {
            System.out.println("Unidade Curricular não encontrada.");
        }
    }
    
    


}
