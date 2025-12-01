package LoginValidation;

import java.util.Scanner;

public class LaboratoryAccess {
    public static void main(String[] args) {
        User usuarioValido = new User("aluno2025", "escola@123");

        Scanner scanner = new Scanner(System.in);

        final int MAX_TENTATIVAS = 3;
        int tentativasRestantes = MAX_TENTATIVAS;
        boolean acessoConcedido = false;

        System.out.println("Sistema de Acesso ao Laboratório");

        while (tentativasRestantes > 0 && !acessoConcedido) {
            System.out.print("Digite seu Login: ");
            String loginDigitado = scanner.nextLine();

            System.out.print("Digite sua Senha: ");
            String senhaDigitada = scanner.nextLine();

            if (usuarioValido.validarCredenciais(loginDigitado, senhaDigitada)) {

                acessoConcedido = true;
                System.out.println("\nLogin bem-sucedido!");

            } else {

                tentativasRestantes--;

                if (tentativasRestantes > 0) {
                    System.out.println("\nSenha incorreta. Tentativas restantes: " + tentativasRestantes);
                } else {
                    System.out.println("\nAcesso bloqueado! Você excedeu o limite de " + MAX_TENTATIVAS + " falhas.");
                }
            }
        }

        scanner.close();
    }
}
