package CalculatingGrades;

import java.util.Locale;

public class Student {
    private static final double MEDIA_APROVACAO = 7.0;

    private String nome;
    private double nota1;
    private double nota2;

    public Student(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void gerarRelatorio() {
        double media = (this.nota1 + this.nota2) / 2.0;

        String situacao;
        if (media >= MEDIA_APROVACAO) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        String mediaFormatada = String.format(Locale.getDefault(), "%.1f", media);

        System.out.println("Relatório Acadêmico");
        System.out.println("Aluno: " + this.nome);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Média: " + mediaFormatada);
        System.out.println("Situação: " + situacao);
    }
}
