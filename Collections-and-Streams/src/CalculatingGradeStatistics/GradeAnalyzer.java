package CalculatingGradeStatistics;

import java.util.List;

public class GradeAnalyzer {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        Double somaTotal = notas.stream()
                .reduce(0.0, Double::sum);

        double media = somaTotal / notas.size();

        Double menorNota = notas.stream()
                .min(Double::compare)
                .get();

        Double maiorNota = notas.stream()
                .max(Double::compare)
                .get();

        System.out.println("A média das notas é: " + media);
        System.out.println("A menor nota foi: " + menorNota);
        System.out.println("A maior nota foi: " + maiorNota);
    }
}
