package ConvertingToUppercaseAndLowercase;

import java.util.Scanner;

public class TextStandardizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        String textoMaiusculo = texto.toUpperCase();

        String textoMinusculo = texto.toLowerCase();

        System.out.println("Texto em maiúsculas: " + textoMaiusculo);
        System.out.println("Texto em minúsculas: " + textoMinusculo);

        scanner.close();
    }
}
