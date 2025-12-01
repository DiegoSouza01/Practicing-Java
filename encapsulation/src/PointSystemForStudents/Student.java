package PointSystemForStudents;

public class Student {
    private String nome;
    private int pontos;

    public Student(String nome) {
        this.nome = nome;
        this.pontos = 0; // Começa com zero pontos
    }

    public void ganharPontos(int pontosGanhos) {
        if (pontosGanhos > 0) {
            this.pontos += pontosGanhos;
            System.out.println(nome + " ganhou " + pontosGanhos + " pontos.");
        } else {
            System.out.println("Não é possível adicionar pontuação negativa ou zero.");
        }
    }

    private int calcularNivel() {
        return (this.pontos / 100) + 1;
    }

    public void exibirStatus() {
        int nivelAtual = calcularNivel();

        System.out.println("Status do Aluno");
        System.out.println("Nome: " + nome);
        System.out.println("Pontos: " + pontos);
        System.out.println("Nível: " + nivelAtual);
    }

    public static void main(String[] args) {
        Student aluno = new Student("Fernanda");

        System.out.println("Teste Inicial (Nível 1)");
        aluno.exibirStatus();

        System.out.println("\nTeste 1: Passagem de Nível");
        aluno.ganharPontos(120);
        aluno.exibirStatus();

        System.out.println("\nTeste 2: Pontuação Múltipla");
        aluno.ganharPontos(85);
        aluno.exibirStatus();
    }
}
