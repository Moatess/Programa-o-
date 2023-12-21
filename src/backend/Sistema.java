package backend;

import java.util.List;

public class Sistema {

    public RepositorioUC ucs;
    public RepositorioAlunos alunos;
    public RepositorioCursos cursos;
    public RepositorioProfessores professores;
    public RepositorioSumarios sumarios;
    public RepositorioUtilizadores utilizadores;
    //private final List<RegistoAcesso>listaEntradas;
    private Utilizador utilizadorLigado;

    public RepositorioUC getUcs() {
        return ucs;
    }

    public RepositorioAlunos getAlunos() {
        return alunos;
    }

    public RepositorioCursos getCursos() {
        return cursos;
    }

    public RepositorioProfessores getProfessores() {
        return professores;
    }

    public RepositorioSumarios getSumarios() {
        return sumarios;
    }
    
    

}
