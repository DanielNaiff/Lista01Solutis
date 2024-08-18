import java.util.InputMismatchException;
import java.util.Scanner;

public class Circulo {

    public static double calcularArea(double raio) {
        final double PI = Math.PI; // Valor de PI
        return PI * raio * raio;   // Fórmula da área
    }

    public static double arredondar(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite o valor do raio do círculo: ");

            try {
                raio = scanner.nextDouble();
                if (raio < 0) {
                    System.out.println("O raio não pode ser negativo. Tente novamente.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número válido.");
                scanner.next();
            }
        }

        double area = calcularArea(raio);

        double areaArredondada = arredondar(area);

        System.out.println("A área do círculo é: " + areaArredondada);

        scanner.close();
    }
}
