package FormattingNumbers;

import java.util.Scanner;

public class FinancialReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        System.out.printf("Valor formatado: R$ %.2f%n", valor);

        scanner.close();
    }
}
