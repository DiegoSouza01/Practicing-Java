package ExtractingPartOfAString;

import java.util.Scanner;

public class Extractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String nomeCompleto = scanner.nextLine();
        int indicePonto = nomeCompleto.lastIndexOf('.');

        String nomeSemExtensao;

        if (indicePonto > 0) {
            nomeSemExtensao = nomeCompleto.substring(0, indicePonto);
        } else {
            nomeSemExtensao = nomeCompleto;
        }

        System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);

        scanner.close();
    }
}
