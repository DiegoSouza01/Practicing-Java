package PaymentSystem;

public class Pix extends Payment {

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.println(String.format("Pagamento via Pix de R$%.2f confirmado", this.valor));
    }
}
