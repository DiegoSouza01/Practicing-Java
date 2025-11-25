package FineForDelay;

public class Main {
    public static void main(String[] args) {

        String titulo1 = "Dom Casmurro";
        int diasAtraso1 = 3;

        Return pedido1 = new Return(titulo1, diasAtraso1);

        System.out.println("Cálculo de Multas da Livraria");
        pedido1.exibirDetalhes();

        Return pedido2 = new Return("Cem Anos de Solidão", 10);

        pedido2.exibirDetalhes();

        Return pedido3 = new Return("O Pequeno Príncipe", 0);

        pedido3.exibirDetalhes();
    }
}
