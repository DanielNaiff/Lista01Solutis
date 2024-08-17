import java.util.InputMismatchException;
import java.util.Scanner;

class NumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetirProcesso = true;

        while (repetirProcesso) {
            int numero = lerValor(scanner, "Digite um número inteiro: ");

            System.out.println("Números primos menores que " + numero + ":");

            // Verificação de números primos diretamente no main
            for (int i = 2; i < numero; i++) {
                boolean ehPrimo = true;

                if (i <= 1) {
                    ehPrimo = false;
                } else if (i == 2) {
                    ehPrimo = true;
                } else if (i % 2 == 0) {
                    ehPrimo = false;
                } else {
                    for (int j = 3; j * j <= i; j += 2) {
                        if (i % j == 0) {
                            ehPrimo = false;
                            break;
                        }
                    }
                }

                if (ehPrimo) {
                    System.out.println(i);
                }
            }

            repetirProcesso = desejaRepetir(scanner);
        }

        scanner.close();
        System.out.println("O programa foi encerrado");
    }

    // Método para ler e validar um valor
    private static int lerValor(Scanner scanner, String nomeValor) {
        int valor = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(nomeValor);
                valor = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número inteiro.");
                scanner.next();
            }
        }

        return valor;
    }

    // Método para perguntar ao usuário se deseja repetir o processo
    private static boolean desejaRepetir(Scanner scanner) {
        boolean escolhaValida = false;
        boolean repetirProcesso = false;

        while (!escolhaValida) {
            System.out.print("Deseja realizar outra troca? (s/n): ");
            String escolha = scanner.next();
            if (escolha.equalsIgnoreCase("s")) {
                repetirProcesso = true;
                escolhaValida = true;
            } else if (escolha.equalsIgnoreCase("n")) {
                repetirProcesso = false;
                escolhaValida = true;
            } else {
                System.out.println("Entrada inválida! Por favor, digite s ou n.");
            }
        }

        return repetirProcesso;
    }
}
