import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quilometragemTotal = 0;
        double litrosTotal = 0;

        while (true) {
            System.out.println("Digite a quilometragem dirigida (ou um número negativo para sair):");
            int quilometragem = scanner.nextInt();

            if (quilometragem < 0) {
                break;
            }

            System.out.println("Digite a quantidade de litros de gasolina consumidos:");
            int litros = scanner.nextInt();

            double consumo = (double) quilometragem / litros;

            System.out.printf("Consumo para este tanque: %.2f km/l%n", consumo);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            quilometragemTotal += quilometragem;
            litrosTotal += litros;
        }

        if (litrosTotal > 0) {
            double consumoTotal = quilometragemTotal / litrosTotal;
            System.out.printf("Quilometragem combinada: %.2f km%n", quilometragemTotal);
            System.out.printf("Total de litros consumidos: %.2f litros%n", litrosTotal);
            System.out.printf("Consumo médio total: %.2f km/l%n", consumoTotal);
        } else {
            System.out.println("Nenhum dado de combustível foi registrado.");
        }

        scanner.close();
    }
}
