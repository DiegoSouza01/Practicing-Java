package InventoryControl;

public class StockItem {
    private String nome;
    private int quantidade;

    public StockItem(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void vender(int quantidadeVendida) {
        if (this.quantidade >= quantidadeVendida) {
            this.quantidade -= quantidadeVendida;

            System.out.printf("Venda realizada. Estoque restante de %s: %d%n",
                    this.nome,
                    this.quantidade
            );
        } else {
            System.out.println("Estoque insuficiente");
        }
    }
}
