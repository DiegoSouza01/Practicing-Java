public class AgeVerificationScopeVariables {
    public static void main(String[] args) {
        int idade = 17; // Declara a variável antes da verificação
        String mensagem; // Declara a variável antes do bloco condicional

        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem); // Agora a variável está acessível
    }
}
