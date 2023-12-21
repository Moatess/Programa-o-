
package backend;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class RepositorioAlunos implements Serializable {

    private Map<String, Aluno> listaAlunos;
    

    public Map<String, Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(Map<String, Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public RepositorioAlunos() {
        this.listaAlunos = new HashMap<>();
    }

    public void inserirAluno(String numeroMecanografico, Aluno aluno) {
        listaAlunos.put(numeroMecanografico, aluno);
    }

    public void removerAluno(String numeroMecanografico) {
        listaAlunos.remove(numeroMecanografico);
    }

    public boolean existeAluno(String numeroMecanografico) {
        return listaAlunos.containsKey(numeroMecanografico);
    }


}

