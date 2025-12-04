package PaymentSystem;

public class CreditCard extends Payment {

    public CreditCard(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        double taxa = this.valor * 0.03;
        System.out.println(String.format("Pagamento de R$%.2f confirmado no Cartão de Crédito (Taxa: R$%.2f)", this.valor, taxa));
    }
}
