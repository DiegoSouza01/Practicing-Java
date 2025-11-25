package CorrectingTheRegistration;

public class Collaborator {
    private String nome;
    private String cargo;
    private int nivelAcesso;

    public Collaborator(String nome, String cargo, int nivelAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    public void atualizarDados(String novoCargo, int novoNivelAcesso) {
        this.cargo = novoCargo;
        this.nivelAcesso = novoNivelAcesso;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Nível de acesso: " + this.nivelAcesso);
    }
}
