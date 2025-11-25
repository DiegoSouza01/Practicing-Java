package CorrectingTheRegistration;

public class Main {
    public static void main(String[] args) {

        String nome = "Júlia Oliveira";
        String cargoAtual = "Pessoa Desenvolvedora Júnior";
        int nivelAcessoAtual = 1;

        String novoCargo = "Pessoa Desenvolvedora Plena";
        int novoNivelAcesso = 2;

        Collaborator julia = new Collaborator(nome, cargoAtual, nivelAcessoAtual);

        System.out.println("- Antes da atualização -");
        julia.exibirInformacoes();

        julia.atualizarDados(novoCargo, novoNivelAcesso);

        System.out.println("\n- Após atualização -");
        julia.exibirInformacoes();

        System.out.println("\n- Mudança de Departamento -");
        julia.atualizarDados("Analista de Qualidade Pleno", 3);
        julia.exibirInformacoes();
    }
}
