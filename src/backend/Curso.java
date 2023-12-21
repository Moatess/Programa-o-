package backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Curso implements Serializable {

    private String designacao;
    private Professor diretorCurso;
    private RepositorioAlunos alunos;
    private RepositorioUC Ucs;

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

    public RepositorioAlunos getAluno() {
        return alunos;
    }

    public void setAluno(RepositorioAlunos alunos) {
        this.alunos = alunos;
    }

    public RepositorioUC getUcs() {
        return Ucs;
    }

    public void setUcs(RepositorioUC Ucs) {
        this.Ucs = Ucs;
    }

    public void adicionarAluno(String numeroMecanografico, Aluno aluno) {
        alunos.inserirAluno(numeroMecanografico, aluno);
    }

    public void removerAluno(String numeroMecanografico) {
        alunos.removerAluno(numeroMecanografico);
    }

    public List<Aluno> listarAlunos() {
        return new ArrayList<>(alunos.getListaAlunos().values());
    }

    public void atribuirDirecaoCurso(Professor diretorCurso) {
        this.setDiretorCurso(diretorCurso);
        System.out.println("Direção de curso atribuída com sucesso.");
    }

}
