import java.util.Scanner;

public class OrdenarPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra:");
        String palavra1 = scanner.nextLine();
        System.out.println("Digite a segunda palavra:");
        String palavra2 = scanner.nextLine();

        int comparacao = palavra1.compareTo(palavra2);

        if (comparacao < 0) {
            System.out.println("Ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (comparacao > 0) {
            System.out.println("Ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {
            System.out.println("As palavras são iguais.");
        }

        if (palavra1.length() > palavra2.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra1);
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra2);
        } else {
            System.out.println("Ambas as palavras têm o mesmo número de caracteres.");
        }

        scanner.close();
    }
}
