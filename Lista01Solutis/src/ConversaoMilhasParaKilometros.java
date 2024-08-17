import java.util.Scanner;

class ConversaoMilhasParaKilometros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetirProcesso = true;

        while (repetirProcesso){
            System.out.print("Digite a distância em milhas: ");
            double milhas = lerValor(scanner);

            double kilometros = converterMilhasParaKilometros(milhas);

            System.out.printf("Distância em quilômetros: %.2f km%n", kilometros);

            repetirProcesso = desejaRepetir(scanner);
        }
        scanner.close();
        System.out.println("O programa foi encerrado");
    }

    // Método para perguntar ao usuário se deseja repetir o processo
    private static boolean desejaRepetir(Scanner scanner) {
        boolean escolhaValida = false;
        boolean repetirProcesso = false;

        while (!escolhaValida) {
            System.out.print("Deseja repetir o programa? (s/n): ");
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

    // Método para ler um valor do usuário
    private static double lerValor(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida! Por favor, insira um número.");
            scanner.next(); // Limpa a entrada inválida
        }
        return scanner.nextDouble();
    }

    // Método para converter milhas para quilômetros
    private static double converterMilhasParaKilometros(double milhas) {
        final double CONVERSAO = 1.609;
        return milhas * CONVERSAO;
    }
}
