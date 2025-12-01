package FilmRating;

import java.util.ArrayList;
import java.util.List;

public class Movies {
    private final String titulo;
    private final List<Integer> avaliacoes;

    public Movies(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(int nota) {
        if (nota >= 1 && nota <= 5) {
            this.avaliacoes.add(nota);
            System.out.println("Avaliação " + nota + " adicionada para o filme " + titulo + ".");
        } else {
            System.out.println("Erro: Avaliação inválida (" + nota + "). A nota deve ser entre 1 e 5.");
        }
    }

    public void calcularEExibirMedia() {
        if (avaliacoes.isEmpty()) {
            System.out.println("O filme " + titulo + " ainda não possui avaliações.");
            return;
        }

        int somaDasNotas = 0;
        for (int nota : avaliacoes) {
            somaDasNotas += nota;
        }

        double media = (double) somaDasNotas / avaliacoes.size();

        System.out.println("\nMédia de avaliações para " + titulo + ": " + String.format("%,.2f", media));
    }

    public static void main(String[] args) {
        Movies matrix = new Movies("Matrix");

        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);

        matrix.adicionarAvaliacao(6);

        matrix.calcularEExibirMedia();

    }
}
