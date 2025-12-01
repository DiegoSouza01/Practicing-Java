package LoginValidation;

public class User {
    private final String login;
    private final String senha;

    public User(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean validarCredenciais(String loginDigitado, String senhaDigitada) {
        return this.login.equals(loginDigitado) && this.senha.equals(senhaDigitada);
    }
}
