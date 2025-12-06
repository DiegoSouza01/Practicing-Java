package ValidatingCPF;

import java.util.Scanner;

public class CpfValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        boolean valido = cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");

        if (valido) {
            System.out.println("O CPF " + cpf + " está no formato válido.");
        } else {
            System.out.println("O CPF " + cpf + " está em um formato inválido.");
        }

        scanner.close();
    }
}
