package ResettingTheBalance;

public class Main {
    public static void main(String[] args) {

        DigitalAccount conta = new DigitalAccount(0.0);

        double valorEntrada = 1579.42;
        conta.depositar(valorEntrada);

        System.out.println("Simulação de Transações");

        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();
    }
}
