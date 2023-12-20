package backend;

public class Administrador {

    private String username;
    private String password;

    public Administrador(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter and Setter methods for username and password
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Additional methods for the Administrador class
    public void adicionarProfessor(Professor professor) {
        // Add logic to add a professor to the system
    }

    public void removerProfessor(Professor professor) {
        // Add logic to remove a professor from the system
    }

    public void criarCurso(Curso curso) {
        // Add logic to create a new course in the system
    }

    // ... other methods as needed
}
