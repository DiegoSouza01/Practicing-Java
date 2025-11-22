package WorkShift;

import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorkShiftCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        long cargaHorariaHoras = 8;

        LocalTime entrada;
        System.out.print("Digite o horário de entrada (HH:mm): ");
        try {
            entrada = LocalTime.parse(scanner.next(), formatter);
        } catch (Exception e) {
            System.err.println("Erro: Horário de entrada inválido. Use o formato HH:mm.");
            return;
        }

        LocalTime saidaPrevista = entrada.plusHours(cargaHorariaHoras);

        LocalTime saidaReal;
        System.out.print("Digite o horário real de saída (HH:mm): ");
        try {
            saidaReal = LocalTime.parse(scanner.next(), formatter);
        } catch (Exception e) {
            System.err.println("Erro: Horário de saída inválido. Use o formato HH:mm.");
            return;
        }

        scanner.close();

        Duration tempoTrabalhado = Duration.between(entrada, saidaReal);

        Duration jornadaPadrao = Duration.ofHours(cargaHorariaHoras);

        Duration saldo = tempoTrabalhado.minus(jornadaPadrao);

        long totalMinutosSaldo = saldo.toMinutes();

        String sinal;
        if (totalMinutosSaldo > 0) {
            sinal = "+";
        } else if (totalMinutosSaldo < 0) {
            sinal = "-";
        } else {
            sinal = "";
        }

        long horasAbsolutas = Math.abs(totalMinutosSaldo / 60);
        long minutosAbsolutos = Math.abs(totalMinutosSaldo % 60);

        System.out.println("Horário de entrada: " + entrada.format(formatter));
        System.out.println("Horário de saída previsto: " + saidaPrevista.format(formatter));
        System.out.println("Horário real de saída: " + saidaReal.format(formatter));
        System.out.println("Carga Horária Diária: " + cargaHorariaHoras + "h 0min");
        System.out.println("Saldo de horas: " + sinal + horasAbsolutas + "h " + minutosAbsolutos + "min");
    }
}