package ValidatingReferenceCodes;

import java.util.Scanner;

public class ProductValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código de referência: ");
        String codigo = scanner.nextLine();

        boolean valido = codigo.matches("[A-Z]{3}-\\d{4}");

        if (valido) {
            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("O código de referência é inválido.");
        }

        scanner.close();
    }
}
