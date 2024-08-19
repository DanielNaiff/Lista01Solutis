public class Questao07_DivisaoMultiplosDe3 {
    public static void main(String[] args) {
        System.out.println("Divisões usando tipo int:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultadoInt = i / 2;
                System.out.println(i + " dividido por 2 é " + resultadoInt);
            }
        }

        System.out.println("\nDivisões usando tipo double:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                double resultadoDouble = i / 2.0;
                System.out.println(i + " dividido por 2 é " + resultadoDouble);
            }
        }
    }
}
