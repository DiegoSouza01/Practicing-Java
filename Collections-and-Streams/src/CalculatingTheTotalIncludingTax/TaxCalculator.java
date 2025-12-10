package CalculatingTheTotalIncludingTax;

import java.util.List;

public class TaxCalculator {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        Double totalSemImposto = precosProdutos.stream()
                .reduce(0.0, (acumulador, preco) -> acumulador + preco);
        Double totalComImposto = totalSemImposto * 1.08;

        System.out.printf("Valor total antes do imposto: %.2f%n", totalSemImposto);
        System.out.printf("Valor total com imposto de 8%%: %.2f%n", totalComImposto);
    }
}
