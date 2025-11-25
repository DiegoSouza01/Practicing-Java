package InventoryControl;

public class Main {
    public static void main(String[] args) {

        String nomeItem = "Camiseta";
        int quantidadeInicial = 10;

        StockItem item = new StockItem(nomeItem, quantidadeInicial);

        System.out.println("Início do Processamento de Vendas");

        item.vender(3);

        item.vender(8);

        item.vender(5);
    }
}
