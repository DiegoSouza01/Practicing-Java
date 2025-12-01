package ProductRegistrationWithValidation;

public class Product {
    private String nome;
    private double preco;

    public Product(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public void setPreco(double novoPreco) {
        if (novoPreco < 0) {
            System.out.println("Preço inválido. O preço não pode ser negativo.");
            this.preco = 0.00;
        } else {
            this.preco = novoPreco;
        }
    }

    public void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + String.format("%,.2f", preco));
    }

    public double getPreco() {
        return preco;
    }

    public static void main(String[] args) {
        String nomeExemplo = "Mouse";
        double precoInvalido = -59.90;

        System.out.println("Teste 1: Preço Negativo");
        Product mouse = new Product(nomeExemplo, precoInvalido);
        mouse.exibirDados();

        System.out.println("\nTeste 2: Preço Válido");
        mouse.setPreco(125.50);
        mouse.exibirDados();
    }
}
