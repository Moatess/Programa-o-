package frontend;
import backend.Professor;
import backend.Curso;
import backend.UnidadeCurricular;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Interface {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Professor> professores = new ArrayList<>();
        List<Curso> cursos = new ArrayList<>();
        List<UnidadeCurricular> ucs = new ArrayList<>();
        boolean exit = false;
        while (!exit) {
            System.out.println("\n===== University Management System =====");
            System.out.println("1. Add Professor");
            System.out.println("2. Add Curso");
            System.out.println("3. Add Unidade Curricular");
            System.out.println("4. List Professors");
            System.out.println("5. List Cursos");
            System.out.println("6. List Unidade Curricular");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            switch (choice) {
                case 1:
                    addProfessor(professores);
                    break;
                case 2:
                    addCurso(cursos, professores);
                    break;
                case 3:
                    //addUnidadeCurricular(ucs);
                    break;
                case 4:
                    listProfessors(professores);
                    break;
                case 5:
                    listCursos(cursos);
                    break;
                case 6:
                    //listUnidadeCurricular(ucs);
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Thank you for using the University Management System!");
    }
    private static void addProfessor(List<Professor> professores) {
        System.out.println("\n===== Add Professor =====");
        //Chamar utilizador
        System.out.print("Enter Professor's username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Professor's password: ");
        String password = scanner.nextLine();
        System.out.print("Enter Professor's name: ");
        String nome = scanner.nextLine();
        System.out.print("Enter Professor's registration number: ");
        String numeroMecanografico = scanner.nextLine();
        System.out.print("Enter Professor's start date of functions (YYYY-MM-DD): ");
        String startDateString = scanner.nextLine();
        LocalDate inicioFuncoes = LocalDate.parse(startDateString);
        // You may want to add more input prompts based on your Professor class attributes
        Professor professor = new Professor(username, password, nome, numeroMecanografico, inicioFuncoes, null);
        professores.add(professor);
        System.out.println("Professor added successfully!");
    }
    // Implement similar methods for adding Curso and UnidadeCurricular
    // Método auxiliar para encontrar um Professor por número de registro
    private static Professor findProfessorByNumero(List<Professor> professores, String numeroMecanografico) {
        for (Professor professor : professores) {
            if (professor.getNumeroMecanografico().equals(numeroMecanografico)) {
                return professor;
            }
        }
        return null;  // Retorna null se não encontrar o professor
    }
    private static void listProfessors(List<Professor> professores) {
        System.out.println("\n===== List of Professors =====");
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }
    private static void addCurso(List<Curso> cursos, List<Professor> professores) {
        System.out.println("\n===== Add Curso =====");
        // Exibindo a lista de professores para que o usuário escolha um diretor
        System.out.println("Professores disponíveis:");
        listProfessors(professores);
        // Obtendo o número do professor que será o diretor do curso
        System.out.print("Enter the registration number of the Professor who will be the Curso's director: ");
        String diretorCursoNumero = scanner.nextLine();
        // Encontrando o professor na lista
        Professor diretorCurso = findProfessorByNumero(professores, diretorCursoNumero);
        // Validando se o professor existe
        if (diretorCurso != null) {
            // Entrada do nome do curso
            System.out.print("Enter Curso's name: ");
            String designacao = scanner.nextLine();
            // Criando o objeto Curso com o diretor
            Curso curso = new Curso(designacao, diretorCurso);
            cursos.add(curso);
            System.out.println("Curso added successfully!");
        } else {
            System.out.println("Error: Professor not found with the given registration number.");
        }
    }
    private static void listCursos(List<Curso> cursos) {
        System.out.println("\n===== List of Cursos =====");
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }
    // Implement similar methods for listing Cursos and UnidadeCurricular
    // You may need to implement error handling and validation in these methods
}