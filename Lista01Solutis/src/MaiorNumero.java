import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean repetirProcesso = true;

        while (repetirProcesso){
            double valor1 = lerValor(scanner, "Digite o primeiro valor: ");

            double valor2 = lerValor(scanner, "Digite o segundo valor: ");

            double maior = valor1 > valor2 ? valor1 : valor2;

            System.out.println("O maior valor é: " + maior);

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

    // Método para ler e validar um valor
    private static double lerValor(Scanner scanner, String nomeValor) {
        double valor = 0.0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(nomeValor);
                valor = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.next();
            }
        }

        return valor;
    }
}
