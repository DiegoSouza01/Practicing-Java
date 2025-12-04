package PaymentSystem;

public class Payment {
    protected double valor;

    public Payment(double valor) {
        this.valor = valor;
    }

    public void confirmarPagamento() {
        System.out.println("Processando pagamento genérico...");
    }
}
