package BankingSystem;

public abstract class BankOperation implements BankAction {
    protected double valor;

    public BankOperation(double valor) {
        this.valor = valor;
    }
}
