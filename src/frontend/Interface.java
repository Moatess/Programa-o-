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
                    //addCurso(cursos);
                    break;
                case 3:
                    //addUnidadeCurricular(ucs);
                    break;
                case 4:
                    listProfessors(professores);
                    break;
                case 5:
                    //listCursos(cursos);
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

    private static void listProfessors(List<Professor> professores) {
        System.out.println("\n===== List of Professors =====");
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }

    // Implement similar methods for listing Cursos and UnidadeCurricular

    // You may need to implement error handling and validation in these methods
}
