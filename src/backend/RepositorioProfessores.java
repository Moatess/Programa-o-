package backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositorioProfessores implements Serializable {

    private Map<String, Professor> listaProfessores;

    public Map<String, Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(Map<String, Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public RepositorioProfessores() {
        this.listaProfessores = new HashMap<>();
    }
    
    public List<Professor> listarProfessores() {
        return new ArrayList<>(listaProfessores.values());
    }

    public void inserirProfessor(String username, Professor professor) {
        listaProfessores.put(username, professor);
    }

    public void removerProfessor(String username) {
        listaProfessores.remove(username);
    }

    public boolean existeProfessor(String username) {
        return listaProfessores.containsKey(username);
    }

}
