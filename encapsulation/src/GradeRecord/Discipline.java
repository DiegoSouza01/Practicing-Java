package GradeRecord;

import java.util.ArrayList;
import java.util.List;

public class Discipline {
    private String nome;
    private List<Double> notasValidas;
    private int notasIgnoradas;

    public Discipline(String nome) {
        this.nome = nome;
        this.notasValidas = new ArrayList<>();
        this.notasIgnoradas = 0;
    }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.notasValidas.add(nota);
        } else {
            this.notasIgnoradas++;
            System.out.println("Nota inválida ignorada: " + nota);
        }
    }

    public void calcularEExibirMedia() {
        int totalNotasValidas = notasValidas.size();

        if (totalNotasValidas == 0) {
            System.out.println("\nNão há notas válidas para calcular a média em " + nome + ".");
            System.out.println("Total de notas inválidas ignoradas: " + notasIgnoradas);
            return;
        }

        double soma = 0.0;
        for (double nota : notasValidas) {
            soma += nota;
        }

        double media = soma / totalNotasValidas;

        System.out.println("\nTotal de notas válidas: " + totalNotasValidas);
        System.out.println("Média em " + nome + ": " + String.format("%,.2f", media));
    }

    public static void main(String[] args) {
        Discipline matematica = new Discipline("Matemática");

        matematica.adicionarNota(7.5);
        matematica.adicionarNota(11.0);
        matematica.adicionarNota(8.0);
        matematica.adicionarNota(-3.0);
        matematica.adicionarNota(9.5);

        matematica.calcularEExibirMedia();
    }
}
