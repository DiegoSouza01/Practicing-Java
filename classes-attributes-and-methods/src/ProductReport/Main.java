package ProductReport;

public class Main {
    public static void main(String[] args) {

        String nome = "Mouse Gamer";
        double preco = 159.9;
        int quantidade = 25;

        Product mouseGamer = new Product(nome, preco, quantidade);

        System.out.println("Relatório de Estoque");

        mouseGamer.mostrarDadosFormatados();

        Product monitor = new Product("Monitor LED 27", 1250.758, 10);
        System.out.println("\nOutro Product");
        monitor.mostrarDadosFormatados();
    }
}