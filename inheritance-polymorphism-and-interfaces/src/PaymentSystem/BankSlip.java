package PaymentSystem;

public class BankSlip extends Payment {

    public BankSlip(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        double taxa = this.valor * 0.01;
        System.out.println(String.format("Boleto de R$%.2f gerado com sucesso (Taxa: R$%.2f)", this.valor, taxa));
    }
}
