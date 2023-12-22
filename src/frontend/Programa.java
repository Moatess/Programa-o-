package frontend;

import backend.Professor;
import backend.Sistema;
import java.time.LocalDate;


public class Programa {

    private final Consola consola = new Consola();
    private final Sistema sistema = new Sistema();

    public static void main(String[] args) throws Exception {
        Programa programa = new Programa();
        int opcao;
        String[] opcoes = {
            "Username",
            "Password",
            "Sair"};
        do {
            opcao = programa.consola.lerInteiro(opcoes);
            switch (opcao) {
                case 1:
                    programa.criarProfessor();
                    break;
                case 2:

                    break;
            }

        } while (opcao != opcoes.length);

    }

    public void criarProfessor() {
        System.out.println("===== Adicionar Professor =====");

        String username = consola.lerString("Username do Professor: ");
        String password = consola.lerString("Password do Professor: ");
        String nome = consola.lerString("Nome do Professor: ");
        String numeroMecanografico = consola.lerString("Número Mecanográfico do Professor: ");

        String startDateString = consola.lerString("Data de Início de Funções do Professor (YYYY-MM-DD): ");
        LocalDate inicioFuncoes = LocalDate.parse(startDateString);

        // Aqui você pode continuar pedindo outras informações necessárias para criar um professor
        // Agora, crie uma instância de Professor com as informações fornecidas
        Professor professor = new Professor(username, password, nome, numeroMecanografico, inicioFuncoes, null);

        // Adicione o professor ao RepositorioProfessores
        sistema.professores.inserirProfessor(username, professor);

        System.out.println("Professor adicionado com sucesso!");
    }
}
