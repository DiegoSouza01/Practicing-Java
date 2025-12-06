package CheckingIfAStringContainsASubstring;

import java.util.Scanner;

public class WordSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();

        boolean encontrada = texto.contains(palavra);

        if (encontrada) {
            System.out.println("A palavra \"" + palavra + "\" está presente no texto.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não foi encontrada no texto.");
        }

        scanner.close();
    }
}
