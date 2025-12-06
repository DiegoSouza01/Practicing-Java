package RemovingWhiteSpaces;

import java.util.Scanner;

public class NameFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");

        String nomeOriginal = scanner.nextLine();

        String nomeSemEspacos = nomeOriginal.trim();

        System.out.println("Nome sem espaços: " + nomeSemEspacos);

        scanner.close();
    }
}
