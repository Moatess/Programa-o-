package backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UnidadeCurricular implements Serializable {

    private String designacao;
    private Professor regente;
    private RepositorioProfessores equipa;
    private RepositorioSumarios sumarios;
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

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

    public RepositorioProfessores getEquipa() {
        return equipa;
    }

    public void setEquipa(RepositorioProfessores equipa) {
        this.equipa = equipa;
    }

    public RepositorioSumarios getSumarios() {
        return sumarios;
    }

    public void setSumarios(RepositorioSumarios sumarios) {
        this.sumarios = sumarios;
    }

    public void adicionarProfessor(Administrador admin, Professor professor) {
        if (admin != null) {
            equipa.inserirProfessor(professor.getNome(), professor);
        } else {
            // Adicione um tratamento para a falta de permissão (lançar uma exceção, imprimir uma mensagem, etc.)
            System.out.println("Permissão negada. Apenas administradores podem adicionar professores.");
        }
    }

    public void removerProfessor(Administrador admin, String username) {
        if (admin != null) {
            equipa.removerProfessor(username);
        } else {
            // Adicione um tratamento para a falta de permissão
            System.out.println("Permissão negada. Apenas administradores podem remover professores.");
        }
    }

    public List<Professor> listarProfessores(Administrador admin) {
        if (admin != null) {
            return new ArrayList<>(equipa.getListaProfessores().values());
        } else {
            System.out.println("Permissão negada. Apenas administradores podem listar professores.");
            return new ArrayList<>();
        }
    }

}
