package BankBalanceControl;

public class Account {
    private String titular;
    private double saldo;

    public Account(String titular) {
        this.titular = titular;
        this.saldo = 0.00;
        System.out.println("Conta criada para " + titular + " com saldo inicial de 0,00.");
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de " + String.format("%,.2f", valor) + " realizado com sucesso.");
            exibirSaldo();
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de " + String.format("%,.2f", valor) + " autorizado.");
            exibirSaldo();
        }
        else if (valor > 0 && this.saldo < valor) {
            System.out.println("Saldo insuficiente para saque.");
        }
        else {
            System.out.println("Erro: O valor do saque deve ser positivo.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual de " + titular + ": " + String.format("%,.2f", saldo));
    }

    public static void main(String[] args) {
        Account conta = new Account("Ana");

        System.out.println("\nCenário 1: Saldo Insuficiente (Exemplo da entrada)");
        conta.depositar(1000.00);

        conta.sacar(1200.00);

        conta.exibirSaldo();

        System.out.println("\nCenário 2: Saque com Sucesso");

        conta.sacar(200.00);
    }
}
