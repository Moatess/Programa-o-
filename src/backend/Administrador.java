package backend;
public class Administrador extends Utilizador {
    private String username;
    private String password;
    private String nome;
    // Constructor
    public Administrador(String username, String password, String nome) {
        super(username, password);
        this.username = username;
        this.password = password;
    }
    // Getter and Setter methods
    // (Note: You can inherit the getters and setters for 'username' and 'password' from the Utilizador class)
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}