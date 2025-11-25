package FineForDelay;

import java.util.Locale;

public class Return {
    private static final double MULTA_POR_DIA = 2.50;

    private String titulo;
    private int diasAtraso;

    public Return(String titulo, int diasAtraso) {
        this.titulo = titulo;
        this.diasAtraso = diasAtraso;
    }

    public double calcularMulta() {
        return this.diasAtraso * MULTA_POR_DIA;
    }

    public void exibirDetalhes() {
        double valorMulta = calcularMulta();

        String multaFormatada = String.format(Locale.getDefault(), "%.2f", valorMulta);

        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %s%n",
                this.titulo,
                this.diasAtraso,
                multaFormatada
        );
    }
}
