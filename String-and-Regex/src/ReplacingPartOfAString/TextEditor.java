package ReplacingPartOfAString;

import java.util.Scanner;

public class TextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra a ser substituída: ");
        String palavraAntiga = scanner.nextLine();

        System.out.print("Digite a nova palavra: ");
        String palavraNova = scanner.nextLine();

        if (texto.contains(palavraAntiga)) {
            String textoModificado = texto.replace(palavraAntiga, palavraNova);

            System.out.println("Texto modificado: " + textoModificado);
        } else {
            System.out.println("Erro: A palavra '" + palavraAntiga + "' não foi encontrada no texto.");
        }

        scanner.close();
    }
}
