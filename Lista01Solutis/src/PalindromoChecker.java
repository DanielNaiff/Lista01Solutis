import java.util.Scanner;

public class PalindromoChecker {

    // Método que verifica se uma palavra é um palíndromo
    public static boolean isPalindromo(String palavra) {
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        int comprimento = palavra.length();

        for (int i = 0; i < comprimento / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    // Método para perguntar ao usuário se deseja repetir o processo
    private static boolean desejaRepetir(Scanner scanner) {
        boolean escolhaValida = false;
        boolean repetirProcesso = false;

        while (!escolhaValida) {
            System.out.print("Deseja testar de novo? (s/n): ");
            String escolha = scanner.nextLine();
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir;

        do {
            String palavra = "";
            boolean entradaValida = false;

            while (!entradaValida) {
                System.out.print("Digite uma palavra para verificar se é um palíndromo: ");
                palavra = scanner.nextLine().trim();

                if (palavra.isEmpty()) {
                    System.out.println("Entrada inválida! A palavra não pode ser vazia. Por favor, digite uma palavra.");
                } else {
                    entradaValida = true;
                }
            }

            if (isPalindromo(palavra)) {
                System.out.println(palavra + " é um palíndromo.");
            } else {
                System.out.println(palavra + " não é um palíndromo.");
            }
            repetir = desejaRepetir(scanner);
        } while (repetir);

        scanner.close();
    }
}
