import java.util.Scanner;

public class Questao12_ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quilometragemTotal = 0;
        double litrosTotal = 0;

        while (true) {
            System.out.print("Digite a quilometragem dirigida (ou um número negativo para sair): ");
            double quilometragem = scanner.nextDouble();

            // Condição para sair do loop
            if (quilometragem < 0) {
                break;
            }

            System.out.print("Digite a quantidade de litros de gasolina consumidos: ");
            double litros = scanner.nextDouble();

            // Verifica se a quantidade de litros é válida
            if (litros <= 0) {
                System.out.println("A quantidade de litros deve ser maior que zero. Tente novamente.");
                continue;
            }

            // Calcula o consumo para o tanque atual
            double consumo = quilometragem / litros;
            System.out.printf("Consumo para este tanque: %.2f km/l%n", consumo);

            // Acumula os valores totais
            quilometragemTotal += quilometragem;
            litrosTotal += litros;

            // Exibe o resumo atual
            double consumoTotal = quilometragemTotal / litrosTotal;
            System.out.printf("Quilometragem acumulada até agora: %.2f km%n", quilometragemTotal);
            System.out.printf("Total de litros consumidos até agora: %.2f litros%n", litrosTotal);
            System.out.printf("Consumo médio acumulado até agora: %.2f km/l%n", consumoTotal);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

        // Fecha o scanner
        scanner.close();
    }
}
