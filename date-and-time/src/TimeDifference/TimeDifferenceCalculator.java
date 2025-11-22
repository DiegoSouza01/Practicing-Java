package TimeDifference;

import java.time.LocalTime;
import java.time.Duration;

public class TimeDifferenceCalculator {

    public static void main(String[] args) {

        LocalTime horaInicio = LocalTime.of(14, 30, 0);

        LocalTime horaTermino = LocalTime.of(16, 45, 0);

        System.out.println("Início da Atividade: " + horaInicio);
        System.out.println("Término da Atividade: " + horaTermino);

        Duration duracao = Duration.between(horaInicio, horaTermino);

        long totalHoras = duracao.toHours();

        long totalMinutos = duracao.toMinutes();
        long minutosRestantes = totalMinutos - (totalHoras * 60);

        System.out.println("Diferença de tempo: " + totalHoras + " horas e " + minutosRestantes + " minutos");
    }
}