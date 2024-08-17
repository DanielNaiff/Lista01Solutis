import java.util.Scanner;

public class DiasDaSemana {

    public static void main(String[] args) {
        String[] diasSemana = {
                "Segunda-feira",
                "Terça-feira",
                "Quarta-feira",
                "Quinta-feira",
                "Sexta-feira",
                "Sábado",
                "Domingo"
        };

        Scanner scanner = new Scanner(System.in);

        boolean repetirProcesso = true;

        while (repetirProcesso){
            System.out.print("Digite um número de 1 a 7: ");
            int numero = lerValor(scanner);

            if (numero >= 1 && numero <= 7) {
                System.out.println("O dia da semana correspondente é: " + diasSemana[numero - 1]);
            } else {
                System.out.println("Número inválido! Por favor, insira um número de 1 a 7.");
            }

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

    // Método para ler e validar um valor inteiro do usuário
    private static int lerValor(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida! Por favor, insira um número inteiro.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
