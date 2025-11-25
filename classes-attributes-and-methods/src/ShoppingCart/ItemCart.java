package ShoppingCart;

public class ItemCart {
    private String nome;
    private double preco;
    private int quantidade;

    public ItemCart(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularTotalItem() {
        return this.preco * this.quantidade;
    }
}
