package BankingSystem;

public class Main {
    public static void main(String[] args) {

        BankOperation deposito = new Deposit(200.0);
        BankOperation saque = new Withdraw(50.5);

        deposito.executar();
        saque.executar();
    }
}
