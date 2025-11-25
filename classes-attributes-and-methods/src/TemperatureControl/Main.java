package TemperatureControl;

public class Main {
    public static void main(String[] args) {

        String localA = "Setor A";
        double temperaturaA = 39.2;

        TemperatureSensor setorA = new TemperatureSensor(localA, temperaturaA);

        System.out.println("Leitura do " + localA + " (Com Alerta)");
        setorA.mostrarDadosEAlerta();

        String localB = "Setor B";
        double temperaturaB = 35.1;

        TemperatureSensor setorB = new TemperatureSensor(localB, temperaturaB);

        System.out.println("Leitura do " + localB + " (Ideal)");
        setorB.mostrarDadosEAlerta();
    }
}
