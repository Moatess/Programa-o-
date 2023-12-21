package backend;

public class Administrador {

    public boolean autenticar(String username, String password) {
        // Verifique se o username e password correspondem a um administrador válido
        return username.equals("admin") && password.equals("senhaAdmin");
    }

    public void removerAluno(RepositorioAlunos repositorioAlunos, String numeroMecanografico) {
        if (repositorioAlunos.existeAluno(numeroMecanografico)) {
            repositorioAlunos.removerAluno(numeroMecanografico);
            System.out.println("Aluno removido com sucesso.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void alterarInformacaoCurso(RepositorioCursos repositorioCursos, String designacao, String novaDesignacao) {
        if (repositorioCursos.existeCurso(designacao)) {
            Curso curso = repositorioCursos.getListaCursos().get(designacao);
            curso.setDesignacao(novaDesignacao);
            System.out.println("Designação do curso alterada com sucesso.");
        } else {
            System.out.println("Curso não encontrado.");
        }
    }

    public void alterarInformacaoUC(RepositorioUC repositorioUC, String designacao, String novaDesignacao) {
        if (repositorioUC.existeUC(designacao)) {
            UnidadeCurricular uc = repositorioUC.getListaUCs().get(designacao);
            uc.setDesignacao(novaDesignacao);
            System.out.println("Designação da UC alterada com sucesso.");
        } else {
            System.out.println("UC não encontrada.");
        }
    }

}
