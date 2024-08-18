import java.util.InputMismatchException;
import java.util.Scanner;

public class ContadorDeCaracteres {

    public static void contarCaracteres(String texto) {
        int contagemVogais = 0;
        int contagemEspacos = 0;
        int contagemConsoantes = 0;

        texto = texto.toLowerCase();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    contagemVogais++;
                } else {
                    contagemConsoantes++;
                }
            } else if (c == ' ') {
                contagemEspacos++;
            }
        }


        System.out.println("Quantidade de vogais: " + contagemVogais);
        System.out.println("Quantidade de espaços em branco: " + contagemEspacos);
        System.out.println("Quantidade de consoantes: " + contagemConsoantes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            String texto = "";

            while (texto.trim().isEmpty()) {
                System.out.print("Digite uma cadeia de caracteres: ");
                texto = scanner.nextLine();

                if (texto.trim().isEmpty()) {
                    System.out.println("A entrada não pode ser vazia. Tente novamente.");
                }
            }

            contarCaracteres(texto);

            System.out.print("Deseja repetir? (s/n): ");
            String resposta = scanner.nextLine().trim().toLowerCase();

            if (resposta.equals("n")) {
                repetir = false;
                System.out.println("Programa encerrado.");
            } else if (!resposta.equals("s")) {
                System.out.println("Resposta inválida. Encerrando o programa.");
                repetir = false;
            }
        }

        scanner.close();
    }
}
