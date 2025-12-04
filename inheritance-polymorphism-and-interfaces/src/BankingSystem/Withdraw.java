package BankingSystem;

public class Withdraw extends BankOperation {

    public Withdraw(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Saque de R$%.2f realizado%n", this.valor);
    }
}
