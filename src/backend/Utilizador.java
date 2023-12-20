package backend;

public class Utilizador {
    private final String username;
    private final String password;

    public Utilizador(String username, String password) {
        // Add validation if needed
        this.username = username;
        this.password = password;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // No setter methods to make the class immutable

    // Additional methods as needed
    // ...

    @Override
    public String toString() {
        return "Utilizador{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
