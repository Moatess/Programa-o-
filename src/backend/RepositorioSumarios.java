package backend;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class RepositorioSumarios implements Serializable {

    private Map<String, Sumario> listaSumarios;

    public RepositorioSumarios() {
        this.listaSumarios = new HashMap<>();
    }

    public void inserirSumario(String codigo, Sumario sumario) {
        listaSumarios.put(codigo, sumario);
    }

    public void removerSumario(String codigo) {
        listaSumarios.remove(codigo);
    }

    public boolean existeSumario(String codigo) {
        return listaSumarios.containsKey(codigo);
    }
}
