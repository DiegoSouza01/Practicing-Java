package TemperatureControl;

import java.util.Locale;

public class TemperatureSensor {
    private static final double LIMITE_ALERTA = 37.5;

    private String local;
    private double temperaturaAtual;

    public TemperatureSensor(String local, double temperaturaAtual) {
        this.local = local;
        this.temperaturaAtual = temperaturaAtual;
    }

    public void mostrarDadosEAlerta() {
        String tempFormatada = String.format(Locale.getDefault(), "%.1f", this.temperaturaAtual);

        System.out.println("Sensor no local: " + this.local);
        System.out.println("Temperatura: " + tempFormatada + " ºC");

        if (this.temperaturaAtual > LIMITE_ALERTA) {
            System.out.println("Alerta: Temperatura acima do limite!");
        } else {
            System.out.println("Status: Condição ideal.");
        }
    }
}
