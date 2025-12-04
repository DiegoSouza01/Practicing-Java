package PaymentSystem;

public class Main {
    public static void main(String[] args) {
        Payment cartao = new CreditCard(250.00);
        Payment boleto = new BankSlip(500.00);
        Payment pix = new Pix(300.00);

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();
    }
}
