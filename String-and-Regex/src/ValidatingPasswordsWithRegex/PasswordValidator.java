package ValidatingPasswordsWithRegex;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$";

        if (senha.matches(regex)) {
            System.out.println("A senha é válida.");
        } else {
            System.out.println("A senha é inválida. Ela deve ter 8 caracteres, letras maiúsculas, minúsculas, números e símbolos.");
        }

        scanner.close();
    }
}
