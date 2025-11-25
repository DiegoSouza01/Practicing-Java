package ProductReport;

import java.util.Locale;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void mostrarDadosFormatados() {
        String precoFormatado = String.format(Locale.getDefault(), "%.2f", this.preco);

        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: R$ " + precoFormatado);
        System.out.println("Quantidade em estoque: " + this.quantidade);
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}