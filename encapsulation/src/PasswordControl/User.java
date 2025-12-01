package PasswordControl;

public class User {
    private String senhaAtual;

    public User(String senhaInicial) {
        this.senhaAtual = senhaInicial;
        System.out.println("Usuário criado com senha inicial.");
    }

    public void setSenha(String senhaDigitadaAcesso, String novaSenha) {
        if (this.senhaAtual.equals(senhaDigitadaAcesso)) {

            this.senhaAtual = novaSenha;
            System.out.println("Senha alterada com sucesso!");

        } else {
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }

    public String getSenhaAtual() {
        return senhaAtual;
    }


    public static void main(String[] args) {
        User user = new User("123456");

        System.out.println("\n Teste 1: Alteração com sucesso (Senha atual correta)");
        user.setSenha("123456", "abc123");

        System.out.println("\nTeste 2: Alteração com falha (Senha atual incorreta)");
        user.setSenha("123456", "novaInvalida");

        System.out.println("\nTeste 3: Alteração com sucesso (Usando a nova senha atual)");
        user.setSenha("abc123", "987654");
    }
}
