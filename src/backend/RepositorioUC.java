
package backend;


import java.io.Serializable;
import java.util.TreeMap;

public class RepositorioUC implements Serializable {

    private TreeMap<String, UnidadeCurricular> listaUCs;

    public RepositorioUC() {
        this.listaUCs = new TreeMap<>();
    }

    public TreeMap<String, UnidadeCurricular> getListaUCs() {
        return listaUCs;
    }

    public void setListaUCs(TreeMap<String, UnidadeCurricular> listaUCs) {
        this.listaUCs = listaUCs;
    }
    
    public void inserirUC(String designacao, UnidadeCurricular uc) {
        listaUCs.put(designacao, uc);
    }

    public void removerUC(String designacao) {
        listaUCs.remove(designacao);
    }

    public boolean existeUC(String designacao) {
        return listaUCs.containsKey(designacao);
    }
}

