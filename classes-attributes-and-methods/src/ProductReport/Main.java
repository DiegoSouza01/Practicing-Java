package ProductReport;

public class Main {
    public static void main(String[] args) {

        String nome = "Mouse Gamer";
        double preco = 159.9;
        int quantidade = 25;

        Produto mouseGamer = new Produto(nome, preco, quantidade);

        System.out.println("Relatório de Estoque");

        mouseGamer.mostrarDadosFormatados();

        Produto monitor = new Produto("Monitor LED 27", 1250.758, 10);
        System.out.println("\nOutro Produto");
        monitor.mostrarDadosFormatados();
    }
}