package ResettingTheBalance;

import java.util.Locale;

public class DigitalAccount {
    private double saldo;

    public DigitalAccount(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void zerarSaldo() {
        this.saldo = 0.0;
        System.out.println("O saldo foi zerado com sucesso.");
    }

    public void exibirSaldo() {
        String saldoFormatado = String.format(Locale.getDefault(), "%.2f", this.saldo);

        System.out.println("Saldo atual: R$ " + saldoFormatado);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
