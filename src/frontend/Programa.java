package frontend;

import backend.Sistema;

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

                    break;
                case 2:

                    break;
            }

        } while (opcao != opcoes.length);

    }
}
