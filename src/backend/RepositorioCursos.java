package backend;

import java.io.Serializable;
import java.util.TreeMap;

public class RepositorioCursos implements Serializable {

    private TreeMap<String, Curso> listaCursos;

    public RepositorioCursos() {
        this.listaCursos = new TreeMap<>();
    }

    public TreeMap<String, Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(TreeMap<String, Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
    
    public void inserirCurso(String designacao, Curso curso) {
        listaCursos.put(designacao, curso);
    }

    public void removerCurso(String designacao) {
        listaCursos.remove(designacao);
    }

    public boolean existeCurso(String designacao) {
        return listaCursos.containsKey(designacao);
    }
    
 
}
