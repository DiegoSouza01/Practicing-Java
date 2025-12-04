package BankingSystem;

public class Deposit extends BankOperation {

    public Deposit(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Depósito de R$%.2f realizado%n", this.valor);
    }
}
